
package bancobrasil;

import java.util.ArrayList;

public class GerenteRepository {
    public ArrayList<Gerente> gerente = new ArrayList<>();
    
        public ArrayList<Gerente> addGerente(){
            gerente.add(new Gerente("davis", "12345", "Davi", "Saldanha", ""));
            gerente.add(new Gerente("teste", "teste", "", "", ""));
            
            return gerente;           
        }
    
}
