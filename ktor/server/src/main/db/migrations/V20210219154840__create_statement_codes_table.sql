CREATE TABLE IF NOT EXISTS statement_codes(
  id SERIAL PRIMARY KEY,
  account_id INT NOT NULL,
  code VARCHAR(256) NOT NULL,
  created_at timestamp NOT NULL
);

ALTER TABLE statement_codes ADD CONSTRAINT statment_codes_code_unique UNIQUE (code);
