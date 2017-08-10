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
@Table(name = "stuftax_23")
public class StufTAXRecord1023 extends StufTAXRecord implements Serializable {
    
    @Id
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    private Long id;
    
    @Column(name="line_number")
    private Integer lineNumber;
    
    @Column(name="aand_groep_vergelijkb_obj")
    private String groepAanduidingvergelijkbareObjecten;
    
    @Column(name="indic_vermelding_taxatieversl")
    private String indicatieVermeldingTaxatieverslag;
    
    @Column(name="woz_objectnummer_ref")
    private Long wozObjectNummerRef;
    
    @Column(name="volgnummer_marktgegeven")
    private Integer volgnummerMarktgegeven;
    
    @Column(name="mutatiecode")
    private String mutatiecode;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="ingangsdatum")
    private Date ingangsDatum;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="einddatum")
    private Date eindDatum;

    public StufTAXRecord1023() {
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

    public String getGroepAanduidingvergelijkbareObjecten() {
        return groepAanduidingvergelijkbareObjecten;
    }

    public void setGroepAanduidingvergelijkbareObjecten(String groepAanduidingvergelijkbareObjecten) {
        this.groepAanduidingvergelijkbareObjecten = groepAanduidingvergelijkbareObjecten;
    }

    public String getIndicatieVermeldingTaxatieverslag() {
        return indicatieVermeldingTaxatieverslag;
    }

    public void setIndicatieVermeldingTaxatieverslag(String indicatieVermeldingTaxatieverslag) {
        this.indicatieVermeldingTaxatieverslag = indicatieVermeldingTaxatieverslag;
    }

    public Long getWozObjectNummerRef() {
        return wozObjectNummerRef;
    }

    public void setWozObjectNummerRef(Long wozObjectNummerRef) {
        this.wozObjectNummerRef = wozObjectNummerRef;
    }

    public Integer getVolgnummerMarktgegeven() {
        return volgnummerMarktgegeven;
    }

    public void setVolgnummerMarktgegeven(Integer volgnummerMarktgegeven) {
        this.volgnummerMarktgegeven = volgnummerMarktgegeven;
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
        
        this.groepAanduidingvergelijkbareObjecten = getString(3, 8, line);
        this.indicatieVermeldingTaxatieverslag = getString(11, 1, line);
        this.wozObjectNummerRef = getLong(19, 12, line);
        this.volgnummerMarktgegeven = getNumber(31, 8, line);
        this.mutatiecode = getString(39, 1, line);
        this.ingangsDatum = getDate(40, 8, line);
        this.eindDatum = getDate(48, 8, line);  
    }
}