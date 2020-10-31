/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.edu.Proyect3DW2020.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.edu.Proyect3DW2020.modelo.tipoMovimiento;
import umg.edu.Proyect3DW2020.negocio.tipoMovimientoRepository;

/**
 *
 * @author eli
 */
@Service
public class tipoMovimientoServicio {


       @Autowired
    private tipoMovimientoRepository repo;
   
   

   public List<tipoMovimiento> enlistAll_tipoMovimiento() {
       return repo.findAll();
   }
   
   

   public tipoMovimiento findById_tipoMovimiento_buscarid(Integer id){
      return  repo.findById(id).get();
   }
    
   
     public String create(tipoMovimiento tipoMovimiento){ 
         try {
            repo.save(tipoMovimiento);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error insertando el tipo de movimiento.";
        }
         
}
     
                
               public String modify_tipoMovimiento(tipoMovimiento tipoMovimiento){ 
         try {
            repo.save(tipoMovimiento);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error modificar el tipo de movimiento.";
        }
         
}
               
       public String delete_tipoMovimiento(Integer id){
         try {
            repo.deleteById(id);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error eliminando el tipo de movimiento.";
        }
    }
    
}
