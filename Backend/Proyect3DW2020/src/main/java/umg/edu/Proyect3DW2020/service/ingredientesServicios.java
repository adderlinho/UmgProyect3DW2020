/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.edu.Proyect3DW2020.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.edu.Proyect3DW2020.modelo.ingredientes;
import umg.edu.Proyect3DW2020.negocio.ingredientesRepository;

/**
 *
 * @author eli
 */
@Service
public class ingredientesServicios {
    

       @Autowired
    private ingredientesRepository repo;
   
   
    
   public List<ingredientes> enlistAll_ingredientes() {
       return repo.findAll();
   }
   
   
      //servicio para buscar tienda por id
   public ingredientes findById_buscarid(Integer id){
      return  repo.findById(id).get();
   }
    
   
     public String create(ingredientes ingredientes){ 
         try {
            repo.save(ingredientes);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error insertando el ingrediente.";
        }
         
}
     
                
               public String modify_ingredientes(ingredientes ingredientes){ 
         try {
            repo.save(ingredientes);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error modificar el ingrediente.";
        }
         
}
               
       public String delete_ingredientes(Integer id){
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