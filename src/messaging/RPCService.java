package messaging;

import nodes.Node;

public class RPCService {

    public static void sendRequest(Node sender, Node receiver, String request) {
        System.out.println(sender.getNodeId() + " sending RPC to " + receiver.getNodeId());
        receiver.handleRequest(request);
    }
}
