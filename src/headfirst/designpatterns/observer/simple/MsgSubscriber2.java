package headfirst.designpatterns.observer.simple;

public class MsgSubscriber2 implements Observer {
	@Override
    public void update(Message m) {
        System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());
    }
}
