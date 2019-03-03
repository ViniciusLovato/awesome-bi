
CREATE USER "dashboard-app" WITH password 'dashboard-app';

CREATE SCHEMA dashboard;

GRANT USAGE ON SCHEMA dashboard TO "dashboard-app";
ALTER USER "dashboard-app" SET search_path = dashboard, public;

ALTER DEFAULT PRIVILEGES
   IN SCHEMA dashboard
GRANT SELECT, UPDATE, INSERT, DELETE ON TABLES
   TO "dashboard-app";

CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
