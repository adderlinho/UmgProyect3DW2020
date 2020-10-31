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

import umg.edu.Proyect3DW2020.modelo.tipoMovimiento;
import umg.edu.Proyect3DW2020.service.tipoMovimientoServicio;

/**
 *
 * @author devAS
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/tipoMovimiento")
public class tipoMovimientoController {
    @Autowired
    private tipoMovimientoServicio servicio;

    @GetMapping
    public List <tipoMovimiento> listar(){
        return servicio.enlistAll_tipoMovimiento();
    }

    @GetMapping(value="/buscar/{id}")
    public tipoMovimiento buscarId(@PathVariable("id") final Integer id){
        return  servicio.findById_tipoMovimiento_buscarid(id);
    }

    //metodo para insertar detalleProductoFinal
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String  insertar(@RequestBody tipoMovimiento emp){
      
            return servicio.create(emp);
        
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public String modificar(@RequestBody tipoMovimiento emp){
   
            return servicio.modify_tipoMovimiento(emp);
        
    }

    //metoo para eliminar producto
    @DeleteMapping(value="/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String eliminar(@PathVariable("id") Integer id){
        
            return servicio.delete_tipoMovimiento(id);
        
    }
}
