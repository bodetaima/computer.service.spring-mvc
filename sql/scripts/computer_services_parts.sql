create table parts
(
    id           int auto_increment
        primary key,
    part_type_id int          null,
    name         varchar(255) null,
    price        double       null,
    description  longtext     null,
    created_by   int          null,
    created_date datetime(6)  null,
    deleted      bit          not null,
    updated_by   int          null,
    updated_date datetime(6)  null
);

INSERT INTO computer_services.parts (part_type_id, name, price, description, created_by, created_date, deleted, updated_by, updated_date) VALUES (4, 'ASUS ROG STRIX RTX 2080 Super-8G GAMING', 13699000, 'Phiên bản RTX 2080 Super cao cấp của Asus. Xung nhân tối đa: 1785 MHz.', 1, '2020-05-15 14:59:11.661000000', false, 1, '2020-05-15 16:13:04.689000000');
INSERT INTO computer_services.parts (part_type_id, name, price, description, created_by, created_date, deleted, updated_by, updated_date) VALUES (4, 'INNO3D GTX 1660 Super TWIN X2', 5899000, 'Phiên bản GTX 1660 Super giá rẻ của Inno3D', 1, '2020-05-15 14:59:46.373000000', false, 0, '2020-05-15 14:59:46.373000000');
INSERT INTO computer_services.parts (part_type_id, name, price, description, created_by, created_date, deleted, updated_by, updated_date) VALUES (2, 'Intel Xeon E-2236 (3.4GHz turbo up to 4.8GHz, 6 nhân, 12 luồng, 12 MB Cache, 80W)', 7999000, 'Intel Xeon E-2236 (3.4GHz turbo up to 4.8GHz, 6 nhân, 12 luồng, 12 MB Cache, 80W)', 1, '2020-05-15 16:14:07.722000000', false, 0, '2020-05-15 16:14:07.723000000');