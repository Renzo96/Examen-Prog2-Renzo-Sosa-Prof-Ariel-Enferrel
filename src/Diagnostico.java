import java.time.LocalDate;

public class Diagnostico {
    private String descripcion;
    private LocalDate fecha;

    public Diagnostico(String descripcion, LocalDate fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Diagnostico() {
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
