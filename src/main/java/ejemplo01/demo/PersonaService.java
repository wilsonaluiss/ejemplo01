/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01.demo;

import java.util.List;

/**
 *
 * @author lexlp
 */
public interface PersonaService {
    
    List<Persona>listar();
    Persona listarId(int id);
    Persona add(Persona p);
    Persona edit(Persona p);
    Persona delete(int id);
    
}
