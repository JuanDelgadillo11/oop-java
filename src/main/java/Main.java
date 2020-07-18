import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        ListLandTransPort trans = new ListLandTransPort();
        trans.addLand(new Bicycle("Cross", 1500,false,false));
        trans.addLand(new Car("Audi", 20000,true,true));
        trans.display();
    }
}