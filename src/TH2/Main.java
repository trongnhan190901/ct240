package TH2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Producer producer = new Producer();
        producer.setName("Producer Zoom65");
        producer.start();

        Consumer consumer = new Consumer(producer);
        consumer.setName("Consumer Zoom65");
        consumer.start();

        while (true){
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input != ""){
                System.exit(0);
            }
        }
    }
}
