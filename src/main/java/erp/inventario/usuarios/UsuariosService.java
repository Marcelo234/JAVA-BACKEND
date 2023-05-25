package erp.inventario.usuarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService {
    @Autowired
    UsuariosRepository repository;
    public Usuarios save( Usuarios entity){
        return repository.save(entity);
    }

    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Usuarios findById(long id){
        return repository.findById(id).orElse(null);
    }

    public List<Usuarios> findAll(){
        return repository.findAll();
    }
}
