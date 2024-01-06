# Curtain
Blind application for college and university students.

## Tech Stack

1. Java
2. Spring
3. MongoDB
4. Spring Security
5. Lombok

## How to run this application.

1. Generate ssh keys and put them in src/main/resources directory.

```shell
ssh-keygen -t rsa
# Copy the public key as rsa.public.key and private key as rsa.private.key
```

2. Export MONGO_DB_HOST by creating a mongo db connection.

```shell
set MONGO_DB_HOST=<some_value>
echo %MONGO_DB_HOST%
```

2. Run
```shell
./gradlew build
./gradlew run
```