package TightToLooseCoupling;

public class Test {
    public static void main(String [] args)
    {
        IWorker iworker = Factory.getObject();

        Consumer consumer = new Consumer(iworker);
        consumer.manageProducer();
    }
}
