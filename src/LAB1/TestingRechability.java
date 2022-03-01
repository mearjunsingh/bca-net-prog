package LAB1;

import java.io.*;
import java.net.*;

public class TestingRechability {
    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getByName("localhost");

            if (ia.isReachable(100)) {
                System.out.println("Connection Established.");
            }

            NetworkInterface netif = NetworkInterface.getByName("eth0");

            if (ia.isReachable(netif, 400, 100)) {
                System.out.println("Connection Established.");
            }
        } catch (SocketException se) {
            System.out.println("Error Occured: " + se.getLocalizedMessage());
        } catch (IOException ie) {
            System.out.println("Error Occured: " + ie.getLocalizedMessage());
        }
    }
}
