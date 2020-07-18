import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
    Abuelo abuelo = new Abuelo();
    Padre padre = new Padre();
    abuelo.metodoAbuelo(); // llama a su propio metodo
    padre.metodoPadre();// llama a los dos padre y abuelo
    padre.metodoAbuelo();// llama al metodo de su padre
    }
}
