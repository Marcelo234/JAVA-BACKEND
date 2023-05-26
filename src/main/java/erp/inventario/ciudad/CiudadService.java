package erp.inventario.ciudad;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadService {

    @Autowired
    CiudadRepository repository;

    public Ciudad save( Ciudad entity){
        return repository.save(entity);
    }
    
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Ciudad findById(long id){
        return repository.findById(id).orElse(null);
    }

    public List<Ciudad> findAll(){
        return repository.findAll();
    }
}
