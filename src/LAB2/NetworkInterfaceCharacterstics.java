package LAB2;

import java.net.*;

public class NetworkInterfaceCharacterstics {
    public static void main(String[] args) {
        try {
            NetworkInterface ni = NetworkInterface.getByName("lo");

            if (ni.isLoopback()) {
                System.out.println(ni + " is loop back interface.");
            }
            if (ni.isPointToPoint()) {
                System.out.println(ni + " is point to point interface.");
            }
            if (ni.isUp()) {
                System.out.println(ni + " is up and running.");
            }
            if (ni.isVirtual()) {
                System.out.println(ni + " is virtual interface.");
            }
            if (ni.supportsMulticast()) {
                System.out.println(ni + " does support multicast.");
            }
        } catch (SocketException ue) {
            System.out.println("Error Occurred: " + ue.getLocalizedMessage());
        }
    }
}
