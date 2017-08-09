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
@Table(name = "stuftax_21")
public class StufTAXRecord1021 extends StufTAXRecord implements Serializable {
    
    @Id
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    private Long id;
    
    @Column(name="line_number")
    private Integer lineNumber;
    
    @Column(name="woz_objectnummer")
    private Long wozObjectNummer;
    
    @Column(name="wijkcode")
    private Integer wijkcode;
    
    @Column(name="buurtcode")
    private Integer buurtcode;
    
    @Column(name="waarde_onr_zaakbelasting")
    private Integer waardeOnroerendeZaakbeslasting;
    
    @Column(name="reden_waardeverschil_vast_onr")
    private String redenWaardeverschilVastOnroerend;
    
    @Column(name="getaxeerd_waarde")
    private Integer getaxeerdeWaarde;
    
    @Column(name="heffing_maatstaf_onr_gebr")
    private Integer heffingsMaatstafOnroerendZaakbeslastingGebr;
    
    @Column(name="waarderingvoorschrift")
    private String gehanteerdWaarderingsvoorschrift;
    
    @Column(name="aand_monument")
    private String monumentAanduiding;
    
    @Column(name="code_omzetbelasting")
    private String codeOmzetbelasting;
    
    @Column(name="aand_groep_vergelijkb_object")
    private String groepAanduidingvergelijkbareObjecten;
    
    @Column(name="type_aanduiding")
    private String typeAanduiding;
    
    @Column(name="soort_object_code")
    private String soortObjectCode;
    
    @Column(name="aanwezig_lift")
    private String aanwezigheidLift;
    
    @Column(name="indicatie_ligging")
    private String indicatieLigging;
    
    @Column(name="code_ontbreken_nuts")
    private String codeOntbrekenNutsVoorziening;
    
    @Column(name="foto_indexnummer")
    private Integer fotoIndexNummer;
    
    @Column(name="financieringvorm")
    private String financieringsVorm;
    
