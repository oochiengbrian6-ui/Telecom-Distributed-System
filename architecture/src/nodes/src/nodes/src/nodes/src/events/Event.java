package events;

public abstract class Event {

    protected String eventType;

    public Event(String eventType) {
        this.eventType = eventType;
    }

    public abstract void process();
}
