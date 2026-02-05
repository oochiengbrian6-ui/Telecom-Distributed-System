import nodes.*;
import messaging.RPCService;

public class Main {

    public static void main(String[] args) {

        EdgeNode edge1 = new EdgeNode("Edge1", 12, 500, 0.2, 40, 4);
        CoreNode core1 = new CoreNode("Core1", 8, 1000, 0.1, 60, 8);
        CloudNode cloud1 = new CloudNode("Cloud1", 20, 1200, 0.3, 70, 16);

        RPCService.sendRequest(edge1, core1, "Client RPC Call");
        RPCService.sendRequest(core1, cloud1, "Process Transaction");
    }
}
