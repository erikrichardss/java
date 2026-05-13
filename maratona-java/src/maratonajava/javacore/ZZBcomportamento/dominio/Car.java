package maratonajava.javacore.ZZBcomportamento.dominio;

public class Car {

    private String name = "Audi";
    private String cor;
    private int ano;

    public Car(String cor, int ano) {
        this.cor = cor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }
}
