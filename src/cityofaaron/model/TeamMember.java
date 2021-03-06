
package cityofaaron.model;
import java.io.Serializable;

/**
 *
 * @author kristinaplauche
 */
public enum TeamMember {
    
    Lucas("Lucas Nicholes", "The Magnificent"),
    Susan("Susan Peay", "The Patient"),
    Kristina("Kristina Plauche", "The Intelligent");     
    
    private String name;
    private String title;

    TeamMember(String name, String title){
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }


    
}
