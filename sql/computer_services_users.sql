create table users
(
    id           int auto_increment
        primary key,
    created_by   int          null,
    created_date datetime(6)  null,
    deleted      bit          not null,
    updated_by   int          null,
    updated_date datetime(6)  null,
    address      varchar(255) null,
    birth_date   datetime(6)  null,
    email        varchar(255) null,
    full_name    varchar(255) null,
    password     varchar(255) null,
    phone_number varchar(255) null,
    role_id      varchar(255) null,
    user_code    varchar(255) null,
    username     varchar(255) null
);

