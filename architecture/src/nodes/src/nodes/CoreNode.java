package nodes;

public class CoreNode extends Node {

    public CoreNode(String nodeId, int latency, int throughput,
                    double packetLoss, int cpuUsage, double memory) {
        super(nodeId, latency, throughput, packetLoss, cpuUsage, memory);
    }

    @Override
    public void handleRequest(String request) {
        System.out.println(nodeId + " routing request: " + request);
        System.out.println("Coordinating transaction commit...");
    }

    public void handleFailure(String failedNode) {
        System.out.println("Core handling failure of node: " + failedNode);
    }
}
