package headfirst.designpatterns.observer.simple;

public class Main {
	public static void main(String[] args) 
    {
        MsgSubscriber1 s1 = new MsgSubscriber1();
        MsgSubscriber2 s2 = new MsgSubscriber2();
        MsgSubscriber3 s3 = new MsgSubscriber3();
         
        MsgPublisher p = new MsgPublisher();
         
        p.attach(s1);
        p.attach(s2);
         
        p.notifyUpdate(new Message("First Message"));   //s1 and s2 will receive the update
         
        p.detach(s1);
        p.attach(s3);
         
        p.notifyUpdate(new Message("Second Message")); //s2 and s3 will receive the update
    }
}
