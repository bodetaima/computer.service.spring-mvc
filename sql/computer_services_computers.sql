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

