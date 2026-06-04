package exercise.pacote03.ex01.test;

import exercise.pacote03.ex01.domain.Pedido;

import java.util.*;
import java.util.stream.Collectors;

public class ProdutoTest01 {

    private static List<Pedido> pedidos = new ArrayList<>(List.of(
            new Pedido("Notebook", "Eletrônicos", 4500, 10),
            new Pedido("Mouse", " Eletrônicos", 80, 50),
            new Pedido("Teclado", "Eletrônicos", 150, 30),
            new Pedido("Monitor", "Eletrônicos", 1200, 15),
            new Pedido("Livro Java", "Livros", 90, 20),
            new Pedido("Clean Code", "Livros", 120, 12),
            new Pedido("Cadeira Gamer", "Móveis", 1500, 5),
            new Pedido("Mesa Escritório", "Móveis", 800, 8),
            new Pedido("Headset", "Eletrônicos", 350, 25),
            new Pedido("Spring Boot", " Livros", 110, 18)
    ));

    public static void main(String[] args) {

        pedidos.stream()
                .filter(p -> p.getPreco() > 500)
                .forEach(System.out::println);
        System.out.println("-----------------------");
        pedidos.stream()
                .map(Pedido::getNome)
                .forEach(System.out::print);
        System.out.println("-----------------------");
        pedidos.stream()
                .sorted(Comparator.comparing(Pedido::getPreco))
                .forEach(System.out::println);
        System.out.println("-----------------------");
        pedidos.stream()
                .sorted(Comparator.comparing(Pedido::getPreco).reversed())
                .limit(3)
                .forEach(System.out::println);
        System.out.println("-----------------------");
        Optional<Pedido> monitor = pedidos.stream()
                .filter(p -> p.getNome().contains("Monitor"))
                .findFirst();
        monitor.ifPresent(System.out::println);
        System.out.println("-----------------------");
        pedidos.stream()
                .mapToDouble(Pedido::getPreco)
                .average()
                .ifPresent(System.out::println);
        System.out.println("-----------------------");
        pedidos.stream()
                .max(Comparator.comparing(Pedido::getPreco))
                .ifPresent(System.out::println);
        System.out.println("-----------------------");
        pedidos.stream()
                .min(Comparator.comparing(Pedido::getPreco))
                .ifPresent(System.out::println);
        System.out.println("-----------------------");
        System.out.println(pedidos.stream()
                .mapToDouble(p -> p.getPreco() * p.getEstoque())
                .sum());
        System.out.println("-----------------------");
        System.out.println((Long) pedidos.stream()
                .map(Pedido::getCategoria)
                .count());
        System.out.println("-----------------------");
        Map<String, List<Pedido>> pedidoStringMap =
                pedidos.stream()
                        .collect(Collectors.groupingBy(Pedido::getCategoria));
        pedidoStringMap.forEach((s, p) -> {
            System.out.println(s + ": ");
            p.forEach(l -> System.out.println("    " + l.getNome()));
        });
        System.out.println("-----------------------");
        Map<String, Long> stringLongMap = pedidos.stream()
                .collect(Collectors.groupingBy(Pedido::getCategoria, Collectors.counting()));
        stringLongMap.forEach((s, l) -> {
            System.out.println(s + ": " + l);
        });
    }
}
