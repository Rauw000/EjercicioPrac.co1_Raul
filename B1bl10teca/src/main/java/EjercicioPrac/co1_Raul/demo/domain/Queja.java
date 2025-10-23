package EjercicioPrac.co1_Raul.demo.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "queja")
public class Queja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreCliente;
    private String email;
    private String telefono;

    @Enumerated(EnumType.STRING)
    private Tipo tipo;

    private String asunto;
    private String mensaje;
    private Boolean tratado;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    public enum Tipo {
        QUEJA, SUGERENCIA, CONSULTA
    }

    public Queja() {
     
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Boolean getTratado() {
        return tratado;
    }

    public void setTratado(Boolean tratado) {
        this.tratado = tratado;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}