select * from oficina;
select * from empleado;
select * from cliente;
select * from pedido;
select * from pago;
select * from producto;

/*actividades*/
select codigo_oficina, ciudad from oficina;
select ciudad, telefono from oficina where pais like 'españa';
select nombre, CONCAT(apellido1, ', ',apellido2) AS 'Apellidos', email from empleado where codigo_jefe = 7;
select puesto as 'nombre del puesto', nombre, CONCAT(apellido1, ', ',apellido2) AS 'Apellidos', email from empleado where codigo_jefe is NULL; /*Se usa is sino no lo toma con =*/
select nombre, CONCAT(apellido1, ', ',apellido2) AS 'Apellidos', puesto from empleado where puesto not like 'Representante Ventas'; 
select nombre_cliente from cliente where pais like 'Spain'; 
select estado from pedido group by estado; /* Se utiliza el group by para mostrar solamente los diferentes estadíos*/
/*Se utilizan las 3 formas*/
select codigo_cliente from pago where year(fecha_pago) = '2008' group by codigo_cliente;
select codigo_cliente from pago where date_format(fecha_pago, '%Y')='2008'  group by codigo_cliente;
select * from pago;
select codigo_cliente from pago where fecha_pago like '2008%' group by codigo_cliente;
/*Se utilizan las 3 formas*/
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega from pedido where fecha_entrega > fecha_esperada;

/*Se utilizan las 2 formas*/
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega from pedido 
where fecha_esperada>=adddate(fecha_entrega, interval 2 Day);

select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega from pedido 
where datediff(fecha_entrega,fecha_esperada)<=-2;
/*Se utilizan las 2 formas*/

/*Se utilizan las 3 formas nuevamente*/
select * from pedido where estado = 'rechazado' and year (fecha_pedido) = '2009';
select * from pedido where estado = 'rechazado' and fecha_pedido like '2009%';
select * from pedido where estado = 'rechazado' and date_format(fecha_pedido, '%Y')='2009'; /* Solamente con año se utiliza mayuscula*/
/*Se utilizan las 3 formas nuevamente*/

select * from pedido where month(fecha_entrega) = '01';
select * from pedido where date_format(fecha_entrega, '%m') = '01'; /* Se utiliza m minuscula porque discrimina/*



/*13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal.
Ordene el resultado de mayor a menor.*/
select * from pago where date_format(fecha_pago, '%Y') = '2008' AND forma_pago = 'paypal' order by total DESC;
select forma_pago from pago group by forma_pago; 
select * from producto where gama like 'Ornamentales' and cantidad_en_stock > 100 order by precio_venta desc;
select c.* from cliente c, empleado e where ciudad like 'Madrid' and e.puesto like 'Representante Ventas' and codigo_empleado_rep_ventas = 30 or codigo_empleado_rep_ventas = 11 ;
select nombre_cliente, nombre, CONCAT(apellido1,', ', apellido2) as Apellidos from cliente inner join empleado on codigo_empleado_rep_ventas = codigo_jefe;
select nombre_cliente, nombre, CONCAT(apellido1,', ', apellido2) as Apellidos from cliente inner join empleado on codigo_empleado_rep_ventas = codigo_jefe where ;

/*2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus
representantes de ventas.*


