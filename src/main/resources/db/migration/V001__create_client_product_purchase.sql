use graph_db;

CREATE TABLE client (
        id BIGINT auto_increment primary key
        ,email VARCHAR(255)
        ,name VARCHAR(255)
	);

CREATE TABLE product (
        id BIGINT auto_increment primary key
        ,name VARCHAR(255)
        ,price DECIMAL(19, 2)
	);

CREATE TABLE purchase (
        id BIGINT auto_increment primary key
        ,data DATE
        ,quantity INTEGER
        ,STATUS VARCHAR(255)
        ,client_id BIGINT
        ,product_id BIGINT
	);

ALTER TABLE purchase ADD CONSTRAINT fk_purchase_client_id FOREIGN KEY (client_id) REFERENCES client (id);

ALTER TABLE purchase ADD CONSTRAINT fk_purchase_product_id FOREIGN KEY (product_id) REFERENCES product (id);