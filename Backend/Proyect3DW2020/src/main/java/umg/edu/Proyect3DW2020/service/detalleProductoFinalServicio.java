/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.edu.Proyect3DW2020.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.edu.Proyect3DW2020.modelo.detalleProductoFinal;
import umg.edu.Proyect3DW2020.negocio.detalleProductoFinalRepository;

/**
 *
 * @author eli
 */
@Service
public class detalleProductoFinalServicio {
    
    @Autowired
    private detalleProductoFinalRepository repo;
    
      //Servicio para enlistar tienda
   public List<detalleProductoFinal> enlistAll_detalleProductoFinal() {
       return repo.findAll();
   }
   
   
   
   //buscar por ID
   public detalleProductoFinal findById_detalleProductoFinal(Integer id){
      return  repo.findById(id).get();
   }
   
   //Insertar uno nuevo
   
      //servicio para crear la tienda
   public String create(detalleProductoFinal detalleProductoFinal){
      try {
            repo.save(detalleProductoFinal);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error insertando el detalle del producto.";
        }
         
}
   
   
   
         //servicio para crear la tienda
   public String modify_detalleProductoFinal(detalleProductoFinal detalleProductoFinal){
         try {
            repo.save(detalleProductoFinal);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error modificando el detalle del producto.";
        }
         
         
         
         
         
}
 
   
   public String delete_detalleProductoFinal(Integer id){
         try {
            repo.deleteById(id);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error eliminando la tienda.";
        }
    }
   
   
   
    
}
