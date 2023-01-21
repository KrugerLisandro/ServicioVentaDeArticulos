package Modelo;

import java.util.Objects;

public class VendedorVO extends PersonaVO {
    private String cuit;
    private double comision;
    private CiudadVO ciudad;

    public VendedorVO() {}

    public VendedorVO(String cuit, double comision, String nombre, String apellido, String direccion) {
        super(nombre, apellido, direccion);
        this.cuit = cuit;
        this.comision = comision;
    }
    
    public VendedorVO(String cuit, double comision, CiudadVO ciudad, String nombre, String apellido, String direccion) {
        super(nombre, apellido, direccion);
        this.cuit = cuit;
        this.comision = comision;
        this.ciudad = ciudad;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public CiudadVO getCiudad() {
        return ciudad;
    }

    public void setCiudad(CiudadVO ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final VendedorVO other = (VendedorVO) obj;
        if (this.cuit != other.cuit) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
}
