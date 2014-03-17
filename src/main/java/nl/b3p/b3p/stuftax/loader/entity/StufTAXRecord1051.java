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
@Table(name = "stax_kadaster_object")
public class StufTAXRecord1051 extends StufTAXRecord implements Serializable {
    
    @Id
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    private Long id;
    
    @Column(name="line_number")
    private Integer lineNumber;
    
    @Column(name="kad_gemeente_code")
    private String kadasterGemeenteCode;
    
    @Column(name="sectie")
    private String sectie;
    
    @Column(name="perceelnummer")
    private Integer perceelnummer;
    
    @Column(name="perceel_indexletter")
    private String perceelIndexLetter;
    
    @Column(name="perceel_indexnummer")
    private Integer perceelIndexNummer;
    
    @Column(name="kadaster_oppervlakte")
    private Integer kadastraleOppervlakte;
    
    @Column(name="bebouwingcode")
    private Integer bebouwingsCode;
    
    @Column(name="kaartblad_nummer")
    private Integer kaartbladNummer;
    
    @Column(name="kaartblad_volgnummer")
    private Integer kaartbladVolgnummer;
    
    @Column(name="ruitletter")
    private String ruitLetter;
    
    @Column(name="ruitnummer")
    private Integer ruitNummer;
    
    @Column(name="x_coord")
    private Integer xCoord;
    
    @Column(name="y_coord")
    private Integer yCoord;
    
    @Column(name="registercode")
    private String registerCode;
    
    @Column(name="stuknummer")
    private String stuknummer;
    
    @Column(name="mutatiecode")
    private String mutatiecode;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="ingangsdatum")
    private Date ingangsDatum;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="einddatum")
    private Date eindDatum;    

    public StufTAXRecord1051() {
    }
    
    public StufTAXRecord1051(LineNumberReader lineNumberReader, String line) {   
        this.lineNumber = lineNumberReader.getLineNumber();
        
        this.kadasterGemeenteCode = getString(3, 5, line);
        this.sectie = getString(8, 2, line);
        this.perceelnummer = getNumber(10, 5, line);
        this.perceelIndexLetter = getString(15, 1, line);
        this.perceelIndexNummer = getNumber(16, 4, line);
        this.kadastraleOppervlakte = getNumber(20, 8, line);
        this.bebouwingsCode = getNumber(28, 1, line);
        this.kaartbladNummer = getNumber(29, 3, line);
        this.kaartbladVolgnummer = getNumber(32, 1, line);
        this.ruitLetter = getString(33, 1, line);
        this.ruitNummer = getNumber(34, 2, line);
        
        /* TODO decimals ? */
        this.xCoord = getNumber(36, 6, line);
        this.yCoord = getNumber(42, 6, line);
        
        this.registerCode = getString(48, 3, line);
        this.stuknummer = getString(51, 5, line);
        this.mutatiecode = getString(56, 1, line);
        this.ingangsDatum = getDate(57, 8, line);
        this.eindDatum = getDate(65, 8, line);
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

    public String getKadasterGemeenteCode() {
        return kadasterGemeenteCode;
    }

    public void setKadasterGemeenteCode(String kadasterGemeenteCode) {
        this.kadasterGemeenteCode = kadasterGemeenteCode;
    }

    public String getSectie() {
        return sectie;
    }

    public void setSectie(String sectie) {
        this.sectie = sectie;
    }

    public Integer getPerceelnummer() {
        return perceelnummer;
    }

    public void setPerceelnummer(Integer perceelnummer) {
        this.perceelnummer = perceelnummer;
    }

    public String getPerceelIndexLetter() {
        return perceelIndexLetter;
    }

    public void setPerceelIndexLetter(String perceelIndexLetter) {
        this.perceelIndexLetter = perceelIndexLetter;
    }

    public Integer getPerceelIndexNummer() {
        return perceelIndexNummer;
    }

    public void setPerceelIndexNummer(Integer perceelIndexNummer) {
        this.perceelIndexNummer = perceelIndexNummer;
    }

    public Integer getKadastraleOppervlakte() {
        return kadastraleOppervlakte;
    }

    public void setKadastraleOppervlakte(Integer kadastraleOppervlakte) {
        this.kadastraleOppervlakte = kadastraleOppervlakte;
    }

    public Integer getBebouwingsCode() {
        return bebouwingsCode;
    }

    public void setBebouwingsCode(Integer bebouwingsCode) {
        this.bebouwingsCode = bebouwingsCode;
    }

    public Integer getKaartbladNummer() {
        return kaartbladNummer;
    }

    public void setKaartbladNummer(Integer kaartbladNummer) {
        this.kaartbladNummer = kaartbladNummer;
    }

    public Integer getKaartbladVolgnummer() {
        return kaartbladVolgnummer;
    }

    public void setKaartbladVolgnummer(Integer kaartbladVolgnummer) {
        this.kaartbladVolgnummer = kaartbladVolgnummer;
    }

    public String getRuitLetter() {
        return ruitLetter;
    }

    public void setRuitLetter(String ruitLetter) {
        this.ruitLetter = ruitLetter;
    }

    public Integer getRuitNummer() {
        return ruitNummer;
    }

    public void setRuitNummer(Integer ruitNummer) {
        this.ruitNummer = ruitNummer;
    }

    public Integer getxCoord() {
        return xCoord;
    }

    public void setxCoord(Integer xCoord) {
        this.xCoord = xCoord;
    }

    public Integer getyCoord() {
        return yCoord;
    }

    public void setyCoord(Integer yCoord) {
        this.yCoord = yCoord;
    }

    public String getRegisterCode() {
        return registerCode;
    }

    public void setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
    }

    public String getStuknummer() {
        return stuknummer;
    }

    public void setStuknummer(String stuknummer) {
        this.stuknummer = stuknummer;
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
}