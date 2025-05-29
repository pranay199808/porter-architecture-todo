CREATE TABLE IF NOT EXISTS business_accounts(
id SERIAL PRIMARY KEY,
external_id uuid NOT NULL,
"name" VARCHAR(256) NOT NULL,
brand_name VARCHAR(256) NOT NULL);

ALTER TABLE business_accounts ADD CONSTRAINT business_accounts_external_id_unique UNIQUE (external_id);
ALTER TABLE business_accounts ADD CONSTRAINT business_accounts_name_unique UNIQUE ("name");

CREATE TABLE IF NOT EXISTS billing_infos(
id SERIAL PRIMARY KEY,
account_id INT NOT NULL,
 gst_in VARCHAR(256) NOT NULL,
 gst_reg_address VARCHAR(256) NOT NULL,
 invoice_address VARCHAR(256) NOT NULL);

ALTER TABLE billing_infos ADD CONSTRAINT billing_infos_account_id_unique UNIQUE (account_id);


CREATE TABLE IF NOT EXISTS credit_limits(
id SERIAL PRIMARY KEY,
account_id INT NOT NULL,
amount INT NOT NULL);

ALTER TABLE credit_limits ADD CONSTRAINT credit_limits_account_id_unique UNIQUE (account_id);


CREATE TABLE IF NOT EXISTS business_customers(
id SERIAL PRIMARY KEY,
customer_id INT NOT NULL,
account_id INT NOT NULL,
is_admin BOOLEAN NOT NULL);

ALTER TABLE business_customers ADD CONSTRAINT business_customers_customer_id_unique UNIQUE (customer_id);


CREATE TABLE IF NOT EXISTS tags(
id SERIAL PRIMARY KEY,
owner_type INT NOT NULL,
owner_id INT NOT NULL,
"key" VARCHAR(256) NOT NULL,
"value" VARCHAR(256) NOT NULL);

ALTER TABLE tags ADD CONSTRAINT tags_owner_type_owner_id_key_unique UNIQUE (owner_type, owner_id, "key");

CREATE TABLE IF NOT EXISTS business_orders(
id SERIAL PRIMARY KEY,
customer_id INT NOT NULL,
order_id INT NOT NULL);

ALTER TABLE business_orders ADD CONSTRAINT business_orders_order_id_unique UNIQUE (order_id);

CREATE TABLE IF NOT EXISTS events(
id SERIAL PRIMARY KEY,
account_id INT NOT NULL,
event_type INT NOT NULL,
created_at TIMESTAMP NOT NULL);


CREATE TABLE IF NOT EXISTS ledgers(
id SERIAL PRIMARY KEY,
account_id INT NOT NULL,
transaction_id INT NOT NULL,
transaction_change_type INT NOT NULL,
amount INT NOT NULL, "trigger" INT NOT NULL,
balance_amount INT NOT NULL,
created_at TIMESTAMP NOT NULL);


CREATE TABLE IF NOT EXISTS settlements(
id SERIAL PRIMARY KEY,
credit_transaction_id INT NOT NULL,
debit_transaction_d INT NOT NULL,
amount INT NOT NULL,
is_valid BOOLEAN NOT NULL);

CREATE TABLE IF NOT EXISTS transactions(
id SERIAL PRIMARY KEY,
event_id INT NOT NULL,
transaction_type INT NOT NULL,
ref_type INT NOT NULL,
ref_id VARCHAR(256) NOT NULL,
amount INT NOT NULL,
unsettled_amount INT NOT NULL,
created_at TIMESTAMP NOT NULL,
updated_at TIMESTAMP NOT NULL);


CREATE TABLE IF NOT EXISTS wallets(
id SERIAL PRIMARY KEY,
account_id INT NOT NULL,
amount INT NOT NULL);

ALTER TABLE wallets ADD CONSTRAINT wallets_account_id_unique UNIQUE (account_id);

