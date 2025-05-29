CREATE TABLE IF NOT EXISTS business_account_emails(
  id SERIAL PRIMARY KEY,
  account_id INT NOT NULL,
  email_type INT NOT NULL,
  email VARCHAR(256) NOT NULL
);

ALTER TABLE business_account_emails ADD CONSTRAINT business_account_emails_email_unique UNIQUE (email);
