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
@Table(name = "stuftax_kadaster_identif")
public class StufTAXRecord1040 extends StufTAXRecord implements Serializable {
    
    @Id
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    private Long id;
    
    @Column(name="line_number")
    private Integer lineNumber;
    
    @Column(name="woz_objectnummer")
    private Long wozObjectNummer;
    
    @Column(name="kad_gemeente_code")
    private String kadasterGemeenteCode;
    
    @Column(name="sectie")
    private String sectie;
    
    @Column(name="perceelnummer")
    private Integer perceelnummer;
    
    @Column(name="perceel_index_letter")
    private String perceelIndexLetter;
    
    @Column(name="perceel_index_nummer")
    private Integer perceelIndexNummer;
    
    @Column(name="toegekende_oppervlakte")
    private Integer toegekendeOppervlakte;
    
    @Column(name="meegetaxeerde_opp_geb")
    private Integer meegetaxeerdeOppervlakteGebouwd;
    
    @Column(name="mutatiecode")
    private String mutatieCode;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="ingangsdatum")
    private Date ingangsDatum;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="einddatum")
    private Date eindDatum;

    public StufTAXRecord1040() {
    }
    
    public StufTAXRecord1040(LineNumberReader lineNumberReader, String line) {   
        this.lineNumber = lineNumberReader.getLineNumber();
        
        this.wozObjectNummer = getLong(3, 12, line);
        this.kadasterGemeenteCode = getString(15, 5, line);
        this.sectie = getString(20, 2, line);
        this.perceelnummer = getNumber(22, 5, line);
        this.perceelIndexLetter = getString(27, 1, line);
        this.perceelIndexNummer = getNumber(28, 4, line);
        this.toegekendeOppervlakte = getNumber(32, 8, line);
        this.meegetaxeerdeOppervlakteGebouwd = getNumber(40, 8, line);
        this.mutatieCode = getString(48, 1, line);
        this.ingangsDatum = getDate(49, 8, line);
        this.eindDatum = getDate(57, 8, line);
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

    public Long getWozObjectNummer() {
        return wozObjectNummer;
    }

    public void setWozObjectNummer(Long wozObjectNummer) {
        this.wozObjectNummer = wozObjectNummer;
    }

    public String getKadasterGemeenteCode() {
        return kadasterGemeenteCode;
    }

    public void setKadasterGemeenteCode(String kadasterGemeenteCode) {
        this.kadasterGemeenteCode = kadasterGemeenteCode;
    }

    public String getSectie() {
        return sectie;
    }

    public void setSectie(String sectie) {
        this.sectie = sectie;
    }

    public Integer getPerceelnummer() {
        return perceelnummer;
    }

    public void setPerceelnummer(Integer perceelnummer) {
        this.perceelnummer = perceelnummer;
    }

    public String getPerceelIndexLetter() {
        return perceelIndexLetter;
    }

    public void setPerceelIndexLetter(String perceelIndexLetter) {
        this.perceelIndexLetter = perceelIndexLetter;
    }

    public Integer getPerceelIndexNummer() {
        return perceelIndexNummer;
    }

    public void setPerceelIndexNummer(Integer perceelIndexNummer) {
        this.perceelIndexNummer = perceelIndexNummer;
    }

    public Integer getToegekendeOppervlakte() {
        return toegekendeOppervlakte;
    }

    public void setToegekendeOppervlakte(Integer toegekendeOppervlakte) {
        this.toegekendeOppervlakte = toegekendeOppervlakte;
    }

    public Integer getMeegetaxeerdeOppervlakteGebouwd() {
        return meegetaxeerdeOppervlakteGebouwd;
    }

    public void setMeegetaxeerdeOppervlakteGebouwd(Integer meegetaxeerdeOppervlakteGebouwd) {
        this.meegetaxeerdeOppervlakteGebouwd = meegetaxeerdeOppervlakteGebouwd;
    }

    public String getMutatieCode() {
        return mutatieCode;
    }

    public void setMutatieCode(String mutatieCode) {
        this.mutatieCode = mutatieCode;
    }

    public Date getIngangsDatum() {
        return ingangsDatum;
    }

    public void setIngangsDatum(Date ingangsDatum) {
        this.ingangsDatum = ingangsDatum;
    }

    public Date getEindDatum() {
        return eindDatum;
    }

    public void setEindDatum(Date eindDatum) {
        this.eindDatum = eindDatum;
    }
}