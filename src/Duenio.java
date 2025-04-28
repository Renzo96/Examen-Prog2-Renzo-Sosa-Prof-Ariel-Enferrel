import java.util.ArrayList;
import java.util.List;

public class Duenio {
    private String nombre;
    private Telefono telefono;
    private Direccion direccion;
    private List<Animal> animales;


    public void addAnimal(Animal animal){
        if (animales == null) animales = new ArrayList<>();
        animales.add(animal);
    }
}
