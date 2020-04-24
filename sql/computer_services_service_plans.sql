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

