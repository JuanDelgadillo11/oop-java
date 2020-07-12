import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        System.out.println("------Práctica 3 - Punto 1--------------");

        ArrayList<String> test= new ArrayList<>();
        test.add("Bolivia");
        test.add("Argentina");
        test.add("Argelia");
        test.add("Italia");
        test.add("Australia");
        test.stream()
                .filter(s -> s.startsWith("A"))
                .forEach(System.out::println);
    }
}

