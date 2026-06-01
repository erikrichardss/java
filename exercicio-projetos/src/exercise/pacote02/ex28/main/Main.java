package exercise.pacote02.ex28.main;

import exercise.pacote02.ex28.classe.Funcionario;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Funcionario> funcionariosList = new ArrayList<>();
        funcionariosList.add(new Funcionario("Sansa", 7030, "Administração"));
        funcionariosList.add(new Funcionario("Jonh", 4050, "Finanças"));
        funcionariosList.add(new Funcionario("Daenerys", 8900, "Gestão"));

        funcionariosList.forEach((Funcionario f) -> System.out.println(f.toString()));

        System.out.println("_________________");
        System.out.println(salarioAlto(funcionariosList, (Funcionario f) -> f.getSalario() > 5000));

        System.out.println("_________________");
        List<String> funcionarioNome = funcionarioNome(funcionariosList, (Funcionario f) -> f.getNome());
        System.out.println(funcionarioNome);

        System.out.println("_________________");
        almentoSalario(funcionariosList, (Funcionario f) -> f.setSalario(f.getSalario() + f.getSalario() * 0.1));
        funcionariosList.forEach(f -> System.out.println(f.toString()));

        System.out.println("_________________");
        funcionariosList.sort((f1, f2) -> Double.compare(f1.getSalario(), f2.getSalario()));
        funcionariosList.forEach(f -> System.out.println(f.toString()));

        System.out.println("_________________");
        funcionariosList.stream().filter(funcionario -> funcionario.getCargo().equals("Gestão"))
                .forEach(funcionario -> System.out.println(funcionario.toString()));
    }

    public static <T> List<T> salarioAlto(List<T> list, Predicate<T> predicate) {

        List<T> listSalario = new ArrayList<>();

        for (T t : list) {

            if (predicate.test(t)) {

                listSalario.add(t);
            }
        }

        return listSalario;
    }

    public static <T, R> List<R> funcionarioNome(List<T> list, Function<T, R> function) {

        List<R> listNome = new ArrayList<>();

        for (T t : list) {

            R r = function.apply(t);
            listNome.add(r);
        }

        return listNome;
    }

    public static <T> void almentoSalario(List<T> list, Consumer<T> consumer) {

        for (T t : list) {

            consumer.accept(t);
        }
    }
}
