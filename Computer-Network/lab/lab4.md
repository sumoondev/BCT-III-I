# Basic Router Configuration

## Objective
* To understand the basic concepts of routing configuration in a computer network.
* To configure two routers and establish communication between them.
* To assign IP address to router interfaces and connected end devices.

## Theory
### Router
- A router is a Layer 3 (Network Layer) device in the OSI model that connects two or more packet-switched networks or subnetworks.
- A router is a networking device that connects multiple networks (like your home Wi-Fi to the internet) and directs data traffic between them, acting as a central hub to send information (packets) to the right destination, enabling multiple devices to share a single internet connection and form a local network (LAN).
- Its primary role is to forward data packets between these networks by determining the most efficient path for information to travel. 
### Router Interfaces
- Routers use physical or logical interfaces (such as FastEthernet interfaces) to connect to other routers or end devices. Each interface must be:
	- Assigned a valid IP address and subnet mask
	- Enabled using the appropriate configuration commands

## Procedure

<img src="image/lab4.1.png" width=650px height="400px">
<p> Fig 4.1: Network Design</p>
<hr>

1. Network Topology Design
	- In Cisco Packet Tracer, port labels were enabled for clarity.
	- Two routers were placed and connected to each other using a straight-through cable.
	- Each router was connected to a PC through a separate interface.
2. Router 0 Configuration
	- Router 0 was accessed through the CLI.
	- From User exe mode, Privileged mode was entered and then to global configuration mode.
	- The router hostname was changed to Router0 and an enable secret password was set.
	- The FastEthernet interface connected to Router 02 was assigned an IP address in the same network:
	```
		- Router0(config-if)#	ip address 192.168.1.1 255.255.255.0
	```
	- Another FastEthernet interface was configured with a different IP address to connect a PC (PC0):
	```
		- Router0(config-if)# 	ip address 192.168.2.1 255.255.255.0
	```
	- Both interface were enabled and configuration was saved to NVRAM.
3. Router 1 Configuration
	- Router 1 was configured using similar steps.
	- The hostname was set to Router1 and secret password was configured.
	- The interface connecting to Router 0 was assigned an IP address within the same subnet:
	```
		- Router1(config-if)#	ip address 192.168.1.2 255.255.255.0
	```
	- Another FastEthernet interface was configured with a different IP address to connect a PC (PC1):
	```
		- Router1(config-if)# 	ip address 192.168.3.1 255.255.255.0
	```
	- Both interface were enabled and configuration was saved.
4. PC Configuration
	- Each PC were configured with a static IP address as below:
		- <ins>PC0</ins>
		```
			- ip address	 : 192.168.2.2
			- subnet mask	 : 255.255.255.0
			- default gateway: 192.168.2.1
		```
		- <ins>PC1</ins>
		```
			- ip address	 : 192.168.3.2
			- subnet mask	 : 255.255.255.0
			- default gateway: 192.168.3.1
		```
5. Testing and Verification
	- Connectivity between Router0 and PC0, and Router1 and PC1 was tested using ping command.
	- Router to Router configuration was verified using appropriate show command.

<!-- Not required in report -->

<!-- ## Procedure
*For better visualization, not required in report.*<br>
*1. press cltr + r*<br>
*2. [x] port label always show*<br>

<img src="image/lab4.1.png" width=650px height="400px">
<p>Fig 4.1: Network Design</p>
<hr>

1. Network Topology Setup
	- Design the network topology as shown above

2. Router01 configuration
```c
	Router> 												   // User executive mode
	Router> 			 	enable 					
	Router#													   // Privilege mode
	Router# 			 	configure terminal		
	Router(config)#											   // Global config mode
	Router(config)# 	 	hostname Router01 				   // Change host name
	Router01(config)# 	 	enable secret <password>		   // sets password

	// fa0/0 was provided in the label
	Router01(config)# 	 	interface fa0/0 					   
	Router01(config-if)#									   // interface mode

	// sets router ip address for router to router interfacing
	Router01(config-if)# 	ip address 192.168.1.1 255.255.255.0  

	Router01(config-if)# 	no shutdown						   // enable interfacing
	Router01(config-if)# 	ex								   // exit from the current mode
	Router01(config)#    	interface fa0/1					   // interfacing a PC

	// sets router ip address for router to pc interfacing
	Router01(config-if)# 	ip address 192.168.2.1 255.255.255.0  

	Router01(config-if)# 	no shutdown
	Router01(config-if)# 	ex
	Router01(config)#    	ex
	Router01#  			 	copy running-config startup-config // saves the config to NVRAM
	
	Router01#			 	show running-config				   // shows config
```
<hr>

3. Router02 configuration
```c
	Router> 			 	enable 					
	Router# 			 	configure terminal		
	Router(config)# 	 	hostname Router02 				   
	Router02(config)# 	 	enable secret <password>		   

	// fa0/0 was provided in the label
	Router02(config)# 	 	interface fa0/0 					   

	// sets router ip address for router to router interfacing
	Router02(config-if)# 	ip address 192.168.1.2 255.255.255.0  

	Router02(config-if)# 	no shutdown						   
	Router02(config-if)# 	ex								   
	Router02(config)#    	interface fa0/1					   // interfacing a PC

	// sets router ip address for router to pc interfacing
	Router02(config-if)# 	ip address 192.168.3.1 255.255.255.0  

	Router02(config-if)# 	no shutdown
	Router02(config-if)# 	ex
	Router02(config)#    	ex
	Router02#  			 	copy running-config startup-config // saves the config to NVRAM
	
	Router02#			 	show running-config				   // shows config
```
<hr>
*Note: Now the connection is established you can check using ping in cli*
<hr>

### PC 1 Configuration
* Set static IP 

### PC 1 Configuration
* Set static IP 

### Test using PC
* Using command Prompt
* use ping commands  -->