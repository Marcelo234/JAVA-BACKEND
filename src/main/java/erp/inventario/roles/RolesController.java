package erp.inventario.roles;

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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
    
@RestController
@RequestMapping("/api/roles")
@CrossOrigin({"*"})
@Tag(name = "Controlador de los roles, tabla (Roles)")
public class RolesController {
    
    @Autowired
    RolesService service;
    
    @Operation(summary = "Obtiene un rol por su identificacion (id) ")
    @GetMapping("/{id}/")
    public Roles findById(@PathVariable long id){
        return service.findById(id);
    }
    
    @Operation(summary = "Obtiene todos los roles")
    @GetMapping("/")
    public List<Roles> findAll(){
        return service.findAll();
    }
    
    @Operation(summary = "Guarda un nuevo rol (enviado en el body)")
    @PostMapping("/")
    public Roles save( @RequestBody Roles entity ){
        return service.save(entity);
    }
    
    @Operation(summary = "Actualiza un rol por su id")
    @PutMapping("/")
    public Roles update( @RequestBody Roles entity ){
        return service.save(entity);
    }
    
    @Operation(summary = "Elimina un rol por su id")
    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        service.deleteById(id);
    }
    
}
