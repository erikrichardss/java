package exercise.pacote03.ex02.domain;

import java.util.concurrent.atomic.AtomicInteger;

public class Order {
    private static final AtomicInteger atomicInteger = new AtomicInteger(1);
    private Integer id = 0;
    private String custumer;
    private double value;
    private  Status status;

    public Order(String custumer, double value, Status status) {
        this.id = atomicInteger.getAndIncrement();
        this.custumer = custumer;
        this.value = value;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", custumer='" + custumer + '\'' +
                ", value=" + value +
                ", status=" + status +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getCustumer() {
        return custumer;
    }

    public double getValue() {
        return value;
    }

    public Status getStatus() {
        return status;
    }
}
