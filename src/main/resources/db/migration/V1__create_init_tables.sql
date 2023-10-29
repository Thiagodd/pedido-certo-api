CREATE TABLE cuisine
(
    id         UUID NOT NULL,
    created_by VARCHAR(50),
    updated_by VARCHAR(50),
    created_at TIMESTAMP WITHOUT TIME ZONE,
    updated_at TIMESTAMP WITHOUT TIME ZONE,
    name       VARCHAR(50) NOT NULL,
    CONSTRAINT pk_cuisine PRIMARY KEY (id)
);

CREATE TABLE order_item
(
    id          UUID NOT NULL,
    quantity    INTEGER,
    unit_price  DECIMAL,
    total_price DECIMAL,
    order_id    UUID NOT NULL,
    product_id  UUID NOT NULL,
    CONSTRAINT pk_order_item PRIMARY KEY (id)
);

CREATE TABLE orders
(
    id                   UUID NOT NULL,
    created_by           VARCHAR(50),
    updated_by           VARCHAR(50),
    created_at           TIMESTAMP WITHOUT TIME ZONE,
    updated_at           TIMESTAMP WITHOUT TIME ZONE,
    total_price          DECIMAL,
    shipping_rate        DECIMAL,
    subtotal             DECIMAL,
    confirmation_date    TIMESTAMP WITHOUT TIME ZONE,
    cancellation_date    TIMESTAMP WITHOUT TIME ZONE,
    delivery_date        TIMESTAMP WITHOUT TIME ZONE,
    status               VARCHAR(50),
    restaurant_id        UUID NOT NULL,
    address_cep          VARCHAR(50),
    address_public_place VARCHAR(50),
    address_number       VARCHAR(50),
    address_complement   VARCHAR(50),
    address_neighborhood VARCHAR(50),
    CONSTRAINT pk_orders PRIMARY KEY (id)
);

CREATE TABLE payment_method
(
    id          UUID NOT NULL,
    description VARCHAR(50),
    CONSTRAINT pk_payment_method PRIMARY KEY (id)
);

CREATE TABLE product
(
    id                UUID NOT NULL,
    created_by        VARCHAR(50),
    updated_by        VARCHAR(50),
    created_at        TIMESTAMP WITHOUT TIME ZONE,
    updated_at        TIMESTAMP WITHOUT TIME ZONE,
    name              VARCHAR(50),
    small_description VARCHAR(255),
    long_description  VARCHAR(500),
    price             DECIMAL,
    active            BOOLEAN,
    restaurant_id     UUID NOT NULL,
    CONSTRAINT pk_product PRIMARY KEY (id)
);

CREATE TABLE restaurant
(
    id                   UUID NOT NULL,
    created_by           VARCHAR(50),
    updated_by           VARCHAR(50),
    created_at           TIMESTAMP WITHOUT TIME ZONE,
    updated_at           TIMESTAMP WITHOUT TIME ZONE,
    name                 VARCHAR(50),
    shipping_rate        DECIMAL,
    active               BOOLEAN,
    open                 BOOLEAN,
    address_cep          VARCHAR(50),
    address_public_place VARCHAR(50),
    address_number       VARCHAR(50),
    address_complement   VARCHAR(50),
    address_neighborhood VARCHAR(50),
    CONSTRAINT pk_restaurant PRIMARY KEY (id)
);

CREATE TABLE restaurant_payment_method
(
    payment_method_id UUID NOT NULL,
    restaurant_id     UUID NOT NULL,
    CONSTRAINT pk_restaurant_payment_method PRIMARY KEY (payment_method_id, restaurant_id)
);

ALTER TABLE orders
    ADD CONSTRAINT FK_ORDERS_ON_RESTAURANT FOREIGN KEY (restaurant_id) REFERENCES restaurant (id);

ALTER TABLE order_item
    ADD CONSTRAINT FK_ORDER_ITEM_ON_ORDER FOREIGN KEY (order_id) REFERENCES orders (id);

ALTER TABLE order_item
    ADD CONSTRAINT FK_ORDER_ITEM_ON_PRODUCT FOREIGN KEY (product_id) REFERENCES product (id);

ALTER TABLE product
    ADD CONSTRAINT FK_PRODUCT_ON_RESTAURANT FOREIGN KEY (restaurant_id) REFERENCES restaurant (id);

ALTER TABLE restaurant_payment_method
    ADD CONSTRAINT fk_respaymet_on_payment_method FOREIGN KEY (payment_method_id) REFERENCES payment_method (id);

ALTER TABLE restaurant_payment_method
    ADD CONSTRAINT fk_respaymet_on_restaurant FOREIGN KEY (restaurant_id) REFERENCES restaurant (id);