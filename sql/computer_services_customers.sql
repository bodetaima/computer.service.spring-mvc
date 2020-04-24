create table customers
(
    id           int auto_increment
        primary key,
    created_by   int          null,
    created_date datetime(6)  null,
    deleted      bit          not null,
    updated_by   int          null,
    updated_date datetime(6)  null,
    address      varchar(255) null,
    email        varchar(255) null,
    full_name    varchar(255) null,
    phone_number varchar(255) null
);

