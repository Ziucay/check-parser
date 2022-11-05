--liquibase formatted sql
--changeset ziucay:4
CREATE TABLE application.user_receipts (
                                     id SERIAL PRIMARY KEY,
                                     user_id integer NOT NULL references user(id),
                                     receipt_id integer NOT NULL references receipt(id)
);
--rollback DROP TABLE application.user_receipts;