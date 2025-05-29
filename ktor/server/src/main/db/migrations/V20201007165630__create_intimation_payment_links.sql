CREATE TABLE IF NOT EXISTS intimation_payment_links(
  id SERIAL PRIMARY KEY,
  payment_intimation_id INT NOT NULL,
  payment_link_id INT NOT NULL
)
