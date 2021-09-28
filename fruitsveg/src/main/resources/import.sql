INSERT INTO users( username, password,user_type) VALUES('admin@erp.com', '$2a$10$NzRLDUAxTvqEk9qRjC42Ou8xLQbjobSgOWTZwnGqo8SfYW.RK5cPS', 'ADMIN');
INSERT INTO users( username, password,user_type) VALUES( 'employee@erp.com', '$2a$10$QZgGk8xKuJp5JRp4udqDDuUx0uafvisv3H2KXfvPUu0KqR08RVN9i', 'EMPLOYEE');
INSERT INTO users( username, password,user_type) VALUES('client@erp.com', '$2a$10$b/dVgnqDJDO0LKpDN/hta.6ZMW4o94tY7ceOijux7/scPhIZQLL9C', 'CLIENT');


INSERT INTO addresses(id, street, number, city, country, zip_code)VALUES('3836cbf0-ec20-47ae-9f2f-4a59b89c0184','Calle Azores', '1 C','Barcelona','Spain', '08016'); 
INSERT INTO addresses(id, street, number, city, country, zip_code)VALUES('575c1d13-1480-4dcd-a0f6-05dc7910c779','carre del sol', '3 2','Barcelona','Spain', '08012'); 
INSERT INTO addresses(id, street, number, city, country, zip_code)VALUES('67abca3e-26b6-4baa-8f53-ce53df5724f4','Calle Provenza 74', '3 A','Barcelona','Spain', '08014'); 

INSERT INTO clients (id, dni, name, surname, address_id, user_id) VALUES ('0aa0ed3d-d69c-4955-a265-be813c8bf8f3', 'A1234567Z', 'Ruben', 'Alcalde','3836cbf0-ec20-47ae-9f2f-4a59b89c0184','1');
INSERT INTO clients (id, dni, name, surname, address_id, user_id) VALUES ('22c8598b-1dc5-4b34-99bf-3ad228609004', 'C1234567Z', 'Ariel', 'Cohan','575c1d13-1480-4dcd-a0f6-05dc7910c779','2');
INSERT INTO clients (id,  dni, name, surname, address_id, user_id) VALUES ('5ff1e45a-1afd-4a5c-9413-ac87c114d64b', 'B1236767Z','Andres', 'Guzman','67abca3e-26b6-4baa-8f53-ce53df5724f4', '3');

INSERT INTO orders(order_id,client_id,date_created,total,billing_address_id,shipping_address_id)VALUES('0f010722-7425-4d6d-8a48-ac6ec38bdcf6', '0aa0ed3d-d69c-4955-a265-be813c8bf8f3', '2021-07-21 06:23:47','1200','3836cbf0-ec20-47ae-9f2f-4a59b89c0184','3836cbf0-ec20-47ae-9f2f-4a59b89c0184');			  

INSERT INTO products(product_id,created,family,image,modified,name,price,stock,vat,wholesale_price,wholesale_quantity ) VALUES('1','1626853613388','Fruits','url image','1626853613388','Orange','150','100','21','100','200' );
INSERT INTO products(product_id,created,family,image,modified,name,price,stock,vat,wholesale_price,wholesale_quantity ) VALUES('2','1626853613388','Fruits','url image','1626853613388','Kale','350','300','31','300','300' );

INSERT INTO order_details( id,quantity,subtotal,order_id,product_id)VALUES('5400c1b6-2766-4d44-a5ed-bad9e5f635db','5','700','0f010722-7425-4d6d-8a48-ac6ec38bdcf6',1);
INSERT INTO order_details( id,quantity,subtotal,order_id,product_id)VALUES('66f2e44c-c7bc-43b9-9ce6-043a01888b8b','1','150','0f010722-7425-4d6d-8a48-ac6ec38bdcf6',2);
