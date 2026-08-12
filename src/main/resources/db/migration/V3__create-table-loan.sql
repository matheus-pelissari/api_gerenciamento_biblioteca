CREATE TABLE loan (
    id BIGSERIAL PRIMARY KEY ,
    book_id BIGINT REFERENCES book(id) NOT NULL,
    user_id BIGINT REFERENCES users(id) NOT NULL,
    loan_date DATE DEFAULT NOW(),
    due_date DATE NOT NULL,
    return_date TIMESTAMP DEFAULT NULL,
    status VARCHAR(20) NOT NULL
)