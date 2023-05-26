package erp.inventario.proveedores;


import erp.inventario.ciudad.Ciudad;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Proveedores {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    private String nombre;
    private String direccion;

    @ManyToOne
    private Ciudad ciudad;
}
