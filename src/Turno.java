import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Turno {
    private LocalDate fecha;
    private Animal animal;
    private Veterinario veterinario;
    private List<TratamientoRealizado> tratamientos;

    public Turno(LocalDate fecha, Animal animal, Veterinario veterinario) {
        this.fecha = fecha;
        this.animal = animal;
        this.veterinario = veterinario;
    }


    public void addTratamientoRealizado(LocalDate fecha, Tratamiento tratamiento){
        if (tratamientos == null) tratamientos = new ArrayList<>();
        tratamientos.add(new TratamientoRealizado(fecha, tratamiento));
    }

    public List<TratamientoRealizado> getTratamientos() {
        return tratamientos;
    }

    public void registrarTratamiento(Tratamiento tratamiento, LocalDate fecha, List<Medicamento> medicamentos){
        TratamientoRealizado tratamientoRegistrado = new TratamientoRealizado(fecha,tratamiento);
        if (!this.getAnimal().estaEnTratamiento()){
            this.getAnimal().setEstado(EstadoAnimal.EN_TRATAMIENTO);
        }
    }

    public Animal getAnimal() {
        return animal;
    }

    public void diagnosticar(String descripcion){
        Diagnostico diagnostico = null;
        diagnostico.setDescripcion(descripcion);
        diagnostico.setFecha(LocalDate.now());
    }

}
