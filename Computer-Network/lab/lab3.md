# DNS AND WEB SERVER

## OBJECTIVE
* To understand the working principles of Domain Name System (DNS) and Web Server (HTTP) in a computer network.
* To configure and simulate DNS and Web server services.
* To understand how client PCs access a web server using a domain name instead of an IP address.

## THEORY

### Domain Name System (DNS)
- DNS is a hierarchical and distributed naming system that translates human-readable domain names (e.g., www.example.com) into machine-readable IP addresses. Without DNS, users would need to remember numerical IP addresses to access network services.
- DNS follows a client–server model, where a client sends a query to a DNS server requesting the IP address associated with a particular domain name.
- **DNS Record**
    - DNS records are entries stored in a DNS server database that define how domain names are mapped and resolved. Common DNS record types include:
        * A (Address) Record: Maps a domain name to an IPv4 address.
        * CNAME (Canonical Name) Record: Maps one domain name to another domain name.
        * MX (Mail Exchange) Record: Specifies mail servers responsible for receiving email for a domain.
        * NS (Name Server) Record: Identifies the authoritative DNS servers for a domain.

### Web Server
- A web server is a system that hosts web content and delivers it to clients over a network using the Hypertext Transfer Protocol (HTTP). 
- When a client requests a webpage, the web server processes the request and sends the requested resource, such as an HTML page, back to the client.


## PROCEDURE
1. Network Topology Design
    - Open Cisco Packet Tracer
    - Create a star topology using following devices:
        - One 24-port Switch
        - One Server (DHCP Server)
        - One Server (DNS Server)
        - One Server (Web Server)
        - Five Client PCs
    - Connect all devices to the switch using copper straight-through cables.
2. DHCP Server Configuration
    - Assign a static IP address to the DHCP server.
    ```
        DHCP Server -> 192.168.10.1 / 255.255.255.0
    ```
    - Enable the DHCP service.
    - Configure a DHCP pool with:
    ```
        - Starting IP Address : 192.168.10.2
        - Subnet Mask         : 255.255.255.0
        - Default Gateway     : 192.168.10.1
        - DNS server          : 192.168.10.20
    ```
    - Save the configuration.
3. Web Server Configuration
    - Assign a static IP address to the Web server.
    ```
        Web Server -> 192.168.10.10 / 255.255.255.0
    ```
    - Set default gateway as 192.168.10.1
    - Enable the HTTP server
    - Modify the default web page
4. DNS Server COnfiguration
    - Assign a static IP address to the DNS server.
    ```
        DNS Server -> 192.168.10.20 / 255.255.255.0
    ```
    - Enable the DNS server
    - Create a DNS record mapping a domain name:
    ```c
        Name    : example.com           Type : A Record
        Address : 192.168.10.10 //IP of web server
    ```
5. Verify each PC received valid IP address, subnet mask, default gateway, and DNS server address automatically via DHCP server.
6. Testing
    - From a PC, open a web browser and access the website using the domain name set or configured in DNS server.
    - Confirm successful name resolution and web page loading.