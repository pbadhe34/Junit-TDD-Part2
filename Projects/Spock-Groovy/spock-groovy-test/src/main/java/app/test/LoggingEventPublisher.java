package app.test;

public class LoggingEventPublisher implements EventPublisher {

    @Override
    public void publish(String addedOfferId) {
        System.out.println("I've published: " + addedOfferId);
    }

}
