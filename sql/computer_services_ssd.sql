create table ssd
(
    id           int auto_increment
        primary key,
    created_by   int          null,
    created_date datetime(6)  null,
    deleted      bit          not null,
    updated_by   int          null,
    updated_date datetime(6)  null,
    description  varchar(255) null,
    name         varchar(255) null,
    price        double       null
);

