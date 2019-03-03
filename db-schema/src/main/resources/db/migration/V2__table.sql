SET SCHEMA 'dashboard';

CREATE TABLE data_source (
    id uuid DEFAULT public.uuid_generate_v4() NOT NULL
        CONSTRAINT data_source_pk
        PRIMARY KEY,
    name VARCHAR(50)                          NOT NULL
        CONSTRAINT name_data_source_key
        UNIQUE,
    url VARCHAR(100)                          NOT NULL,
    database_name VARCHAR(100)                NOT NULL,
    port VARCHAR(10)                          NOT NULL,
    database_type VARCHAR(50)                 NOT NULL

);

CREATE TABLE data_table (
    id uuid DEFAULT public.uuid_generate_v4() NOT NULL
        CONSTRAINT data_table_pk
        PRIMARY KEY,
    name VARCHAR(50)                          NOT NULL
        CONSTRAINT data_table_key
        UNIQUE,
    ttl INTEGER                               NOT NULL,
    data_source_id uuid                       NOT NULL
        CONSTRAINT data_table_data_source_id_fk
        REFERENCES data_source
);

