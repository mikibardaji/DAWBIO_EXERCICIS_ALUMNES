/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 *
 * @author abrah
 */
public class MostraDAO {
    
    private Map<String, MostraGenetica> muestra; 

    public MostraDAO() {
      muestra = new HashMap<>();
     
    }
     
  public boolean registrarMostra(MostraGenetica m){
    
      if(!muestra.containsKey(m.getIdMostra())){
      
      muestra.put(m.getIdMostra(), m);
      return true;
      } else {
       return false;
      }
  }
  
  public MostraGenetica buscarPerId(String id){
     
      return muestra.get(id);
}
  
  public List <MostraGenetica> obtenerTodas(){
   return new ArrayList<> (muestra.values());
      
  }
  
  public boolean EliminarMostra (String id ){
     if(muestra.containsKey(id)){
        muestra.remove(id);
        return true;
     }
     else {
       return false; 
     }
  }
  
  public double calcularMitjanaLongitud(){
       if (muestra.isEmpty()) return 0;
    
    double suma = 0;
    for (MostraGenetica m : muestra.values()) {
        suma += m.getLongitudCadena();
    }
    return suma / muestra.size();
  }
    // Getters y Setters...
    public Map<String, Integer> numeroMostresOrganisme() {
    Map<String, Integer> resum = new HashMap<>();
    
    for (MostraGenetica m : muestra.values()) {
        String org = m.getOrganismo();
        if (resum.containsKey(org)) {
            resum.put(org, resum.get(org) + 1);
        } else {
            resum.put(org, 1);
        }
    }
    return resum;
}

}
