package umg.edu.Proyect3DW2020.modelo;

import java.util.Date;
import java.util.List;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="venta")
public class venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idventa;
    private String nombrecliente;
    private Date fechapedido;
    private int estado;
    private int idestado_estadoventa;
    private int usuario_crea;
    private int idusuario_usuarios;
    private int idtienda;

    @Override
    public String toString() {
        return "venta{" +
                "idventa='" + idventa + '\'' +
                ", nombrecliente='" + nombrecliente + '\'' +
                ", fechapedido='" + fechapedido + '\'' +
                ", estado='" + estado + '\'' +
                ", idestado_estadoventa='" + idestado_estadoventa + '\'' +
                ", usuario_crea='" + usuario_crea + '\'' +
                ", idusuario_usuarios='" + idusuario_usuarios + '\'' +
                ", idtienda='" + idtienda + '\'' +
                '}';
    }
}
