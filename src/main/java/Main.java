import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        System.out.println("--------Práctica 3 - Punto 2------------");

        ArrayList<String> test2= new ArrayList<>();
        test2.add("Bolivia");
        test2.add("Argentina");
        test2.add("Argelia");
        test2.add("Italia");
        test2.add("Australia");
        test2.stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);
    }
}
