/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.edu.Proyect3DW2020.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.edu.Proyect3DW2020.modelo.productosFinal;
import umg.edu.Proyect3DW2020.negocio.estadosRepository;
import umg.edu.Proyect3DW2020.negocio.productosFinalRepository;

/**
 *
 * @author eli
 */
@Service
public class productosFinalServicio {
    

       @Autowired
    private productosFinalRepository repo;
   
   
 
   public List<productosFinal> enlistAll_productosFinal() {
       return repo.findAll();
   }
   
   
   
   public productosFinal findById_productosFinal_buscarid(Integer id){
      return  repo.findById(id).get();
   }
    
   
     public String create(productosFinal productosFinal){ 
         try {
            repo.save(productosFinal);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error insertando el producto final.";
        }
         
}
     
                
               public String modify_productosFinal(productosFinal productosFinal){ 
         try {
            repo.save(productosFinal);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error modificar el producto final.";
        }
         
}
               
       public String delete_productosFinal(Integer id){
         try {
            repo.deleteById(id);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error eliminando el producto.";
        }
    }
    
}
