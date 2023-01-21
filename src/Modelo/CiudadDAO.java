package Modelo;

import java.util.List;
import org.hibernate.Session;

public class CiudadDAO {
    
    public List fromListaCiudades(Session session) {
        List<CiudadVO> ciudades = session.createQuery("FROM CiudadVO").list();
        return ciudades;
    }
    
}
