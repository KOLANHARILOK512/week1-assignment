package headfirst.designpatterns.observer.simple;

public class MsgSubscriber1 implements Observer {
	@Override
    public void update(Message m) {
        System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
    }
}
