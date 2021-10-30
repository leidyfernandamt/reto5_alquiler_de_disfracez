
package com.Alquiler_de_disfraces.reto5_alquiler_de_disfraces.interfaces;

import com.Alquiler_de_disfraces.reto5_alquiler_de_disfraces.modelo.Reservacion;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author usuario
 */
public interface InterfaceReservacion  extends CrudRepository<Reservacion,Integer> {
    
     public List<Reservacion> findAllByStatus(String status);
    
    public List<Reservacion> findAllByStartDateAfterAndStartDateBefore(Date dateOne, Date dateTwo);
    
    // select clientId, count(*) as "total" from reservacion group by cliendId order by total desc;
    @Query ("SELECT c.client, COUNT(c.client) from Reservacion AS c group by c.client order by COUNT(c.client)DESC")
    public List<Object[]> countTotalReservationsByClient();
    
}
