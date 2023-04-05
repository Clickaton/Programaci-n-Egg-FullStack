select * from equipos;
select * from jugadores;
select * from partidos;
select * from estadisticas;

select distinct posicion from jugadores;
/*CANDADO A*/ 
/*la posición es: 2*/ 
select MAX(Asistencias_por_partido) , count(Asistencias_por_partido) as 'veces que aparece' from estadisticas where Asistencias_por_partido = (select MAX(Asistencias_por_partido) from estadisticas); 
/*El código es: '762525' */
select SUM(peso) as 'contraseña' from jugadores j, equipos e where e.Conferencia = 'East' AND j.posicion like '%C%' and j.Nombre_equipo = e.nombre ;

/*CANDADO B*/ 
/*la posición es: 3*/
select count(jugador) as 'Cantidad de jugadores' from estadisticas  where Asistencias_por_partido > (SELECT COUNT(Nombre) from jugadores where nombre_equipo like 'Heat');
/*El código es: '1740' */
SELECT count(temporada) from partidos where temporada like '%99%';


/*CANDADO C*/
/*la posición es: 1*/
SELECT SUM((Select (SELECT COUNT(j.nombre) from jugadores j , equipos e where j.Procedencia like 'Michigan' and e.Conferencia like 'West' and j.nombre_equipo = e.nombre ) / (SELECT COUNT(codigo) from jugadores where peso >= 195) as division )) +0.9945;
/*El código es:3758 */
SELECT FLOOR(SUM((select avg(e.Puntos_por_partido) from estadisticas e) + (select COUNT(e.Asistencias_por_partido) from estadisticas e) + (select sum(e.Tapones_por_partido) from estadisticas e))) from estadisticas e, equipos f, jugadores j where f.Division = 'central' and e.jugador = j.codigo and j.Nombre_equipo = f.nombre;


/*CANDADO D*/
/*la posición es: 4 */
SELECT FLOOR((SELECT e.Tapones_por_partido from estadisticas e, jugadores j where e.temporada like '00/01' and e.jugador = (SELECT codigo from jugadores where nombre like 'Corey Maggette') and e.jugador = j.codigo)) as posicion;
/*El código es:* 191/
SELECT FLOOR((Select SUM(e.Puntos_por_partido)  from estadisticas e, jugadores j where e.jugador = j.codigo and j.Procedencia like 'Argentina')) as codigo;



