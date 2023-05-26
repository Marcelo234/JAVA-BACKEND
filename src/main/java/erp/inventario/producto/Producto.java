package erp.inventario.producto;

import erp.inventario.categorias.Categorias;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
//Delimitador de acceso, class, nombre de la clase
public class Producto {
    //Delimitador de acceso, tipo de dato, nombre del atributo
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    private String nombre;
    private String descripcion;
    private double precioUnitario;
    
    @ManyToOne
    private Categorias categorias;
    
}
