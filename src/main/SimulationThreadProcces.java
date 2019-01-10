package main;

import store.Consumer;
import store.Producer;
import store.Store;

public class SimulationThreadProcces
{
    public static void main(String args[]) throws Exception
    {
        Store store = new Store();

        Thread producer1 = new Thread(new Producer(5, store));
        producer1.start();
        Thread.sleep(1000);
        store.stocktaking();
        Thread consumer1 = new Thread(new Consumer(3, store));
        consumer1.start();
        Thread.sleep(1000);
        store.stocktaking();

        Thread producer2 = new Thread(new Producer(6, store));
        producer2.start();
        Thread.sleep(1000);
        store.stocktaking();
        Thread consumer2 = new Thread(new Consumer(10, store));
        consumer2.start();
        Thread.sleep(1000);
        store.stocktaking();

        Thread producer3 = new Thread(new Producer(2, store));
        producer3.start();
        Thread.sleep(1000);
        store.stocktaking();
        Thread consumer3 = new Thread(new Consumer(5, store));
        consumer3.start();
        Thread.sleep(1000);
        store.stocktaking();

        Thread producer4 = new Thread(new Producer(10, store));
        producer4.start();
        Thread.sleep(1000);
        store.stocktaking();
        Thread consumer4 = new Thread(new Consumer(10, store));
        consumer4.start();
        Thread.sleep(1000);
        store.stocktaking();

        Thread producer5 = new Thread(new Producer(10, store));
        producer5.start();
        Thread.sleep(1000);
        store.stocktaking();
        Thread consumer5 = new Thread(new Consumer(10, store));
        consumer5.start();
        Thread.sleep(1000);
        store.stocktaking();
    }
}
