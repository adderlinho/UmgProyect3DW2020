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
    private int cantidad;
    private int preciounitario;
    private int estado;
    private int idventa_venta;
    private int idproductofinal_productosfinal;
    private int estado_estados;
    private Date fechacrea;

    @Override
    public String toString() {
        return "ventadetalle{" +
                "iddetalleventa='" + iddetalleventa + '\'' +
                ", idventa='" + idventa + '\'' +
                ", idproductofinal='" + idproductofinal + '\'' +
                ", cantidad='" + cantidad + '\'' +
                ", preciounitario='" + preciounitario + '\'' +
                ", estado='" + estado + '\'' +
                ", idventa_venta='" + idventa_venta + '\'' +
                ", idproductofinal_productosfinal='" + idproductofinal_productosfinal + '\'' +
                ", estado_estados='" + estado_estados + '\'' +
                ", fechacrea='" + fechacrea + '\'' +
                '}';
    }
}
