package nodes;

public class CloudNode extends Node {

    public CloudNode(String nodeId, int latency, int throughput,
                     double packetLoss, int cpuUsage, double memory) {
        super(nodeId, latency, throughput, packetLoss, cpuUsage, memory);
    }

    @Override
    public void handleRequest(String request) {
        System.out.println(nodeId + " processing heavy computation: " + request);
        System.out.println("Returning response to Core layer...");
    }
}
