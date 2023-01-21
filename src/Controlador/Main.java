package Controlador;

import Modelo.*;
import Vista.Menu;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {

        Session session = Conexion.getSessionFactory().openSession();
        preCargaDatos(session);
        
//      Ingreso al Sistema
        Controlador control = new Controlador(session);
        Menu vista = new Menu(control);
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        
    }
    public static void preCargaDatos(Session session) {
        CiudadVO ciudad = new CiudadVO("Paraná");
        CiudadVO ciudad2 = new CiudadVO("Santa Fe");
        CiudadVO ciudad3 = new CiudadVO("Mendoza");
        CiudadVO ciudad4 = new CiudadVO("Neuquen");
        CiudadVO ciudad5 = new CiudadVO("Buenos Aires");
        CiudadVO ciudad6 = new CiudadVO("Salta");
        MarcaVO marca = new MarcaVO("Nike");
        MarcaVO marca2 = new MarcaVO("Adidas");
        MarcaVO marca3 = new MarcaVO("Samsung");
        MarcaVO marca4 = new MarcaVO("Audi");
        MarcaVO marca5 = new MarcaVO("Drean");
        MarcaVO marca6 = new MarcaVO("Asus");
        MarcaVO marca7 = new MarcaVO("Ford");
        MarcaVO marca8 = new MarcaVO("Nokia");
        PersonaVO persona = new PersonaVO("Luis", "Dome", "España 321");
        PersonaVO persona2 = new PersonaVO("David", "Rojas", "Italia 501");
        VendedorVO vendedor = new VendedorVO("20-44506426-3", 30, ciudad, "Marcela", "Lopez", "Italia 454");
        VendedorVO vendedor2 = new VendedorVO("23-45234555-1", Integer.valueOf(35), ciudad5, "Alfred", "Sponton", "España 123");
        VendedorVO vendedor3 = new VendedorVO("27-12343656-4", Integer.valueOf(35), ciudad2, "Rocio", "Perez", "Moreno y San Luis 122");
        VendedorVO vendedor4 = new VendedorVO("20-45345466-9", Integer.valueOf(35), ciudad4, "Luis", "Rodriguez", "Color 433");
        ArticuloVO articulo = new ArticuloVO("1-111-2", "Notebook", "Nuevo", 80000, 94000, marca6, vendedor);
        ArticuloVO articulo2 = new ArticuloVO("1-121-2", "Zapatilla", "Usado", 7000, 9000, marca2, vendedor3);
        ArticuloVO articulo3 = new ArticuloVO("2-141-4", "Auto", "Nuevo", 3000000, 3280000, marca4, vendedor2);
        ArticuloVO articulo4 = new ArticuloVO("4-151-1", "Televisor", "Nuevo", 40000, 51000, marca3, vendedor3);
        ArticuloVO articulo5 = new ArticuloVO("3-551-6", "Lavarropa", "Semi-Nuevo", 35000, 45000, marca5, vendedor);
        ArticuloVO articulo6 = new ArticuloVO("1-121-9", "Heladera", "Nuevo", 70000, 98000, marca3, vendedor4);

//        Iniciamos una transaccion.   
        Transaction trx = session.beginTransaction();

        session.save(ciudad);
        session.save(ciudad2);
        session.save(ciudad3);
        session.save(ciudad4);
        session.save(ciudad5);
        session.save(ciudad6);
        session.save(marca);
        session.save(marca2);
        session.save(marca3);
        session.save(marca4);
        session.save(marca5);
        session.save(marca6);
        session.save(marca7);
        session.save(marca8);
        session.save(persona);
        session.save(persona2);
        session.save(vendedor);
        session.save(vendedor2);
        session.save(vendedor3);
        session.save(vendedor4);
        session.save(articulo);
        session.save(articulo2);
        session.save(articulo3);
        session.save(articulo4);
        session.save(articulo5);
        session.save(articulo6);

//        Cerramos la transaccion. 
        trx.commit();
    }
}
