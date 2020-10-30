/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.edu.Proyect3DW2020.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.edu.Proyect3DW2020.modelo.estados;
import umg.edu.Proyect3DW2020.negocio.estadosRepository;

/**
 *
 * @author eli
 */
@Service
public class estadosServicios {
    
       @Autowired
    private estadosRepository repo;
   
   
     //Servicio para enlistar tienda
   public List<estados> enlistAll_estados() {
       return repo.findAll();
   }
   
   
      //servicio para buscar tienda por id
   public estados findById_buscarid(Integer id){
      return  repo.findById(id).get();
   }
    
   
     public String create(estados estados){ 
         try {
            repo.save(estados);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error insertando el estado.";
        }
         
}
     
                
               public String modify_estados(estados estados){ 
         try {
            repo.save(estados);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error modificar el estado.";
        }
         
}
               
       public String delete_estados(Integer id){
         try {
            repo.deleteById(id);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error eliminando el estado.";
        }
    }
    
}
