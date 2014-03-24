package nl.b3p.b3p.stuftax.loader;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import nl.b3p.b3p.stuftax.loader.entity.*;
import nl.b3p.b3p.stuftax.loader.util.StufTAXParseException;
import nl.b3p.b3p.stuftax.loader.util.StufTAXRecordCollector;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public final class App {

    private static List<Option> fileDbOpts;
    private static List<Option> urlDbOpts;
    private static List<Option> userDbOpts;
    private static List<Option> passwDbOpts;
    private static Options fileOptions, urlOptions, userOptions, passwOptions;
    
    private static final String URL = "url";
    
    private static PrintWriter pw = new PrintWriter(System.out, true);

    private App() {}
    
    private static void printHelp() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptionComparator(new Comparator<Option>() {
            public int compare(Option lhs, Option rhs) {
                List[] lists = new List[]{fileDbOpts, urlDbOpts, userDbOpts, passwDbOpts};
                for (List l : lists) {
                    int lhsIndex = l.indexOf(lhs);
                    if (lhsIndex != -1) {
                        return Integer.valueOf(lhsIndex).compareTo(l.indexOf(rhs));
                    }
                }
                return lhs.getArgName().compareTo(rhs.getArgName());
            }
        });

        final int width = 100;
        formatter.printUsage(pw, 80, "java -jar b3p-stuftax-loader-1.0-jar-with-dependencies.jar <options>");
        pw.println("\nOptions:\n");
        formatter.printOptions(pw, width, fileOptions, 2, 2);
        formatter.printOptions(pw, width, urlOptions, 2, 2);
        formatter.printOptions(pw, width, userOptions, 2, 2);
        formatter.printOptions(pw, width, passwOptions, 2, 2);
        pw.println(formatter.toString());
    }

    private static Options buildOptions() {
        fileDbOpts = Arrays.asList(new Option[]{
            OptionBuilder
            .withDescription("Pad met bestandsnaam, bijv. '/pad/naar/bestand/stuftax.txt'")
            .withArgName("filename")
            .hasArg(true)
            .isRequired()
            .create("filename")
        });

        urlDbOpts = Arrays.asList(new Option[]{
            OptionBuilder
            .withDescription("Jdbc url naar database bijv. 'jdbc:oracle:thin:@hostnaam:port:sid' of 'jdbc:postgresql://hostname:port/db'")
            .withArgName(URL)
            .hasArg(true)
            .isRequired()
            .create(URL)
        });

        userDbOpts = Arrays.asList(new Option[]{
            OptionBuilder
            .withDescription("Database gebruiker")
            .withArgName("user")
            .hasArg(true)
            .isRequired()
            .create("user")
        });

        passwDbOpts = Arrays.asList(new Option[]{
            OptionBuilder
            .withDescription("Database wachtwoord")
            .withArgName("password")
            .hasArg(true)
            .isRequired()
            .create("password")
        });

        Options options = new Options();
        fileOptions = new Options();
        for (Option o : fileDbOpts) {
            options.addOption(o);
            fileOptions.addOption(o);
        }

        urlOptions = new Options();
        for (Option o : urlDbOpts) {
            options.addOption(o);
            urlOptions.addOption(o);
        }

        userOptions = new Options();
        for (Option o : userDbOpts) {
            options.addOption(o);
            userOptions.addOption(o);
        }

        passwOptions = new Options();
        for (Option o : passwDbOpts) {
            options.addOption(o);
            passwOptions.addOption(o);
        }

        return options;
    }

    private static Session getSession(CommandLine cl) {
        Configuration cfg = new Configuration();

        String jdbcUrl = cl.getOptionValue(URL);
        String user = cl.getOptionValue("user");
        String password = cl.getOptionValue("password");

        cfg.setProperty("hibernate.connection.url", jdbcUrl);

        cfg.setProperty("hibernate.connection.username", user);
        cfg.setProperty("hibernate.connection.password", password);

        if (cl.getOptionValue(URL).contains("oracle")) {
            cfg.setProperty("hibernate.connection.driver_class", "oracle.jdbc.driver.OracleDriver");
            cfg.setProperty("hibernate.connection.pool_size", "10");
        } else {
            cfg.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
            cfg.setProperty("hibernate.connection.pool_size", "10");
        }

        addAnnotatedClassesToConfig(cfg);

        Session sess = null;
        try {
            SessionFactory sessionFactory = cfg.buildSessionFactory();
            sess = sessionFactory.openSession();
        } catch (HibernateException ex) {
            pw.println("Fout verbinden database: " + ex.getLocalizedMessage());
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

    public static void main(String[] args)
            throws MalformedURLException, IOException, StufTAXParseException {
        
        /* TODO: See if decimals are used */

        Options options = buildOptions();
        CommandLine cl = null;
        try {
            CommandLineParser parser = new PosixParser();

            cl = parser.parse(options, args);
        } catch (ParseException e) {
            pw.printf("%s: %s\n\n", e.getClass().getSimpleName(), e.getMessage());
            printHelp();
            System.exit(1);
        }

        long start = System.currentTimeMillis();

        int count = 0;

        String fileName = cl.getOptionValue("filename");

        URL fileUrl = new File(fileName).toURI().toURL();

        pw.println("Verbinden naar database...");
        Session sess = getSession(cl);
        if (sess != null) {
            pw.println("Inladen Stuf TAX bestand...");

            StufTAXRecordCollector iter = null;
            try {
                iter = new StufTAXRecordCollector(fileUrl);
            } catch (Exception ex) {
                pw.println("Fout inladen bestand: " + ex.getLocalizedMessage());
            }

            Transaction tx = null;
            tx = sess.beginTransaction();

            while (iter != null && iter.hasNext()) {
                StufTAXRecord record = iter.next();

                try {
                    sess.persist(record);
                    count++;
                } catch (HibernateException ex) {
                    pw.println("Fout schrijven record: " + ex.getLocalizedMessage());
                }
            }

            tx.commit();

            sess.close();
        }

        long diff = System.currentTimeMillis() - start;

        pw.println("Er zijn " + count + " records geschreven in " + diff + " ms.");
        pw.close();
    }
}
