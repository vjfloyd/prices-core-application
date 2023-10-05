CREATE TABLE PRICES (
    id   INTEGER NOT NULL AUTO_INCREMENT,
    brand_id  INTEGER NOT NULL ,
    start_date  VARCHAR(255) NOT NULL,
    end_date  VARCHAR(255) NOT NULL,
    price_list  INTEGER NOT NULL,
    product_id  INTEGER NOT NULL,
    priority  INTEGER NOT NULL,
    price  INTEGER NOT NULL,
    currency  VARCHAR(128) NOT NULL,
    PRIMARY KEY (id)
);