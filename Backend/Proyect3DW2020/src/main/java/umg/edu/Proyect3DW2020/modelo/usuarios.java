package umg.edu.Proyect3DW2020.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="usuarios")
public class usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idusuario;
    private String nombre;
    private String dpi;
    private String telefono;
    private int estado;
    private int idtienda;
    private int administrador;

    @Override
    public String toString() {
        return "usuarios{" +
                "idusuario='" + idusuario + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dpi='" + dpi + '\'' +
                ", telefono='" + telefono + '\'' +
                ", estado='" + estado + '\'' +
                ", idtienda='" + idtienda + '\'' +
                ", administrador='" + administrador + '\'' +
                ", administrador='" + administrador + '\'' +
                '}';
    }
}
