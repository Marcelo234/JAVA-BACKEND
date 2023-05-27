package erp.inventario.cliente;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(unique = true, nullable = false)
  private Long id_cliente;


  private String nombre_cliente;
  private String direccion;
  private String email;
  private Integer prioridad;

  // Definition Getter and setter
  public Long getId_cliente() {
    return id_cliente;
  }
  public void setId_cliente(Long id_cliente) {
    this.id_cliente = id_cliente;
  }
  public String getNombre_cliente() {
    return nombre_cliente;
  }
  public void setNombre_cliente(String nombre_cliente) {
    this.nombre_cliente = nombre_cliente;
  }
  public String getDireccion() {
    return direccion;
  }
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public Integer getPrioridad() {
    return prioridad;
  }
  public void setPrioridad(Integer prioridad) {
    this.prioridad = prioridad;
  }
}
