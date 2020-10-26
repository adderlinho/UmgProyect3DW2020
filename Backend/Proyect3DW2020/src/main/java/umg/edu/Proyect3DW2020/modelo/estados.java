package umg.edu.Proyect3DW2020.modelo;

import java.util.Date;
import java.util.List;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="estados")
public class estados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int estado;
    private String descripcion;

    @Override
    public String toString() {
        return "estados{" +
                "estado='" + estado + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
