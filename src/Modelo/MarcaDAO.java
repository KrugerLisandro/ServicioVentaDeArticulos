package Modelo;

import java.util.List;
import org.hibernate.Session;

public class MarcaDAO {
    
    public List fromListaMarcas(Session session) {
        List<MarcaVO> marcas = session.createQuery("FROM MarcaVO").list();
        return marcas;
    }
}
