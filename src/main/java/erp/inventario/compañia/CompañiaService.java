package erp.inventario.compañia;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompañiaService {

    @Autowired
    CompañiaRepository repository;

    public Compañia save( Compañia entity){
        return repository.save(entity);
    }
    
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Compañia findById(long id){
        return repository.findById(id).orElse(null);
    }

    public List<Compañia> findAll(){
        return repository.findAll();
    }
}
