package erp.inventario.cliente;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
public interface ClienteRepository extends CrudRepository <Cliente, Long> {
    List<Cliente> findAll();  
}