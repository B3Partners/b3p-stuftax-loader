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
@Table(name = "stax_eigenaar_gebruiker")
public class StufTAXRecord1060 extends StufTAXRecord implements Serializable {
    
    @Id
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    private Long id;
    
    @Column(name="line_number")
    private Integer lineNumber;
    
    @Column(name="woz_objectnummer")
    private Long wozObjectNummer;
    
    @Column(name="anummer_nat_persoon")
    private Long aNummerNatuurlijkpersoon;
    
    @Column(name="sofinummer")
    private Integer sofinummer;
    
    @Column(name="aand_eigenaar_gebruiker")
    private String aanduidingEigenaarGebruiker;
    
    @Column(name="zakelijk_recht_code")
    private String zakelijkRechtCode;
    
    @Column(name="cs_code")
    private String csCode;
    
    @Column(name="mutatiecode")
    private String mutatiecode;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="ingangsdatum")
    private Date ingangsDatum;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="einddatum")
    private Date eindDatum;
    
    @Column(name="aanvulling_sofinummer")
    private Integer aanvullingSofinummer;
    
    @Column(name="subjectnummer_akr")
    private Long subjectNummerAKR;

    public StufTAXRecord1060() {
    }
    
    public StufTAXRecord1060(LineNumberReader lineNumberReader, String line) {   
        this.lineNumber = lineNumberReader.getLineNumber();
        
        this.wozObjectNummer = getLong(3, 12, line);
        this.aNummerNatuurlijkpersoon = getLong(15, 10, line);
        this.sofinummer = getNumber(25, 9, line);
        this.aanduidingEigenaarGebruiker = getString(34, 1, line);
        this.zakelijkRechtCode = getString(35, 6, line);
        this.csCode = getString(41, 2, line);
        this.mutatiecode = getString(43, 1, line);
        this.ingangsDatum = getDate(44, 8, line);
        this.eindDatum = getDate(52, 8, line);
        this.aanvullingSofinummer = getNumber(60, 10, line);
        this.subjectNummerAKR = getLong(70, 10, line);
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

    public Long getaNummerNatuurlijkpersoon() {
        return aNummerNatuurlijkpersoon;
    }

    public void setaNummerNatuurlijkpersoon(Long aNummerNatuurlijkpersoon) {
        this.aNummerNatuurlijkpersoon = aNummerNatuurlijkpersoon;
    }

    public Integer getSofinummer() {
        return sofinummer;
    }

    public void setSofinummer(Integer sofinummer) {
        this.sofinummer = sofinummer;
    }

    public String getAanduidingEigenaarGebruiker() {
        return aanduidingEigenaarGebruiker;
    }

    public void setAanduidingEigenaarGebruiker(String aanduidingEigenaarGebruiker) {
        this.aanduidingEigenaarGebruiker = aanduidingEigenaarGebruiker;
    }

    public String getZakelijkRechtCode() {
        return zakelijkRechtCode;
    }

    public void setZakelijkRechtCode(String zakelijkRechtCode) {
        this.zakelijkRechtCode = zakelijkRechtCode;
    }

    public String getCsCode() {
        return csCode;
    }

    public void setCsCode(String csCode) {
        this.csCode = csCode;
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

    public Integer getAanvullingSofinummer() {
        return aanvullingSofinummer;
    }

    public void setAanvullingSofinummer(Integer aanvullingSofinummer) {
        this.aanvullingSofinummer = aanvullingSofinummer;
    }

    public Long getSubjectNummerAKR() {
        return subjectNummerAKR;
    }

    public void setSubjectNummerAKR(Long subjectNummerAKR) {
        this.subjectNummerAKR = subjectNummerAKR;
    }
}