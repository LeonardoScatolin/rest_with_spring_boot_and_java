# REST APIs RESTFul

Este repositório faz parte do meu aprendizado enquanto estou concluindo meu curso na Udemy sobre REST APIs RESTFul usando Spring Boot, Java e Docker. Cada pasta neste repositório representa uma seção do curso.

## Seções do Curso

### 05 - Primeiros passos em Spring Boot
Nesta seção, foi apresentado os arquivos presentes em um projeto Spring Boot, e além disso foi criado uma rota de exemplo utilizando request param.

![image](https://github.com/LeonardoScatolin/rest_with_spring_boot_and_java/assets/122055877/536caf19-91a4-48d1-8e0b-a5df1cd76af1)


### 06 - Entendendo o Path Params e o tratamento de exceções
Nesta seção, foi desenvolvida uma calculadora de exemplo que oferece todas as operações matemáticas básicas. Além disso, foi implementado um tratamento de exceção para garantir que apenas números sejam aceitos como entrada nas URLs das operações.

![image](https://github.com/LeonardoScatolin/rest_with_spring_boot_and_java/assets/122055877/c87bb862-555a-4044-9b6b-3c4847036fda)

### 07 - Trabalhando com os verbos HTTP, GET, POST, PUT e DELETE
Nesta seção, foi explorado o uso dos verbos HTTP GET, POST, PUT e DELETE em uma aplicação de teste. Para simular dados, foi utilizado um método `mockPerson` que gera informações para simular dados durante o desenvolvimento da aplicação.

![image](https://github.com/LeonardoScatolin/rest_with_spring_boot_and_java/assets/122055877/b2b7390c-d4a6-4c3c-a9f8-2038292f640b)

### 08 - Conectando com banco de dados MySQL
Nesta seção, foi adicionada a dependência do MySQL no arquivo `pom.xml`, estabelecida a conexão com o banco de dados MySQL através do arquivo `application.yml`, e adicionadas as anotações do JPA para criação das tabelas e colunas do banco de dados. Além disso, o Hibernate foi configurado para interpretar essas anotações e gerar o código SQL necessário para realizar operações como criar, atualizar, recuperar e excluir dados no banco de dados.

![image](https://github.com/LeonardoScatolin/rest_with_spring_boot_and_java/assets/122055877/35310ba3-b58d-4cfd-94de-9ee0fa257365)

### 09 - Trabalhando com padrão VO
Nesta seção, foi introduzido o padrão VO (Value Object), que visa ocultar as informações do banco de dados para serem enviadas para o servidor. Também foram realizados testes unitários após a implementação do `ModelMapper` para transformar classes que pertencem ao banco de dados em classes padrão VO.

![image](https://github.com/LeonardoScatolin/rest_with_spring_boot_and_java/assets/122055877/dba4a8f6-69e0-4b5f-a9b0-0a8c01f531a0)

### 10 - Versionamento de endpoints
Nesta seção, a rota `v2` foi criada para adicionar o campo `birthDay` no banco de dados, e a classe `PersonVOV2` foi introduzida para lidar com essa atualização, mantendo a compatibilidade com versões anteriores da API.

![image](https://github.com/LeonardoScatolin/rest_with_spring_boot_and_java/assets/122055877/a5e6cbec-fa2f-4a45-a5b6-b06eae0298e2)

### 11 - Adicionando suporte à Migrations com Flyway
Nesta seção, foi adicionada a dependência `Flyway` para realizar migrações no banco de dados. Um script foi criado para a criação do banco de dados e outro para popular as tabelas com dados iniciais.

![image](https://github.com/LeonardoScatolin/rest_with_spring_boot_and_java/assets/122055877/f0b2610a-9668-4a93-ac69-58b26eaa4d71)


---
