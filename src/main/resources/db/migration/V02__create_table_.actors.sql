CREATE TABLE spray_operator(
id BIGSERIAL,
sop_code BIGINT NOT NULL,
name VARCHAR(100) NOT NULL,
district_id BIGINT NOT NULL,
active BOOLEAN DEFAULT true,
PRIMARY KEY(id),
CONSTRAINT fk_sop_district 
  FOREIGN KEY(district_id) REFERENCES district(id)
);

CREATE TABLE mobilizer(
id BIGSERIAL,
mob_code BIGINT NOT NULL,
name VARCHAR(100) NOT NULL,
district_id BIGINT NOT NULL,
active BOOLEAN DEFAULT true,
PRIMARY KEY(id),
CONSTRAINT fk_mob_district 
  FOREIGN KEY(district_id) REFERENCES district(id)
);

CREATE TABLE team_leader(
id BIGSERIAL,
tl_code BIGINT NOT NULL,
name VARCHAR(100) NOT NULL,
district_id BIGINT NOT NULL,
active BOOLEAN DEFAULT true,
PRIMARY KEY(id),
CONSTRAINT fk_tl_district 
 FOREIGN KEY(district_id) REFERENCES district(id)
);

CREATE TABLE brigade_superviser(
id BIGSERIAL,
bs_code BIGINT NOT NULL,
name VARCHAR(100) NOT NULL,
district_id BIGINT NOT NULL,
active BOOLEAN DEFAULT true,
PRIMARY KEY(id),
CONSTRAINT fk_bs_district 
 FOREIGN KEY(district_id) REFERENCES district(id)
);

CREATE TABLE iec_assistant(
id BIGSERIAL,
iec_code BIGINT NOT NULL,
name VARCHAR(100) NOT NULL,
district_id BIGINT NOT NULL,
active BOOLEAN DEFAULT true,
PRIMARY KEY(id),
CONSTRAINT fk_iec_district 
 FOREIGN KEY(district_id) REFERENCES district(id)
);