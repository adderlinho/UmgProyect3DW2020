/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.edu.Proyect3DW2020.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.edu.Proyect3DW2020.modelo.ventaDetalle;
import umg.edu.Proyect3DW2020.negocio.ventaDetalleRepository;

/**
 *
 * @author eli
 */
@Service
public class ventaDetalleServicio {
    
       @Autowired
    private ventaDetalleRepository repo;
   
   
    
   public List<ventaDetalle> enlistAll_ventaDetalle() {
       return repo.findAll();
   }
   
   
      //servicio para buscar tienda por id
   public ventaDetalle findById_ventaDetalle_buscarid(Integer id){
      return  repo.findById(id).get();
   }
    
   
     public String create(ventaDetalle ventaDetalle){ 
         try {
            repo.save(ventaDetalle);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error insertando el detalle de la venta.";
        }
         
}
     
                
               public String modify_ventaDetalle(ventaDetalle ventaDetalle){ 
         try {
            repo.save(ventaDetalle);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error modificar el detalle de la venta.";
        }
         
}
               
       public String delete_ventaDetalle(Integer id){
         try {
            repo.deleteById(id);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error eliminando el detale de la venta.";
        }
    }
    
}

