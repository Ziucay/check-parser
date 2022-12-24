# Backend

This is server side of the project.

## Overview

On the backend we have:
- authorization module
- mock module
- PostgreSQL database
- liquibase client
- adminer for database

## Developing

Use 

```bash
./gradlew :mock:run
./gradlew :authorization:run
```

to run applications without docker

## Troubleshooting

There can be a problem with running kotlin 
applications. To fix it, add `kt` in the
end of file. Example:

`com.cost.accountant.mock.ApplicationKt`


Docker build error:

```bash
ERROR [internal] load metadata for docker.io/library/build:latest

failed to solve with frontend dockerfile.v0:
failed to solve with frontend gateway.v0: rpc error:
code = Unknown desc = pull access denied, repository
does not exist or may require authorization:
server message: insufficient_scope: authorization failed
```

write

```bash
export DOCKER_BUILDKIT=0
export COMPOSE_DOCKER_CLI_BUILD=0
```



