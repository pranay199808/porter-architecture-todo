CREATE TABLE IF NOT EXISTS payment_strategies(
  id SERIAL PRIMARY KEY,
  account_id INT NOT NULL,
  strategy INT NOT NULL,
  amount INT,
  days INT
);

ALTER TABLE payment_strategies ADD CONSTRAINT payment_strategies_account_id_unique UNIQUE (account_id);
