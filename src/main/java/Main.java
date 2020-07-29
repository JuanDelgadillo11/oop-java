import stream.Pedido;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------Práctica 5-------------");

        List<Pedido> pedidoList = new ArrayList<>();
        pedidoList.add(new Pedido("ped1","normal","Juan Perez","2020-05-05"));
        pedidoList.add(new Pedido("ped2","programado","Maria Guaman","2020-05-03"));
        pedidoList.add(new Pedido("ped3","normal","Juan Perez","2020-05-10"));
        System.out.println("-----------------------");

        // select cliente from Pedido;
        pedidoList.stream().map(Pedido::getCliente).forEach(value -> System.out.println(value));
    }
}