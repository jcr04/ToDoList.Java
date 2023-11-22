# API de Lista de Tarefas (ToDo List)

## Descrição
Esta API fornece um serviço de gerenciamento de tarefas, permitindo aos usuários criar, listar, atualizar e deletar tarefas. Foi desenvolvida utilizando Java com Spring Boot, seguindo os princípios do Domain-Driven Design (DDD) e uma arquitetura de camadas.

## Tecnologias Utilizadas
- Java
- Spring Boot
- PostgreSQL
- Lombok
- Hibernate

## Instalação
Para instalar e executar esta API localmente, siga os passos abaixo:

1. Clone o repositório:
   ```bash
   git clone [URL_DO_REPOSITORIO]
   ```
2. ```bash
   cd ToDoList.Java
   ```
3. ```bash
   mvn spring-boot:run
   ```
a aplicação estará rodando na Porta 8081

## Endpoints da API
#### `Listar todas as Tarefas`
- Metodo Get
- Retorna todas as tarefas salvas no banco de dados

#### `Criar Tarefa`
- Método POST
- Criar Tarefa para salvar no banco de dados
- Body:
  ```json
  {
    "title": "Título da Tarefa",
    "description": "Descrição da Tarefa",
    "dueDate": "AAAA-MM-DDTHH:MM:SS",
    "completed": false
  }
  ```
#### `Atualizar Tarefa`
- Método PUT
- Atualizar um Dado já criado no Banco de dados
- Body:
  ```json
  {
    "title": "Título da Tarefa",
    "description": "Descrição da Tarefa",
    "dueDate": "AAAA-MM-DDTHH:MM:SS",
    "completed": false
  }
  ```
#### `Deleta Tarefa`
- Método Delete
- Deletar um dado já criado e salvado no Banco de dados.
