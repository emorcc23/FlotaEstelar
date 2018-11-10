/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Álvaro Santos
 * Created: 10-nov-2018
 */

DROP DATABASE IF EXISTS flotaestelarv2;
CREATE DATABASE flotaestelarv2;
USE flotaestelarv2;

CREATE TABLE nave (
id_nave INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
capitan VARCHAR (100) NOT NULL,
nombre VARCHAR (100) NOT NULL,
matricula VARCHAR (100) NOT NULL,
tipo VARCHAR (100) NOT NULL,
foto VARCHAR (256) NOT NULL);

CREATE TABLE tripulante (
id_tripulante INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR (100) NOT NULL,
cargo VARCHAR (100) NOT NULL,
sexo VARCHAR (100) NOT NULL,
experiencia INT NOT NULL,
origen VARCHAR (100) NOT NULL,
raza VARCHAR (100) NOT NULL,
edad INT NOT NULL,
foto VARCHAR (256) NOT NULL,
id_nave INT NOT NULL,
CONSTRAINT fk_tripulante_nave
FOREIGN KEY (id_nave)
REFERENCES nave(id_nave));

CREATE TABLE mision (
id_mision INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR (100) NOT NULL,
id_nave INT NOT NULL,
CONSTRAINT fk_mision_nave
FOREIGN KEY (id_nave)
REFERENCES nave (id_nave),
descripcion VARCHAR (100) NOT NULL);

CREATE TABLE cuaderno (
id_cuaderno INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
id_nave INT NOT NULL,
CONSTRAINT fk_cuaderno_nave
FOREIGN KEY (id_nave)
REFERENCES nave (id_nave),
fecha DATE NOT NULL,
descripcion VARCHAR (100) NOT NULL,
audio VARCHAR (100) NOT NULL);

INSERT INTO nave (capitan,nombre,matricula,tipo,foto) VALUES ("capitan1","nombre1","matricula1","tipo1","foto1");
INSERT INTO nave (capitan,nombre,matricula,tipo,foto) VALUES ("capitan2","nombre2","matricula2","tipo2","foto2");
INSERT INTO nave (capitan,nombre,matricula,tipo,foto) VALUES ("capitan3","nombre3","matricula3","tipo3","foto3");
INSERT INTO nave (capitan,nombre,matricula,tipo,foto) VALUES ("capitan4","nombre4","matricula4","tipo4","foto4");
INSERT INTO nave (capitan,nombre,matricula,tipo,foto) VALUES ("capitan5","nombre5","matricula5","tipo5","foto5");
INSERT INTO nave (capitan,nombre,matricula,tipo,foto) VALUES ("capitan6","nombre6","matricula6","tipo6","foto6");
INSERT INTO nave (capitan,nombre,matricula,tipo,foto) VALUES ("capitan7","nombre7","matricula7","tipo7","foto7");
INSERT INTO nave (capitan,nombre,matricula,tipo,foto) VALUES ("capitan8","nombre8","matricula8","tipo8","foto8");
INSERT INTO nave (capitan,nombre,matricula,tipo,foto) VALUES ("capitan9","nombre9","matricula9","tipo9","foto9");
INSERT INTO tripulante (nombre,cargo,sexo,experiencia,origen,raza,edad,foto,id_nave) VALUES ("nombre1","cargo1","sexo1",12,"origen1","raza1",36,"foto1",6);
INSERT INTO tripulante (nombre,cargo,sexo,experiencia,origen,raza,edad,foto,id_nave) VALUES ("nombre2","cargo2","sexo2",1,"origen2","raza2",20,"foto2",1);
INSERT INTO tripulante (nombre,cargo,sexo,experiencia,origen,raza,edad,foto,id_nave) VALUES ("nombre3","cargo3","sexo3",5,"origen3","raza3",25,"foto3",8);
INSERT INTO tripulante (nombre,cargo,sexo,experiencia,origen,raza,edad,foto,id_nave) VALUES ("nombre4","cargo4","sexo4",13,"origen4","raza4",34,"foto4",2);
INSERT INTO tripulante (nombre,cargo,sexo,experiencia,origen,raza,edad,foto,id_nave) VALUES ("nombre5","cargo5","sexo5",15,"origen5","raza5",36,"foto5",5);
INSERT INTO tripulante (nombre,cargo,sexo,experiencia,origen,raza,edad,foto,id_nave) VALUES ("nombre6","cargo6","sexo6",18,"origen6","raza6",40,"foto6",4);
INSERT INTO tripulante (nombre,cargo,sexo,experiencia,origen,raza,edad,foto,id_nave) VALUES ("nombre7","cargo7","sexo7",3,"origen7","raza7",19,"foto7",9);
INSERT INTO tripulante (nombre,cargo,sexo,experiencia,origen,raza,edad,foto,id_nave) VALUES ("nombre8","cargo8","sexo8",12,"origen8","raza8",34,"foto8",3);
INSERT INTO tripulante (nombre,cargo,sexo,experiencia,origen,raza,edad,foto,id_nave) VALUES ("nombre9","cargo9","sexo9",2,"origen9","raza9",26,"foto9",7);
INSERT INTO mision (nombre,id_nave,descripcion) VALUES ("nombre1",3,"descripcion1");
INSERT INTO mision (nombre,id_nave,descripcion) VALUES ("nombre2",1,"descripcion2");
INSERT INTO mision (nombre,id_nave,descripcion) VALUES ("nombre3",8,"descripcion3");
INSERT INTO mision (nombre,id_nave,descripcion) VALUES ("nombre4",4,"descripcion4");
INSERT INTO mision (nombre,id_nave,descripcion) VALUES ("nombre5",7,"descripcion5");
INSERT INTO mision (nombre,id_nave,descripcion) VALUES ("nombre6",6,"descripcion6");
INSERT INTO mision (nombre,id_nave,descripcion) VALUES ("nombre7",5,"descripcion7");
INSERT INTO mision (nombre,id_nave,descripcion) VALUES ("nombre8",2,"descripcion8");
INSERT INTO mision (nombre,id_nave,descripcion) VALUES ("nombre9",9,"descripcion9");
INSERT INTO cuaderno (id_nave,fecha,descripcion,audio) VALUES (7,"2019/05/02","descripcion1","audio1");
INSERT INTO cuaderno (id_nave,fecha,descripcion,audio) VALUES (1,"2020/02/19","descripcion2","audio2");
INSERT INTO cuaderno (id_nave,fecha,descripcion,audio) VALUES (3,"2019/12/09","descripcion3","audio3");
INSERT INTO cuaderno (id_nave,fecha,descripcion,audio) VALUES (4,"2020/11/23","descripcion4","audio4");
INSERT INTO cuaderno (id_nave,fecha,descripcion,audio) VALUES (2,"2019/10/07","descripcion5","audio5");
INSERT INTO cuaderno (id_nave,fecha,descripcion,audio) VALUES (8,"2019/01/01","descripcion6","audio6");
INSERT INTO cuaderno (id_nave,fecha,descripcion,audio) VALUES (5,"2020/02/11","descripcion7","audio7");
INSERT INTO cuaderno (id_nave,fecha,descripcion,audio) VALUES (6,"2019/07/07","descripcion8","audio8");
INSERT INTO cuaderno (id_nave,fecha,descripcion,audio) VALUES (9,"2020/02/20","descripcion9","audio9");

SELECT * FROM nave;
SELECT * FROM tripulante;
SELECT * FROM mision;
SELECT * FROM cuaderno;