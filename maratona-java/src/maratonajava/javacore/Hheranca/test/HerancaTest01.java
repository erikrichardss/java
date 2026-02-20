package maratonajava.javacore.Hheranca.test;

import maratonajava.javacore.Hheranca.dominio.Endereco;
import maratonajava.javacore.Hheranca.dominio.Funcionario;
import maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("123765-123");

        Pessoa pessoa = new Pessoa("Toyohima Shimazu");
        pessoa.setCpf("11111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("2222222-22");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        System.out.println("------------");
        funcionario.imprime();
    }
}
