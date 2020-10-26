package umg.edu.Proyect3DW2020.modelo;

import java.util.Date;
import java.util.List;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="detalleproductofinal")
public class detalleProductoFinal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iddetalleproductofinal;
    private int idingrediente;
    private double cantidad;
    private int estado;
    private int idproductofinal;

    @Override
    public String toString() {
        return "detalleproductofinal{" +
                "iddetalleproductofinal='" + iddetalleproductofinal + '\'' +
                ", idingrediente='" + idingrediente + '\'' +
                ", cantidad='" + cantidad + '\'' +
                ", estado='" + estado + '\'' +
                ", idproductofinal='" + idproductofinal + '\'' +
                '}';
    }
}
