package erp.inventario.almacen;

import erp.inventario.compañia.Compañia;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Almacen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    private String nombreAlmacen;
    private String direccionAlmacen;
    private String capacidadAlmacen;

    @ManyToOne
    private Compañia compañia;

}
