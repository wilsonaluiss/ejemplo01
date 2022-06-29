
package ejemplo01.demo;
import javax.persistence.*;

@Entity
@Table(name ="personas" , schema = "proyecto")
/**
 *
 * @author lexlp
 */
public class Persona {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private int id;
    @Column
    private String nombre;
    @Column
    private String apellidos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
    
}
