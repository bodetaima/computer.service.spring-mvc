create table roles
(
    id               int auto_increment
        primary key,
    created_by       int          null,
    created_date     datetime(6)  null,
    deleted          bit          not null,
    updated_by       int          null,
    updated_date     datetime(6)  null,
    name             varchar(255) null,
    role_description varchar(255) null
);

