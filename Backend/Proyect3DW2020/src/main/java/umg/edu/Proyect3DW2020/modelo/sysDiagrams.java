package umg.edu.Proyect3DW2020.modelo;

import java.util.Date;
import java.util.List;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="sysdiagrams")
public class sysDiagrams {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int diagram_id;
    private String name;
    private int principal_id;
    private int version;
    private int definition;

    @Override
    public String toString() {
        return "sysdiagrams{" +
                "diagram_id='" + diagram_id + '\'' +
                ", name='" + name + '\'' +
                ", principal_id='" + principal_id + '\'' +
                ", version='" + version + '\'' +
                ", definition='" + definition + '\'' +
                '}';
    }
}
