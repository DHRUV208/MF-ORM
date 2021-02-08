package com.ncu.applications;

public class Consumer {
    IWorker iw;

    public Consumer(IWorker iw) {
        this.iw = iw;
    }
    public void manageProducer()
    {
        iw.First();
    }

}
