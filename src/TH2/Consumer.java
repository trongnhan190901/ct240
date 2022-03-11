package TH2;

public class Consumer extends Thread {
    private Producer producer;

    public Consumer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String data = producer.consume();
                System.out.println("Consumer: "+Thread.currentThread().getName()+" đã tiêu thụ " + data);
                Thread.sleep(1000);
            }
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
        }
    }
}
