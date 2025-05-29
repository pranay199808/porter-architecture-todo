CREATE TABLE IF NOT EXISTS bank_accounts(
  id SERIAL PRIMARY KEY,
  account_id INT NOT NULL,
  name varchar(256) NOT NULL,
  bank_name varchar(256) NOT NULL,
  account_number varchar(256) NOT NULL,
  ifsc varchar(256) NOT NULL,
  created_at timestamp NOT NULL
);

CREATE UNIQUE INDEX bank_accounts_account_id_uniqidx ON bank_accounts (account_id);
