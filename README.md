# Spring Boot Continents API

A Spring Boot application that fetches and stores continent data from an API.

## Project Description

This application demonstrates the use of Spring Boot to create a RESTful API that fetches continent data from an external API, stores it in a local H2 database, and provides endpoints to retrieve the information.

## Features

- Fetches continent data from an external API
- Stores data in an H2 in-memory database
- Provides RESTful endpoints to retrieve continent information
- Uses Spring Data JPA for database operations
- Implements proper error handling and validation

## Prerequisites

- Java 11 or higher
- Maven 3.6 or higher
- Git

## Setup

1. Clone the repository:
   ```
   git clone https://github.com/your-username/spring-boot-continents-api.git
   cd spring-boot-continents-api
   ```

2. Build the project:
   ```
   mvn clean install
   ```

3. Run the application:
   ```
   mvn spring-boot:run
   ```

The application will start on `http://localhost:8080`.

## API Endpoints

- GET `/api/continents`: Retrieve all continents

## Database

The application uses an H2 in-memory database. You can access the H2 console at `http://localhost:8080/h2-console` with the following details:

- JDBC URL: `jdbc:h2:mem:continentdb`
- Username: `sa`
- Password: `password`

## Next Steps

1. Implement additional API endpoints (e.g., get continent by code, add new continent)
2. Add input validation for API requests
3. Implement proper error handling and custom error responses
4. Write unit and integration tests
5. Add logging throughout the application
6. Implement security features (authentication and authorization)
7. Create a front-end interface to interact with the API
8. Document the API using Swagger or Spring REST Docs

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

[MIT](https://choosealicense.com/licenses/mit/)