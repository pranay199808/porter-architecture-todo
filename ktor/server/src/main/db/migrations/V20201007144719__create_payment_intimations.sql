CREATE TABLE IF NOT EXISTS payment_intimations(
  id SERIAL PRIMARY KEY,

  account_id INT NOT NULL,
  external_id uuid NOT NULL,

  intimation_type INT NOT NULL,

  bcp_amount_usage INT,
  bcp_duration_days INT,

  balance_usage_level INT,

  credit_days_used INT,
  credit_days_usage_level INT,

  credit_amount_used INT,
  credit_amount_usage_level INT,

  status INT NOT NULL,

  expiry_ts timestamp NOT NULL,
  created_at timestamp NOT NULL
);
