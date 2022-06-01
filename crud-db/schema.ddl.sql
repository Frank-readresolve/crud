DROP TABLE IF EXISTS persons;
DROP TABLE IF EXISTS attitudes;
DROP TABLE IF EXISTS hobbies;

CREATE TABLE attitudes (  
	id SERIAL PRIMARY KEY,  
	name varchar(10) UNIQUE NOT NULL
);

CREATE TABLE hobbies (  
	id SERIAL PRIMARY KEY,  
	name varchar(10) UNIQUE NOT NULL
);

CREATE TABLE persons (  
	id SERIAL PRIMARY KEY,  
	learner_number CHAR(6) UNIQUE NOT NULL,
	first_name varchar(255) NOT NULL,
	last_name varchar(255) NOT NULL,
	attitude_id INTEGER NOT NULL,
	hobby_id INTEGER NOT NULL,
	CONSTRAINT fk_attitude_id
    	FOREIGN KEY (attitude_id)
    	REFERENCES attitudes(id),
    CONSTRAINT fk_hobby_id
    	FOREIGN KEY (hobby_id)
    	REFERENCES hobbies(id)
);
