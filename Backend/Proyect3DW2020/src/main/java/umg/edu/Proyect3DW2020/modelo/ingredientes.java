package umg.edu.Proyect3DW2020.modelo;

import java.util.Date;
import java.util.List;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="ingredientes")
public class ingredientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idingrediente;
    private String nombre;
    private String descripcion;
    private int medida;
    private int estado;
    private int idtienda;

    @Override
    public String toString() {
        return "ingredientes{" +
                "idingrediente='" + idingrediente + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", medida='" + medida + '\'' +
                ", estado='" + estado + '\'' +
                ", idtienda='" + idtienda + '\'' +
                '}';
    }
}
