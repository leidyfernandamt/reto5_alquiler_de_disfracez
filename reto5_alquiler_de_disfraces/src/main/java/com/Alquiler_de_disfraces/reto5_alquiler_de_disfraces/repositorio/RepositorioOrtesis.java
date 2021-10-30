
package com.Alquiler_de_disfraces.reto5_alquiler_de_disfraces.repositorio;

import com.Alquiler_de_disfraces.reto5_alquiler_de_disfraces.interfaces.InterfaceOrtesis;
import com.Alquiler_de_disfraces.reto5_alquiler_de_disfraces.modelo.Ortesis;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author usuario
 */
@Repository
public class RepositorioOrtesis {
    @Autowired
    private InterfaceOrtesis crud;
    

    public List<Ortesis> getAll(){
        return (List<Ortesis>) crud.findAll();       
    }
    
    public Optional <Ortesis> getOrthesis(int id){
        return crud.findById(id);
    }
    
    public Ortesis save(Ortesis ortesis){
        return crud.save(ortesis);
    }
      public void delete(Ortesis ortesis){
        crud.delete(ortesis);
    }
    
}
