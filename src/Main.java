import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        A partir del diagrama UML entregado:
//        1. Codificá las clases que aparecen en el modelo, respetando atributos, relaciones y
//        jerarquías.
//        2. Instanciá los siguientes objetos como parte del mét
//        consola:
//        o Un perro y un gato, ambos con su ficha médica y dueño.
//        o Un veterinario con una especialidad.
//        o Un turno para el perro y otro para el gato, atendidos por el veterinario.
//                o Un tratamiento realizado en cada turno, con al menos un medicamento.

        Especialidad especialidadCanina = new Especialidad("Caninos Domésticos");
        Especialidad especialidadFelina = new Especialidad("Felinos Domésticos");

        Veterinario vetPerro = new Veterinario("Sergio", especialidadCanina);
        Veterinario vetGato = new Veterinario("Alejandra", especialidadFelina);

        Raza razaPerro = new Raza("Ovejero Alemán", "Caninos");
        Raza razaGato = new Raza("Esfinge", "Felinos");

        Perro dog = new Perro("Bobby", 2,EstadoAnimal.EN_TRATAMIENTO, razaPerro);
        Gato cat = new Gato("Chito", 3, EstadoAnimal.EN_TRATAMIENTO, razaGato, "Blanquinegro");

        Medicamento medTurnoPerro = new Medicamento("Sertralina", "10mg");
        Medicamento medTurnoGato = new Medicamento("Ibupirar", "20mg");

        Turno turnoPerro = new Turno(LocalDate.now(),dog,vetPerro);
        Turno turnoGato = new Turno(LocalDate.now(), cat, vetGato);

        turnoPerro.addTratamientoRealizado(LocalDate.now(), Tratamiento.DESPARASITACION);
        turnoGato.addTratamientoRealizado(LocalDate.now(), Tratamiento.VACUNACION);

        turnoPerro.getTratamientos().get(0).addMedicamentos(medTurnoPerro);
        turnoGato.getTratamientos().get(1).addMedicamentos(medTurnoGato);

        dog.addTurno(turnoPerro);
        cat.addTurno(turnoGato);

//        TratamientoRealizado tratTurnoPerro = new TratamientoRealizado();
//        TratamientoRealizado tratTurnoGato = new TratamientoRealizado();


    }
}