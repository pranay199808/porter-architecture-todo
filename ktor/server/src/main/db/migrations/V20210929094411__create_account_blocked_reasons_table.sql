CREATE TABLE IF NOT EXISTS account_blocked_reasons(
  id               SERIAL PRIMARY KEY,
  account_id       INT NOT NULL,
  reason           INT NOT NULL,
  created_at       TIMESTAMP NOT NULL,
  updated_at       TIMESTAMP NOT NULL
);

CREATE UNIQUE INDEX account_blocked_reasons_comp_idx ON account_blocked_reasons(account_id, reason);
CREATE INDEX account_blocked_reasons_account_id_idx on account_blocked_reasons(account_id);
