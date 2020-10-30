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
    private int idproductofinal_productosfinal;
    private int idingrediente_ingredientes;
    private int estado_estados;
    private int usuario_crea;
    private int idusuario_usuarios;

    public int getIddetalleproductofinal() {
        return iddetalleproductofinal;
    }

    public int getIdingrediente() {
        return idingrediente;
    }

    public double getCantidad() {
        return cantidad;
    }

    public int getEstado() {
        return estado;
    }

    public int getIdproductofinal() {
        return idproductofinal;
    }

    public int getIdproductofinal_productosfinal() {
        return idproductofinal_productosfinal;
    }

    public int getIdingrediente_ingredientes() {
        return idingrediente_ingredientes;
    }

    public int getEstado_estados() {
        return estado_estados;
    }

    public int getUsuario_crea() {
        return usuario_crea;
    }

    public int getIdusuario_usuarios() {
        return idusuario_usuarios;
    }

    @Override
    public String toString() {
        return "detalleproductofinal{" +
                "iddetalleproductofinal='" + iddetalleproductofinal + '\'' +
                ", idingrediente='" + idingrediente + '\'' +
                ", cantidad='" + cantidad + '\'' +
                ", estado='" + estado + '\'' +
                ", idproductofinal='" + idproductofinal + '\'' +
                ", idproductofinal_productosfinal='" + idproductofinal_productosfinal + '\'' +
                ", idingrediente_ingredientes='" + idingrediente_ingredientes + '\'' +
                ", estado_estados='" + estado_estados + '\'' +
                ", usuario_crea='" + usuario_crea + '\'' +
                ", idusuario_usuarios='" + idusuario_usuarios + '\'' +
                '}';
    }
}
