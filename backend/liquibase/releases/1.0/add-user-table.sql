--liquibase formatted sql
--changeset ziucay:2
CREATE TABLE application.user (
    id SERIAL PRIMARY KEY ,
    username VARCHAR UNIQUE NOT NULL,
    password VARCHAR NOT NULL,
    auth_token VARCHAR NOT NULL
);
--rollback DROP TABLE application.user;
