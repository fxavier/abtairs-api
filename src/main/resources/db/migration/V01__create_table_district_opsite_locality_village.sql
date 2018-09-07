CREATE TABLE district(
id BIGSERIAL NOT NULL,
name VARCHAR(100) NOT NULL,
active BOOLEAN NOT NULL DEFAULT true,
PRIMARY KEY(id)
);

CREATE TABLE operational_site(
id SERIAL NOT NULL,
name VARCHAR(100) NOT NULL,
target BIGINT NOT NULL DEFAULT 0,
district_id BIGINT,
active BOOLEAN NOT NULL DEFAULT true,
PRIMARY KEY(id),
CONSTRAINT fk_op_site_district
     FOREIGN KEY(district_id) REFERENCES district(id)
);

CREATE TABLE locality(
id BIGSERIAL NOT NULL,
name VARCHAR(100) NOT NULL,
operational_site_id INTEGER,
active BOOLEAN NOT NULL DEFAULT true,
PRIMARY KEY(id),
CONSTRAINT fk_op_site_locality
     FOREIGN KEY(operational_site_id) REFERENCES operational_site(id)
);

CREATE TABLE village(
id BIGSERIAL NOT NULL,
name VARCHAR(100) NOT NULL,
locality_id INTEGER,
revisits BIGINT NOT NULL DEFAULT 0,
active BOOLEAN NOT NULL DEFAULT true,
PRIMARY KEY(id),
CONSTRAINT fk_village_locality
     FOREIGN KEY(locality_id) REFERENCES locality(id)
);