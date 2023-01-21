package Controlador;

import Modelo.ArticuloVO;
import Modelo.CiudadVO;
import Modelo.Logica;
import Modelo.MarcaVO;
import Modelo.VendedorVO;
import java.util.List;
import org.hibernate.Session;

public class Controlador {
    Session miSession = null;
    Logica miLogica = new Logica(); 
    
    public Controlador(Session session){
        this.miSession = session;
    }
    
    //PRODUCTO
    //CREACION PRODUCTO
    public void crearArticulo(String codigo, String nombre, String descripcion, double precioCosto, double precioVenta, MarcaVO marca) {

        ArticuloVO producto = new ArticuloVO();
        
        producto.setCodigo(codigo);
        producto.setNombre(nombre);
        producto.setDescripcion(descripcion);
        producto.setPrecioCosto(precioCosto);
        producto.setPrecioVenta(precioVenta);
        producto.setMarca(marca);

        miLogica.agregarArticulo(miSession, producto);
    }

    //MODIFICACION PRODUCTO
    public void modificarProducto(int id, String codigo, String nombre, String descripcion, double precioCosto, double precioVenta, MarcaVO marca) {

        ArticuloVO producto = miLogica.recuperarArticulo(miSession, id);

        producto.setCodigo(codigo);
        producto.setNombre(nombre);
        producto.setDescripcion(descripcion);
        producto.setPrecioCosto(precioCosto);
        producto.setPrecioVenta(precioVenta);
        producto.setMarca(marca);

        miLogica.editarArticulo(miSession, producto, id);
    }
    public void modificarProducto2(int id, String codigo, String nombre, String descripcion, double precioCosto, double precioVenta) {

        ArticuloVO producto = miLogica.recuperarArticulo(miSession, id);

        producto.setCodigo(codigo);
        producto.setNombre(nombre);
        producto.setDescripcion(descripcion);
        producto.setPrecioCosto(precioCosto);
        producto.setPrecioVenta(precioVenta);
       
        miLogica.editarArticulo(miSession, producto, id);
    }
    //Buscar un Producto
    
    public Object buscarArticulo (int id){
        ArticuloVO articulo = miLogica.recuperarArticulo(miSession, id);
    return articulo;
    }
 
    
    //LISTAR PRODUCTO
    public List listarArticulos() {

        List<ArticuloVO> articulos = miLogica.listarArticulos(miSession);
        return articulos;
    }

    //MARCA //MODIFICAR
    //LISTAR MARCA
    public List listarMarcas() {

        List<MarcaVO> marcas = miLogica.listarMarca(miSession);
        marcas.sort(null);
        return marcas;
    }

    //CIUDAD //MODIFICAR
    //LISTAR CIUDAD
    public List listarCiudad() {

        List<CiudadVO> ciudades = miLogica.listarCiudades(miSession);
        ciudades.sort(null);
        return ciudades;
    }

    //VENDEDOR
    //CREAR VENDEDOR
    public void crearVendedor(String nombre, String apellido, String direccion, String cuit, double comision, CiudadVO ciudad) {
        
        VendedorVO vendedor = new VendedorVO();
        vendedor.setNombre(nombre);
        vendedor.setApellido(apellido);
        vendedor.setDireccion(direccion);
        vendedor.setCuit(cuit);
        vendedor.setComision(comision);
        vendedor.setCiudad(ciudad);

        miLogica.agregarVendedor(miSession, vendedor);

    }

    //MODIFICAR VENDEDOR
    public void modificarVendedor(int id, String nombre, String apellido, String direccion, String cuit, double comision, CiudadVO ciudad) {
        
        VendedorVO vendedor = miLogica.recuperarVendedor(miSession, id);
        
        vendedor.setNombre(nombre);
        vendedor.setApellido(apellido);
        vendedor.setDireccion(direccion);
        vendedor.setCuit(cuit);
        vendedor.setComision(comision);
        vendedor.setCiudad(ciudad);
        
        miLogica.editarVendedor(miSession, vendedor, id);
        
    }
public void modificarVendedor2(int id, String nombre, String apellido, String direccion, String cuit, double comision) {
        
        VendedorVO vendedor = miLogica.recuperarVendedor(miSession, id);
        
        vendedor.setNombre(nombre);
        vendedor.setApellido(apellido);
        vendedor.setDireccion(direccion);
        vendedor.setCuit(cuit);
        vendedor.setComision(comision);
        
        miLogica.editarVendedor(miSession, vendedor, id);
        
    }

    //LISTAR VENDEDOR
    public List listarVendedores() {
        List<VendedorVO> vendedores = miLogica.listarVendedores(miSession);
        return vendedores;
    }
    
    public void asociarVendedorConArticulo(ArticuloVO articulo, VendedorVO vendedor){
        this.miLogica.asociarVendedorConArticulo(miSession, articulo, vendedor);
    }
}
