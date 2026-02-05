# Telecom-Distributed-System
Distributed system simulation for a telecom network dataset.

For the provided dataset in table, the most efficient architecture would be Hierarchical Hybrid Model; consisting of three distinct tiers. This ensures that latency is minimized at the Edge while heavy processing is centralized in the Cloud

1. Architectural Tiers Edge Tier (Edge1, Edge2):
 Positioned closest to the data source which in my case would be users. These nodes handle immediate Remote Procedural Call requests. By processing at the edge, we respect the low-latency requirement (12, 15ms).
Core Tier (Core1, Core2): Acting as the regional backbone. These nodes have high throughput (950, 1000 Mbps) and are responsible for managing TransactionCommit events. They ensure data consistency before sending summarized reports to the Cloud.
Cloud Tier (Cloud1): The central processing hub. With 16 GB of RAM and 70% CPU capacity, it handles global analytics and long-term storage

2. Communication & Reliability
Message-Passing Mechanism:

 I'll use Asynchronous Event-Driven Communication. This is critical because Edge2, Core2, and Cloud1 are prone to NodeFailure. Using a message queue most instances RabbitMQ would be preferred to prevents the whole system from crashing if one node goes down.

Fault Tolerance: When a NodeFailure occurs at Core2, the Recovery event is triggered to restore state from the high-capacity Cloud1 node.
