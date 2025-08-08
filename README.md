# FakerAPI RestAssured

## Overview
Automated API testing for [FakerAPI](https://fakerapi.it/) using Java, RestAssured, and TestNG. Validates endpoints, schemas, and business logic for company data.

## Features
- API endpoint validation
- JSON schema checks
- Configurable test environment
- Allure reporting integration

## Technologies
- Java
- RestAssured
- TestNG
- Maven
- Allure

## Project Structure
```
src/
  test/java/org/fakerapi/api/CompaniesAPI.java
  test/java/org/fakerapi/api/TestBase.java
  test/java/org/fakerapi/tests/CompaniesAPITest.java
  test/resources/config.properties
  test/resources/getAllCompaniesSchema.json
```

## Setup
1. **Clone the repository**
   ```sh
   git clone <repo-url>
   ```
2. **Install dependencies**
   ```sh
   mvn clean install
   ```
3. **Configure properties**
   - Edit `src/test/resources/config.properties` for API base URL and settings.

## Running Tests
```sh
mvn test
```

## Generating Allure Report
```sh
mvn allure:serve
```

## Contributing
Pull requests are welcome. For major changes, open an issue first.
