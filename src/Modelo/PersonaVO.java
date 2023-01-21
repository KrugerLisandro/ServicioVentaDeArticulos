package Modelo;

public class PersonaVO {

    private Integer idPersona;
    private String nombre;
    private String apellido;
    private String direccion;

    public PersonaVO() {
    }

    public PersonaVO(String nombre, String apellido, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer id) {
        this.idPersona = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + '}';
    }
}
