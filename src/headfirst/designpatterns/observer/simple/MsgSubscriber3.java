package headfirst.designpatterns.observer.simple;

public class MsgSubscriber3 implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberThree :: " + m.getMessageContent());
    }

}
