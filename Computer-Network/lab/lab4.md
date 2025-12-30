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
* use ping commands 