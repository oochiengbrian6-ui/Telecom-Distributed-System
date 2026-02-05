package events;

public class NodeFailureEvent extends Event {

    private String nodeId;

    public NodeFailureEvent(String nodeId) {
        super("NodeFailure");
        this.nodeId = nodeId;
    }

    @Override
    public void process() {
        System.out.println("Processing failure of node: " + nodeId);
    }
}
