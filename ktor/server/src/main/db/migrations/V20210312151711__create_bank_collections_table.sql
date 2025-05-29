CREATE TABLE IF NOT EXISTS bank_collections(
  id          SERIAL PRIMARY KEY,
  account_id  INT NOT NULL,
  ref_id      varchar(256) NOT NULL,
  bank_ref_id varchar(256) NOT NULL,
  amount      INT NOT NULL,
  created_at  timestamp NOT NULL
);

CREATE UNIQUE INDEX bank_collections_ref_id_unique_index ON bank_collections(ref_id);
