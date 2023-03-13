SELECT nombre FROM producto;
SELECT nombre, precio FROM producto;
SELECT * FROM producto;
INSERT INTO producto (nombre, precio, codigo_fabricante) VALUES ("Ram 16 GB", 559, 3);
SELECT * FROM fabricante;
SELECT nombre, round(precio) FROM producto;
SELECT codigo_fabricante FROM producto GROUP BY codigo_fabricante;
SELECT nombre FROM fabricante ORDER BY nombre ASC;
SELECT nombre, precio FROM producto ORDER BY nombre, precio DESC;
SELECT * FROM fabricante LIMIT 5;
SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1;
SELECT nombre, precio FROM producto ORDER BY precio DESC LIMIT 1;
SELECT nombre FROM producto WHERE precio <= 120;
SELECT nombre, precio FROM producto WHERE precio between 60 AND 200;
SELECT nombre, codigo_fabricante FROM producto WHERE codigo_fabricante IN (1, 3, 5);
SELECT nombre FROM producto WHERE nombre like "Portatil%";

/*Consultas Multitabla*/

SELECT p.codigo as codigo_producto, p.nombre as nombre_producto, f.codigo as codigo_fabricante, f.nombre as nombre_fabricante FROM producto p, fabricante f WHERE codigo_fabricante = f.codigo ORDER BY p.codigo ASC;
SELECT p.nombre as nombre_producto, p.precio as precio_producto, f.nombre as nombre_fabricante FROM producto p, fabricante f WHERE codigo_fabricante = f.codigo ORDER BY f.nombre;
SELECT p.nombre as nombre_producto, p.precio as precio_producto, f.nombre as nombre_fabricante FROM producto p, fabricante f WHERE codigo_fabricante = f.codigo ORDER BY p.precio LIMIT 1;
SELECT *, f.nombre FROM producto p, fabricante f WHERE f.nombre = "lenovo" AND codigo_fabricante = f.codigo;
SELECT *, f.nombre FROM producto p, fabricante f WHERE f.nombre = "Crucial" AND precio > 200 AND codigo_fabricante = f.codigo;
SELECT *, f.nombre FROM producto p, fabricante f WHERE f.nombre IN ("Asus","Hewlett-Packard") AND codigo_fabricante = f.codigo;
SELECT *, f.nombre FROM producto p, fabricante f WHERE precio >= 180 AND codigo_fabricante = f.codigo ORDER BY precio DESC, p.nombre;
SELECT * FROM fabricante f LEFT JOIN producto  ON codigo_fabricante = f.codigo;
SELECT * FROM fabricante f LEFT JOIN producto p ON codigo_fabricante = f.codigo WHERE p.nombre IS NULL;

/*Subconsultas en la cláusula WHERE*/

SELECT * FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Lenovo");
SELECT * FROM producto WHERE precio = (SELECT max(precio) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Lenovo")) ;
SELECT nombre FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Lenovo") ORDER BY precio DESC LIMIT 1;
SELECT nombre, precio FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Asus") AND precio > (SELECT AVG(precio) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Asus"));

/*Subconsultas con IN y NOT IN*/

SELECT LEFT ("Lenovo",2) FROM producto LIMIT 1;
SELECT CONCAT (LEFT ("Lenovo",2), LEFT("Asus",3)," ", LEFT ("Lenovo",3) ) AS saludo FROM producto LIMIT 1;
SELECT p.*, f.nombre AS nombre_fabricante FROM producto p, fabricante f WHERE codigo_fabricante = f.codigo ORDER BY codigo_fabricante;
SELECT f.nombre FROM fabricante f WHERE nombre IN (SELECT p.nombre FROM producto p WHERE codigo IS NULL ) ;
select F.NOMBRE as Fabricante, count(*) as cantidadDeProductos from producto p Inner join fabricante f on p.codigo_fabricante = f.codigo
 where f.nombre <> 'Lenovo' group by codigo_fabricante having  (Count(codigo_fabricante) = (select count(codigo_fabricante) from producto 
 p where codigo_fabricante = (select codigo from fabricante where nombre = 'Lenovo')));



