CREATE TABLE products (
    id SERIAL PRIMARY KEY,
    code VARCHAR(255) UNIQUE,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    color VARCHAR(255),
    price_acquisition NUMERIC,
    cost_percentage NUMERIC,
    price_cost NUMERIC,
    profit_percentage_min NUMERIC,
    profit_percentage_max NUMERIC,
    sale_price_min NUMERIC,
    sale_price_max NUMERIC,
    amount NUMERIC,
    amount_critical NUMERIC,
    id_supplier BIGINT,
    id_product_type BIGINT,
    activated BOOLEAN NOT NULL,
    FOREIGN KEY (id_supplier) REFERENCES suppliers(id),
    FOREIGN KEY (id_product_type) REFERENCES product_type(id)
);