    @Column(name="aantekening")
    private String aantekening;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="taxatiedatum")
    private Date taxatieDatum;
    
    @Column(name="taxateur")
    private String taxateur;
    
    @Column(name="inpandige_opname")
    private String inpandigeOpname;
    
    @Column(name="stijlletter")
    private String stijlLetter;
    
    @Column(name="percentage_gereed")
    private Integer percentageGereed;
    
    @Column(name="mutatiecode")
    private String mutatiecode;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="ingangsdatum")
    private Date ingangsDatum;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="einddatum")
    private Date eindDatum;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="toestand_peildatum")
    private Date toestandsPeildatum;  

    public StufTAXRecord1021() {
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

    public Integer getWijkcode() {
        return wijkcode;
    }

    public void setWijkcode(Integer wijkcode) {
        this.wijkcode = wijkcode;
    }

    public Integer getBuurtcode() {
        return buurtcode;
    }

    public void setBuurtcode(Integer buurtcode) {
        this.buurtcode = buurtcode;
    }

    public Integer getWaardeOnroerendeZaakbeslasting() {
        return waardeOnroerendeZaakbeslasting;
    }

    public void setWaardeOnroerendeZaakbeslasting(Integer waardeOnroerendeZaakbeslasting) {
        this.waardeOnroerendeZaakbeslasting = waardeOnroerendeZaakbeslasting;
    }

    public String getRedenWaardeverschilVastOnroerend() {
        return redenWaardeverschilVastOnroerend;
    }

    public void setRedenWaardeverschilVastOnroerend(String redenWaardeverschilVastOnroerend) {
        this.redenWaardeverschilVastOnroerend = redenWaardeverschilVastOnroerend;
    }

    public Integer getGetaxeerdeWaarde() {
        return getaxeerdeWaarde;
    }

    public void setGetaxeerdeWaarde(Integer getaxeerdeWaarde) {
        this.getaxeerdeWaarde = getaxeerdeWaarde;
    }

    public Integer getHeffingsMaatstafOnroerendZaakbeslastingGebr() {
        return heffingsMaatstafOnroerendZaakbeslastingGebr;
    }

    public void setHeffingsMaatstafOnroerendZaakbeslastingGebr(Integer heffingsMaatstafOnroerendZaakbeslastingGebr) {
        this.heffingsMaatstafOnroerendZaakbeslastingGebr = heffingsMaatstafOnroerendZaakbeslastingGebr;
    }

    public String getGehanteerdWaarderingsvoorschrift() {
        return gehanteerdWaarderingsvoorschrift;
    }

    public void setGehanteerdWaarderingsvoorschrift(String gehanteerdWaarderingsvoorschrift) {
        this.gehanteerdWaarderingsvoorschrift = gehanteerdWaarderingsvoorschrift;
    }

    public String getMonumentAanduiding() {
        return monumentAanduiding;
    }

    public void setMonumentAanduiding(String monumentAanduiding) {
        this.monumentAanduiding = monumentAanduiding;
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

    public String getTypeAanduiding() {
        return typeAanduiding;
    }

    public void setTypeAanduiding(String typeAanduiding) {
        this.typeAanduiding = typeAanduiding;
    }

    public String getSoortObjectCode() {
        return soortObjectCode;
    }

    public void setSoortObjectCode(String soortObjectCode) {
        this.soortObjectCode = soortObjectCode;
    }

    public String getAanwezigheidLift() {
        return aanwezigheidLift;
    }

    public void setAanwezigheidLift(String aanwezigheidLift) {
        this.aanwezigheidLift = aanwezigheidLift;
    }

    public String getIndicatieLigging() {
        return indicatieLigging;
    }

    public void setIndicatieLigging(String indicatieLigging) {
        this.indicatieLigging = indicatieLigging;
    }

    public String getCodeOntbrekenNutsVoorziening() {
        return codeOntbrekenNutsVoorziening;
    }

    public void setCodeOntbrekenNutsVoorziening(String codeOntbrekenNutsVoorziening) {
        this.codeOntbrekenNutsVoorziening = codeOntbrekenNutsVoorziening;
    }

    public Integer getFotoIndexNummer() {
        return fotoIndexNummer;
    }

    public void setFotoIndexNummer(Integer fotoIndexNummer) {
        this.fotoIndexNummer = fotoIndexNummer;
    }

    public String getFinancieringsVorm() {
        return financieringsVorm;
    }

    public void setFinancieringsVorm(String financieringsVorm) {
        this.financieringsVorm = financieringsVorm;
    }

    public String getAantekening() {
        return aantekening;
    }

    public void setAantekening(String aantekening) {
        this.aantekening = aantekening;
    }

    public Date getTaxatieDatum() {
        return taxatieDatum;
    }

    public void setTaxatieDatum(Date taxatieDatum) {
        this.taxatieDatum = taxatieDatum;
    }

    public String getTaxateur() {
        return taxateur;
    }

    public void setTaxateur(String taxateur) {
        this.taxateur = taxateur;
    }

    public String getInpandigeOpname() {
        return inpandigeOpname;
    }

    public void setInpandigeOpname(String inpandigeOpname) {
        this.inpandigeOpname = inpandigeOpname;
    }

    public String getStijlLetter() {
        return stijlLetter;
    }

    public void setStijlLetter(String stijlLetter) {
        this.stijlLetter = stijlLetter;
    }

    public Integer getPercentageGereed() {
        return percentageGereed;
    }

    public void setPercentageGereed(Integer percentageGereed) {
        this.percentageGereed = percentageGereed;
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

    public Date getToestandsPeildatum() {
        return toestandsPeildatum;
    }

    public void setToestandsPeildatum(Date toestandsPeildatum) {
        this.toestandsPeildatum = toestandsPeildatum;
    }

    @Override
    public void fillValues(LineNumberReader lineNumberReader, String line) {
        this.lineNumber = lineNumberReader.getLineNumber();
        
        this.wozObjectNummer = getLong(3, 12, line);
        this.wijkcode = getNumber(15, 3, line);
        this.buurtcode = getNumber(18, 3, line);
        this.waardeOnroerendeZaakbeslasting = getNumber(21, 11, line);
        this.redenWaardeverschilVastOnroerend = getString(32, 1, line);
        this.getaxeerdeWaarde = getNumber(33, 11, line);
        this.heffingsMaatstafOnroerendZaakbeslastingGebr = getNumber(44, 11, line);
        this.gehanteerdWaarderingsvoorschrift = getString(73, 1, line);
        this.monumentAanduiding = getString(74, 1, line);
        this.codeOmzetbelasting = getString(75, 1, line);
        this.groepAanduidingvergelijkbareObjecten = getString(76, 8, line);
        this.typeAanduiding = getString(84, 6, line);
        this.soortObjectCode = getString(90, 4, line);
        this.aanwezigheidLift = getString(106, 1, line);
        this.indicatieLigging = getString(114, 2, line);
        this.codeOntbrekenNutsVoorziening = getString(118, 3, line);
        this.fotoIndexNummer = getNumber(153, 8, line);
        this.financieringsVorm = getString(161, 2, line);
        this.aantekening = getString(163, 50, line);
        this.taxatieDatum = getDate(213, 8, line);
        this.taxateur = getString(221, 4, line);
        this.inpandigeOpname =  getString(225, 1, line);
        this.stijlLetter = getString(226, 1, line);
        this.percentageGereed = getNumber(227, 3, line);
        this.mutatiecode = getString(230, 1, line);
        this.ingangsDatum = getDate(231, 8, line);
        this.eindDatum = getDate(239, 8, line);
        this.toestandsPeildatum = getDate(247, 8, line);
    }
}