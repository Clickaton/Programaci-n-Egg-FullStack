select * from equipos;
select * from jugadores;
select * from partidos;
select * from estadisticas;

/*Puntos ordenados del 1 al 18*/
select nombre from jugadores order by nombre;
select nombre from jugadores where posicion='c' and peso > 200 order by nombre;
select nombre from equipos order by nombre;
select nombre from equipos where conferencia like "east";  
select * from equipos where ciudad like 'C%' order by nombre;  
select CONCAT(nombre, ', ', nombre_equipo) as 'nombre y equipo' from jugadores order by nombre_equipo;        
select * from jugadores where nombre_equipo like 'raptors' order by nombre;
select CONCAT(Puntos_por_partido, ', ', nombre) AS 'Puntos por partido y nombre del jugador' from estadisticas INNER JOIN jugadores on estadisticas.jugador = jugadores.codigo where nombre like 'Pau Gasol';
SELECT CONCAT(nombre, ', ', Puntos_por_partido, ' puntos.') AS 'Puntos en la temporada 04/05' FROM estadisticas INNER JOIN jugadores on estadisticas.jugador = jugadores.codigo where nombre like 'Pau Gasol' and temporada like '04/05';
select CONCAT(count(puntos_por_partido), ' Punto/s ' , ', ', nombre) AS 'puntos en toda la carrera de los jugadores' from estadisticas INNER JOIN jugadores on estadisticas.jugador = jugadores.codigo group by jugador;
select count(nombre_equipo), nombre_equipo from jugadores group by nombre_equipo order by Nombre_equipo;
select codigo from jugadores where nombre like 'Corey Brever';
