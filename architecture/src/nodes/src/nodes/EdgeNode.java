package nodes;

public class EdgeNode extends Node {

    public EdgeNode(String nodeId, int latency, int throughput,
                    double packetLoss, int cpuUsage, double memory) {
        super(nodeId, latency, throughput, packetLoss, cpuUsage, memory);
    }

    public void handleRequest(String request) {
        System.out.println(nodeId + " received client request: " + request);
        System.out.println("Forwarding request to Core layer...");
    }
}
