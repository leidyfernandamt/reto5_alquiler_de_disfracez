
package com.Alquiler_de_disfraces.reto5_alquiler_de_disfraces.web;

import com.Alquiler_de_disfraces.reto5_alquiler_de_disfraces.modelo.Ortesis;
import com.Alquiler_de_disfraces.reto5_alquiler_de_disfraces.servicios.ServiciosOrtesis;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author usuario
 */
@RestController
@RequestMapping("/api/Ortopedic")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class WebOrtesis {
    
     @GetMapping("/holaMundo")
    public String saludad(){
    return "bienbenidos alquiler de disfraces";
    }

    
    @Autowired
    private ServiciosOrtesis servicio;
    @GetMapping("all")
    public List <Ortesis> getOrthesis(){
        return servicio.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Ortesis> getOrthesis(@PathVariable("id") int idOrthesis) {
        return servicio.getOrthesis(idOrthesis);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Ortesis save(@RequestBody Ortesis orthesis) {
        return servicio.save(orthesis);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Ortesis update(@RequestBody Ortesis ortesis) {
        return servicio.update(ortesis);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int ortesisId) {
        return servicio.deleteOrtesis(ortesisId);
    }

}
