create table part_types
(
    id           int auto_increment
        primary key,
    type         varchar(255)  null,
    name         varchar(255)  null,
    description  longtext      null,
    created_by   int default 0 null,
    created_date datetime(6)   null,
    deleted      bit           not null,
    updated_by   int default 0 null,
    updated_date datetime(6)   null
);

INSERT INTO computer_services.part_types (type, name, description, created_by, created_date, deleted, updated_by,
                                          updated_date)
VALUES ('mainboard', 'Motherboard', 'Motherboard of the PC', 0, '2020-05-15 12:01:12', false, 0, '2020-05-15 12:33:02');
INSERT INTO computer_services.part_types (type, name, description, created_by, created_date, deleted, updated_by,
                                          updated_date)
VALUES ('cpu', 'Central Processing Unit', 'CPU of the PC', 0, '2020-05-15 12:01:14', false, 0, '2020-05-15 12:33:04');
INSERT INTO computer_services.part_types (type, name, description, created_by, created_date, deleted, updated_by,
                                          updated_date)
VALUES ('ram', 'Random Access Memory', 'RAM of the PC', 0, '2020-05-15 12:02:03', false, 0, '2020-05-15 12:33:06');
INSERT INTO computer_services.part_types (type, name, description, created_by, created_date, deleted, updated_by,
                                          updated_date)
VALUES ('gpu', 'Graphics processing unit', 'GPU of the PC', 0, '2020-05-15 12:03:46', false, 0, '2020-05-15 12:33:05');
INSERT INTO computer_services.part_types (type, name, description, created_by, created_date, deleted, updated_by,
                                          updated_date)
VALUES ('psu', 'Power supply unit', 'PSU of the PC', 0, '2020-05-15 12:04:34', false, 0, '2020-05-15 12:33:07');
INSERT INTO computer_services.part_types (type, name, description, created_by, created_date, deleted, updated_by,
                                          updated_date)
VALUES ('hdd', 'Hard disk drive', 'HDD of the PC', 0, '2020-05-15 12:05:26', false, 0, '2020-05-15 12:33:08');
INSERT INTO computer_services.part_types (type, name, description, created_by, created_date, deleted, updated_by,
                                          updated_date)
VALUES ('ssd', 'Solid state drive', 'SSD of the PC', 0, '2020-05-15 12:06:00', false, 0, '2020-05-15 12:33:09');