package erp.inventario.usuarios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UsuariosRepository extends CrudRepository <Usuarios, Long> {
    
    List<Usuarios> findAll();

}
