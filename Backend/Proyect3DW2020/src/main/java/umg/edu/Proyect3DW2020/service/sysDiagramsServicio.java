/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.edu.Proyect3DW2020.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.edu.Proyect3DW2020.modelo.sysDiagrams;
import umg.edu.Proyect3DW2020.negocio.estadosRepository;
import umg.edu.Proyect3DW2020.negocio.sysDiagramsRepository;

/**
 *
 * @author eli
 */
@Service
public class sysDiagramsServicio {
   
       @Autowired
    private sysDiagramsRepository repo;
   
   
     //Servicio para enlistar tienda
   public List<sysDiagrams> enlistAll_sysDiagrams() {
       return repo.findAll();
   }
   
   
      //servicio para buscar tienda por id
   public sysDiagrams findById_sysDiagrams_buscarid(Integer id){
      return  repo.findById(id).get();
   }
    
   
     public String create(sysDiagrams sysDiagrams){ 
         try {
            repo.save(sysDiagrams);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error insertando el sysDiagrams.";
        }
         
}
     
                
               public String modify_sysDiagrams(sysDiagrams sysDiagrams){ 
         try {
            repo.save(sysDiagrams);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error modificar el sysDiagrams.";
        }
         
}
               
       public String delete_sysDiagrams(Integer id){
         try {
            repo.deleteById(id);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error eliminando el sysDiagrams.";
        }
    }
    
}
