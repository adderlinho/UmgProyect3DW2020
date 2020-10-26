package umg.edu.Proyect3DW2020.modelo;

import java.util.Date;
import java.util.List;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="kardexproductos")
public class kardexProductos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idmovimiento;
    private int idtipomov;
    private int idingrediente;
    private double ingreso;
    private double egreso;
    private double saldo;
    private String documento;
    private Date fechadocumento;
    private Date fechavence;

    @Override
    public String toString() {
        return "kardexproductos{" +
                "idmovimiento='" + idmovimiento + '\'' +
                ", idtipomov='" + idtipomov + '\'' +
                ", idingrediente='" + idingrediente + '\'' +
                ", ingreso='" + ingreso + '\'' +
                ", egreso='" + ingreso + '\'' +
                ", saldo='" + ingreso + '\'' +
                ", documento='" + ingreso + '\'' +
                ", fechadocumento='" + ingreso + '\'' +
                ", fechavence='" + ingreso + '\'' +
                '}';
    }
}