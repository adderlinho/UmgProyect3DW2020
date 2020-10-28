package umg.edu.Proyect3DW2020.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="medidas")
public class medidas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int medida;
    private String medidadescripcion;

    @Override
    public String toString() {
        return "medidas{" +
                "medida='" + medida + '\'' +
                ", medidadescripcion='" + medidadescripcion + '\'' +
                '}';
    }
}
