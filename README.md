# Spring Data Redis Implementation

Redis integration implementation with Spring Boot + Spring Data Redis


## Technologies
- Java 17
- Maven
- Spring Boot
- [Redis](https://redis.io/)
- [Spring Data Redis](https://spring.io/projects/spring-data-redis)

## Running the Application

1. Clone repository
```
git clone https://github.com/sevketbuyukdemir/spring-data-redis.git
```
2. Run Redis server via Docker Desktop
- Create and start container for the first time:
```
docker-compose up -d
```
- Start an existing container:
```
docker-compose start
```
- Stop the running container:
```
docker-compose stop
```
- Perform a clean restart (stops containers and removes volumes):
```
docker-compose down -v
```
3. Run Spring Boot application
