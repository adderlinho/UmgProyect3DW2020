package umg.edu.Proyect3DW2020.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="estadoventa")
public class estadoventa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idestado;
    private String descripcion;

    @Override
    public String toString() {
        return "estadoventa{" +
                "idEstado='" + idestado + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
