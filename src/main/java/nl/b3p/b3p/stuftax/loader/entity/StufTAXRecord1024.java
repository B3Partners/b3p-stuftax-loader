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
@Table(name = "stuftax_tussentijd_taxatie")
public class StufTAXRecord1024 extends StufTAXRecord implements Serializable {
    
    @Id
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    private Long id;
    
    @Column(name="line_number")
    private Integer lineNumber;
    
    @Column(name="woz_objectnummer")
    private Long wozObjectNummer;
    
    @Column(name="volgnummer_tussentijd_taxatie")
    private Integer volgnummerTussentijdseTaxatie;
    
    @Column(name="waardeverandering_mutatie")
    private Integer waardeVeranderingMutatie;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="waarde_peildatum")
    private Date waardePeildatum;
    
    @Column(name="reden_tussentijd_taxatie")
    private String redenTussentijdseTaxatie;
    
    @Column(name="resultaat_tussentijd_taxatie")
    private String resultaatTussentijdseTaxatie;
    
    @Column(name="nummer_bezwaarschrift")
    private String nummerBezwaarschrift;
    
    @Column(name="indiener_bezwaarschrift")
    private String indienerBezwaarschrift;
    
    @Column(name="gemachtigde")
    private String gemachtigde;
    
    @Column(name="nummer_bouwvergunning")
    private String nummerBouwvergunning;
    
    @Column(name="opgegeven_kosten_verbouwing")
    private Long opgegevenKostenVerbouwing;
    
    @Column(name="mutatiecode")
    private String mutatiecode;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="ingangsdatum")
    private Date ingangsDatum;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="einddatum")
    private Date eindDatum;
    
    @Column(name="aand_valutasoort")
    private String aanduidingValutaSoort;
    
    @Column(name="valutakosten_verbouwing")
    private String valutaKostenVerbouwing;
    
    @Column(name="omschrijving_vergunning")
    private String omschrijvingVergunning;

    public StufTAXRecord1024() {
    }
    
    public StufTAXRecord1024(LineNumberReader lineNumberReader, String line) {   
        this.lineNumber = lineNumberReader.getLineNumber();
        
        this.wozObjectNummer = getLong(3, 12, line);
        this.volgnummerTussentijdseTaxatie = getNumber(15, 3, line);
        this.waardeVeranderingMutatie = getNumber(18, 10, line);
        this.waardePeildatum = getDate(28, 8, line);
        this.redenTussentijdseTaxatie = getString(36, 1, line);
        this.resultaatTussentijdseTaxatie = getString(37, 2, line);
        this.nummerBezwaarschrift = getString(39, 10, line);
        this.indienerBezwaarschrift = getString(49, 1, line);
        this.gemachtigde = getString(50, 30, line);
        this.nummerBouwvergunning = getString(80, 10, line);
        this.opgegevenKostenVerbouwing = getLong(90, 11, line);
        this.mutatiecode = getString(101, 1, line);
        this.ingangsDatum = getDate(102, 8, line);
        this.eindDatum = getDate(110, 8, line);
        this.aanduidingValutaSoort = getString(118, 3, line);
        this.valutaKostenVerbouwing = getString(121, 3, line);
        this.omschrijvingVergunning = getString(124, 40, line);
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

    public Integer getVolgnummerTussentijdseTaxatie() {
        return volgnummerTussentijdseTaxatie;
    }

    public void setVolgnummerTussentijdseTaxatie(Integer volgnummerTussentijdseTaxatie) {
        this.volgnummerTussentijdseTaxatie = volgnummerTussentijdseTaxatie;
    }

    public Integer getWaardeVeranderingMutatie() {
        return waardeVeranderingMutatie;
    }

    public void setWaardeVeranderingMutatie(Integer waardeVeranderingMutatie) {
        this.waardeVeranderingMutatie = waardeVeranderingMutatie;
    }

    public Date getWaardePeildatum() {
        return waardePeildatum;
    }

    public void setWaardePeildatum(Date waardePeildatum) {
        this.waardePeildatum = waardePeildatum;
    }

    public String getRedenTussentijdseTaxatie() {
        return redenTussentijdseTaxatie;
    }

    public void setRedenTussentijdseTaxatie(String redenTussentijdseTaxatie) {
        this.redenTussentijdseTaxatie = redenTussentijdseTaxatie;
    }

    public String getResultaatTussentijdseTaxatie() {
        return resultaatTussentijdseTaxatie;
    }

    public void setResultaatTussentijdseTaxatie(String resultaatTussentijdseTaxatie) {
        this.resultaatTussentijdseTaxatie = resultaatTussentijdseTaxatie;
    }

    public String getNummerBezwaarschrift() {
        return nummerBezwaarschrift;
    }

    public void setNummerBezwaarschrift(String nummerBezwaarschrift) {
        this.nummerBezwaarschrift = nummerBezwaarschrift;
    }

    public String getIndienerBezwaarschrift() {
        return indienerBezwaarschrift;
    }

    public void setIndienerBezwaarschrift(String indienerBezwaarschrift) {
        this.indienerBezwaarschrift = indienerBezwaarschrift;
    }

    public String getGemachtigde() {
        return gemachtigde;
    }

    public void setGemachtigde(String gemachtigde) {
        this.gemachtigde = gemachtigde;
    }

    public String getNummerBouwvergunning() {
        return nummerBouwvergunning;
    }

    public void setNummerBouwvergunning(String nummerBouwvergunning) {
        this.nummerBouwvergunning = nummerBouwvergunning;
    }

    public Long getOpgegevenKostenVerbouwing() {
        return opgegevenKostenVerbouwing;
    }

    public void setOpgegevenKostenVerbouwing(Long opgegevenKostenVerbouwing) {
        this.opgegevenKostenVerbouwing = opgegevenKostenVerbouwing;
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

    public String getAanduidingValutaSoort() {
        return aanduidingValutaSoort;
    }

    public void setAanduidingValutaSoort(String aanduidingValutaSoort) {
        this.aanduidingValutaSoort = aanduidingValutaSoort;
    }

    public String getValutaKostenVerbouwing() {
        return valutaKostenVerbouwing;
    }

    public void setValutaKostenVerbouwing(String valutaKostenVerbouwing) {
        this.valutaKostenVerbouwing = valutaKostenVerbouwing;
    }

    public String getOmschrijvingVergunning() {
        return omschrijvingVergunning;
    }

    public void setOmschrijvingVergunning(String omschrijvingVergunning) {
        this.omschrijvingVergunning = omschrijvingVergunning;
    }
}