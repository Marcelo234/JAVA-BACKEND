package erp.inventario.proveedores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProveedoresService {

    @Autowired
    ProveedoresRepository repository;

    public Proveedores save( Proveedores entity){
        return repository.save(entity);
    }
    
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Proveedores findById(long id){
        return repository.findById(id).orElse(null);
    }

    public List<Proveedores> findAll(){
        return repository.findAll();
    }
}
