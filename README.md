# ServicioVentaDeArticulos Trabajo Práctico
El alumno deberá entregar un archivo con extensión .zip, con el proyecto netbeans que contenga el código de las clases que se utilizaron para la realización del TP. Debe existir una clase con el método main para poder ejecutar todo el sistema y de ser necesario, un instructivo de como instalar y/o usar el mismo. Esto último resulta de importancia principalmente para el tema de la base de datos a utilizar.

El objetivo del trabajo práctico es generar un sistema con interfaz swing a partir de datos a persistir de vendedores los cuales tendrán asociados los artículos que venden.

Desarrollar el modelo de persistencia en Hibernate definiendo mínimamente las siguientes relaciones:
Definir una entidad Persona de la cual extiendan la entidad Vendedor.
Persona debe tener estas propiedades: Nombre, Apellido, Dirección
Vendedor debe tener estas propiedades: CUIT, Porcentaje de Comisión
Un vendedor puede vender muchos tipos de artículos.
Un vendedor debe tener asociada la Ciudad donde reside como una entidad.
Un artículo debe tener asociada una Marca. Además debe tener como mínimo un código, nombre, descripción, precio costo y precio venta
Crear un formulario para la administración de vendedores cumpliendo como mínimo los siguientes puntos:
Listar todos los artículos.
Agregar un nuevo artículo. Los datos requeridos son Nombre, Código, Precio y Marca (las marcas deben estar precargadas en la base de datos).
Editar un artículo.
Listar todos los vendedores.
Agregar un nuevo vendedor. Los datos requeridos son Nombre, CUIT y Ciudad (las ciudades deben estar precargadas en la base de datos).
Editar un vendedor.
Asociar artículos a un vendedor.
