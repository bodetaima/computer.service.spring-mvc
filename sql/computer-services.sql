create table if not exists computers
(
    id             int auto_increment
        primary key,
    created_by     int          null,
    created_date   datetime(6)  null,
    deleted        bit          null,
    updated_by     int          null,
    updated_date   datetime(6)  null,
    computer_model varchar(255) null,
    cpu_id         int          null,
    customer_id    int          null,
    hdd_id         int          null,
    mainboard_id   int          null,
    name           varchar(255) null,
    order_id       int          null,
    psu_id         int          null,
    ram_id         int          null,
    ssd_id         int          null,
    vga_id         int          null
);

create table if not exists cpu
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

create table if not exists customers
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

create table if not exists hdd
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

create table if not exists main_board
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

create table if not exists operations
(
    id             int auto_increment
        primary key,
    created_by     int          null,
    created_date   datetime(6)  null,
    deleted        bit          not null,
    updated_by     int          null,
    updated_date   datetime(6)  null,
    name           varchar(255) null,
    operation_code varchar(255) null
);

create table if not exists order_service_plan_operations
(
    id                        int auto_increment
        primary key,
    created_by                int          null,
    created_date              datetime(6)  null,
    deleted                   bit          not null,
    updated_by                int          null,
    updated_date              datetime(6)  null,
    ospo_code                 varchar(255) null,
    name                      varchar(255) null,
    order_id                  varchar(255) null,
    service_plan_operation_id varchar(255) null
);

create table if not exists orders
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

create table if not exists permissions
(
    id              int auto_increment
        primary key,
    created_by      int          null,
    created_date    datetime(6)  null,
    deleted         bit          not null,
    updated_by      int          null,
    updated_date    datetime(6)  null,
    permission_code varchar(255) null
);

create table if not exists psu
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

create table if not exists ram
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

create table if not exists roles
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

create table if not exists role_permissions
(
    role_id       int not null,
    permission_id int not null,
    primary key (role_id, permission_id),
    constraint UK_qfkbccnh2c5o4tc7akq5x11wv
        unique (permission_id),
    constraint FKegdk29eiy7mdtefy5c7eirr6e
        foreign key (permission_id) references permissions (id),
    constraint FKn5fotdgk8d1xvo8nav9uv3muc
        foreign key (role_id) references roles (id)
);

create table if not exists service_plan_operations
(
    id              int auto_increment
        primary key,
    created_by      int          null,
    created_date    datetime(6)  null,
    deleted         bit          not null,
    updated_by      int          null,
    updated_date    datetime(6)  null,
    operation_id    varchar(255) null,
    service_plan_id varchar(255) null
);

create table if not exists service_plans
(
    id                int auto_increment
        primary key,
    created_by        int          null,
    created_date      datetime(6)  null,
    deleted           bit          not null,
    updated_by        int          null,
    updated_date      datetime(6)  null,
    initial_price     int          null,
    name              varchar(255) null,
    service_plan_code varchar(255) null
);

create table if not exists ssd
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

create table if not exists users
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

create table if not exists vga
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


