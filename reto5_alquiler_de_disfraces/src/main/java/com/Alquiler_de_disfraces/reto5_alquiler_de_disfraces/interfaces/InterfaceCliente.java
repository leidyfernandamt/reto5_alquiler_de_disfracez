
package com.Alquiler_de_disfraces.reto5_alquiler_de_disfraces.interfaces;

import com.Alquiler_de_disfraces.reto5_alquiler_de_disfraces.modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author usuario
 */
public interface InterfaceCliente extends CrudRepository<Cliente,Integer> {
    
}
