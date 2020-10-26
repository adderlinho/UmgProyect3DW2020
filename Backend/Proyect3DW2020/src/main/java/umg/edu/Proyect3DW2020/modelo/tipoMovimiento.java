package umg.edu.Proyect3DW2020.modelo;

import java.util.Date;
import java.util.List;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="tipomovimiento")
public class tipoMovimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtipomov;
    private String tipomovimiento;

    @Override
    public String toString() {
        return "tipomovimiento{" +
                "idtipomov='" + idtipomov + '\'' +
                ", tipomovimiento='" + tipomovimiento + '\'' +
                '}';
    }
}
