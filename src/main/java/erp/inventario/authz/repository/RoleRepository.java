package erp.inventario.authz.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import erp.inventario.authz.entity.Role;




public interface RoleRepository extends CrudRepository <Role, Long> {

    List<Role> findAll();
    
}
