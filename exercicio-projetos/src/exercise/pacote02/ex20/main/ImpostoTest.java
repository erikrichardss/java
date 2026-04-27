package exercise.pacote02.ex20.main;

import exercise.pacote02.ex20.classe.ImpostoFixo;
import exercise.pacote02.ex20.classe.ImpostoIms;
import exercise.pacote02.ex20.classe.ImpostoRenda;
import exercise.pacote02.ex20.repositorio.Imposto;
import exercise.pacote02.ex20.servico.CalculadoraImposto;

import java.util.ArrayList;
import java.util.List;

public class ImpostoTest {
    public static void main(String[] args) {
        ImpostoRenda impostoRenda = new ImpostoRenda();
        ImpostoIms impostoIms = new ImpostoIms();
        ImpostoFixo impostoFixo = new ImpostoFixo();

        List<Imposto> impostoList = new ArrayList<>();
        impostoList.add(impostoRenda);
        impostoList.add(impostoIms);
        impostoList.add(impostoFixo);

        CalculadoraImposto.calcularTotal(1000, impostoList);
    }
}
