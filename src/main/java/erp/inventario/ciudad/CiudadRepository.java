package erp.inventario.ciudad;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
public interface CiudadRepository extends CrudRepository <Ciudad, Long> {
    List<Ciudad> findAll();  
}
