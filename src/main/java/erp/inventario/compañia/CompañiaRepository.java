package erp.inventario.compañia;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
public interface CompañiaRepository extends CrudRepository <Compañia, Long> {
    List<Compañia> findAll();  
}
