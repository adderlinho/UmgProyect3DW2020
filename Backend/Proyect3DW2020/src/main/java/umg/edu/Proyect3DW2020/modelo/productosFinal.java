package umg.edu.Proyect3DW2020.modelo;

import java.util.Date;
import java.util.List;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="productosfinal")
public class productosFinal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idproductofinal;
    private String nombre;
    private String descripcion;
    private int estado;
    private double precio;
    private int estado_estados;
    private int idtienda;

    @Override
    public String toString() {
        return "productosfinal{" +
                "idproductofinal='" + idproductofinal + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estado='" + estado + '\'' +
                ", precio='" + precio + '\'' +
                ", estado_estados='" + estado_estados + '\'' +
                ", idtienda='" + idtienda + '\'' +
                '}';
    }
}
