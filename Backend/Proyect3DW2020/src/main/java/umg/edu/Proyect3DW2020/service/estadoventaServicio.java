/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.edu.Proyect3DW2020.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import umg.edu.Proyect3DW2020.modelo.estadoventa;
import umg.edu.Proyect3DW2020.negocio.estadoventaRepository;

/**
 *
 * @author eli
 */
public class estadoventaServicio {
    
     @Autowired
    private estadoventaRepository repo;
   
   
     //Servicio para enlistar tienda
   public List<estadoventa> enlistAll_estadoventa() {
       return repo.findAll();
   }
   
   
      //servicio para buscar tienda por id
   public estadoventa findById_estadoventa_buscarid(Integer id){
      return  repo.findById(id).get();
   }
    
   
     public String create(estadoventa estadoventa){ 
         try {
            repo.save(estadoventa);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error insertando el estado de venta.";
        }
         
}
     
                
               public String modify_estadoventa(estadoventa estadoventa){ 
         try {
            repo.save(estadoventa);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error modificar el estado de venta.";
        }
         
}
               
       public String delete_estadoventa(Integer id){
         try {
            repo.deleteById(id);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error eliminando el estado de venta.";
        }
    }
    
    
}
