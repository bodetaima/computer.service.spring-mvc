create user 'computer_services'@'%' identified by 'phongtt';
grant all privileges on computer_services.* to 'computer_services'@'%';

create table computers
(
    id             int auto_increment
        primary key,
    created_by     int          null,
    created_date   datetime(6)  null,
    deleted        bit          not null,
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

create table cpu
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

INSERT INTO computer_services.cpu (created_by, created_date, deleted, updated_by, updated_date, description, name,
                                   price)
VALUES (0, '2020-05-03 22:11:14.619000000', false, 0, '2020-05-03 22:11:14.619000000', 'My current CPU!',
        'AMD Ryzen 5 3400G', 4089000);

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

create table hdd
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

create table main_board
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

INSERT INTO computer_services.main_board (created_by, created_date, deleted, updated_by, updated_date, description,
                                          name, price)
VALUES (0, '2020-04-28 23:27:58.675000000', false, 0, '2020-04-28 23:27:58.675000000', 'My current mainboard!',
        'ASUS PRIME B450M-A', 1799000);

create table operations
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

create table order_service_plan_operations
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

create table permissions
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

create table psu
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

create table ram
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

INSERT INTO computer_services.roles (created_by, created_date, deleted, updated_by, updated_date, name,
                                     role_description)
VALUES (0, '2020-04-27 22:32:04', false, 0, '2020-04-27 22:32:11', 'ROLE_USER', 'User role');
INSERT INTO computer_services.roles (created_by, created_date, deleted, updated_by, updated_date, name,
                                     role_description)
VALUES (0, '2020-04-27 22:32:05', false, 0, '2020-04-27 22:32:12', 'ROLE_CUSTOMER', 'Customer role');
INSERT INTO computer_services.roles (created_by, created_date, deleted, updated_by, updated_date, name,
                                     role_description)
VALUES (0, '2020-04-27 22:32:06', false, 0, '2020-04-27 22:32:12', 'ROLE_ADMIN', 'Admin role');

create table role_permissions
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

create table service_plan_operations
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

create table service_plans
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

INSERT INTO computer_services.ssd (created_by, created_date, deleted, updated_by, updated_date, description, name,
                                   price)
VALUES (0, '2020-05-03 22:13:00.389000000', false, 0, '2020-05-03 22:13:00.389000000', 'My current SSD!',
        'Intel 512Gb SSD', 2799000);

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

INSERT INTO computer_services.users (created_by, created_date, deleted, updated_by, updated_date, address, birth_date,
                                     email, full_name, password, phone_number, role_id, user_code, username)
VALUES (0, '2020-04-27 22:32:44.776000000', false, 0, '2020-04-27 22:32:44.776000000', null, null,
        'tranphongbb@outlook.com', null, '$2a$10$4PaBQNEXkpO.Bi4f8VpwAufKHpexe5VoYXnx0KwF3dGjoVXa0k1l6', null, null,
        null, 'tranphongbb');
INSERT INTO computer_services.users (created_by, created_date, deleted, updated_by, updated_date, address, birth_date,
                                     email, full_name, password, phone_number, role_id, user_code, username)
VALUES (0, '2020-04-27 22:33:15.555000000', false, 0, '2020-04-27 22:33:15.555000000', null, null, 'admin@wefixit.com',
        null, '$2a$10$MnXKKqUh7eXb7GkkANglbu5GVdtsPNYwMtlaeUEL9TnehX539CqK6', null, null, null, 'root');

create table user_roles
(
    user_id int not null,
    role_id int not null,
    primary key (user_id, role_id),
    constraint FKh8ciramu9cc9q3qcqiv4ue8a6
        foreign key (role_id) references roles (id),
    constraint FKhfh9dx7w3ubf1co1vdev94g3f
        foreign key (user_id) references users (id)
);

INSERT INTO computer_services.user_roles (user_id, role_id)
VALUES (1, 1);
INSERT INTO computer_services.user_roles (user_id, role_id)
VALUES (2, 1);
INSERT INTO computer_services.user_roles (user_id, role_id)
VALUES (2, 3);

create table vga
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
