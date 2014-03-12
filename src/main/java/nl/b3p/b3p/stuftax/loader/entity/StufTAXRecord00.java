package nl.b3p.b3p.stuftax.loader.entity;

import java.io.LineNumberReader;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author boy
 */
@Entity
@Table(name = "stuftax_voorloop")
public class StufTAXRecord00 extends StufTAXRecord implements Serializable {
    
    @Id
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    private Long id;
    
    @Column(name="line_number")
    private Integer lineNumber;
    
    @Column(name="gemeente_code")
    private Integer gemeenteCode;
    
    @Column(name="gemeente_naam")
    private String gemeenteNaam;
    
    @Column(name="contactpersoon")
    private String contactPersoon;
    
    @Column(name="cp_telefoonnummer")
    private String cpTelefoonnummer;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="aanmaak_datum_bestand")
    private Date aanmaakDatumBestand;
    
    @Column(name="bijgewerkt_tm_maand")
    private Integer bijgewerkTotMetMaand;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="datum_vorige_aanl_bestand")
    private Date datumVorigeAanleveringBestand;
    
    @Column(name="aard_levering_bestand")
    private String aardLeveringBestand;
    
    @Column(name="software_leverancier")
    private String softwareLeverancier;
    
    @Column(name="versie_stuftax")
    private Integer versieStufTAX;

    public StufTAXRecord00() {
    }
    
    public StufTAXRecord00(LineNumberReader lineNumberReader, String line) {   
        this.lineNumber = lineNumberReader.getLineNumber();
        
        this.gemeenteCode = getNumber(3, 4, line);
        this.gemeenteNaam = getString(7, 40, line);        
        this.contactPersoon = getString(47, 40, line); 
        this.cpTelefoonnummer = getString(87, 20, line); 
        this.aanmaakDatumBestand = getDate(111, 8, line);        
        this.bijgewerkTotMetMaand = getNumber(119, 2, line);
        this.datumVorigeAanleveringBestand = getDate(121, 8, line);
        this.aardLeveringBestand = getString(129, 1, line);
        this.softwareLeverancier = getString(130, 20, line);
        this.versieStufTAX = getNumber(150, 2, line);
    }
}