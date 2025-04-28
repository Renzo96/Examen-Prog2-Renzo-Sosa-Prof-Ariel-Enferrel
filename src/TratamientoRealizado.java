import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TratamientoRealizado {
    private Tratamiento tratamiento;
    private List<Medicamento> medicamentos;
    private LocalDate fecha;

    public TratamientoRealizado(LocalDate fecha, Tratamiento tratamiento) {
        this.fecha = fecha;
        this.tratamiento = tratamiento;
    }

    public void addMedicamentos(Medicamento medicamento){
        if (medicamentos == null) medicamentos = new ArrayList<>();
        medicamentos.add(medicamento);
    }
}
