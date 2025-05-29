CREATE TABLE IF NOT EXISTS admin_profiles(
  id               SERIAL PRIMARY KEY,
  admin_id         INT NOT NULL,
  first_name       VARCHAR(256)  NOT NULL,
  last_name        VARCHAR(256)   NOT NULL,
  mobile           VARCHAR(256)   NOT NULL,
  created_at       TIMESTAMP NOT NULL
);

CREATE UNIQUE INDEX admin_id_uniq_index on admin_profiles(admin_id);