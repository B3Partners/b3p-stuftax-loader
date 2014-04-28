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
@Table(name = "stuftax_52")
public class StufTAXRecord1052 extends StufTAXRecord implements Serializable {
    
    @Id
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    private Long id;
    
    @Column(name="line_number")
    private Integer lineNumber;
    
    @Column(name="volgnummer_marktgegeven")
    private Integer volgnummerMarktgegeven;
    
    @Column(name="omschrijving_transactie")
    private String omschrijvingTransactie;
    
    @Column(name="aard_marktinfo")
    private String aardMarktinfo;
    
    @Column(name="soort_transactie")
    private String soortTransactie;
    
    @Column(name="aand_bruikb_marktgegeven")
    private String aanduidingBruikbaarheidMarktgegeven;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="datum_transactie")
    private Date datumTransactie;
    
    @Column(name="txprijs")
    private Integer transactieprijs;
    
    @Column(name="txprijs_idx_waarde_peildatum")
    private Integer transactieprijsIndexWaardePeildatum;
    
    @Column(name="looptijd_huurcontract")
    private Integer looptijdHuurcontract;
    
    @Column(name="indexatie_huurpijs")
    private String indexatiehuurpijs;
    
    @Column(name="indic_omzetbel_huurprijs")
    private String indicatieOmzetbelastingHuurprijs;
    
    @Column(name="servicekosten")
    private Integer servicekosten;
    
    @Column(name="totaal_bruto_vloer_opp")
    private Integer totaalBrutoVloerOppervlakte;
    
    @Column(name="verhuurb_vloer_opp_primair")
    private Integer verhuurbareVloerOppPrimaireRuimte;
    
    @Column(name="huurprijs_m2_primair")
    private Integer huurprijsM2PrimaireRuimte;
    
    @Column(name="geschat_huurprijs_m2_peildatum")
    private Integer geschatteHuurprijsM2IndexWaardepeildatum;
    
    @Column(name="grondkosten")
    private Integer grondkosten;
    
    @Column(name="kosten_ruwbouw")
    private Integer kostenRuwbouw;
    
    @Column(name="kosten_afbouw_inr")
    private Integer kostenAfbouwInrichting;
    
    @Column(name="kosten_installatie")
    private Integer kostenInstallaties;
    
    @Column(name="kosten_werktuigen")
    private Integer kostenWerktuigen;
    
    @Column(name="kosten_infra")
    private Integer kostenInfrastructuur;
    
    @Column(name="kosten_overig")
    private Integer kostenOverig;
    
    @Column(name="totaal_brutoinhoud_obj")
    private Integer totaalBrutoInhoudObject;
    
    @Column(name="indic_omzetbel_grondprijs")
    private String indicatieOmzetbelastingGrondprijs;
    
    @Column(name="totaal_opp_grond")
    private Integer totaalOppervlakteGrond;
    
    @Column(name="gronduitgifteprijs_m2")
    private Integer gronduitgiftePrijsPerM2;
    
    @Column(name="mutatiecode")
    private String mutatiecode;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="ingangsdatum")
    private Date ingangsDatum;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="einddatum")
    private Date eindDatum;
    
    @Column(name="aand_valutasoort")
    private String aanduidingValutasoort;    

    public StufTAXRecord1052() {
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

    public Integer getVolgnummerMarktgegeven() {
        return volgnummerMarktgegeven;
    }

    public void setVolgnummerMarktgegeven(Integer volgnummerMarktgegeven) {
        this.volgnummerMarktgegeven = volgnummerMarktgegeven;
    }

    public String getOmschrijvingTransactie() {
        return omschrijvingTransactie;
    }

    public void setOmschrijvingTransactie(String omschrijvingTransactie) {
        this.omschrijvingTransactie = omschrijvingTransactie;
    }

    public String getAardMarktinfo() {
        return aardMarktinfo;
    }

    public void setAardMarktinfo(String aardMarktinfo) {
        this.aardMarktinfo = aardMarktinfo;
    }

    public String getSoortTransactie() {
        return soortTransactie;
    }

    public void setSoortTransactie(String soortTransactie) {
        this.soortTransactie = soortTransactie;
    }

    public String getAanduidingBruikbaarheidMarktgegeven() {
        return aanduidingBruikbaarheidMarktgegeven;
    }

    public void setAanduidingBruikbaarheidMarktgegeven(String aanduidingBruikbaarheidMarktgegeven) {
        this.aanduidingBruikbaarheidMarktgegeven = aanduidingBruikbaarheidMarktgegeven;
    }

    public Date getDatumTransactie() {
        return datumTransactie;
    }

    public void setDatumTransactie(Date datumTransactie) {
        this.datumTransactie = datumTransactie;
    }

    public Integer getTransactieprijs() {
        return transactieprijs;
    }

    public void setTransactieprijs(Integer transactieprijs) {
        this.transactieprijs = transactieprijs;
    }

    public Integer getTransactieprijsIndexWaardePeildatum() {
        return transactieprijsIndexWaardePeildatum;
    }

    public void setTransactieprijsIndexWaardePeildatum(Integer transactieprijsIndexWaardePeildatum) {
        this.transactieprijsIndexWaardePeildatum = transactieprijsIndexWaardePeildatum;
    }

    public Integer getLooptijdHuurcontract() {
        return looptijdHuurcontract;
    }

    public void setLooptijdHuurcontract(Integer looptijdHuurcontract) {
        this.looptijdHuurcontract = looptijdHuurcontract;
    }

    public String getIndexatiehuurpijs() {
        return indexatiehuurpijs;
    }

    public void setIndexatiehuurpijs(String indexatiehuurpijs) {
        this.indexatiehuurpijs = indexatiehuurpijs;
    }

    public String getIndicatieOmzetbelastingHuurprijs() {
        return indicatieOmzetbelastingHuurprijs;
    }

    public void setIndicatieOmzetbelastingHuurprijs(String indicatieOmzetbelastingHuurprijs) {
        this.indicatieOmzetbelastingHuurprijs = indicatieOmzetbelastingHuurprijs;
    }

    public Integer getServicekosten() {
        return servicekosten;
    }

    public void setServicekosten(Integer servicekosten) {
        this.servicekosten = servicekosten;
    }

    public Integer getTotaalBrutoVloerOppervlakte() {
        return totaalBrutoVloerOppervlakte;
    }

    public void setTotaalBrutoVloerOppervlakte(Integer totaalBrutoVloerOppervlakte) {
        this.totaalBrutoVloerOppervlakte = totaalBrutoVloerOppervlakte;
    }

    public Integer getVerhuurbareVloerOppPrimaireRuimte() {
        return verhuurbareVloerOppPrimaireRuimte;
    }

    public void setVerhuurbareVloerOppPrimaireRuimte(Integer verhuurbareVloerOppPrimaireRuimte) {
        this.verhuurbareVloerOppPrimaireRuimte = verhuurbareVloerOppPrimaireRuimte;
    }

    public Integer getHuurprijsM2PrimaireRuimte() {
        return huurprijsM2PrimaireRuimte;
    }

    public void setHuurprijsM2PrimaireRuimte(Integer huurprijsM2PrimaireRuimte) {
        this.huurprijsM2PrimaireRuimte = huurprijsM2PrimaireRuimte;
    }

    public Integer getGeschatteHuurprijsM2IndexWaardepeildatum() {
        return geschatteHuurprijsM2IndexWaardepeildatum;
    }

    public void setGeschatteHuurprijsM2IndexWaardepeildatum(Integer geschatteHuurprijsM2IndexWaardepeildatum) {
        this.geschatteHuurprijsM2IndexWaardepeildatum = geschatteHuurprijsM2IndexWaardepeildatum;
    }

    public Integer getGrondkosten() {
        return grondkosten;
    }

    public void setGrondkosten(Integer grondkosten) {
        this.grondkosten = grondkosten;
    }

    public Integer getKostenRuwbouw() {
        return kostenRuwbouw;
    }

    public void setKostenRuwbouw(Integer kostenRuwbouw) {
        this.kostenRuwbouw = kostenRuwbouw;
    }

    public Integer getKostenAfbouwInrichting() {
        return kostenAfbouwInrichting;
    }

    public void setKostenAfbouwInrichting(Integer kostenAfbouwInrichting) {
        this.kostenAfbouwInrichting = kostenAfbouwInrichting;
    }

    public Integer getKostenInstallaties() {
        return kostenInstallaties;
    }

    public void setKostenInstallaties(Integer kostenInstallaties) {
        this.kostenInstallaties = kostenInstallaties;
    }

    public Integer getKostenWerktuigen() {
        return kostenWerktuigen;
    }

    public void setKostenWerktuigen(Integer kostenWerktuigen) {
        this.kostenWerktuigen = kostenWerktuigen;
    }

    public Integer getKostenInfrastructuur() {
        return kostenInfrastructuur;
    }

    public void setKostenInfrastructuur(Integer kostenInfrastructuur) {
        this.kostenInfrastructuur = kostenInfrastructuur;
    }

    public Integer getKostenOverig() {
        return kostenOverig;
    }

    public void setKostenOverig(Integer kostenOverig) {
        this.kostenOverig = kostenOverig;
    }

    public Integer getTotaalBrutoInhoudObject() {
        return totaalBrutoInhoudObject;
    }

    public void setTotaalBrutoInhoudObject(Integer totaalBrutoInhoudObject) {
        this.totaalBrutoInhoudObject = totaalBrutoInhoudObject;
    }

    public String getIndicatieOmzetbelastingGrondprijs() {
        return indicatieOmzetbelastingGrondprijs;
    }

    public void setIndicatieOmzetbelastingGrondprijs(String indicatieOmzetbelastingGrondprijs) {
        this.indicatieOmzetbelastingGrondprijs = indicatieOmzetbelastingGrondprijs;
    }

    public Integer getTotaalOppervlakteGrond() {
        return totaalOppervlakteGrond;
    }

    public void setTotaalOppervlakteGrond(Integer totaalOppervlakteGrond) {
        this.totaalOppervlakteGrond = totaalOppervlakteGrond;
    }

    public Integer getGronduitgiftePrijsPerM2() {
        return gronduitgiftePrijsPerM2;
    }

    public void setGronduitgiftePrijsPerM2(Integer gronduitgiftePrijsPerM2) {
        this.gronduitgiftePrijsPerM2 = gronduitgiftePrijsPerM2;
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

    public String getAanduidingValutasoort() {
        return aanduidingValutasoort;
    }

    public void setAanduidingValutasoort(String aanduidingValutasoort) {
        this.aanduidingValutasoort = aanduidingValutasoort;
    }

    @Override
    public void fillValues(LineNumberReader lineNumberReader, String line) {
        this.lineNumber = lineNumberReader.getLineNumber();
        
        this.volgnummerMarktgegeven = getNumber(3, 8, line);
        this.omschrijvingTransactie = getString(11, 40, line);
        this.aardMarktinfo = getString(51, 1, line);
        this.soortTransactie = getString(52, 1, line);
        this.aanduidingBruikbaarheidMarktgegeven = getString(53, 2, line);
        this.datumTransactie = getDate(55, 8, line);
        this.transactieprijs = getNumber(63, 10, line);
        this.transactieprijsIndexWaardePeildatum = getNumber(73, 10, line);
        this.looptijdHuurcontract = getNumber(83, 3, line);
        this.indexatiehuurpijs = getString(86, 1, line);
        this.indicatieOmzetbelastingHuurprijs = getString(87, 1, line);
        this.servicekosten = getNumber(88, 10, line);
        this.totaalBrutoVloerOppervlakte = getNumber(98, 6, line);
        this.verhuurbareVloerOppPrimaireRuimte = getNumber(104, 6, line);
        this.huurprijsM2PrimaireRuimte = getNumber(110, 6, line);
        this.geschatteHuurprijsM2IndexWaardepeildatum = getNumber(116, 6, line);
        this.grondkosten = getNumber(122, 9, line);
        this.kostenRuwbouw = getNumber(131, 9, line);
        this.kostenAfbouwInrichting = getNumber(140, 9, line);
        this.kostenInstallaties = getNumber(149, 9, line);
        this.kostenWerktuigen = getNumber(158, 9, line);
        this.kostenInfrastructuur = getNumber(167, 9, line);
        this.kostenOverig = getNumber(176, 9, line);
        this.totaalBrutoInhoudObject = getNumber(185, 8, line);
        this.indicatieOmzetbelastingGrondprijs = getString(193, 1, line);
        this.totaalOppervlakteGrond = getNumber(194, 8, line);
        this.gronduitgiftePrijsPerM2 = getNumber(202, 6, line);
        this.mutatiecode = getString(208, 1, line);
        this.ingangsDatum = getDate(209, 8, line);
        this.eindDatum = getDate(217, 8, line);
        this.aanduidingValutasoort = getString(225, 3, line);
    }
}