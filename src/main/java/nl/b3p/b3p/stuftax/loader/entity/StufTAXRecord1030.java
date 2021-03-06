package nl.b3p.b3p.stuftax.loader.entity;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author boy
 */
@Entity
@Table(name = "stuftax_30")
public class StufTAXRecord1030 extends StufTAXRecord implements Serializable {
    
    @Id
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    private Long id;
    
    @Column(name="line_number")
    private Integer lineNumber;
    
    @Column(name="anummer_nat_persoon")
    private Long aNummerNatuurlijkpersoon;
    
    @Column(name="sofinummer")
    private Long sofinummer;
    
    @Column(name="voorletters")
    private String voorletters;
    
    @Column(name="voorvoegsels")
    private String voorvoegsels;
    
    @Column(name="geslacht_bedrijfnaam")
    private String geslachtsBedrijfsNaam;
    
    @Column(name="partner_bedrijfnaam_verkort")
    private String partnerBedrijfsNaamVerkort;
    
    @Column(name="voorvoegsel_partner")
    private String voorvoegselsPartnerNaam;
    
    @Column(name="aanvulling_sofinummer")
    private Integer aanvullingSofiNummer;
    
    @Column(name="aand_naamgebruik")
    private String aanduidingNaamgebruik;

    public StufTAXRecord1030() {
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

    public Long getaNummerNatuurlijkpersoon() {
        return aNummerNatuurlijkpersoon;
    }

    public void setaNummerNatuurlijkpersoon(Long aNummerNatuurlijkpersoon) {
        this.aNummerNatuurlijkpersoon = aNummerNatuurlijkpersoon;
    }

    public Long getSofinummer() {
        return sofinummer;
    }

    public void setSofinummer(Long sofinummer) {
        this.sofinummer = sofinummer;
    }

    public String getVoorletters() {
        return voorletters;
    }

    public void setVoorletters(String voorletters) {
        this.voorletters = voorletters;
    }

    public String getVoorvoegsels() {
        return voorvoegsels;
    }

    public void setVoorvoegsels(String voorvoegsels) {
        this.voorvoegsels = voorvoegsels;
    }

    public String getGeslachtsBedrijfsNaam() {
        return geslachtsBedrijfsNaam;
    }

    public void setGeslachtsBedrijfsNaam(String geslachtsBedrijfsNaam) {
        this.geslachtsBedrijfsNaam = geslachtsBedrijfsNaam;
    }

    public String getPartnerBedrijfsNaamVerkort() {
        return partnerBedrijfsNaamVerkort;
    }

    public void setPartnerBedrijfsNaamVerkort(String partnerBedrijfsNaamVerkort) {
        this.partnerBedrijfsNaamVerkort = partnerBedrijfsNaamVerkort;
    }

    public String getVoorvoegselsPartnerNaam() {
        return voorvoegselsPartnerNaam;
    }

    public void setVoorvoegselsPartnerNaam(String voorvoegselsPartnerNaam) {
        this.voorvoegselsPartnerNaam = voorvoegselsPartnerNaam;
    }

    public Integer getAanvullingSofiNummer() {
        return aanvullingSofiNummer;
    }

    public void setAanvullingSofiNummer(Integer aanvullingSofiNummer) {
        this.aanvullingSofiNummer = aanvullingSofiNummer;
    }

    public String getAanduidingNaamgebruik() {
        return aanduidingNaamgebruik;
    }

    public void setAanduidingNaamgebruik(String aanduidingNaamgebruik) {
        this.aanduidingNaamgebruik = aanduidingNaamgebruik;
    }

    @Override
    public void fillValues(int linenumber, String line) {
        this.lineNumber = linenumber;
        
        this.aNummerNatuurlijkpersoon = getLong(3, 10, line);
        this.sofinummer = getLong(13, 9, line);
        this.voorletters = getString(22, 10, line);
        this.voorvoegsels = getString(32, 10, line);
        this.geslachtsBedrijfsNaam = getString(42, 135, line);
        this.partnerBedrijfsNaamVerkort = getString(177, 55, line);
        this.voorvoegselsPartnerNaam = getString(232, 10, line);
        this.aanvullingSofiNummer = getNumber(242, 10, line);
        this.aanduidingNaamgebruik = getString(252, 1, line);
    }
}