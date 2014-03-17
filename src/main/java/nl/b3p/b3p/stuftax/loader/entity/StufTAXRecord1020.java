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
@Table(name = "stax_wozobject")
public class StufTAXRecord1020 extends StufTAXRecord implements Serializable {
    
    @Id
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
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
    
    public StufTAXRecord1020(LineNumberReader lineNumberReader, String line) {   
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