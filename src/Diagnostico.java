import java.time.LocalDate;

public class Diagnostico {
    private String descripcion;
    private LocalDate fecha;

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
