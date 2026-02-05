 Performance Bottlenecks Analysis and Justification

 1. Introduction
This section identifies and prioritizes performance bottlenecks in the distributed
telecom network using latency, throughput, packet loss, CPU utilization, and memory
metrics from the dataset. Mathematical reasoning is applied to justify each bottleneck.

 3. Bottleneck Identification Criteria

A node is considered a bottleneck if it satisfies one or more of the following:
- High latency
- Low throughput relative to traffic demand
- High packet loss
- High CPU utilization
- Limited memory resources


 4. Bottleneck Analysis

 4.1 Edge Layer Bottleneck (Edge2)

Observation:
- Edge2 has the highest packet loss (0.5%)
- Lower throughput compared to Edge1

Mathematical Justification:

Effective Throughput = Throughput × (1 − Packet Loss)

For Edge2:
Effective Throughput = 480 × (1 − 0.005)  
Effective Throughput ≈ 477.6 Mbps

For Edge1:
Effective Throughput = 500 × (1 − 0.002)  
Effective Throughput ≈ 499 Mbps

Since Edge2 delivers lower effective throughput, it becomes a bottleneck during
high request volumes.


4.2 Core Layer Bottleneck (Core2)

Observation:
- Core2 has lower throughput than Core1
- Handles routing and transaction coordination

Justification:

Let total incoming traffic from edges be T.

If T > 950 Mbps, Core2 experiences congestion while Core1 remains stable up to
1000 Mbps.

Thus, Core2 becomes the first core-layer bottleneck under peak load.

---

 4.3 Cloud Layer Bottleneck (Cloud1) – PRIMARY BOTTLENECK

Observation:
- Highest latency (20 ms)
- Highest CPU utilization (70%)
- Single cloud node handling all heavy computation

Mathematical Justification:

Using Little’s Law:
L = λ × W

Where:
- L = average number of requests in system
- λ = arrival rate
- W = response time (latency)

As Cloud1 latency increases, W increases, causing L to grow rapidly.
At high arrival rates, this leads to request queuing and increased response times.

High CPU usage (70%) further limits processing capacity, making Cloud1 the dominant
system bottleneck.

6. Conclusion
The cloud layer is the most critical performance bottleneck due to centralized
processing and high resource utilization. Core and edge bottlenecks emerge under
increased traffic loads. Addressing cloud scalability and core load balancing would
significantly improve overall system performance.
