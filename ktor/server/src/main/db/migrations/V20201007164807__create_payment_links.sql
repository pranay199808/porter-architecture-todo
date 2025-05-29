CREATE TABLE IF NOT EXISTS payment_links(
  id SERIAL PRIMARY KEY,
  ref_id uuid NOT NULL,
  account_id INT NOT NULL,
  amount INT NOT NULL,
  link VARCHAR(256) NOT NULL,
  created_at timestamp NOT NULL
)
