use graph_db;

insert ignore into client (id, email, name) values (1, 'rogerio@gmail.com', 'Rogério Brito');
insert ignore into client (id, email, name) values (2, 'claudiana@gmail.com', 'Claudiana Andrade');
insert ignore into client (id, email, name) values (3, 'sophie@gmail.com', 'Sophie Vitória');

insert ignore into product (id, name, price) values (1, 'Boné Chicago Bulls', 100);
insert ignore into product (id, name, price) values (2, 'TV Samsung Q80R', 4.500);
insert ignore into product (id, name, price) values (3, 'Iphone 13 Pro Max 512Gb', 11.300);
insert ignore into product (id, name, price) values (4, 'Sapato All Star 38', 150);
insert ignore into product (id, name, price) values (5, 'Fone Bluetooth Freebuds Pro', 23);
insert ignore into product (id, name, price) values (6, 'Monitor Ultrawide', 23);

select * from client;
select * from product;