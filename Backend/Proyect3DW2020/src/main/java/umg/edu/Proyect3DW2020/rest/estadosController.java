package umg.edu.Proyect3DW2020.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import umg.edu.Proyect3DW2020.modelo.estados;
import umg.edu.Proyect3DW2020.service.estadosServicios;

/**
 *
 * @author devAS
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/estados")
public class estadosController {
    @Autowired
    private estadosServicios servicios;

    @GetMapping
    public List <estados> listar(){
        return servicios.enlistAll_estados();
    }

    @GetMapping(value="/buscar/{id}")
    public estados buscarId(@PathVariable("id") final Integer id){
        return  servicios.findById_buscarid(id);
    }
    
   
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String  insertar(@RequestBody estados emp){
            return servicios.create(emp);
        
    } 

    //metodo para modificar producto
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public String modificar(@RequestBody estados emp){
          return servicios.modify_estados(emp);
        
    }
    
   

    //metoo para eliminar producto
    @DeleteMapping(value="/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String eliminar(@PathVariable("id") Integer id){
            return servicios.delete_estados(id);
    }
    
}
