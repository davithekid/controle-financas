package com.example.controle_financas.service;

import com.example.controle_financas.entity.user.AuthenticationDTO;
import com.example.controle_financas.entity.user.LoginResponseDTO;
import com.example.controle_financas.entity.user.RegisterDTO;
import com.example.controle_financas.entity.user.User;
import com.example.controle_financas.infra.security.TokenService;
import com.example.controle_financas.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

// arquivo de autenticação de tokens
@Service
public class AuthService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository repository;

    @Autowired
    private TokenService tokenService;

    // service para logar o user
    public ResponseEntity login(@RequestBody @Valid AuthenticationDTO data) {
        var usernamePassword = new UsernamePasswordAuthenticationToken(data.login(), data.senha());
        var auth = this.authenticationManager.authenticate(usernamePassword);

        var token = tokenService.generateToken((User) auth.getPrincipal());
        return ResponseEntity.ok(new LoginResponseDTO(token));
    }

    // service para registrar um novo user
    public ResponseEntity<?> register(RegisterDTO data) {
        if (repository.findByLogin(data.login()) != null) {
            return ResponseEntity.badRequest().body("Login já existe");
        }

        String encryptedPassword = new BCryptPasswordEncoder().encode(data.senha());

        User newUser = new User(
                data.login(),
                encryptedPassword,
                data.role(),
                data.nome(),
                data.sobrenome(),
                data.email()
        );

        repository.save(newUser);
        return ResponseEntity.ok("Usuário cadastrado com sucesso");
    }

}
