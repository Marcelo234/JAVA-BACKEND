package erp.inventario.usuarios;

import erp.inventario.roles.Roles;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idUsuarios;
    private String nombre;
    private String correoElectronico;
    private String contraseña;

    @ManyToOne
    private Roles roles;
}
