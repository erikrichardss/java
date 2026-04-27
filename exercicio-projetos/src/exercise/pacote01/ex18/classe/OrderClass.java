package exercise.pacote01.ex18.classe;

public class OrderClass {
    private String orderId;
    private String customerName;
    private double amount;
    private String status;
    private boolean confirmed;
    private static int totalOrders;

    {
        this.confirmed = false;
        OrderClass.totalOrders += 1;
        System.out.println("Initializing new order...");
    }

    public OrderClass(String orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
        this.status = "PENDING";
    }

    public OrderClass(String orderId, String customerName, double amount, String status) {
        this(orderId, customerName, amount);
        this.status = status;
    }

    public static int getTotalOrders() {
        return totalOrders;
    }

    public static class Builder {
        private String orderId;
        private String customerName;
        private double amount;
        private String status;

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder amount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public OrderClass build() {
            if (this.status == null) {
                this.status = "PENDING...";
            }

            return new OrderClass(orderId, customerName, amount, status);
        }
    }
}