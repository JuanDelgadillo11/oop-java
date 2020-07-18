import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal("perro","blanco");
        Animal animal1 = new Ave("paloma","plomo");

        List<Animal> animales = new ArrayList<>();
        animales.add(animal);
        animales.add(animal1);

        animales.stream().forEach(value -> value.desplazar());
    }
}
