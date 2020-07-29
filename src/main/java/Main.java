import stream.Pedido;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------Práctica 5 point 1-------------");

        List<Pedido> pedidoList = new ArrayList<>();
        pedidoList.add(new Pedido("ped1","normal","Juan Perez","2020-05-05"));
        pedidoList.add(new Pedido("ped2","programado","Maria Guaman","2020-05-03"));
        pedidoList.add(new Pedido("ped3","normal","Juan Perez","2020-05-10"));
        System.out.println("-----------------------");

        // select cliente from Pedido;
        pedidoList.stream().map(Pedido::getCliente).forEach(value -> System.out.println(value));

        System.out.println("----------Práctica 5 point 2-------------");
        //Select cliente from Pedido where tipoPedido = “= normal“
        pedidoList.stream().filter(p ->p.getTipoPedido() == "normal").map(Pedido::getCliente).forEach(value -> System.out.println(value));

        System.out.println("----------Práctica 5 point 3-------------");
        //Select codPedido from Pedido where fecha = "2020-05-05"
        pedidoList.stream().filter(p ->p.getFecha() == "2020-05-05").map(Pedido::getCodPedido).forEach(value -> System.out.println(value));

    }
}