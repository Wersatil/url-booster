CREATE TABLE url (
    id bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY UNIQUE,
    custom_url varchar(128) UNIQUE NOT NULL,
    original_url varchar(512) NOT NULL,
    theme varchar(100),
    owner varchar(64) NOT NULL
);
