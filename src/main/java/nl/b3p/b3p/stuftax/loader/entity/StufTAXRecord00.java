package nl.b3p.b3p.stuftax.loader.entity;

import java.io.LineNumberReader;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author boy
 */
@Entity
@Table(name = "stuftax_00")
public class StufTAXRecord00 extends StufTAXRecord implements Serializable {
    
    @Id    
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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
    @Column(name="datum_vorig_aanl_bestand")
    private Date datumVorigeAanleveringBestand;
    
    @Column(name="aard_levering_bestand")
    private String aardLeveringBestand;
    
    @Column(name="software_leverancier")
    private String softwareLeverancier;
    
    @Column(name="versie_stuftax")
    private Integer versieStufTAX;

    public StufTAXRecord00() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Integer getGemeenteCode() {
        return gemeenteCode;
    }

    public void setGemeenteCode(Integer gemeenteCode) {
        this.gemeenteCode = gemeenteCode;
    }

    public String getGemeenteNaam() {
        return gemeenteNaam;
    }

    public void setGemeenteNaam(String gemeenteNaam) {
        this.gemeenteNaam = gemeenteNaam;
    }

    public String getContactPersoon() {
        return contactPersoon;
    }

    public void setContactPersoon(String contactPersoon) {
        this.contactPersoon = contactPersoon;
    }

    public String getCpTelefoonnummer() {
        return cpTelefoonnummer;
    }

    public void setCpTelefoonnummer(String cpTelefoonnummer) {
        this.cpTelefoonnummer = cpTelefoonnummer;
    }

    public Date getAanmaakDatumBestand() {
        return aanmaakDatumBestand;
    }

    public void setAanmaakDatumBestand(Date aanmaakDatumBestand) {
        this.aanmaakDatumBestand = aanmaakDatumBestand;
    }

    public Integer getBijgewerkTotMetMaand() {
        return bijgewerkTotMetMaand;
    }

    public void setBijgewerkTotMetMaand(Integer bijgewerkTotMetMaand) {
        this.bijgewerkTotMetMaand = bijgewerkTotMetMaand;
    }

    public Date getDatumVorigeAanleveringBestand() {
        return datumVorigeAanleveringBestand;
    }

    public void setDatumVorigeAanleveringBestand(Date datumVorigeAanleveringBestand) {
        this.datumVorigeAanleveringBestand = datumVorigeAanleveringBestand;
    }

    public String getAardLeveringBestand() {
        return aardLeveringBestand;
    }

    public void setAardLeveringBestand(String aardLeveringBestand) {
        this.aardLeveringBestand = aardLeveringBestand;
    }

    public String getSoftwareLeverancier() {
        return softwareLeverancier;
    }

    public void setSoftwareLeverancier(String softwareLeverancier) {
        this.softwareLeverancier = softwareLeverancier;
    }

    public Integer getVersieStufTAX() {
        return versieStufTAX;
    }

    public void setVersieStufTAX(Integer versieStufTAX) {
        this.versieStufTAX = versieStufTAX;
    }

    @Override
    public void fillValues(LineNumberReader lineNumberReader, String line) {
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