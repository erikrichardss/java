package exercise.pacote03.ex02.thread;

import exercise.pacote03.ex02.domain.Order;
import exercise.pacote03.ex02.service.StockService;

public class OrderProcessor implements Runnable {
    private Order order;
    private StockService stockService;

    public OrderProcessor(Order order) {
        this.order = order;
    }

    public OrderProcessor(Order order, StockService stockService) {
        this.order = order;
        this.stockService = stockService;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.printf("Stock present %d \n", stockService.stock());
            System.out.printf("%d payment: %s \n",
                    order.getId(), order.getStatus().getName());
            Thread.sleep(2000);
            System.out.printf("Order %d prepare to items \n",
                    order.getId());
            Thread.sleep(2000);
            System.out.printf("Order %d set aside in stock \n",
                    order.getId());
            Thread.sleep(2000);
            System.out.printf("Order %d finished \n",
                    order.getId());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
