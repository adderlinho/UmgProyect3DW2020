/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.edu.Proyect3DW2020.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.edu.Proyect3DW2020.modelo.usuarios;
import umg.edu.Proyect3DW2020.negocio.usuariosRepository;

/**
 *
 * @author eli
 */
@Service
public class usuariosServicio {
    

       @Autowired
    private usuariosRepository repo;
   
   
     //Servicio para enlistar tienda
   public List<usuarios> enlistAll_usuarios() {
       return repo.findAll();
   }
   
   
      //servicio para buscar tienda por id
   public usuarios findById_usuarios_buscarid(Integer id){
      return  repo.findById(id).get();
   }
    
   
     public String create(usuarios usuarios){ 
         try {
            repo.save(usuarios);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error insertando el usuario.";
        }
         
}
     
                
               public String modify_usuarios(usuarios usuarios){ 
         try {
            repo.save(usuarios);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error modificar el usuario.";
        }
         
}
               
       public String delete_usuarios(Integer id){
         try {
            repo.deleteById(id);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error eliminando el usuario.";
        }
    }
    
}

