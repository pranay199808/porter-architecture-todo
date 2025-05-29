CREATE TABLE IF NOT EXISTS account_versions(
  id         SERIAL PRIMARY KEY,
  account_id INT NOT NULL,
  property   INT NOT NULL,
  value      varchar(256) NOT NULL,
  start_ts   timestamp NOT NULL,
  end_ts     timestamp
);
