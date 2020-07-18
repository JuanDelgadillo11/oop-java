import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListLandTransPort {
    List<Land> lando = new ArrayList<Land>();;

    public void addLand (Land land){
        lando.add(land);
    }

    public void display(){
        Iterator itr=lando.iterator();
        while(itr.hasNext()){
            Land st=(Land)itr.next();
            System.out.println("name = "+st.getName()+", price = "+st.getPrice()+", hasMotor =  "+st.hasMotor+", "+ st.displayData());
        }
    }
}
