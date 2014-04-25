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
@Table(name = "stuftax_20")
public class StufTAXRecord1020 extends StufTAXRecord implements Serializable {
    
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="line_number")
    private Integer lineNumber;
    
    @Column(name="woz_objectnummer")
    private Long wozObjectNummer;
    
    @Column(name="woonplaats")
    private String woonplaatsNaam;
    
    @Column(name="straatnaam")
    private String straatNaam;
    
    @Column(name="huisnummer")
    private Integer huisNummer;
    
    @Column(name="huisletter")
    private String huisLetter;
    
    @Column(name="huisnummer_toev")
    private String huisNummerToevoeging;
    
    @Column(name="aand_huisnummer")
    private String aanduidingBijHuisnummer;
    
    @Column(name="postcode")
    private String postcode;
    
    @Column(name="lokatieomschrijving")
    private String lokatieOmschrijving;
    
    @Column(name="grondoppervlakte")
    private Integer grondOppervlakte;
    
    @Column(name="gebruikscode")
    private Integer gebruiksCode;
    
    @Column(name="code_geb_ongeb")
    private String codeGebouwdOngebouwd;
    
    @Column(name="meegetaxeerde_opp_geb")
    private Integer meegetaxeerdeOppervlakteGebouwd;
    
    @Column(name="aandeel_getaxeerd_waarde_geb")
    private Integer aandeelGetaxeerdeWaardeGebouwd;
    
    @Column(name="vastgesteld_waarde")
    private Integer vastgesteldeWaarde;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="waarde_peildatum")
    private Date waardePeilDatum;
    
    @Column(name="bijz_waardering_code")
    private Integer bijzondereWaarderingsCode;
    
    @Column(name="mutatiecode")
    private String mutatieCode;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="ingangsdatum")
    private Date ingangsDatum;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="einddatum")
    private Date eindDatum;
    
    @Column(name="straatcode")
    private Integer straatCode;
    
    @Column(name="aand_valutasoort")
    private String aanduidingValutaSoort;
    
    @Column(name="code_blokkeren_taxatie")
    private Integer codeBlokkerenTaxatie;   

    public StufTAXRecord1020() {
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

    public String getWoonplaatsNaam() {
        return woonplaatsNaam;
    }

    public void setWoonplaatsNaam(String woonplaatsNaam) {
        this.woonplaatsNaam = woonplaatsNaam;
    }

    public String getStraatNaam() {
        return straatNaam;
    }

    public void setStraatNaam(String straatNaam) {
        this.straatNaam = straatNaam;
    }

    public Integer getHuisNummer() {
        return huisNummer;
    }

    public void setHuisNummer(Integer huisNummer) {
        this.huisNummer = huisNummer;
    }

    public String getHuisLetter() {
        return huisLetter;
    }

    public void setHuisLetter(String huisLetter) {
        this.huisLetter = huisLetter;
    }

    public String getHuisNummerToevoeging() {
        return huisNummerToevoeging;
    }

    public void setHuisNummerToevoeging(String huisNummerToevoeging) {
        this.huisNummerToevoeging = huisNummerToevoeging;
    }

    public String getAanduidingBijHuisnummer() {
        return aanduidingBijHuisnummer;
    }

    public void setAanduidingBijHuisnummer(String aanduidingBijHuisnummer) {
        this.aanduidingBijHuisnummer = aanduidingBijHuisnummer;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getLokatieOmschrijving() {
        return lokatieOmschrijving;
    }

    public void setLokatieOmschrijving(String lokatieOmschrijving) {
        this.lokatieOmschrijving = lokatieOmschrijving;
    }

    public Integer getGrondOppervlakte() {
        return grondOppervlakte;
    }

    public void setGrondOppervlakte(Integer grondOppervlakte) {
        this.grondOppervlakte = grondOppervlakte;
    }

    public Integer getGebruiksCode() {
        return gebruiksCode;
    }

    public void setGebruiksCode(Integer gebruiksCode) {
        this.gebruiksCode = gebruiksCode;
    }

    public String getCodeGebouwdOngebouwd() {
        return codeGebouwdOngebouwd;
    }

    public void setCodeGebouwdOngebouwd(String codeGebouwdOngebouwd) {
        this.codeGebouwdOngebouwd = codeGebouwdOngebouwd;
    }

    public Integer getMeegetaxeerdeOppervlakteGebouwd() {
        return meegetaxeerdeOppervlakteGebouwd;
    }

    public void setMeegetaxeerdeOppervlakteGebouwd(Integer meegetaxeerdeOppervlakteGebouwd) {
        this.meegetaxeerdeOppervlakteGebouwd = meegetaxeerdeOppervlakteGebouwd;
    }

    public Integer getAandeelGetaxeerdeWaardeGebouwd() {
        return aandeelGetaxeerdeWaardeGebouwd;
    }

    public void setAandeelGetaxeerdeWaardeGebouwd(Integer aandeelGetaxeerdeWaardeGebouwd) {
        this.aandeelGetaxeerdeWaardeGebouwd = aandeelGetaxeerdeWaardeGebouwd;
    }

    public Integer getVastgesteldeWaarde() {
        return vastgesteldeWaarde;
    }

    public void setVastgesteldeWaarde(Integer vastgesteldeWaarde) {
        this.vastgesteldeWaarde = vastgesteldeWaarde;
    }

    public Date getWaardePeilDatum() {
        return waardePeilDatum;
    }

    public void setWaardePeilDatum(Date waardePeilDatum) {
        this.waardePeilDatum = waardePeilDatum;
    }

    public Integer getBijzondereWaarderingsCode() {
        return bijzondereWaarderingsCode;
    }

    public void setBijzondereWaarderingsCode(Integer bijzondereWaarderingsCode) {
        this.bijzondereWaarderingsCode = bijzondereWaarderingsCode;
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

    public Integer getStraatCode() {
        return straatCode;
    }

    public void setStraatCode(Integer straatCode) {
        this.straatCode = straatCode;
    }

    public String getAanduidingValutaSoort() {
        return aanduidingValutaSoort;
    }

    public void setAanduidingValutaSoort(String aanduidingValutaSoort) {
        this.aanduidingValutaSoort = aanduidingValutaSoort;
    }

    public Integer getCodeBlokkerenTaxatie() {
        return codeBlokkerenTaxatie;
    }

    public void setCodeBlokkerenTaxatie(Integer codeBlokkerenTaxatie) {
        this.codeBlokkerenTaxatie = codeBlokkerenTaxatie;
    }

    @Override
    public void fillValues(LineNumberReader lineNumberReader, String line) {
        this.lineNumber = lineNumberReader.getLineNumber();
        
        this.wozObjectNummer = getLong(3, 12, line);
        this.woonplaatsNaam = getString(15, 40, line);        
        this.straatNaam = getString(55, 24, line); 
        this.huisNummer = getNumber(79, 5, line); 
        this.huisLetter = getString(84, 1, line);        
        this.huisNummerToevoeging = getString(85, 4, line);
        this.aanduidingBijHuisnummer = getString(89, 2, line);
        this.postcode = getString(91, 6, line);
        this.lokatieOmschrijving = getString(97, 40, line);
        this.grondOppervlakte = getNumber(137, 8, line);        
        this.gebruiksCode = getNumber(145, 2, line);
        this.codeGebouwdOngebouwd = getString(147, 1, line);
        this.meegetaxeerdeOppervlakteGebouwd = getNumber(148, 8, line);
        this.aandeelGetaxeerdeWaardeGebouwd = getNumber(156, 11, line);
        this.vastgesteldeWaarde = getNumber(167, 11, line);
        this.waardePeilDatum = getDate(178, 8, line);
        this.bijzondereWaarderingsCode = getNumber(186, 3, line);        
        this.mutatieCode = getString(189, 1, line);
        this.ingangsDatum = getDate(190, 8, line);
        this.eindDatum = getDate(198, 8, line);
        this.straatCode = getNumber(206, 5, line);
        this.aanduidingValutaSoort = getString(211, 3, line);
        this.codeBlokkerenTaxatie = getNumber(214, 2, line);
    }
}