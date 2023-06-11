package erp.inventario.usuarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin({"*"})
@Tag(name = "Controlador de los usuarios, tabla (Usuarios)")
public class UsuariosController {

    @Autowired
    UsuariosService service;

    @GetMapping("/{id}/")
    public Usuarios findById(@PathVariable long id){
        return service.findById(id);
    }

    @GetMapping("/")
    public List<Usuarios> findAll(){
        return service.findAll();
    }

    @PostMapping("/")
    public Usuarios save( @RequestBody Usuarios entity ){
        return service.save(entity);
    }

    @PutMapping("/")
    public Usuarios update( @RequestBody Usuarios entity ){
        return service.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        service.deleteById(id);
    }

}
