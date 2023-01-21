package Modelo;

public class MarcaVO implements Comparable <MarcaVO> {
    private Integer idMarca;
    private String nombre;

    public MarcaVO() {}

    public MarcaVO(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    } 

    @Override
    public int compareTo(MarcaVO o) {
        return this.getNombre().compareTo(o.getNombre());
    }
    
}
