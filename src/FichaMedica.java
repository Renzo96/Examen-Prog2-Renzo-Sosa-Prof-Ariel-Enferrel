import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FichaMedica {
    private List<Diagnostico> diagnosticos;



    public void addDiagnostico(String desripcion, LocalDate fecha){
        if (diagnosticos == null) diagnosticos = new ArrayList<>();
        diagnosticos.add(new Diagnostico(desripcion, fecha));
    }
}
