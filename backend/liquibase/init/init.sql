--liquibase formatted sql
--changeset ziucay:1
CREATE DATABASE application;
--rollback DROP DATABASE application;