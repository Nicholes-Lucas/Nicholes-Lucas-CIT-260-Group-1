
package cityofaaron.model;
import java.io.Serializable;
/**
 *
 * @author kristinaplauche
 */
public class Location implements Serializable {
    private String description;
    private String symbol;

    public Location() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }    
    
}
