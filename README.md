# Country Capital Microservice

This microservice manages the relationships between countries and their capitals. Built with Spring Boot and MySQL, it supports operations to save and retrieve capital information for a given country. The service is secured with Basic Authentication and is Dockerized for easy setup and deployment.

## Prerequisites

To run this project, you will need Docker and Docker Compose installed on your system preferably the latest versions. This ensures you can easily set up the MySQL database and run the Spring Boot application without needing to configure the environment and dependencies manually.

## Getting Started

Follow these steps to get the microservice up and running on your local machine:

### 1. Clone the Repository

First, clone this repository to your local machine:
```git clone https://github.com/Adnanrobi/countrycapital.git```

### 2. Start the Application and Database with Docker Compose
From the root directory of the project, run:

```./mvnw clean package -DskipTests``` to build the project using Maven Wrapper.

```docker-compose up``` to build the Docker image for the Spring Boot application and start both the application and the MySQL database containers. The docker-compose.yml file in the project directory contains all the necessary configurations.

### 3. Accessing the Application
Once the containers are up and running, the microservice is accessible at:
```http://localhost:8080```
## API Endpoints

#### Save Country-Capital Information

- **HTTP Method:** `POST`
- **Path:** `/api/country/save`
- **Description:** Save country-capital pairs to the database.
- **Authentication:** Requires Basic Authentication.

#### Retrieve Capital by Country

- **HTTP Method:** `GET`
- **Path:** `/api/country/{countryName}`
- **Description:** Retrieve the capital of a specific country from the database.
- **URL Parameter:** `countryName` - The name of the country for which to retrieve the capital.
- **Response:** A JSON containing the capital in the following format: `{"capital": "Dhaka"}`
- **Authentication:** Requires Basic Authentication.

## Testing
You can test the API using tools like Postman. Make sure to include Basic Authentication headers with your requests.

## Assumptions:
- **CSRF protection is disabled for simplicity as I considered a local development environment.
- **Used only one user for authentication which is predefined in memory, for a production system it should be implemented using a database to manage users
- **Password is hardcoded for simplicity
