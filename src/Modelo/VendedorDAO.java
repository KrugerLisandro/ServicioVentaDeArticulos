package Modelo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class VendedorDAO {
    
    public List fromListaVendedores(Session session) {
        List<VendedorVO> vendedores = session.createQuery("FROM VendedorVO").list();
        return vendedores;
    }

    public void saveVendedor(Session session, VendedorVO vendedor) {
        Transaction trx = session.beginTransaction();
        session.save(vendedor);
        trx.commit();
    }

    public VendedorVO loadVendedor(Session session, Integer id) {
        Transaction trx = session.beginTransaction();
        VendedorVO vend = (VendedorVO) session.load(VendedorVO.class, id);
        trx.commit();
        return vend;
    }

    public void updateVendedor(Session session, VendedorVO vendedor) {
        Transaction trx = session.beginTransaction();
        session.update(vendedor);
        trx.commit();
    }

}