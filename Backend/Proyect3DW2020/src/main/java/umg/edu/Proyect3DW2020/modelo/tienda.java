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
  
    public tienda(int idtienda, String nombretienda, String direccion, String telefono, String nit) {
        this.idtienda = idtienda;
        this.nombretienda = nombretienda;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }
    
    
      public tienda() {
      
    }
    
   
        
    public int getIdtienda() {
        return idtienda;
    }

    public String getNombretienda() {
        return nombretienda;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNit() {
        return nit;
    }
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
