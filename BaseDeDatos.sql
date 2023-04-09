create database if not exists Base_de_datos;

use Base_de_datos;

create table if not exists equipos(
id_equipo int auto_increment primary key,
nombre varchar(100),
descripcion varchar(100)
);

create table if not exists partidos(
numPartido int auto_increment primary key,
equipo1 int,
equipo2 int,
golesEquipo1 int,
golesEquipo2 int,
resultado int,
foreign key (equipo1) references equipos(id_equipo),
foreign key (equipo2) references equipos(id_equipo)
);

create table if not exists pronostico(
partido int,
equipo int,
resultado int,
puntos int,
foreign key (partido) references partidos(numPartido),
foreign key (equipo) references equipos(id_equipo)
);

create table if not exists ronda(
nro int auto_increment primary key,
partido int,
puntos int,
foreign key (partido) references partidos(numPartido)
);

create table if not exists resultadoEnum (
ganador int,
perdedor int,
empate int
);

