create table users (
    id long unsigned NOT NULL AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    created_date TIMESTAMP,
);

create table diary (
    id long unsigned NOT NULL AUTO_INCREMENT,
    title VARCHAR(30) NOT NULL,
    content text NOT NULL,
    created_date TIMESTAMP,
    status BOOLEAN DEFAULT TRUE,
    user_id long,

    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);