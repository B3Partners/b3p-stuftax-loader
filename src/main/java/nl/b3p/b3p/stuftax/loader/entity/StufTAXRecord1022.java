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
@Table(name = "stuftax_22")
public class StufTAXRecord1022 extends StufTAXRecord implements Serializable {
    
    @Id
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    private Long id;
    
    @Column(name="line_number")
    private Integer lineNumber;
    
    @Column(name="woz_objectnummer")
    private Long wozObjectNummer;
    
    @Column(name="nummer_onderdeel")
    private Integer nummerOnderdeel;
    
    @Column(name="waarderingvoorschrift")
    private String gehanteerdWaarderingsvoorschrift;
    
    @Column(name="code_omzetbelasting")
    private String codeOmzetbelasting;
    
    @Column(name="aand_groep_vergelijkb_object")
    private String groepAanduidingvergelijkbareObjecten;
    
    @Column(name="bepaald_waarde_onderdeel")
    private Integer bepaaldeWaardeOnderdeel;   
    
    @Column(name="code_vrijstelling_ozb")
    private String codeVrijstellingOZB;
    
    @Column(name="code_onderdeel_wozobject")
    private String codeOnderdeelWOZObject;
    
    @Column(name="bouwjaar")
    private String bouwjaar;
    
    @Column(name="bouwlaag")
    private Integer bouwlaag;
    
    @Column(name="ontsluiting_verdieping")
    private String ontsluitingVerdieping;
    
    @Column(name="aantal_kamers")
    private Integer aantalKamers;
    
    @Column(name="jaar_renovatie")
    private Integer renovatieJaar;
    
    @Column(name="percentage_renovatie")
    private Integer renovatiePercentage;
    
    @Column(name="kwaliteit_luxe")
    private String kwaliteitLuxe;
    
    @Column(name="onderhoudtoestand")
    private String onderhoudsToestand;
    
    @Column(name="uitstraling")
    private String uitstraling;
    
    @Column(name="doelmatigheid")
    private String doelmatigheid;
    
    @Column(name="voorzieningen")
    private String voorzieningen;
    
    @Column(name="inhoud")
    private Integer inhoud;
    
    @Column(name="code_bruto_netto_inhoud")
    private String codeBrutoNettoInhoud;
    
    @Column(name="oppervlakte")
    private Integer oppervlakte;
    
    @Column(name="code_bruto_netto_oppervlakte")
    private String codeBrutoNettoOppervlakte;
    
    @Column(name="lengte")
    private Integer lengte;
    
    @Column(name="breedte")
    private Integer breedte;
    
    @Column(name="hoogte")
    private Integer hoogte;
    
    @Column(name="front_breedte")
    private Integer frontBreedte;
    
    @Column(name="aantal_stuk_eenheden")
    private Integer aantalStuksEenheden;
    
    @Column(name="waarde_per_stuk_eenheid")
    private Integer waardePerStukEenheid;
    
    @Column(name="huurwaarde_per_m2")
    private Integer huurwaardePerM2;
    
    @Column(name="huurwaarde")
    private Integer huurwaarde;
    
    @Column(name="kapitalisatiefactor")
    private Integer kapitalisatieFactor;
    
    @Column(name="kosten_vervanging_m3_stuk")
    private Integer vervangingskostenPerM3StukEenheid;
    
    @Column(name="ongecorrigeerd_vervangwaarde")
    private Integer ongecorrigeerdeVervangingswaarde;
    
    @Column(name="verwachte_levensduur")
    private Integer verwachteLevensduur;
    
    @Column(name="restwaarde")
    private Integer restwaarde;
    
    @Column(name="factor_techn_veroudering")
    private Integer factorTechnischeVeroudering;
    
    @Column(name="invloed_eco_veroudering")
    private Integer invloedEconomischeVeroudering;
    
    @Column(name="invloed_bouwwijze_verandering")
    private Integer invloedVeranderingBouwwijze;
    
    @Column(name="invloed_doelmatigheid")
    private Integer invloedDoelmatigheid;
    
    @Column(name="invloed_excess_gebruikkost")
    private Integer invloedExcessieveGebruikskosten;
    
    @Column(name="factor_func_veroudering")
    private Integer factorFunctioneleVeroudering;
    
    @Column(name="aantekening_onderdeel")
    private String aantekeningOnderdeel;
    
    @Column(name="code_taxatie_methode")
    private String codeTaxatieMethodiek;
    
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
    
