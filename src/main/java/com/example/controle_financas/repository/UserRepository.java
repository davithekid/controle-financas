        package com.example.controle_financas.repository;

        import com.example.controle_financas.entity.user.User;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.security.core.userdetails.UserDetails;

        import java.util.UUID;

        public interface UserRepository extends JpaRepository<User, UUID> {
            // metodo para consultar o user pelo login
            UserDetails findByLogin(String login);
        }
