package erp.inventario.categorias;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/categorias")
@CrossOrigin({"*"})
@Tag(name = "Controlador de las categorias, tabla (Categorias)")
public class CategoriasController {
    
    @Autowired
    CategoriasService service;

    @GetMapping("/{id}/")
    public Categorias findById(@PathVariable long id){
        return service.findById(id);
    }

    @GetMapping("/")
    public List<Categorias> findAll(){
        return service.findAll();
    }

    //Create
    //Delimitador de acceso (public, private), tipo de dato de retorno, nombre del metodo, parametros de entrada(Sentencias)
    @PostMapping("/")
    public Categorias save( @RequestBody Categorias entity ){
        return service.save(entity);
    }

    @PutMapping("/")
    public Categorias update ( @RequestBody Categorias entity ){
        return service.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        service.deleteById(id);
    }

    @PatchMapping("/{id}/")
    public Categorias partiaUpdate(@PathVariable long id, @RequestBody Map<String, Object> fields){
        Categorias entity = findById(id);
        
        //itera sobre los campos que se desean actualizar
        for (Map.Entry<String, Object> field : fields.entrySet()){
            String fieldName = field.getKey();
            Object fieldValue = field.getValue();
        
        //utiliza reflection para establecer el valor del campo en la entidad
        try {
            Field campoEntidad = Categorias.class.getDeclaredField(fieldName);
            campoEntidad.setAccessible(true);
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            campoEntidad.set(entity, mapper.convertValue(fieldValue, campoEntidad.getType()));
        } catch (NoSuchFieldException | IllegalAccessException ex){
            //maneja la excepcion si ocurre algun erros al acceder al campo
        }
        }
    return update(entity);
    }
}
