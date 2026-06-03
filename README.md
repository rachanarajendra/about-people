# People API

Simple Spring Boot service with one demo endpoint.

## Tech Stack

- Java 21
- Spring Boot 3
- Maven Wrapper (`./mvnw`)
- Docker / Docker Compose

## Run locally

```bash
./mvnw spring-boot:run
```

Service base URL: `http://localhost:8080`

Example endpoint:

```bash
curl http://localhost:8080/api/humans/readAll
```

## Run tests

```bash
./mvnw test
```

## Run with Docker

Build image:

```bash
docker build -t people-app .
```

Run container:

```bash
docker run --rm -p 8080:8080 people-app
```

Or run with Docker Compose:

```bash
docker compose up --build
```

## CI

GitHub Actions workflow: `.github/workflows/ci.yml`

It runs:
- Maven build + tests
- Docker image build validation

