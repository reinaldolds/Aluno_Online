# Aluno_Online
Aluno: Reinaldo Lira de Sousa

Disciplina: BackEnd 

Faculdade: UNIESP   P3

Tipo de projeto: Acadêmico

This is my project backend

# Technology
* Here are the technologies used in this project(Aqui estão as tecnologias usadas neste projeto):

   * Java version 17
   * Spring Boot 
   * Maven
   * PostgreSQL
   * Dbeaver
   * Github
   * Dependency
   * Postman

* Java
   * Para construir aplicação backend com estrutura REST tendo comunicação com banco de dados do projeto.
* Padrão do Projeto
   * Através de pacotes como `Model` para modelar classes(entidades) que serão geradas como tabelas no banco
     de dados, `Services` para criar regras de negócios, `Repository` para gerenciar a ponte de conexão com
     banco através do JPA, `Controller` mais voltado para front do projeto com ciração e mapeamento dos
     endpoints de conexão HTTP, fazendo injeção de dependências das classes necessárias para o processo da
     aplicação, `Config` usado para criar classe que conecta com swagger que é utilizado para testes e de
     criação da documentação, `DTO` usada para criar classe que extrai apenas partes necessarias de outra
     classe, `enums` usada para realizar enumerações no projeto, neste é usada para parte de situação do
     status.

* Spring Boot
   * Framework usada para crair projeto e dominio e dependências. 

* As dependências utilizadas no projeto:
  * Spring web - para visualização do projeto
  * Spring data - para integração e simplificar acesso ao banco de dados
  * PostgresSQL - para permitir acesso do spring boot com o banco de dados PostgreSQL
  * Lombok - para ajudar na parte de implementação dos gets,sets, toString e acelerar na produçao.

* Dbeaver
  * Para gerenciamento do banco de dados.

* PostgreSQL
  * para criação e manipulação dos dados assim como a conexão com aplicação.

# Service used(Serviços usados):
* Git & Github
  * Para versionamento de código e serviço em nuvem.

* Postman
  * Para requisições http através do endpoint com metodos: get,post,update,petch,delete. Com isso, obeter response que deve retornar um jeson.

# Prints(Banco de Dados, Postman)

![Texto Alternativo](https://github.com/reinaldolds/Aluno_Online/blob/main/src/main/resources/static/prints/printBDaluno.png
)

![Texto Alternativo](https://github.com/reinaldolds/Aluno_Online/blob/main/src/main/resources/static/prints/postStatus202.png
)

![Texto Alternativo](https://github.com/reinaldolds/Aluno_Online/blob/main/src/main/resources/static/prints/postNobd.png
)

![Texto Alternativo](https://github.com/reinaldolds/Aluno_Online/blob/main/src/main/resources/static/prints/listacriadaBanco.png)

![Texto Alternativo](https://github.com/reinaldolds/Aluno_Online/blob/main/src/main/resources/static/prints/getlistarTodosAlunos.jpeg)
