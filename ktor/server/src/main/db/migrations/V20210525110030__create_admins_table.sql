CREATE TABLE IF NOT EXISTS admins(
  id            SERIAL PRIMARY KEY,
  account_id    INT NOT NULL,
  mail_id       VARCHAR(256)  NOT NULL,
  role          INT NOT NULL,
  is_active     BOOLEAN NOT NULL DEFAULT TRUE,
  created_at    TIMESTAMP NOT NULL
);


CREATE UNIQUE INDEX account_primary_role_unique_idx ON admins(account_id, role, is_active) where is_active and role = 0;
CREATE UNIQUE INDEX account_mail_id_unique ON admins(account_id, mail_id);
CREATE UNIQUE INDEX mail_id_is_active_idx ON admins(mail_id, is_active) where is_active;

CREATE INDEX admins_account_id_idx ON admins(account_id);
CREATE INDEX admins_email_id_idx ON admins(mail_id);
