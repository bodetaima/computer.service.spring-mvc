create table orders
(
    id              int auto_increment
        primary key,
    created_by      int          null,
    created_date    datetime(6)  null,
    deleted         bit          not null,
    updated_by      int          null,
    updated_date    datetime(6)  null,
    customer_id     varchar(255) null,
    name            varchar(255) null,
    order_code      varchar(255) null,
    service_plan_id varchar(255) null,
    user_id         varchar(255) null
);

