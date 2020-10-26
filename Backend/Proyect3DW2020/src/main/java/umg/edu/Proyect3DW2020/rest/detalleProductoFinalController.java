package umg.edu.Proyect3DW2020.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import umg.edu.Proyect3DW2020.modelo.detalleProductoFinal;
import umg.edu.Proyect3DW2020.negocio.detalleProductoFinalRepository;

/**
 *
 * @author devAS
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/detalle_producto")
public class detalleProductoFinalController {
    @Autowired
    private detalleProductoFinalRepository repo;

    @GetMapping
    public List <detalleProductoFinal> listar(){
        return repo.findAll();
    }

    @GetMapping(value="/buscar/{id}")
    public detalleProductoFinal buscarId(@PathVariable("id") final Integer id){
        return  repo.findById(id).get();
    }

    //metodo para insertar detalleProductoFinal
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String  insertar(@RequestBody detalleProductoFinal emp){
        try {
            repo.save(emp);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error insertando el detalleProductoFinal.";
        }
    }

    //metodo para modificar producto
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public String modificar(@RequestBody detalleProductoFinal emp){
        try {
            repo.save(emp);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error modificando el detalleProductoFinal.";
        }
    }

    //metoo para eliminar producto
    @DeleteMapping(value="/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String eliminar(@PathVariable("id") Integer id){
        try {
            repo.deleteById(id);
            return "OK";
        }
        catch (Exception ex)
        {
            return "Hubo un error eliminando el detalleProductoFinal.";
        }
    }
}
