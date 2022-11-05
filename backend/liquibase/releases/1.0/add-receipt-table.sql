--liquibase formatted sql
--changeset ziucay:3
CREATE TABLE application.receipt (
                                  id SERIAL PRIMARY KEY,
                                  receipt_json jsonb NOT NULL,
                                  is_processed BOOLEAN NOT NULL
);
--rollback DROP TABLE application.receipt;