package erp.inventario.roles;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
@Service
public class RolesService {
    @Autowired
    RolesRepository repository;
    
    public Roles save( Roles entity){
        return repository.save(entity);
    }
    
    public void deleteById(long id){
        repository.deleteById(id);
    }
    
    public Roles findById(long id){
        return repository.findById(id).orElse(null);
    }
    
    public List<Roles> findAll(){
        return repository.findAll();
    }
}
