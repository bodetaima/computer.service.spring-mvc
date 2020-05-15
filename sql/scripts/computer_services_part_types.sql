create table part_types
(
    id             int auto_increment
        primary key,
    type           varchar(255)         null,
    is_parent_type tinyint(1) default 0 null,
    parent_type    varchar(255)         null,
    name           varchar(255)         null,
    description    longtext             null,
    created_by     int        default 0 null,
    created_date   datetime(6)          null,
    deleted        bit                  not null,
    updated_by     int        default 0 null,
    updated_date   datetime(6)          null
);

INSERT INTO computer_services.part_types (type, is_parent_type, parent_type, name, description, created_by,
                                          created_date, deleted, updated_by, updated_date)
VALUES ('mainboard', 0, 'component', 'Motherboard', 'Motherboard of the PC', 0, '2020-05-15 12:01:12', false, 0,
        '2020-05-15 12:33:02');
INSERT INTO computer_services.part_types (type, is_parent_type, parent_type, name, description, created_by,
                                          created_date, deleted, updated_by, updated_date)
VALUES ('cpu', 0, 'component', 'CPU', 'CPU of the PC', 0, '2020-05-15 12:01:14', false, 0, '2020-05-15 12:33:04');
INSERT INTO computer_services.part_types (type, is_parent_type, parent_type, name, description, created_by,
                                          created_date, deleted, updated_by, updated_date)
VALUES ('ram', 0, 'component', 'RAM', 'RAM of the PC', 0, '2020-05-15 12:02:03', false, 0, '2020-05-15 12:33:06');
INSERT INTO computer_services.part_types (type, is_parent_type, parent_type, name, description, created_by,
                                          created_date, deleted, updated_by, updated_date)
VALUES ('gpu', 0, 'component', 'GPU', 'GPU of the PC', 0, '2020-05-15 12:03:46', false, 0, '2020-05-15 12:33:05');
INSERT INTO computer_services.part_types (type, is_parent_type, parent_type, name, description, created_by,
                                          created_date, deleted, updated_by, updated_date)
VALUES ('psu', 0, 'component', 'PSU', 'PSU of the PC', 0, '2020-05-15 12:04:34', false, 0, '2020-05-15 12:33:07');
INSERT INTO computer_services.part_types (type, is_parent_type, parent_type, name, description, created_by,
                                          created_date, deleted, updated_by, updated_date)
VALUES ('hdd', 0, 'storage', 'HDD', 'HDD of the PC', 0, '2020-05-15 12:05:26', false, 0, '2020-05-15 12:33:08');
INSERT INTO computer_services.part_types (type, is_parent_type, parent_type, name, description, created_by,
                                          created_date, deleted, updated_by, updated_date)
VALUES ('ssd', 0, 'storage', 'SSD', 'SSD of the PC', 0, '2020-05-15 12:06:00', false, 0, '2020-05-15 12:33:09');
INSERT INTO computer_services.part_types (type, is_parent_type, parent_type, name, description, created_by,
                                          created_date, deleted, updated_by, updated_date)
VALUES ('component', 1, null, 'Linh kiện máy tính', 'Linh kiện máy tính', 0, '2020-05-15 17:10:36', false, 0,
        '2020-05-15 17:10:44');
INSERT INTO computer_services.part_types (type, is_parent_type, parent_type, name, description, created_by,
                                          created_date, deleted, updated_by, updated_date)
VALUES ('storage', 1, null, 'Thiết bị lưu trữ', 'Thiết bị lưu trữ', 0, '2020-05-15 17:13:21', false, 0,
        '2020-05-15 17:13:29');