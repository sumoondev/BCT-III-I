# Introduction

## Computer Network
- Computer Network is a collection of computer or any other devices(nodes) that are connected to each other in a common network protocal for the transmission or sharing of resource and information to each other over a network medium.

### <ins>Importance:</ins>
- Cost efficiency
- Resource sharing
- Data management
- Scalability
- Flexibility
- Enhanced Security
- Reliability

### <ins>Use:</ins>
- **Business Application**
    - Suppose a data is stored in a single powerful computer called servers.
    - The employees access those data and information via their own computer called clients.
    - Here, the client pc sends a request over the network medium to the server requesting the access to specific information/resource and after some server processing the server replies to client in accordingly. (either give access or deny as per the privilege)
- **Home Application**
    - Here, multiple personal devices can be connected to same network and access data.
    - This can also be used for Person-to-Person communication.
    - Interactive Entertainment.

## Types of Computer Network
- **Local Area Network**
    - Local Area Network, generally called LANs, are privately-owned network and covers buildings, campus and can cover upto few kilometers in size.
    - Suppose in a bus network, at most one device is the master and capable of transmitting resources and in the mean time other devices are refrained or restricted from sending.
- **Metropolitan Area Network** 
    - Metropolitan Area Network are the collection of LAN networs almost covering a whole city, ranging upto 50kms.
    ```
            School LAN     Hospital LAN
                      \   /   
                       MAN
                      /   \
           Factory LAN     College LAN
    ```
- **Wide Area Network**
    - Collection of multiple LANs and MANs is Wide Area Network.
    - One of the largest example of WAN is Internet.
    - Its range is not limited, it can range from Country to Continent and upto everything like Internet.

## Network Topology
- The physical arrangement of computer or network devies (nodes), which is connected to each other is called network topology.

### <ins>Types</ins>
- **Bus Topology**
    - In bus topology, one single cable act as a network transmission medium and all the devices are connected to this channel.
    ```
            PC1             PC3             PC5
             |               |               |
            -----------------------------------
                     |               |
                    PC2             PC4
    ```
- **Ring Topology**
    ```
                       PC1
                      /   \
                    PC2    PC3
                      \   /
                       PC4
    ```
- **Star Topology**
    ```
                        PC1
                         |
               PC2--Switch/HUB--PC3
                         |
                        PC4
    ```
- **Point to Point**
    ```
            PC1------------------PC2
    ```
- **Mesh Topology**
    - Point-to-Point in Ring Topology, where each and every devices are directly connected, allowing private message.
- **Hybrid Topology**
    - Combination of multiple types of above mentioned topologies.
- **Tree Topology**
    - Combination of bus and start topology.

## Network Architecture
- Network Architecture, it is the network layout which tells us how computers are arranged and tasks are allocated to the computers.
### <ins>Types</ins>
- **Peer to Peer architecture**
    - It is also known as point to point network in which all the computers are directly linked to each other with equal privilege and responsibility for sharing of data.
    - No server.
    ```
                        PC1
                      /  |  \
                    PC2--|--PC3
                      \  |  /
                        PC4 
    ```
    - <b>Advantages</b>
        - It is a cheaper network as it has no server.
        - If one computer stops working, there is little to no harm to remaining system.
        - Its setup and maintainance is so very easy.
    - <b>Disadvantage</b>
        - Security Issues.
        - We cannot backup the data as there is no server in this network.
- **Client-Server architecture**
    - It is also known as request-response architecture.
    - Client requests the server, and server fulfills the response as designed.
    ```
                         Server
                       /   |   \   ...
                      /    |    \   ...
                    PC1   PC2   PC3  ...
    ```
    - <b>Advantages</b>
        - It has a centralized system(server) so here data can be easily backed up.
        - Security is better in this network.
        - Entire system is maintained by the server.
        - It also increase the speed of the resource sharing.
    - <b>Disadvantage</b>
        - In case of server failure, entire network will be failed.
        - Maintaining server is very costly.

## Protocols and Standards
- Protocols are *set of rules* that are used in digital communication to connect network devices and exchange information between them. 
- Protocols determine the format, timing, sequencing, and error control in data communication.
- Without protocols, receiver cannot informatively read the data being sent by the sender. (not able to rebuild the actual information)
- **Protocols control following aspects:**
    - How the Physical connection is built
    - How computers are connected to the network
    - How are data formatted for transmission
    - How that data is sent
    - How to deal with error
- These network rules are created and maintained by many different organizations and committees. Included in these groups are the *Institute of Electrical and Electronic Engineers (IEEE)*, *American National Standards Institute (ANSI)*, *Telecommunications Industry Association (TIA)*, *Electronic Industries Alliance (EIA)* and the *International Telecommunications Union (ITU)*.
- eg:
    - TCP/IP    *Note: TCP creates connection, IP used for communication of data*
    - HTTP
    - SMTP
    - FTP
    - POP

## OSI(Open Systems Interconnection) Reference model 
- This model is a framework that is used to understand how information travels throughout a network.
- This model explains how packets travel throught various layers to another device on the network, even if the sender and receiver have different type of network media.
```
     Application Layer
            |
    Presentation Layer
            |
       Session Layer
            |
      Transport Layer
            |
       Network Layer
            |
      Data Link Layer
            |
      Physical Layer
```
- **Layer 1 (Physical Layer)**
    - Handles the transmission of raw bits over the physical medium
    - Defines the type of cable (UTP, STP, fiber, coaxial) and their physical property
    - Specifies connectors and other physical interface
    - Determines the voltage level used to represent data
    - Defines the data rate for transmission
    - Protocol Data Unit(PDU): Bit
- **Layer 2 (Data Link Layer)**
    - It is a direct link control on the network
    - Provides reliable data transfer over the link
    - Physical addressing
    - Network topology
    - Error notification and flow control
    - Protocol Data Unit(PDU): Frame
- **Layer 3 (Network Layer)**
    - Network address
    - Best path determination
    - Data transmission between subnet
    - Protocol Data Unit(PDU): Packet
- **Layer 4 (Transport Layer)**
    - End to End connection
    - Process are addressed 
    - Transportation issue between the host
    - Reliable data transfer between the host
    - Establish connection between the host
    - Error detection and recovery
    - Protocol Data Unit: Segement
- **Layer 5 (Session Layer)**
    - Maintains user's session
    - Token management
    - Track all the event through the use
    - Establish and terminate session
    - Handles the exchange of information to initiate dialogs, keep them active and to restart sessions
    - PDU: Data
- **Layer 6 (Presentation Layer)**
    - Data representation
    - Makes sure the data is readable to the application
    - Format data
    - Data structure selection
    - Helps application to interpret data: encryption, compression,etc.
    - PDU: Data
- **Layer 7 (Application Layer)**
    - Network application program generate data streams on the network
    - Application donot need to control code devices
    - Provide different network services to the user
    - Email, http, www, smtp, etc.
    - PDU: Data 