public class Bicycle extends Land{
    boolean exersiceBike;

    public Bicycle(String name, int price, boolean hasMotor, boolean exersiceBike) {
        super(name, price, hasMotor);
        this.exersiceBike = exersiceBike;
    }

    public String displayData(){
        return "exercise = "+String.valueOf(exersiceBike);
    }
}
