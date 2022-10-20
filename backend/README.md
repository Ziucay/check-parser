# Backend

This is server side of the project.

Currently, there is only simple mock server

## Docker

To build:

```bash
docker build -t cost-accountant-back .
```
To run:

```bash
docker run -d -p 8080:8080 --rm --name cost-accountant-back cost-accountant-back
```


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



