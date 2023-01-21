package Modelo;

public class ArticuloVO {
    private Integer idArticulo;
    private String codigo;
    private String nombre;
    private String descripcion;
    private double precioCosto;
    private double precioVenta;
    private MarcaVO marca;
    private VendedorVO vendedor;

    public ArticuloVO() {}

    public ArticuloVO(String codigo, String nombre, String descripcion, double precioCosto, double precioVenta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
    }

    public ArticuloVO(String codigo, String nombre, String descripcion, double precioCosto, double precioVenta, MarcaVO marca) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.marca = marca;
    }

    public ArticuloVO(String codigo, String nombre, String descripcion, double precioCosto, double precioVenta, MarcaVO marca, VendedorVO vendedor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.marca = marca;
        this.vendedor = vendedor;
    }

    public Integer getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public MarcaVO getMarca() {
        return marca;
    }

    public void setMarca(MarcaVO marca) {
        this.marca = marca;
    }

    public VendedorVO getVendedor() {
        return vendedor;
    }

    public void setVendedor(VendedorVO vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ArticuloVO other = (ArticuloVO) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
   

    @Override
    public String toString() {
        return nombre;
    }
}
