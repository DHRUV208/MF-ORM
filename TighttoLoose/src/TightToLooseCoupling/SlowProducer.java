package TightToLooseCoupling;

public class SlowProducer implements IWorker{

    public void First() {
        System.out.println("This is a Slow Producer");
    }
    public void Second()
    {
        System.out.println("Second");
    }
}