    public StufTAXRecord1022() {
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

    public Integer getNummerOnderdeel() {
        return nummerOnderdeel;
    }

    public void setNummerOnderdeel(Integer nummerOnderdeel) {
        this.nummerOnderdeel = nummerOnderdeel;
    }

    public String getGehanteerdWaarderingsvoorschrift() {
        return gehanteerdWaarderingsvoorschrift;
    }

    public void setGehanteerdWaarderingsvoorschrift(String gehanteerdWaarderingsvoorschrift) {
        this.gehanteerdWaarderingsvoorschrift = gehanteerdWaarderingsvoorschrift;
    }

    public String getCodeOmzetbelasting() {
        return codeOmzetbelasting;
    }

    public void setCodeOmzetbelasting(String codeOmzetbelasting) {
        this.codeOmzetbelasting = codeOmzetbelasting;
    }

    public String getGroepAanduidingvergelijkbareObjecten() {
        return groepAanduidingvergelijkbareObjecten;
    }

    public void setGroepAanduidingvergelijkbareObjecten(String groepAanduidingvergelijkbareObjecten) {
        this.groepAanduidingvergelijkbareObjecten = groepAanduidingvergelijkbareObjecten;
    }

    public Integer getBepaaldeWaardeOnderdeel() {
        return bepaaldeWaardeOnderdeel;
    }

    public void setBepaaldeWaardeOnderdeel(Integer bepaaldeWaardeOnderdeel) {
        this.bepaaldeWaardeOnderdeel = bepaaldeWaardeOnderdeel;
    }

    public String getCodeVrijstellingOZB() {
        return codeVrijstellingOZB;
    }

    public void setCodeVrijstellingOZB(String codeVrijstellingOZB) {
        this.codeVrijstellingOZB = codeVrijstellingOZB;
    }

    public String getCodeOnderdeelWOZObject() {
        return codeOnderdeelWOZObject;
    }

    public void setCodeOnderdeelWOZObject(String codeOnderdeelWOZObject) {
        this.codeOnderdeelWOZObject = codeOnderdeelWOZObject;
    }

    public String getBouwjaar() {
        return bouwjaar;
    }

    public void setBouwjaar(String bouwjaar) {
        this.bouwjaar = bouwjaar;
    }

    public Integer getBouwlaag() {
        return bouwlaag;
    }

    public void setBouwlaag(Integer bouwlaag) {
        this.bouwlaag = bouwlaag;
    }

    public String getOntsluitingVerdieping() {
        return ontsluitingVerdieping;
    }

    public void setOntsluitingVerdieping(String ontsluitingVerdieping) {
        this.ontsluitingVerdieping = ontsluitingVerdieping;
    }

    public Integer getAantalKamers() {
        return aantalKamers;
    }

    public void setAantalKamers(Integer aantalKamers) {
        this.aantalKamers = aantalKamers;
    }

    public Integer getRenovatieJaar() {
        return renovatieJaar;
    }

    public void setRenovatieJaar(Integer renovatieJaar) {
        this.renovatieJaar = renovatieJaar;
    }

    public Integer getRenovatiePercentage() {
        return renovatiePercentage;
    }

    public void setRenovatiePercentage(Integer renovatiePercentage) {
        this.renovatiePercentage = renovatiePercentage;
    }

    public String getKwaliteitLuxe() {
        return kwaliteitLuxe;
    }

    public void setKwaliteitLuxe(String kwaliteitLuxe) {
        this.kwaliteitLuxe = kwaliteitLuxe;
    }

    public String getOnderhoudsToestand() {
        return onderhoudsToestand;
    }

    public void setOnderhoudsToestand(String onderhoudsToestand) {
        this.onderhoudsToestand = onderhoudsToestand;
    }

    public String getUitstraling() {
        return uitstraling;
    }

    public void setUitstraling(String uitstraling) {
        this.uitstraling = uitstraling;
    }

    public String getDoelmatigheid() {
        return doelmatigheid;
    }

    public void setDoelmatigheid(String doelmatigheid) {
        this.doelmatigheid = doelmatigheid;
    }

    public String getVoorzieningen() {
        return voorzieningen;
    }

    public void setVoorzieningen(String voorzieningen) {
        this.voorzieningen = voorzieningen;
    }

    public Integer getInhoud() {
        return inhoud;
    }

    public void setInhoud(Integer inhoud) {
        this.inhoud = inhoud;
    }

    public String getCodeBrutoNettoInhoud() {
        return codeBrutoNettoInhoud;
    }

    public void setCodeBrutoNettoInhoud(String codeBrutoNettoInhoud) {
        this.codeBrutoNettoInhoud = codeBrutoNettoInhoud;
    }

    public Integer getOppervlakte() {
        return oppervlakte;
    }

    public void setOppervlakte(Integer oppervlakte) {
        this.oppervlakte = oppervlakte;
    }

    public String getCodeBrutoNettoOppervlakte() {
        return codeBrutoNettoOppervlakte;
    }

    public void setCodeBrutoNettoOppervlakte(String codeBrutoNettoOppervlakte) {
        this.codeBrutoNettoOppervlakte = codeBrutoNettoOppervlakte;
    }

    public Integer getLengte() {
        return lengte;
    }

    public void setLengte(Integer lengte) {
        this.lengte = lengte;
    }

    public Integer getBreedte() {
        return breedte;
    }

    public void setBreedte(Integer breedte) {
        this.breedte = breedte;
    }

    public Integer getHoogte() {
        return hoogte;
    }

    public void setHoogte(Integer hoogte) {
        this.hoogte = hoogte;
    }

    public Integer getFrontBreedte() {
        return frontBreedte;
    }

    public void setFrontBreedte(Integer frontBreedte) {
        this.frontBreedte = frontBreedte;
    }

    public Integer getAantalStuksEenheden() {
        return aantalStuksEenheden;
    }

    public void setAantalStuksEenheden(Integer aantalStuksEenheden) {
        this.aantalStuksEenheden = aantalStuksEenheden;
    }

    public Integer getWaardePerStukEenheid() {
        return waardePerStukEenheid;
    }

    public void setWaardePerStukEenheid(Integer waardePerStukEenheid) {
        this.waardePerStukEenheid = waardePerStukEenheid;
    }

    public Integer getHuurwaardePerM2() {
        return huurwaardePerM2;
    }

    public void setHuurwaardePerM2(Integer huurwaardePerM2) {
        this.huurwaardePerM2 = huurwaardePerM2;
    }

    public Integer getHuurwaarde() {
        return huurwaarde;
    }

    public void setHuurwaarde(Integer huurwaarde) {
        this.huurwaarde = huurwaarde;
    }

    public Integer getKapitalisatieFactor() {
        return kapitalisatieFactor;
    }

    public void setKapitalisatieFactor(Integer kapitalisatieFactor) {
        this.kapitalisatieFactor = kapitalisatieFactor;
    }

    public Integer getVervangingskostenPerM3StukEenheid() {
        return vervangingskostenPerM3StukEenheid;
    }

    public void setVervangingskostenPerM3StukEenheid(Integer vervangingskostenPerM3StukEenheid) {
        this.vervangingskostenPerM3StukEenheid = vervangingskostenPerM3StukEenheid;
    }

    public Integer getOngecorrigeerdeVervangingswaarde() {
        return ongecorrigeerdeVervangingswaarde;
    }

    public void setOngecorrigeerdeVervangingswaarde(Integer ongecorrigeerdeVervangingswaarde) {
        this.ongecorrigeerdeVervangingswaarde = ongecorrigeerdeVervangingswaarde;
    }

    public Integer getVerwachteLevensduur() {
        return verwachteLevensduur;
    }

    public void setVerwachteLevensduur(Integer verwachteLevensduur) {
        this.verwachteLevensduur = verwachteLevensduur;
    }

    public Integer getRestwaarde() {
        return restwaarde;
    }

    public void setRestwaarde(Integer restwaarde) {
        this.restwaarde = restwaarde;
    }

    public Integer getFactorTechnischeVeroudering() {
        return factorTechnischeVeroudering;
    }

    public void setFactorTechnischeVeroudering(Integer factorTechnischeVeroudering) {
        this.factorTechnischeVeroudering = factorTechnischeVeroudering;
    }

    public Integer getInvloedEconomischeVeroudering() {
        return invloedEconomischeVeroudering;
    }

    public void setInvloedEconomischeVeroudering(Integer invloedEconomischeVeroudering) {
        this.invloedEconomischeVeroudering = invloedEconomischeVeroudering;
    }

    public Integer getInvloedVeranderingBouwwijze() {
        return invloedVeranderingBouwwijze;
    }

    public void setInvloedVeranderingBouwwijze(Integer invloedVeranderingBouwwijze) {
        this.invloedVeranderingBouwwijze = invloedVeranderingBouwwijze;
    }

    public Integer getInvloedDoelmatigheid() {
        return invloedDoelmatigheid;
    }

    public void setInvloedDoelmatigheid(Integer invloedDoelmatigheid) {
        this.invloedDoelmatigheid = invloedDoelmatigheid;
    }

    public Integer getInvloedExcessieveGebruikskosten() {
        return invloedExcessieveGebruikskosten;
    }

    public void setInvloedExcessieveGebruikskosten(Integer invloedExcessieveGebruikskosten) {
        this.invloedExcessieveGebruikskosten = invloedExcessieveGebruikskosten;
    }

    public Integer getFactorFunctioneleVeroudering() {
        return factorFunctioneleVeroudering;
    }

    public void setFactorFunctioneleVeroudering(Integer factorFunctioneleVeroudering) {
        this.factorFunctioneleVeroudering = factorFunctioneleVeroudering;
    }

    public String getAantekeningOnderdeel() {
        return aantekeningOnderdeel;
    }

    public void setAantekeningOnderdeel(String aantekeningOnderdeel) {
        this.aantekeningOnderdeel = aantekeningOnderdeel;
    }

    public String getCodeTaxatieMethodiek() {
        return codeTaxatieMethodiek;
    }

    public void setCodeTaxatieMethodiek(String codeTaxatieMethodiek) {
        this.codeTaxatieMethodiek = codeTaxatieMethodiek;
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

    @Override
    public void fillValues(int linenumber, String line) {
        this.lineNumber = linenumber;
        
        this.wozObjectNummer = getLong(3, 12, line);
        this.nummerOnderdeel = getNumber(15, 6, line);
        this.gehanteerdWaarderingsvoorschrift = getString(21, 1, line);
        this.codeOmzetbelasting = getString(22, 1, line);
        this.groepAanduidingvergelijkbareObjecten = getString(23, 8, line);
        this.bepaaldeWaardeOnderdeel = getNumber(31, 10, line);
        this.codeVrijstellingOZB = getString(41, 1, line);
        this.codeOnderdeelWOZObject = getString(42, 4, line);
        this.bouwjaar = getString(46, 9, line);
        this.bouwlaag = getNumber(55, 3, line);
        this.ontsluitingVerdieping = getString(58, 3, line);
        this.aantalKamers = getNumber(61, 2, line);
        this.renovatieJaar = getNumber(63, 4, line);
        this.renovatiePercentage = getNumber(67, 2, line);
        this.kwaliteitLuxe = getString(69, 1, line);
        this.onderhoudsToestand = getString(70, 1, line);
        this.uitstraling = getString(71, 1, line);
        this.doelmatigheid = getString(72, 1, line);
        this.voorzieningen = getString(73, 4, line);        
        
        // Sonar Qube Ncss method count
        fillTheRest(line); 
    }
    
    private void fillTheRest(String line) {
        this.inhoud = getNumber(77, 6, line);
        this.codeBrutoNettoInhoud = getString(83, 1, line); 
        this.oppervlakte = getNumber(84, 6, line);
        this.codeBrutoNettoOppervlakte = getString(90, 1, line);
        this.lengte = getNumber(91, 4, line);
        this.breedte = getNumber(95, 4, line);
        this.hoogte = getNumber(99, 4, line);
        this.frontBreedte = getNumber(103, 4, line);
        this.aantalStuksEenheden = getNumber(107, 4, line);
        this.waardePerStukEenheid = getNumber(111, 7, line);
        this.huurwaardePerM2 = getNumber(118, 7, line);
        this.huurwaarde = getNumber(125, 10, line);
        this.kapitalisatieFactor = getNumber(135, 3, line);
        this.vervangingskostenPerM3StukEenheid = getNumber(138, 7, line);
        this.ongecorrigeerdeVervangingswaarde = getNumber(145, 11, line);
        this.verwachteLevensduur = getNumber(156, 3, line);
        this.restwaarde = getNumber(159, 3, line);
        this.factorTechnischeVeroudering = getNumber(162, 4, line);
        this.invloedEconomischeVeroudering = getNumber(166, 4, line);
        this.invloedVeranderingBouwwijze = getNumber(170, 4, line);
        this.invloedDoelmatigheid = getNumber(174, 4, line);
        this.invloedExcessieveGebruikskosten = getNumber(178, 4, line);
        this.factorFunctioneleVeroudering = getNumber(182, 4, line);
        this.aantekeningOnderdeel = getString(186, 30, line);
        this.codeTaxatieMethodiek = getString(216, 1, line);
        this.mutatiecode = getString(217, 1, line);
        this.ingangsDatum = getDate(218, 8, line);
        this.eindDatum = getDate(226, 8, line);
        this.fotoIndexNummer = getNumber(234, 8, line);
    }
}