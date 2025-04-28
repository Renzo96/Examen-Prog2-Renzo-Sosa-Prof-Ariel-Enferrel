import java.util.ArrayList;
import java.util.List;

public class Veterinario {
    private String nombre;
    private Especialidad especilidad;
    private List<Animal> animalesAtendidos;


    public Veterinario(String nombre, Especialidad especilidad) {
        this.nombre = nombre;
        this.especilidad = especilidad;
    }

    public void addAnimalAtendido(Animal animal){
        if (animalesAtendidos ==  null) animalesAtendidos = new ArrayList<>();
        animalesAtendidos.add(animal);
    }

    public void mostrarPacientesAtendidos(){
        for (Animal animal : animalesAtendidos){
            System.out.println("Nombre Mascota " + animal.getNombre() + " cuya especie es" + animal.getRaza().getEspecie() + " y el estado actual es " + animal.getEstado());
        }
    }
}
