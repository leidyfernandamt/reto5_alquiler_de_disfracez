
package com.Alquiler_de_disfraces.reto5_alquiler_de_disfraces.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "category")
public class Categoria  implements Serializable {
    
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="category")
    @JsonIgnoreProperties({"category","message"})
    private List<Ortesis> ortopedics;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Ortesis> getOrtopedics() {
        return ortopedics;
    }

    public void setOrtopedics(List<Ortesis> ortopedics) {
        this.ortopedics = ortopedics;
    }
    
    
    
}
