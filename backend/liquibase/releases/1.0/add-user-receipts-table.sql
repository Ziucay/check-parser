--liquibase formatted sql
--changeset ziucay:4
CREATE TABLE application.user_receipts
(
    id         SERIAL PRIMARY KEY,
    user_id    integer NOT NULL,
    receipt_id integer NOT NULL,
    CONSTRAINT fk_user
        FOREIGN KEY (user_id)
            REFERENCES application.user (id),
    CONSTRAINT fk_receipt
        FOREIGN KEY (receipt_id)
            REFERENCES application.receipt (id)
);
--rollback DROP TABLE application.user_receipts;