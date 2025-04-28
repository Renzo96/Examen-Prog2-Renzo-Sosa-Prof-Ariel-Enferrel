import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private String nombre;
    private int edad;
    private EstadoAnimal estado;
    private FichaMedica fichaMedica;
    private Duenio duenio;
    private Raza raza;
    private ArrayList<Turno> turnos;

    public Animal(String nombre, int edad, EstadoAnimal estado, Raza raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.raza = raza;
    }

    public Animal() {
    }

    public boolean estaEnTratamiento(){
        if (this.estado.equals(EstadoAnimal.EN_TRATAMIENTO)){
            return true;
        }
        return false;
    }

    public void setFichaMedica(FichaMedica ficha){
        this.fichaMedica = new FichaMedica();
    }

    public void addTurno(Turno turno){
        if (turnos == null) turnos = new ArrayList<>();
        turnos.add(turno);
    }

    public void removeTurno(Turno turno){
        if (turnos != null){
            turnos.remove(turno);
        }
    }

    public EstadoAnimal getEstado() {
        return estado;
    }

    public void setEstado(EstadoAnimal estado) {
        this.estado = estado;
    }

    public List<TratamientoRealizado> getHistorialDeTratamientos(){
        List<TratamientoRealizado> tratamientosHistorial = null;
        for (Turno turno : turnos){
            for (TratamientoRealizado trat : turno.getTratamientos()){
                tratamientosHistorial.add(trat);
            }
        }
        return tratamientosHistorial;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Raza getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estado=" + estado +
                ", raza=" + raza +
                '}';
    }
}
