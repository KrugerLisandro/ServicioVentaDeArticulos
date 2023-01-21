package Modelo;

public class CiudadVO implements Comparable <CiudadVO>{
    private Integer idCiudad;
    private String nombre;

    public CiudadVO() {}

    public CiudadVO(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
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
    public int compareTo(CiudadVO o) {
        return this.getNombre().compareTo(o.getNombre());
    }
}
