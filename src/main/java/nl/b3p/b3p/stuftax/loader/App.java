package nl.b3p.b3p.stuftax.loader;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import nl.b3p.b3p.stuftax.loader.entity.*;
import nl.b3p.b3p.stuftax.loader.util.StufTAXParseException;
import nl.b3p.b3p.stuftax.loader.util.StufTAXRecordCollector;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    private static final String TEST_FILE = "/mnt/data/stuftax/STUFTAX.txt";

    public static void main(String[] args)
            throws MalformedURLException, IOException, StufTAXParseException {

        /*
         * TODO:
         * 
         * - Finish Annotations for all record types
         * - See if decimals are used
         * 
         * - Use command line params for file name
         * - Use command line params for connection
         * 
         * - Test Postgres
         * - Test Oracle
         * 
         * - Create --help
         * - Create --version
         * 
         * - Output some stats
         */
        
        long start = System.currentTimeMillis();
        
        URL url = new File(TEST_FILE).toURI().toURL();
        Session sess = getSession();

        if (sess != null) {
            StufTAXRecordCollector iter = new StufTAXRecordCollector(url);
            
            Transaction tx = null;
            tx = sess.beginTransaction();

            while (iter.hasNext()) {
                StufTAXRecord record = iter.next();

                try {
                    sess.persist(record);                   
                } catch (HibernateException ex) {
                    System.out.println(ex);
                }
            }
            
            tx.commit();
            
            sess.close();
        }

        long diff = System.currentTimeMillis() - start;

        System.out.println(diff + " ms");
    }
    
    private static Session getSession() {
        Configuration cfg = new Configuration();
        cfg.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");        
        cfg.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/gisdata");
        cfg.setProperty("hibernate.connection.username", "gisdata");
        cfg.setProperty("hibernate.connection.password", "gisdata");
        cfg.setProperty("hibernate.connection.pool_size", "10");
        
        addAnnotatedClassesToConfig(cfg);
                
        Session sess = null;
        try {
            SessionFactory sessionFactory = cfg.buildSessionFactory();
            sess = sessionFactory.openSession();
        } catch (HibernateException ex) {
            System.out.println(ex);
        }
        
        return sess;        
    }
    
    private static void addAnnotatedClassesToConfig(Configuration cfg) {
        
        cfg.addAnnotatedClass(StufTAXRecord00.class);
        cfg.addAnnotatedClass(StufTAXRecord1020.class);
        cfg.addAnnotatedClass(StufTAXRecord1021.class);
        cfg.addAnnotatedClass(StufTAXRecord1022.class);
        cfg.addAnnotatedClass(StufTAXRecord1023.class);
        cfg.addAnnotatedClass(StufTAXRecord1024.class);
        cfg.addAnnotatedClass(StufTAXRecord1025.class);
        cfg.addAnnotatedClass(StufTAXRecord1030.class);
        cfg.addAnnotatedClass(StufTAXRecord1031.class);
        cfg.addAnnotatedClass(StufTAXRecord1035.class);
        cfg.addAnnotatedClass(StufTAXRecord1040.class);
        cfg.addAnnotatedClass(StufTAXRecord1041.class);
        cfg.addAnnotatedClass(StufTAXRecord1051.class);
        cfg.addAnnotatedClass(StufTAXRecord1052.class);
        cfg.addAnnotatedClass(StufTAXRecord1053.class);
        cfg.addAnnotatedClass(StufTAXRecord1054.class);
        cfg.addAnnotatedClass(StufTAXRecord1060.class);
        cfg.addAnnotatedClass(StufTAXRecord1080.class);
        cfg.addAnnotatedClass(StufTAXRecord1091.class);
        cfg.addAnnotatedClass(StufTAXRecord1092.class);                
    }
}
