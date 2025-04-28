public class Gato extends Animal {
    private String color;

    public Gato(String nombre, int edad, EstadoAnimal estado, Raza raza, String color) {
        super(nombre, edad, estado, raza);
        this.color = color;
    }

    public Gato() {
    }
}
