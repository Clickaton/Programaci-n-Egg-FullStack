/*a) A continuación, realizar las siguientes consultas sobre la base de datos personal:
1. Obtener los datos completos de los empleados.
2. Obtener los datos completos de los departamentos.
3. Listar el nombre de los departamentos.
4. Obtener el nombre y salario de todos los empleados.
5. Listar todas las comisiones.
6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.
7. Obtener los datos de los empleados vendedores, ordenados por nombre
alfabéticamente.
8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a
mayor.
9. Obtener el nombre de o de los jefes que tengan su departamento situado en la ciudad
de “Ciudad Real” 45
10. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las
respectivas tablas de empleados.
11. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado
por comisión de menor a mayor.
12. Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta
de: sumar el salario y la comisión, más una bonificación de 500. Mostrar el nombre del
empleado y el total a pagar, en orden alfabético.
13. Muestra los empleados cuyo nombre empiece con la letra J.
14. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos
empleados que tienen comisión superior a 1000.
15. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen
comisión.
16. Obtener la lista de los empleados que ganan una comisión superior a su sueldo.
17. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.
18. Hallar los empleados cuyo nombre no contiene la cadena “MA”
19. Obtener los nombres de los departamentos que sean “Ventas”, “Investigación” o
‘Mantenimiento.
20. Ahora obtener el contrario, los nombres de los departamentos que no sean “Ventas” ni
“Investigación” ni ‘Mantenimiento.
21. Mostrar el salario más alto de la empresa.
22. Mostrar el nombre del último empleado de la lista por orden alfabético.
23. Hallar el salario más alto, el más bajo y la diferencia entre ellos.
24. Hallar el salario promedio por departamento.
Consultas con Having
25. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de
empleados de esos departamentos.
26. Hallar los departamentos que no tienen empleados
Consulta Multitabla (Uso de la sentencia JOIN/LEFT JOIN/RIGHT JOIN)
27. Mostrar la lista de empleados, con su respectivo departamento y el jefe de cada
departamento.
Consulta con Subconsulta
28. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la
empresa. Ordenarlo por departamento.*/

select * from empleados;
select * from departamentos;
select nombre_depto from departamentos;
select nombre, sal_emp from empleados;
select comision_emp from empleados;
select * from empleados where cargo_emp = 'Secretaria'; /*De esta forma puedo traer a todos los empleados que tengan como atributo "Secretaria" en la columna cargo_emp*/
select * from empleados order by nombre;
select nombre, cargo_emp from empleados order by sal_emp desc;/*
select nombre from empleados , departamentos  where cargo_emp like '%Jefe%' and ciudad like 'ciudad real'; Consigna mal entendida*/
SELECT nombre_jefe_depto FROM departamentos WHERE ciudad = 'Ciudad Real';
SELECT CONCAT(nombre, ', ', cargo_emp) AS 'Nombre y cargo'FROM empleados;
 /* De esta forma creo un alias como nombre de tabla y utilizo la funciòn "CONCAT" para mostrar adentro lo que le pida utilizando ',' para darle un espacio y que quede mas prolijo.*/
SELECT sal_emp, comision_emp from empleados  where  id_depto = 2000 order by id_depto desc;
select nombre , (sal_emp + comision_emp + 500) as total from empleados where id_depto = 3000 order by nombre asc; 
select nombre from empleados where nombre like 'j%'; /* Se coloca Like en vez de = */
select nombre, sal_emp, comision_emp, (sal_emp + comision_emp) as total from empleados where comision_emp > 1000;
select nombre, sal_emp, comision_emp, (sal_emp + comision_emp) as total from empleados where comision_emp = 0;
select nombre from empleados where comision_emp > sal_emp;
select nombre from empleados where comision_emp <= sal_emp * 0.30;
select nombre from empleados where nombre not like 'MA%';
select nombre_depto from departamentos where nombre_depto in ('ventas', 'investigación', 'Mantenimiento');
select nombre_depto from departamentos where nombre_depto not in ('ventas', 'investigación', 'Mantenimiento');
select max(sal_emp) from empleados;  
select nombre from empleados order by nombre desc limit 1; /* Con el limit 1 fuerzo a mostrar un solo item*/
select max(sal_emp), min(sal_emp), max(sal_emp) - min(sal_emp) as diferencia from empleados; 
select id_depto as departamento, round(avg(sal_emp)) as promedio from empleados group by id_depto; /* Round se utiliza para redondear y avg para sacar promedio*/
select id_depto as 'id del depto', count(nombre) as empleados from empleados group by id_depto having count(id_depto) > 3;
select count(id_depto) as departamento from empleados group by id_depto having count(id_depto) = 0;
select nombre, empleados.id_depto from empleados inner join departamentos on empleados.id_depto = departamentos.id_depto;
select nombre from empleados where sal_emp>=(select roud(avg(sal_emp)) from empleados) order by id_depto;
/*Consulta con Subconsulta)
28. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la
empresa. Ordenarlo por departamento.*/