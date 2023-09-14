--liquibase formatted sql

--changeset max:1
CREATE TABLE IF NOT EXISTS users
(
    id BIGSERIAL PRIMARY KEY ,
    firstname VARCHAR(64) NOT NULL,
    lastname VARCHAR(64) NOT NULL,
    login VARCHAR(64) NOT NULL UNIQUE ,
    password VARCHAR(256) NOT NULL,
    birth_date DATE,
    role VARCHAR(32)
    );