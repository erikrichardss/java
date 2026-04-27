package exercise.pacote01.ex26.classe;

public class Carro {
    private String modelo;
    private Motor motor;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public void imprimirCarro() {
        System.out.println(modelo);
        motor.imprimirDetalhes();
    }
}
