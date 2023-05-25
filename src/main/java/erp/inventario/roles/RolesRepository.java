package erp.inventario.roles;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
    
public interface RolesRepository extends CrudRepository <Roles, Long> {
        
    List<Roles> findAll();
    
}
