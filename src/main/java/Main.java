import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        System.out.println("-------Práctica 3 - Punto 3-------------");

        ArrayList<String> test3= new ArrayList<>();
        test3.add("Bolivia");
        test3.add("Argentina");
        test3.add("Argelia");
        test3.add("Italia");
        test3.add("Australia");
        test3.stream()
                .filter(s -> s.length()%2 == 0)
                .forEach(System.out::println);
    }
}
