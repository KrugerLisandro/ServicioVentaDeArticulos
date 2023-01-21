package Modelo;

import java.util.List;
import org.hibernate.Session;

public class Logica {

    VendedorDAO miVendedor = new VendedorDAO();
    ArticuloDAO miArticulo = new ArticuloDAO();
    MarcaDAO miMarca = new MarcaDAO();
    CiudadDAO miCiudad = new CiudadDAO();

    // EN ESTA CLASE DE SER NECESARIO SE AGREGAN LAS VALIDACIONES CORRESPONDIENTES
    public List listarArticulos(Session session) {
        List<ArticuloVO> articulos = this.miArticulo.fromListaArticulos(session);
        return articulos;
    }

    public boolean agregarArticulo(Session session, ArticuloVO articulo) {
        boolean control;
        control = this.evitarCodigoDuplicados(session, articulo);

        if (control == false) {
            this.miArticulo.saveArticulo(session, articulo);
        }

        return control;
    }

    public boolean editarArticulo(Session session, ArticuloVO articulo, Integer id) {
        boolean control;
        control = this.evitarCodigoDuplicados(session, articulo);

        if (control == false) {
            ArticuloVO art = this.miArticulo.loadArticulo(session, id);

            art.setCodigo(articulo.getCodigo());
            art.setNombre(articulo.getNombre());
            art.setDescripcion(articulo.getDescripcion());
            art.setPrecioCosto(articulo.getPrecioCosto());
            art.setPrecioVenta(articulo.getPrecioVenta());
            art.setMarca(articulo.getMarca());
            art.setVendedor(articulo.getVendedor());

            this.miArticulo.updateArticulo(session, art);
        }

        return control;
    }
    public ArticuloVO recuperarArticulo(Session session, Integer id){
        ArticuloVO articulo = this.miArticulo.loadArticulo(session, id);
        return articulo;
    }
    
    public List listarMarca(Session session) {
        List<MarcaVO> marcas = this.miMarca.fromListaMarcas(session);
        return marcas;
    }

    public List listarVendedores(Session session) {
        List<VendedorVO> vendedores = this.miVendedor.fromListaVendedores(session);
        return vendedores;
    }

    public boolean agregarVendedor(Session session, VendedorVO vendedor) {
        boolean control;
        control = this.evitarCuitDuplicados(session, vendedor);

        if (control == false) {
            this.miVendedor.saveVendedor(session, vendedor);
        }

        return control;
    }

    public boolean editarVendedor(Session session, VendedorVO vendedor, Integer id) {
        boolean control;
        control = this.evitarCuitDuplicados(session, vendedor);

        if (control == false) {
            VendedorVO vend = this.miVendedor.loadVendedor(session, id);

            vend.setCuit(vendedor.getCuit());
            vend.setComision(vendedor.getComision());
            vend.setCiudad(vendedor.getCiudad());

            this.miVendedor.updateVendedor(session, vend);
        }

        return control;
    }
    
    public VendedorVO recuperarVendedor(Session session, Integer id){
        VendedorVO vendedor = this.miVendedor.loadVendedor(session, id);
        return vendedor;
    }
    
    public List listarCiudades(Session session) {
        List<CiudadVO> ciudades = this.miCiudad.fromListaCiudades(session);
        return ciudades;
    }

    public boolean evitarCodigoDuplicados(Session session, ArticuloVO articulo) {
        boolean control = false;
        List<ArticuloVO> articulos = new ArticuloDAO().fromListaArticulos(session);

        for (ArticuloVO art : articulos) {
            if (art.getCodigo().equals(articulo.getCodigo())) {
                control = true;
            }
        }
        return control;
    }

    public boolean evitarCuitDuplicados(Session session, VendedorVO vendedor) {
        boolean control = false;
        List<VendedorVO> vendedores = new VendedorDAO().fromListaVendedores(session);

        for (VendedorVO vend : vendedores) {
            if (vend.getCuit().equals(vendedor.getCuit())) {
                control = true;
            }
        }
        return control;
    }
    
    public void asociarVendedorConArticulo(Session session, ArticuloVO articulo, VendedorVO vendedor){
        ArticuloVO art = this.miArticulo.loadArticulo(session, articulo.getIdArticulo());
        art.setVendedor(vendedor);
        this.miArticulo.updateArticulo(session, art);
    }

}
