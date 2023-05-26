package erp.inventario.almacen;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
public interface AlmacenRepository extends CrudRepository <Almacen, Long> {
    List<Almacen> findAll();  
}
