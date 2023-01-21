package Modelo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ArticuloDAO {

    public List fromListaArticulos(Session session) {
        List<ArticuloVO> art = session.createQuery("FROM ArticuloVO").list();
        return art;
    }

    public void saveArticulo(Session session, ArticuloVO articulo) {
        Transaction trx = session.beginTransaction();
        session.save(articulo);
        trx.commit();
    }

    public ArticuloVO loadArticulo(Session session, Integer id) {
        Transaction trx = session.beginTransaction();
        ArticuloVO art = (ArticuloVO) session.load(ArticuloVO.class, id);
        trx.commit();
        return art;
    }

    public void updateArticulo(Session session, ArticuloVO articulo) {
        Transaction trx = session.beginTransaction();
        session.update(articulo);
        trx.commit();
    }

}
