CREATE TABLE IF NOT EXISTS account_statements(
  id SERIAL PRIMARY KEY,
  account_id INT NOT NULL,
  statement_id varchar(256) NOT NULL,
  cycle_start_ts  timestamp NOT NULL,
  cycle_end_ts  timestamp NOT NULL,
  wallet_balance INT NOT NULL,
  orders_booked INT NOT NULL,
  expenses INT NOT NULL,
  recharges INT NOT NULL,
  total_customers INT NOT NULL,
  active_customers INT NOT NULL,
  pdf_location varchar(256) NOT NULL,
  excel_location varchar(256) NOT NULL,
  created_at timestamp NOT NULL
);

ALTER TABLE account_statements ADD CONSTRAINT account_statements_statement_id_unique UNIQUE (statement_id);
