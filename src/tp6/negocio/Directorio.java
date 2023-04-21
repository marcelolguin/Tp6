
package tp6.negocio;

import java.util.HashMap;


public class Directorio {
    private HashMap<String,Cliente> registro=new HashMap<String,Cliente>();
    
    
//AgregarCliente() que permite registrar un nuevo cliente con su respectivo nro de 
//teléfono. Siendo el nro del teléfono la clave del mismo.
    
    public boolean agregarCliente (String telefono, Cliente c){
        boolean agregado = false;
        if (!registro.containsKey(telefono)) {
            registro.put(telefono, c); 
            agregado = true;
        }
        return agregado;
    }
}
