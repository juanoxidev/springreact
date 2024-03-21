
-- Registro 1
INSERT INTO persona_detalle (cargo, dependencia, calle, numero) VALUES ('Gerente', 'Departamento de Ventas', 'Calle 123', '123');

INSERT INTO persona (nombre, apellido, personadetalle_id) VALUES ('Juan', 'Perez', 1);



-- Registro 2


INSERT INTO persona_detalle (cargo, dependencia, calle, numero) VALUES ('Analista', 'Departamento de Finanzas', 'Avenida Central', '456');
INSERT INTO Persona (nombre, apellido, personadetalle_id) VALUES ('María', 'Gomez', 2);


-- Registro 3
INSERT INTO persona_detalle (cargo, dependencia, calle, numero) VALUES ('Ingeniero', 'Departamento de Ingeniería', 'Calle Principal', '789');
INSERT INTO persona (nombre, apellido, personadetalle_id) VALUES ('Carlos', 'Rodriguez', 3);



-- Registro 4
INSERT INTO persona_detalle (cargo, dependencia, calle, numero) VALUES ('Asistente', 'Departamento de Recursos Humanos', 'Avenida Norte', '1011');
INSERT INTO persona (nombre, apellido, personadetalle_id) VALUES ('Laura', 'Martinez', 4);



-- Registro 5
INSERT INTO persona_detalle (cargo, dependencia, calle, numero) VALUES ('Analista de Sistemas', 'Departamento de Tecnología', 'Calle Sur', '1213');
INSERT INTO persona (nombre, apellido, personadetalle_id) VALUES ('Pedro', 'Lopez', 5);


insert into category (category_id, name, status) values (1, 'Consumer Services', false);
insert into category (category_id, name, status) values (2, 'Consumer Services', false);
insert into category (category_id, name, status) values (3, 'Miscellaneous', true);

insert into product (id, name, creation_date, category_id) values (1, 'Soup Campbells Mexicali Tortilla', '2023-04-18 12:30:52', 1);
insert into product (id, name, creation_date, category_id) values (2, 'Table Cloth 90x90 White', '2023-05-27', 2);
insert into product (id, name, creation_date, category_id) values (3, 'Gooseberry', '2022-07-05 23:33:00', 3);
insert into product (id, name, creation_date, category_id) values (4, 'Soup - Knorr, Veg / Beef', '2023-05-11', 1);
insert into product (id, name, creation_date, category_id) values (5, 'Bar - Granola Trail Mix Fruit Nut', '2022-09-16 18:00:12', 2);