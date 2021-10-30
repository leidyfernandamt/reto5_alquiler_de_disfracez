
package com.Alquiler_de_disfraces.reto5_alquiler_de_disfraces.reportes;

import com.Alquiler_de_disfraces.reto5_alquiler_de_disfraces.modelo.Cliente;

/**
 *
 * @author usuario
 */
public class ContadorClientes {
    
    private Long total;
    private Cliente client;

    public ContadorClientes(Long total, Cliente client) {
        this.total = total;
        this.client = client;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }
    
    
    
    
    
    
    
}
