CREATE TABLE book(
                     id BIGSERIAL PRIMARY KEY,
                     title VARCHAR(256) NOT NULL,
                     author VARCHAR(128) NOT NULL,
                     isbn VARCHAR(100) NOT NULL UNIQUE,
                     publisher VARCHAR(128),
                     publication_year INTEGER,
                     total_copies INTEGER NOT NULL CHECK (total_copies >= 0 ),
                     available_copies  INTEGER NOT NULL CHECK (available_copies >= 0),
                     category VARCHAR(128),
                     created_at TIMESTAMP DEFAULT NOW(),
                     updated_at TIMESTAMP DEFAULT NOW(),
                     status VARCHAR(20) DEFAULT 'Active'
)

