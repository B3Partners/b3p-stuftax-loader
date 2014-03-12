package nl.b3p.b3p.stuftax.loader.entity;

import java.io.LineNumberReader;
import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author boy
 */
@Entity
@Table(name = "stuftax_23")
public class StufTAXRecord1023 extends StufTAXRecord implements Serializable {
    
    @Id
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    private Long id;
    
    @Column(name="line_number")
    private Integer lineNumber;

    public StufTAXRecord1023() {
    }
    
    public StufTAXRecord1023(LineNumberReader lineNumberReader, String line) {   
        this.lineNumber = lineNumberReader.getLineNumber();
    }
}