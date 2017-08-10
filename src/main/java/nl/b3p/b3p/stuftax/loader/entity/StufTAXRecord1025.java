package nl.b3p.b3p.stuftax.loader.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author boy
 */
@Entity
@Table(name = "stuftax_25")
public class StufTAXRecord1025 extends StufTAXRecord implements Serializable {
    
    @Id
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    private Long id;
    
    @Column(name="line_number")
    private Integer lineNumber;
    
    @Column(name="woz_objectnummer")
    private Long wozObjectNummer;
    
    @Column(name="aantekening")
    private String aantekening;
    
    @Column(name="taxateur")
    private String taxateur;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="datum_controle")
    private Date datumControle;
    
    @Column(name="reden_controle")
    private Integer redenControle;
    
    @Column(name="gecontroleerd_onderdelen")
    private Integer gecontroleerdeOnderdelen;
    
    @Column(name="gecontroleerd_object_kenm")
    private Integer gecontroleerdeObjectKenmerken;
    
    @Column(name="identific_uitvoerder")
    private String identificatieUitvoerder;
    
    @Column(name="methodiek_controle")
    private Integer methodiekControle;
    
    @Column(name="mutatiecode")
    private String mutatiecode;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="ingangsdatum")
    private Date ingangsDatum;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="einddatum")
    private Date eindDatum;    

    public StufTAXRecord1025() {
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

    public String getAantekening() {
        return aantekening;
    }

    public void setAantekening(String aantekening) {
        this.aantekening = aantekening;
    }

    public String getTaxateur() {
        return taxateur;
    }

    public void setTaxateur(String taxateur) {
        this.taxateur = taxateur;
    }

    public Date getDatumControle() {
        return datumControle;
    }

    public void setDatumControle(Date datumControle) {
        this.datumControle = datumControle;
    }

    public Integer getRedenControle() {
        return redenControle;
    }

    public void setRedenControle(Integer redenControle) {
        this.redenControle = redenControle;
    }

    public Integer getGecontroleerdeOnderdelen() {
        return gecontroleerdeOnderdelen;
    }

    public void setGecontroleerdeOnderdelen(Integer gecontroleerdeOnderdelen) {
        this.gecontroleerdeOnderdelen = gecontroleerdeOnderdelen;
    }

    public Integer getGecontroleerdeObjectKenmerken() {
        return gecontroleerdeObjectKenmerken;
    }

    public void setGecontroleerdeObjectKenmerken(Integer gecontroleerdeObjectKenmerken) {
        this.gecontroleerdeObjectKenmerken = gecontroleerdeObjectKenmerken;
    }

    public String getIdentificatieUitvoerder() {
        return identificatieUitvoerder;
    }

    public void setIdentificatieUitvoerder(String identificatieUitvoerder) {
        this.identificatieUitvoerder = identificatieUitvoerder;
    }

    public Integer getMethodiekControle() {
        return methodiekControle;
    }

    public void setMethodiekControle(Integer methodiekControle) {
        this.methodiekControle = methodiekControle;
    }

    public String getMutatiecode() {
        return mutatiecode;
    }

    public void setMutatiecode(String mutatiecode) {
        this.mutatiecode = mutatiecode;
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

    @Override
    public void fillValues(int linenumber, String line) {
        this.lineNumber = linenumber;
        
        this.wozObjectNummer = getLong(3, 12, line);
        this.aantekening = getString(15, 50, line);
        this.taxateur = getString(65, 4, line);
        this.datumControle = getDate(69, 8, line);
        this.redenControle = getNumber(77, 2, line);
        this.gecontroleerdeOnderdelen = getNumber(79, 1, line);
        this.gecontroleerdeObjectKenmerken = getNumber(80, 1, line);
        this.identificatieUitvoerder = getString(81, 1, line);
        this.methodiekControle = getNumber(82, 2, line);
        this.mutatiecode = getString(84, 1, line);
        this.ingangsDatum = getDate(85, 8, line);
        this.eindDatum = getDate(93, 8, line);
    }
}