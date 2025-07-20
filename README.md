# 💸 Controle de Gastos Pessoais - API REST

API RESTful desenvolvida com Java e Spring Boot para controle financeiro pessoal. Permite que usuários registrem receitas e despesas, organizem categorias e visualizem seus lançamentos.

---

## 📌 Funcionalidades

- Cadastro e autenticação de usuários (com JWT)
- CRUD de lançamentos financeiros (receitas e despesas)
- CRUD de categorias personalizadas
- Relatórios simples por mês e por categoria (em breve)
- Validação e tratamento de erros
- Documentação com Swagger

---

## 🧱 Tecnologias e Ferramentas


- Spring Data JPA
- Spring Security + JWT
- Bean Validation
- Lombok
- Banco de dados: H2 (dev) ou MySQL
- Swagger/OpenAPI
- JUnit e Mockito (em breve)
- Maven

---

## 📄 Endpoints 

### 🔐 Autenticação
| Método | Rota          | Descrição       |
|--------|---------------|-----------------|
| POST   | `/auth/register` | Cadastro de novo usuário |
| POST   | `/auth/login`    | Login e geração de token |

### 👤 Usuário
| Método | Rota          | Descrição       |
|--------|---------------|-----------------|
| GET    | `/usuarios/me` | Dados do usuário logado |

### 💸 Lançamentos
| Método | Rota               | Descrição              |
|--------|--------------------|------------------------|
| GET    | `/lancamentos`     | Listar todos do usuário |
| POST   | `/lancamentos`     | Criar novo lançamento   |
| PUT    | `/lancamentos/{id}`| Editar lançamento       |
| DELETE | `/lancamentos/{id}`| Deletar lançamento      |

### 🏷️ Categorias
| Método | Rota               | Descrição              |
|--------|--------------------|------------------------|
| GET    | `/categorias`      | Listar categorias       |
| POST   | `/categorias`      | Criar nova categoria    |

---




