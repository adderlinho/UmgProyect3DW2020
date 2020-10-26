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

import umg.edu.Proyect3DW2020.modelo.venta;
import umg.edu.Proyect3DW2020.negocio.ventaRepository;

/**
 *
 * @author devAS
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/venta")
public class ventaController {
    @Autowired
    private ventaRepository repo;

    @GetMapping
    public List <venta> listar(){
        return repo.findAll();
    }

    @GetMapping(value="/buscar/{id}")
    public venta buscarId(@PathVariable("id") final Integer id){
        return  repo.findById(id).get();
    }

    //metodo para insertar detalleProductoFinal
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String  insertar(@RequestBody venta emp){
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
    public String modificar(@RequestBody venta emp){
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
