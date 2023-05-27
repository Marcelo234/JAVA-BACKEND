package erp.inventario.cliente;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteService {
  @Autowired
  ClienteRepository clienteRepository;

  public ArrayList<Cliente> obtenerClientes() {
    return (ArrayList<Cliente>) clienteRepository.findAll();
  }

  // Save User
  public Cliente guardarCliente(Cliente cliente) {
    return clienteRepository.save(cliente);
  }

  // Get for Id
  public Optional<Cliente> obtenerPorId(Long id) {
    return clienteRepository.findById(id);
  }

  public ArrayList<Cliente> obtenerPorPrioridad(Integer prioridad) {
    return clienteRepository.findByPrioridad(prioridad);
  }

  public boolean eliminarCliente(Long id) {
    try {
      clienteRepository.deleteById(id);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
