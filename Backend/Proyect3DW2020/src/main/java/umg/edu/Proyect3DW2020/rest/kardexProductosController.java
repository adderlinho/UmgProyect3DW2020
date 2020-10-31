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

import umg.edu.Proyect3DW2020.modelo.kardexProductos;
import umg.edu.Proyect3DW2020.service.kardexProductosServicio;

/**
 *
 * @author devAS
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/kardex")
public class kardexProductosController {
    @Autowired
    private kardexProductosServicio servicio;

    @GetMapping
    public List <kardexProductos> listar(){
        return servicio.enlistAll_kardexProductos();
    }

    @GetMapping(value="/buscar/{id}")
    public kardexProductos buscarId(@PathVariable("id") final Integer id){
        return  servicio.findById_kardexProductos_buscarid(id);
    }

    //metodo para insertar detalleProductoFinal
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String  insertar(@RequestBody kardexProductos emp){
            return servicio.create(emp);
    
    }

    //metodo para modificar producto
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public String modificar(@RequestBody kardexProductos emp){

            return servicio.modify_kardexProductos(emp);
        
    }

    //metoo para eliminar producto
    @DeleteMapping(value="/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String eliminar(@PathVariable("id") Integer id){
            return servicio.delete_kardexProductos(id);
       
    }
}