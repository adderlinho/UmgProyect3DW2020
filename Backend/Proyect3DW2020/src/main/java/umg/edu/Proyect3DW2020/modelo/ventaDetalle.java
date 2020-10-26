package umg.edu.Proyect3DW2020.modelo;

import java.util.Date;
import java.util.List;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="ventadetalle")
public class ventaDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iddetalleventa;
    private int idventa;
    private int idproductofinal;
    private Date fechacrea;
    private int cantidad;
    private int preciounitario;
    private int estado;

    @Override
    public String toString() {
        return "ventadetalle{" +
                "iddetalleventa='" + iddetalleventa + '\'' +
                ", idventa='" + idventa + '\'' +
                ", idproductofinal='" + idproductofinal + '\'' +
                ", fechacrea='" + fechacrea + '\'' +
                ", cantidad='" + cantidad + '\'' +
                ", preciounitario='" + preciounitario + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
