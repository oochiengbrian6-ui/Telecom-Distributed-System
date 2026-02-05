package nodes;

public abstract class Node {

    protected String nodeId;
    protected int latency;
    protected int throughput;
    protected double packetLoss;
    protected int cpuUsage;
    protected double memory;

    public Node(String nodeId, int latency, int throughput,
                double packetLoss, int cpuUsage, double memory) {
        this.nodeId = nodeId;
        this.latency = latency;
        this.throughput = throughput;
        this.packetLoss = packetLoss;
        this.cpuUsage = cpuUsage;
        this.memory = memory;
    }

    public String getNodeId() {
        return nodeId;
    }

    public abstract void handleRequest(String request);
}
