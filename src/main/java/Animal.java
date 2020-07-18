public class Animal {
    String name;
    String color;

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }
    //Constructor
    public Animal(String name, String color){
        this.name=name;
        this.color=color;
    }

    //metodo
    public void desplazar(){
        System.out.println("caminando clase Animal");
    }
}
