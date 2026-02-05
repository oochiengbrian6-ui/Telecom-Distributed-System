# Distributed Telecom Network Architecture

1. Introduction
This document contains entire elaboration on the engineered distributed system architecture for a telecom
network consisting of multiple heterogeneous nodes. The architecture is designed
based on the provided dataset, which includes performance metrics such as latency,
throughput, packet loss, CPU usage, memory capacity, and system events.

The goal of the architecture is to efficiently connect all nodes to establish 
low latency, high throughput, fault tolerance, and scalability.


 2. Node Classification
Based on functional roles and performance characteristics, i calssified the nodes 
into three architectural layers:

- Edge Nodes: Edge1, Edge2
- Core Nodes: Core1, Core2
- Cloud Node: Cloud1

This  enables logical separation of responsibilities and efficient
resource utilization.


3. Layered Architecture Design

3.1 Edge Layer
The edge layer consists of Edge1 and Edge2. These nodes serve as the entry point
for client requests into the system.

Key Responsibilities worth notying:
- Accept Remote Procedure Call (RPC) requests from clients
- Perform lightweight request validation
- Forward requests to the core layer
- Return responses back to clients

Edge nodes are optimized for low latency and are positioned close to end users,
making them suitable
