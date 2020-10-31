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

import umg.edu.Proyect3DW2020.modelo.ventaDetalle;
import umg.edu.Proyect3DW2020.negocio.ventaDetalleRepository;
import umg.edu.Proyect3DW2020.service.ventaDetalleServicio;

/**
 *
 * @author devAS
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/ventadetalle")
public class ventaDetalleController {
    @Autowired
    private ventaDetalleServicio servicio;

    @GetMapping
    public List <ventaDetalle> listar(){
        return servicio.enlistAll_ventaDetalle();
    }

    @GetMapping(value="/buscar/{id}")
    public ventaDetalle buscarId(@PathVariable("id") final Integer id){
        return  servicio.findById_ventaDetalle_buscarid(id);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String  insertar(@RequestBody ventaDetalle emp){
            return servicio.create(emp);
        
    }


    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public String modificar(@RequestBody ventaDetalle emp){
            return servicio.modify_ventaDetalle(emp);
        
    }


    @DeleteMapping(value="/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String eliminar(@PathVariable("id") Integer id){
            return servicio.delete_ventaDetalle(id);
        
    }
}
