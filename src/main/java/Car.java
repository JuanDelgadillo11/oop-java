public class Car extends Land{
    boolean useGas;

    public Car(String name, int price, boolean hasMotor, boolean useGas) {
        super(name, price, hasMotor);
        this.useGas = useGas;
    }

    public String displayData(){
        return "useGas = "+String.valueOf(useGas);
    }
}
