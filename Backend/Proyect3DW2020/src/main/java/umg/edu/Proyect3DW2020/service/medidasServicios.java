/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.edu.Proyect3DW2020.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.edu.Proyect3DW2020.modelo.medidas;
import umg.edu.Proyect3DW2020.negocio.medidasRepository;

/**
 *
 * @author eli
 */
@Service 
public class medidasServicios {
    
      @Autowired
    private medidasRepository repo;
   
   
     //Servicio para enlistar tienda
   public List<medidas> enlistAll_medidas() {
       return repo.findAll();
   }
   
   
     
   public medidas findById_medidas_buscarid(Integer id){
      return  repo.findById(id).get();
   }
    
   
     public String create(medidas medidas){ 
         try {
            repo.save(medidas);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error insertando la medida.";
        }
         
}
     
                
               public String modify_medidas(medidas medidas){ 
         try {
            repo.save(medidas);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error modificar la medida.";
        }
         
}
               
       public String delete_medidas(Integer id){
         try {
            repo.deleteById(id);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error eliminando la medida.";
        }
    }
    
}

