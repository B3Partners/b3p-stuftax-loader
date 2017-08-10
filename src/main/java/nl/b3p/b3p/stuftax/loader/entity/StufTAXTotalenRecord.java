package nl.b3p.b3p.stuftax.loader.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author boy
 */
@Entity
@Table(name = "stuftax_totalen")
public class StufTAXTotalenRecord extends StufTAXRecord implements Serializable {

    @Id
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    private Long id;
    @Column(name = "line_number")
    private Integer lineNumber;
    @Column(name = "aantal_10")
    private Integer aantal10;
    @Column(name = "aantal_20")
    private Integer aantal20;
    @Column(name = "aantal_21")
    private Integer aantal21;
    @Column(name = "aantal_22")
    private Integer aantal22;
    @Column(name = "aantal_23")
    private Integer aantal23;
    @Column(name = "aantal_24")
    private Integer aantal24;
    @Column(name = "aantal_30")
    private Integer aantal30;
    @Column(name = "aantal_31")
    private Integer aantal31;
    @Column(name = "aantal_35")
    private Integer aantal35;
    @Column(name = "aantal_40")
    private Integer aantal40;
    @Column(name = "aantal_41")
    private Integer aantal41;
    @Column(name = "aantal_51")
    private Integer aantal51;
    @Column(name = "aantal_52")
    private Integer aantal52;
    @Column(name = "aantal_53")
    private Integer aantal53;
    @Column(name = "aantal_54")
    private Integer aantal54;
    @Column(name = "aantal_60")
    private Integer aantal60;
    @Column(name = "aantal_80")
    private Integer aantal80;
    @Column(name = "aantal_90")
    private Integer aantal90;
    @Column(name = "aantal_91")
    private Integer aantal91;
    @Column(name = "aantal_92")
    private Integer aantal92;
    @Column(name = "aantal_25")
    private Integer aantal25;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name = "inleesdatum")
    private Date inleesDatum;

    public StufTAXTotalenRecord() {
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAantal10() {
        return aantal10;
    }

    public void setAantal10(Integer aantal10) {
        this.aantal10 = aantal10;
    }

    public Integer getAantal20() {
        return aantal20;
    }

    public void setAantal20(Integer aantal20) {
        this.aantal20 = aantal20;
    }

    public Integer getAantal21() {
        return aantal21;
    }

    public void setAantal21(Integer aantal21) {
        this.aantal21 = aantal21;
    }

    public Integer getAantal22() {
        return aantal22;
    }

    public void setAantal22(Integer aantal22) {
        this.aantal22 = aantal22;
    }

    public Integer getAantal23() {
        return aantal23;
    }

    public void setAantal23(Integer aantal23) {
        this.aantal23 = aantal23;
    }

    public Integer getAantal24() {
        return aantal24;
    }

    public void setAantal24(Integer aantal24) {
        this.aantal24 = aantal24;
    }

    public Integer getAantal30() {
        return aantal30;
    }

    public void setAantal30(Integer aantal30) {
        this.aantal30 = aantal30;
    }

    public Integer getAantal31() {
        return aantal31;
    }

    public void setAantal31(Integer aantal31) {
        this.aantal31 = aantal31;
    }

    public Integer getAantal35() {
        return aantal35;
    }

    public void setAantal35(Integer aantal35) {
        this.aantal35 = aantal35;
    }

    public Integer getAantal40() {
        return aantal40;
    }

    public void setAantal40(Integer aantal40) {
        this.aantal40 = aantal40;
    }

    public Integer getAantal41() {
        return aantal41;
    }

    public void setAantal41(Integer aantal41) {
        this.aantal41 = aantal41;
    }

    public Integer getAantal51() {
        return aantal51;
    }

    public void setAantal51(Integer aantal51) {
        this.aantal51 = aantal51;
    }

    public Integer getAantal52() {
        return aantal52;
    }

    public void setAantal52(Integer aantal52) {
        this.aantal52 = aantal52;
    }

    public Integer getAantal53() {
        return aantal53;
    }

    public void setAantal53(Integer aantal53) {
        this.aantal53 = aantal53;
    }

    public Integer getAantal54() {
        return aantal54;
    }

    public void setAantal54(Integer aantal54) {
        this.aantal54 = aantal54;
    }

    public Integer getAantal60() {
        return aantal60;
    }

    public void setAantal60(Integer aantal60) {
        this.aantal60 = aantal60;
    }

    public Integer getAantal80() {
        return aantal80;
    }

    public void setAantal80(Integer aantal80) {
        this.aantal80 = aantal80;
    }

    public Integer getAantal90() {
        return aantal90;
    }

    public void setAantal90(Integer aantal90) {
        this.aantal90 = aantal90;
    }

    public Integer getAantal91() {
        return aantal91;
    }

    public void setAantal91(Integer aantal91) {
        this.aantal91 = aantal91;
    }

    public Integer getAantal92() {
        return aantal92;
    }

    public void setAantal92(Integer aantal92) {
        this.aantal92 = aantal92;
    }

    public Integer getAantal25() {
        return aantal25;
    }

    public void setAantal25(Integer aantal25) {
        this.aantal25 = aantal25;
    }

    public Date getInleesDatum() {
        return inleesDatum;
    }

    public void setInleesDatum(Date inleesDatum) {
        this.inleesDatum = inleesDatum;
    }

    @Override
    public void fillValues(int linenumber, String line) {
        this.lineNumber = linenumber;

        this.aantal10 = getNumber(3, 9, line);
        this.aantal20 = getNumber(12, 9, line);
        this.aantal21 = getNumber(21, 9, line);
        this.aantal22 = getNumber(30, 9, line);
        this.aantal23 = getNumber(39, 9, line);
        this.aantal24 = getNumber(48, 9, line);
        this.aantal30 = getNumber(57, 9, line);
        this.aantal31 = getNumber(66, 9, line);
        this.aantal35 = getNumber(75, 9, line);
        this.aantal40 = getNumber(84, 9, line);
        this.aantal41 = getNumber(93, 9, line);
        this.aantal51 = getNumber(102, 9, line);
        this.aantal52 = getNumber(111, 9, line);
        this.aantal53 = getNumber(120, 9, line);
        this.aantal54 = getNumber(129, 9, line);
        this.aantal60 = getNumber(138, 9, line);
        this.aantal80 = getNumber(147, 9, line);
        this.aantal90 = getNumber(165, 9, line);
        this.aantal91 = getNumber(174, 9, line);
        this.aantal92 = getNumber(183, 9, line);
        this.aantal25 = getNumber(210, 9, line);
        
        this.inleesDatum = new Date();
    }
}