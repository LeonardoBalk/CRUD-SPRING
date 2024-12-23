﻿# Sistema de Gerenciamento de Cafeteria - CRUD com Spring Boot

Projeto desenvolvido para a disciplina de Programação para web. O sistema realiza operações CRUD (Create, Read, Update, Delete) para gerenciar clientes e produtos de uma cafeteria.

## Sobre o Projeto

O sistema oferece funcionalidades de gerenciamento para o cadastro de clientes e produtos da cafeteria. Ele foi implementado utilizando Java com o framework Spring Boot, além de integrar um banco de dados MySQL.

### Funcionalidades

- **Cadastro de Clientes**: Permite criar, visualizar, editar e excluir clientes.
- **Cadastro de Produtos**: Permite criar, visualizar, editar e excluir produtos da cafeteria.

### Estrutura de Dados

Para o cadastro de clientes, os seguintes atributos foram definidos:

- `id`: Identificador do cliente.
- `nome`: Nome do cliente.
- `telefone`: Telefone do cliente.

Para produtos, o sistema utiliza uma estrutura similar, que facilita a gestão de estoque e informações de vendas.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **MySQL Server 9.1** (banco de dados local)
- **Spring Data JPA**
- **Maven**

## Observações

O projeto originalmente planejava usar o Flyway para controle de versões do banco de dados, mas o plugin não é compatível com a versão do MySQL instalada no meu computador. Como alternativa, deixei o Flyway nas dependências para facilitar testes em ambientes compatíveis. Pode usar o Flyway pode ajustar o `application.properties` para habilitar.

## Configuração do Banco de Dados

1. ### Clone o repositório:
   ```bash
   git clone https://github.com/LeonardoBalk/CRUD-SPRING.git
**Banco de Dados:**

Ter o MySQL Server 9.1 configurado.

Criar um banco de dados para o sistema e configure o application.properties com suas credenciais de acesso:

###  properties:

spring.datasource.url=jdbc:mysql://localhost:3306/
spring.datasource.username=usuario
spring.datasource.password=senha
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update<br><br>
Caso prefira, altere as configurações para usar Flyway, ajustando as propriedades para habilitar o plugin.

### Compilação e Execução:

bash

mvn clean install
mvn spring-boot:run<br><br>

### Testar a Aplicação: 
Acesse http://localhost:8080/clientes e http://localhost:8080/produtos para testar as APIs de clientes e produtos.

## Estrutura do Projeto
`/src/main/java` Contém a lógica principal do sistema, incluindo controladores e repositórios.
`/src/main/resources` Inclui configurações do Spring Boot, como o arquivo application.properties.
`/src/test/java` Testes para verificar o funcionamento das classes principais.

## Endpoints Principais
### Clientes
`GET /clientes` - Lista todos os clientes<br>
`GET /clientes/{id}` - Exibe dados de um cliente específico<br>
`POST /clientes` - Adiciona um novo cliente<br>
`PUT /clientes/{id}` - Atualiza informações de um cliente<br>
`DELETE /clientes/{id}` - Remove um cliente do sistema<br>

### Produtos
`GET /produtos` - Lista todos os produtos<br>
`GET /produtos/{id}` - Exibe dados de um produto específico<br>
`POST /produtos` - Adiciona um novo produto<br>
`PUT /produtos/{id}` - Atualiza informações de um produto<br>
`DELETE /produtos/{id}` - Remove um produto do sistema<br>

O projeto atende os requisitos pedidos da proposta e contém 6 classes: ClienteController, ProdutoController, Cliente, Produto, ClienteService e ProdutoService.
