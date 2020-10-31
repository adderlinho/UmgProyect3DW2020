/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.edu.Proyect3DW2020.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.edu.Proyect3DW2020.modelo.kardexProductos;
import umg.edu.Proyect3DW2020.negocio.kardexProductosRepository;

/**
 *
 * @author eli
 */
@Service
public class kardexProductosServicio {
    
 @Autowired
    private kardexProductosRepository repo;
   
   

   public List<kardexProductos> enlistAll_kardexProductos() {
       return repo.findAll();
   }
   
   
   
   public kardexProductos findById_kardexProductos_buscarid(Integer id){
      return  repo.findById(id).get();
   }
    
   
     public String create(kardexProductos kardexProductos){ 
         try {
            repo.save(kardexProductos);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error insertando el producto.";
        }
         
}
     
                
               public String modify_kardexProductos(kardexProductos kardexProductos){ 
         try {
            repo.save(kardexProductos);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error modificar el producto.";
        }
         
}
               
       public String delete_kardexProductos(Integer id){
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

