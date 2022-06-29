
package ejemplo01.demo;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author lexlp
 */
public interface PersonaRepositorio extends Repository<Persona, Integer> {
    List<Persona>findAll();
    Persona findById(int id);
    Persona save(Persona p);
    void delete(Persona p);
}
