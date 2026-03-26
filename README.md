# ✂️ EncurtaLink - URL Shortener

Um sistema de encurtamento de URLs rápido, moderno e eficiente, desenvolvido como API REST com interface web integrada. Este projeto recebe URLs longas e gera códigos curtos e únicos para redirecionamento, focado na melhor experiência do usuário (UX) com suporte nativo a Dark Mode.

## 🚀 Funcionalidades

- **Encurtamento de Links:** Converte URLs longas em links curtos de 6 caracteres.
- **Redirecionamento Automático:** Intercepta o código curto e redireciona o usuário (HTTP 302) para o destino original.
- **Interface Web Integrada:** Front-end responsivo renderizado no lado do servidor com Dark Mode ativado por padrão.
- **Prevenção de Colisões:** Utiliza a lógica de substrings de UUIDs para garantir identificadores únicos.
- **Deploy Pronto:** Configurado com `Dockerfile` para conteinerização e deploy simplificado em plataformas de nuvem (como Railway e Render).

## 🛠️ Tecnologias Utilizadas

O projeto foi construído utilizando o ecossistema moderno do Java:

* **Java 21** - Linguagem principal do projeto.
* **Spring Boot 3** - Framework principal para a criação da API REST.
* **Spring Data JPA & Hibernate** - ORM para interação com o banco de dados.
* **PostgreSQL** - Banco de dados relacional robusto para persistência dos links.
* **Thymeleaf** - Motor de templates para renderização do HTML dinâmico.
* **Docker** - Conteinerização da aplicação usando Multi-stage build.
* **Maven** - Gerenciamento de dependências e automação de builds.
