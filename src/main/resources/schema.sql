
DROP TABLE IF EXISTS PHONE;

CREATE TABLE PHONE
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    number     VARCHAR(250),
    citycode   VARCHAR(250),
    contrycode VARCHAR(250)
);

DROP TABLE IF EXISTS USUARIO;

CREATE TABLE USUARIO
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(250),
    last_name  VARCHAR(250),
    email      VARCHAR(250),
    created    Date,
    modified   Date,
    last_login Date,
    token      VARCHAR(4000),
    active     VARCHAR(250),
    password   VARCHAR(250),
    phone      INT,
    CONSTRAINT fk_phone FOREIGN KEY (phone) REFERENCES PHONE(id)
);
