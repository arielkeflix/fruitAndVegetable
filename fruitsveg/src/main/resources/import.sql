INSERT INTO addresses(id, street, number, city, country, zip_code)VALUES('3836cbf0-ec20-47ae-9f2f-4a59b89c0184','Calle Azores', '1 C','Barcelona','Spain', '08016'); 
INSERT INTO addresses(id, street, number, city, country, zip_code)VALUES('575c1d13-1480-4dcd-a0f6-05dc7910c779','carre del sol', '3 2','Barcelona','Spain', '08012'); 
INSERT INTO addresses(id, street, number, city, country, zip_code)VALUES('67abca3e-26b6-4baa-8f53-ce53df5724f4','Calle Provenza 74', '3 A','Barcelona','Spain', '08014'); 

INSERT INTO clients (id, dni, name, surname, address_id) VALUES ('0aa0ed3d-d69c-4955-a265-be813c8bf8f3', 'A1234567Z', 'Ruben', 'Alcalde','3836cbf0-ec20-47ae-9f2f-4a59b89c0184');
INSERT INTO clients (id, dni, name, surname, address_id) VALUES ('22c8598b-1dc5-4b34-99bf-3ad228609004', 'C1234567Z', 'Ariel', 'Cohan','575c1d13-1480-4dcd-a0f6-05dc7910c779');
INSERT INTO clients (id,  dni, name, surname, address_id) VALUES ('5ff1e45a-1afd-4a5c-9413-ac87c114d64b', 'B1236767Z','Andres', 'Guzman','67abca3e-26b6-4baa-8f53-ce53df5724f4');

