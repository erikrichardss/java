package exercise.pacote03.ex02.service;

public class StockService {
    private int stock = 10;

    public synchronized int stock() {
        return stock--;
    }
}
