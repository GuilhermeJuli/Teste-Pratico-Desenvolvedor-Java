# Controle de Agendamentos de Vagas

## Descrição
Aplicação para registro de cadastros e agendamentos de vagas. O sistema permite a gestão de vagas, solicitantes e agendamentos, garantindo validações específicas para evitar inconsistências.

## Requisitos
- Java 17
- Maven
- HSQLDB

## Configuração
1. Configure o caminho do banco de dados no arquivo `application.properties`:
    ```properties
    spring.datasource.url=jdbc:hsqldb:file:C:\\Projetos\\Teste-Pratico-Desenvolvedor-Java\\banco\\agenda;hsqldb.lock_file=false
    ```

2. Compile o projeto:
    ```sh
    mvn install -DskipTests
    ```

3. Execute a aplicação:
    ```sh
    java -jar -Dserver.port=9494 target/Teste-Pratico-Desenvolvedor-Java-0.0.2-SNAPSHOT.jar
    ```

4. Acesse no navegador:
    ```
    http://localhost:9494
    ```

## Funcionalidades
- Cadastro de Vagas
- Cadastro de Solicitantes
- Cadastro de Agendamentos
- Consulta de Agendamentos por Período e Solicitante

## Arquitetura
O projeto segue os princípios de Clean Architecture, dividindo a aplicação em camadas distintas: Controller, Service, Repository e Model. Utilizamos JPA/Hibernate para a persistência dos dados e PrimeFaces para a camada de visualização.

## Decisões de Implementação
- Utilização de validações no Service para garantir integridade dos dados.
- Configuração de Managed Beans para integração com JSF.
- Consultas otimizadas para garantir performance com grandes volumes de dados.
