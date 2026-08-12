CREATE TABLE fine (

    id BIGSERIAL PRIMARY KEY ,
    loan_id BIGINT REFERENCES loan(id) NOT NULL UNIQUE,
    amount DECIMAL(10,2) NOT NULL,
    paid BOOLEAN DEFAULT false,
    payment_date DATE

)