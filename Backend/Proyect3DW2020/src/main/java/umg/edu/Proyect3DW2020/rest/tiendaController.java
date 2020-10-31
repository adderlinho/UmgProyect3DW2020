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

import umg.edu.Proyect3DW2020.modelo.tienda;
import umg.edu.Proyect3DW2020.service.tiendaServicio;


/**
 *
 * @author devAS
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/tiendas")
public class tiendaController {

    @Autowired
    private tiendaServicio tiendaServicio;

    
    @GetMapping
    public List <tienda> listar(){
        return tiendaServicio.enlistAll_tienda();
    }

 @GetMapping(value="/buscar/{id}")
    public tienda buscarId(@PathVariable("id") final Integer id){
        return  tiendaServicio.findById_buscarid(id);

  }
    //mentodo que devuelve el nombre de una tienda
     @GetMapping(value="/buscartienda/{id}")
    public String buscartienda(@PathVariable("id") final Integer id){
        return  tiendaServicio.findById_NombresTiendas(id);

  }
    //metodo para insertar detalleProductoFinal
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String  insertar(@RequestBody tienda emp){
        return tiendaServicio.create(emp);
    }


    //modifica una tienda
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public String modificar(@RequestBody tienda emp){             
        return tiendaServicio.modify_tienda(emp);
        
    }


    @DeleteMapping(value="/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String eliminar(@PathVariable("id") Integer id){
            return tiendaServicio.delete_tienda(id);  
    }
}
