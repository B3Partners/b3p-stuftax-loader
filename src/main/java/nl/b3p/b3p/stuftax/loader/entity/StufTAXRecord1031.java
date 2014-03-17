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
@Table(name = "stax_subject_31")
public class StufTAXRecord1031 extends StufTAXRecord implements Serializable {
    
    @Id
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    private Long id;
    
    @Column(name="line_number")
    private Integer lineNumber;
    
    @Column(name="sofinummer")
    private Integer sofinummer;    
    
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
    
    @Column(name="woonplaats")
    private String woonplaatsNaam;
    
    @Column(name="land")
    private String landNaam;
    
    @Column(name="mutatiecode")
    private String mutatieCode;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="ingangsdatum")
    private Date ingangsDatum;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="einddatum")
    private Date eindDatum;
    
    @Column(name="lokatieomschrijving")
    private String lokatieOmschrijving;
    
    @Column(name="aanvulling_sofinummer")
    private Integer aanvullingSofinummer;
    
    @Column(name="handelsregisternummer")
    private Integer handelsRegisterNummer;
    
    @Column(name="subjectnummer_akr")
    private Integer subjectNummerAKR;
    
    @Column(name="adelijke_titel_predikaat")
    private String adelijkeTitelPredikaat;
    
    @Column(name="geslacht")
    private String geslachtsAanduiding;    
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="geb_datum_nat_persoon")
    private Date geboorteDatumNatPersoon;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="overlijden_datum_nat_persoon")
    private Date overlijdensDatumNatPersoon;
    
    @Column(name="status_subject")
    private String statusSubject;
    
    @Column(name="functie_adres")
    private String functieAdres; 

    public StufTAXRecord1031() {
    }
    
    public StufTAXRecord1031(LineNumberReader lineNumberReader, String line) {   
        this.lineNumber = lineNumberReader.getLineNumber();
        
        this.sofinummer = getNumber(3, 9, line);
        this.straatNaam = getString(12, 24, line);
        this.huisNummer = getNumber(36, 5, line);
        this.huisLetter = getString(41, 1, line);
        this.huisNummerToevoeging = getString(42, 4, line);
        this.aanduidingBijHuisnummer = getString(46, 2, line);
        this.postcode = getString(48, 6, line);
        this.woonplaatsNaam = getString(54, 40, line);
        this.landNaam = getString(94, 40, line);
        this.mutatieCode = getString(134, 1, line);
        this.ingangsDatum = getDate(135, 8, line);
        this.eindDatum = getDate(143, 8, line);
        this.lokatieOmschrijving = getString(151, 40, line);
        this.aanvullingSofinummer = getNumber(191, 10, line);
        this.handelsRegisterNummer = getNumber(201, 8, line);
        this.subjectNummerAKR = getNumber(213, 10, line);
        this.adelijkeTitelPredikaat = getString(223, 2, line);
        this.geslachtsAanduiding = getString(226, 1, line);
        this.geboorteDatumNatPersoon = getDate(227, 8, line);
        this.overlijdensDatumNatPersoon = getDate(235, 8, line);
        this.statusSubject = getString(243, 1, line);
        this.functieAdres = getString(249, 1, line);
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

    public Integer getSofinummer() {
        return sofinummer;
    }

    public void setSofinummer(Integer sofinummer) {
        this.sofinummer = sofinummer;
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

    public String getWoonplaatsNaam() {
        return woonplaatsNaam;
    }

    public void setWoonplaatsNaam(String woonplaatsNaam) {
        this.woonplaatsNaam = woonplaatsNaam;
    }

    public String getLandNaam() {
        return landNaam;
    }

    public void setLandNaam(String landNaam) {
        this.landNaam = landNaam;
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

    public String getLokatieOmschrijving() {
        return lokatieOmschrijving;
    }

    public void setLokatieOmschrijving(String lokatieOmschrijving) {
        this.lokatieOmschrijving = lokatieOmschrijving;
    }

    public Integer getAanvullingSofinummer() {
        return aanvullingSofinummer;
    }

    public void setAanvullingSofinummer(Integer aanvullingSofinummer) {
        this.aanvullingSofinummer = aanvullingSofinummer;
    }

    public Integer getHandelsRegisterNummer() {
        return handelsRegisterNummer;
    }

    public void setHandelsRegisterNummer(Integer handelsRegisterNummer) {
        this.handelsRegisterNummer = handelsRegisterNummer;
    }

    public Integer getSubjectNummerAKR() {
        return subjectNummerAKR;
    }

    public void setSubjectNummerAKR(Integer subjectNummerAKR) {
        this.subjectNummerAKR = subjectNummerAKR;
    }

    public String getAdelijkeTitelPredikaat() {
        return adelijkeTitelPredikaat;
    }

    public void setAdelijkeTitelPredikaat(String adelijkeTitelPredikaat) {
        this.adelijkeTitelPredikaat = adelijkeTitelPredikaat;
    }

    public String getGeslachtsAanduiding() {
        return geslachtsAanduiding;
    }

    public void setGeslachtsAanduiding(String geslachtsAanduiding) {
        this.geslachtsAanduiding = geslachtsAanduiding;
    }

    public Date getGeboorteDatumNatPersoon() {
        return geboorteDatumNatPersoon;
    }

    public void setGeboorteDatumNatPersoon(Date geboorteDatumNatPersoon) {
        this.geboorteDatumNatPersoon = geboorteDatumNatPersoon;
    }

    public Date getOverlijdensDatumNatPersoon() {
        return overlijdensDatumNatPersoon;
    }

    public void setOverlijdensDatumNatPersoon(Date overlijdensDatumNatPersoon) {
        this.overlijdensDatumNatPersoon = overlijdensDatumNatPersoon;
    }

    public String getStatusSubject() {
        return statusSubject;
    }

    public void setStatusSubject(String statusSubject) {
        this.statusSubject = statusSubject;
    }

    public String getFunctieAdres() {
        return functieAdres;
    }

    public void setFunctieAdres(String functieAdres) {
        this.functieAdres = functieAdres;
    }
}