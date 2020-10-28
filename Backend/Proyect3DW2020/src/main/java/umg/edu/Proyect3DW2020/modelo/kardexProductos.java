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
    private int idtipomov_tipomomvimiento;
    private int idingrediente_ingredientes;
    private int usuario_crea;
    private int idusuario_usuarios;
    private int idtienda;

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
                ", idtipomov_tipomomvimiento='" + idtipomov_tipomomvimiento + '\'' +
                ", idingrediente_ingredientes='" + idingrediente_ingredientes + '\'' +
                ", usuario_crea='" + usuario_crea + '\'' +
                ", idusuario_usuarios='" + idusuario_usuarios + '\'' +
                ", idtienda='" + idtienda + '\'' +
                '}';
    }
}