package umg.edu.Proyect3DW2020.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="tienda")
public class tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtienda;
    private String nombretienda;
    private String direccion;
    private String telefono;
    private String nit;

    @Override
    public String toString() {
        return "tienda{" +
                "idtienda='" + idtienda + '\'' +
                ", nombretienda='" + nombretienda + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", nit='" + nit + '\'' +
                '}';
    }
}
