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
@Table(name = "stuftax_53")
public class StufTAXRecord1053 extends StufTAXRecord implements Serializable {
    
    @Id
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    private Long id;
    
    @Column(name="line_number")
    private Integer lineNumber;
    
    @Column(name="woz_objectnummer")
    private Long wozObjectNummer;
    
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
    
    @Column(name="foto_indexnummer")
    private Integer fotoIndexNummer;
    
    @Column(name="waarde_vastgest_datum_marktg")
    private Long vastgesteldeWaardeOpDatumMarktgegeven;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="koopdatum")
    private Date koopDatum;
    
    @Column(name="wijz_verw_waarde_vastgesteld")
    private Integer verwachteWijzigingVastgesteldeWaarde;
    
    @Column(name="reden_afwijk_marktgeg_wozverw")
    private Integer redenAfwijkingMarktgegevenWozGebaseerdVerwachting;
    
    @Column(name="relevantie_afwijking")
    private Integer relevantieRedenAfwijking;
    
    @Column(name="kwant_verschil_verkprijs_markt")
    private Integer kwantificeringVerschilVerkoopprijsTovMarktwaarde;
    
    @Column(name="kwant_fout_oude_waarde")
    private Integer kwantificeringFoutOudeVastgesteldeWaarde;
    
    @Column(name="kwant_gevolg_wijz_wozobject")
    private Integer kwantificeringGevolgWijzigingWOZObject;

    public StufTAXRecord1053() {
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

    public Integer getFotoIndexNummer() {
        return fotoIndexNummer;
    }

    public void setFotoIndexNummer(Integer fotoIndexNummer) {
        this.fotoIndexNummer = fotoIndexNummer;
    }

    public Long getVastgesteldeWaardeOpDatumMarktgegeven() {
        return vastgesteldeWaardeOpDatumMarktgegeven;
    }

    public void setVastgesteldeWaardeOpDatumMarktgegeven(Long vastgesteldeWaardeOpDatumMarktgegeven) {
        this.vastgesteldeWaardeOpDatumMarktgegeven = vastgesteldeWaardeOpDatumMarktgegeven;
    }

    public Date getKoopDatum() {
        return koopDatum;
    }

    public void setKoopDatum(Date koopDatum) {
        this.koopDatum = koopDatum;
    }

    public Integer getVerwachteWijzigingVastgesteldeWaarde() {
        return verwachteWijzigingVastgesteldeWaarde;
    }

    public void setVerwachteWijzigingVastgesteldeWaarde(Integer verwachteWijzigingVastgesteldeWaarde) {
        this.verwachteWijzigingVastgesteldeWaarde = verwachteWijzigingVastgesteldeWaarde;
    }

    public Integer getRedenAfwijkingMarktgegevenWozGebaseerdVerwachting() {
        return redenAfwijkingMarktgegevenWozGebaseerdVerwachting;
    }

    public void setRedenAfwijkingMarktgegevenWozGebaseerdVerwachting(Integer redenAfwijkingMarktgegevenWozGebaseerdVerwachting) {
        this.redenAfwijkingMarktgegevenWozGebaseerdVerwachting = redenAfwijkingMarktgegevenWozGebaseerdVerwachting;
    }

    public Integer getRelevantieRedenAfwijking() {
        return relevantieRedenAfwijking;
    }

    public void setRelevantieRedenAfwijking(Integer relevantieRedenAfwijking) {
        this.relevantieRedenAfwijking = relevantieRedenAfwijking;
    }

    public Integer getKwantificeringVerschilVerkoopprijsTovMarktwaarde() {
        return kwantificeringVerschilVerkoopprijsTovMarktwaarde;
    }

    public void setKwantificeringVerschilVerkoopprijsTovMarktwaarde(Integer kwantificeringVerschilVerkoopprijsTovMarktwaarde) {
        this.kwantificeringVerschilVerkoopprijsTovMarktwaarde = kwantificeringVerschilVerkoopprijsTovMarktwaarde;
    }

    public Integer getKwantificeringFoutOudeVastgesteldeWaarde() {
        return kwantificeringFoutOudeVastgesteldeWaarde;
    }

    public void setKwantificeringFoutOudeVastgesteldeWaarde(Integer kwantificeringFoutOudeVastgesteldeWaarde) {
        this.kwantificeringFoutOudeVastgesteldeWaarde = kwantificeringFoutOudeVastgesteldeWaarde;
    }

    public Integer getKwantificeringGevolgWijzigingWOZObject() {
        return kwantificeringGevolgWijzigingWOZObject;
    }

    public void setKwantificeringGevolgWijzigingWOZObject(Integer kwantificeringGevolgWijzigingWOZObject) {
        this.kwantificeringGevolgWijzigingWOZObject = kwantificeringGevolgWijzigingWOZObject;
    }

    @Override
    public void fillValues(int linenumber, String line) {
        this.lineNumber = linenumber;
        
        this.wozObjectNummer = getLong(3, 12, line);
        this.volgnummerMarktgegeven = getNumber(15, 8, line);
        this.mutatiecode = getString(23, 1, line);
        this.ingangsDatum = getDate(24, 8, line);
        this.eindDatum = getDate(32, 8, line);
        this.fotoIndexNummer = getNumber(40, 8, line);
        this.vastgesteldeWaardeOpDatumMarktgegeven = getLong(48, 11, line);
        this.koopDatum = getDate(59, 8, line);
        this.verwachteWijzigingVastgesteldeWaarde = getNumber(67, 4, line);
        this.redenAfwijkingMarktgegevenWozGebaseerdVerwachting = getNumber(71, 2, line);
        this.relevantieRedenAfwijking = getNumber(73, 1, line);
        this.kwantificeringVerschilVerkoopprijsTovMarktwaarde = getNumber(74, 10, line);
        this.kwantificeringFoutOudeVastgesteldeWaarde = getNumber(84, 10, line);
        this.kwantificeringGevolgWijzigingWOZObject = getNumber(94, 10, line);
    }
}