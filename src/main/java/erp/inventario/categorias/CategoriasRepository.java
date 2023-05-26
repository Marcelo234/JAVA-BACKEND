package erp.inventario.categorias;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
public interface CategoriasRepository extends CrudRepository <Categorias, Long> {
    List<Categorias> findAll();  
}
