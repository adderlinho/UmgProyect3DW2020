/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.edu.Proyect3DW2020.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.edu.Proyect3DW2020.modelo.venta;
import umg.edu.Proyect3DW2020.negocio.ventaRepository;

/**
 *
 * @author eli
 */
@Service
public class ventaServicio {
    

       @Autowired
    private ventaRepository repo;
   
   
     //Servicio para enlistar tienda
   public List<venta> enlistAll_venta() {
       return repo.findAll();
   }
   
   
      //servicio para buscar tienda por id
   public venta findById_venta_buscarid(Integer id){
      return  repo.findById(id).get();
   }
    
   
     public String create(venta venta){ 
         try {
            repo.save(venta);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error insertando el estado.";
        }
         
}
     
                
               public String modify_venta(venta venta){ 
         try {
            repo.save(venta);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error modificar el estado.";
        }
         
}
               
       public String delete_venta(Integer id){
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
