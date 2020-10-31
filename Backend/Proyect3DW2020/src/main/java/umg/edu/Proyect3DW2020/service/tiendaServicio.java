/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.edu.Proyect3DW2020.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.edu.Proyect3DW2020.modelo.tienda;
import umg.edu.Proyect3DW2020.negocio.tiendaRepository;

/**
 *
 * @author eli
 */
@Service
public class tiendaServicio {
    
   @Autowired
    private tiendaRepository repo;
   
   //servicio para crear la tienda
   public String create(tienda tienda){
       if (tienda.getNombretienda()== null || tienda.getNombretienda().isEmpty()) {
           throw new RuntimeException();
       }
 
         try {
            repo.save(tienda);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error insertando el la tienda.";
        }
         
}
   
      //servicio para crear la tienda
   public String modify_tienda(tienda tienda){
       if (tienda.getNombretienda()== null || tienda.getNombretienda().isEmpty()) {
           throw new RuntimeException();
       }
 
         try {
            repo.save(tienda);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error modificando la tienda.";
        }
         
}
   //Servicio para enlistar tienda
   public List<tienda> enlistAll_tienda() {
       return repo.findAll();
   }
   
   
   //servicio para buscar tienda por id
   public tienda findById_buscarid(Integer id){
      return  repo.findById(id).get();
   }
   
   //devuelve unicamente el nombre de una tienda por ID
    public String findById_NombresTiendas(Integer id){
      return  repo.findById(id).get().getNombretienda();
   }

    
    //servicio para eliminar tienda
    public String delete_tienda(Integer id){
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
