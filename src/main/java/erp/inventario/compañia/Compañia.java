package erp.inventario.compañia;



import erp.inventario.ciudad.Ciudad;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Compañia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    private String nombresCompañia;
    private String direccionCompañia;
    private double telefonoCompañia;
    private String correoElectronico;

    @ManyToOne
    private Ciudad ciudad;
}
