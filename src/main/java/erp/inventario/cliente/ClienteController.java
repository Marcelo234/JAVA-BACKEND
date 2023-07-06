package erp.inventario.cliente;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/cliente")
@Tag(name = "Controlador de los clientes, tabla (Cliente)")
public class ClienteController {
  @Autowired
  ClienteService clienteService;
  
  @PreAuthorize("hasAuthority('Cliente_Vertodo')")
  @GetMapping("/")
  public ArrayList<Cliente> obtenerClientes() {
    return clienteService.obtenerClientes();
  }
  
  @PostMapping()
  public Cliente guardarCliente(@RequestBody Cliente cliente) {
    return this.clienteService.guardarCliente(cliente);
  }

  @GetMapping(value="/{id}")
  public Optional<Cliente> obtenerClientePorId(@PathVariable("id") Long id) {
    return this.clienteService.obtenerPorId(id);
  }

  @GetMapping("/query")
  public ArrayList<Cliente> obternerPorPrioridad(@RequestParam("prioridad") Integer prioridad) {
    return this.clienteService.obtenerPorPrioridad(prioridad);
  }

  @DeleteMapping(path = "/{id}")
  public String eliminarPorId(@PathVariable("id") Long id) {
    boolean ok = this.clienteService.eliminarCliente(id);
    if (ok) {
      return "Se eliminó el usuario con id " + id;
    } else {
      return "No puedo eliminar el usuario con id " + id;
    }
  }
}
