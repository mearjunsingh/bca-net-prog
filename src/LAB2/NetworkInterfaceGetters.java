package LAB2;

import java.net.*;
import java.util.*;

public class NetworkInterfaceGetters {
    public static void main(String[] args) throws SocketException, UnknownHostException {
        NetworkInterface ni = NetworkInterface.getByName("lo");
        if (ni == null) {
            System.out.println("No such interface.");
        } else {
            System.out.println(ni);
        }

        InetAddress ia = InetAddress.getByName("localhost");
        NetworkInterface ni2 = NetworkInterface.getByInetAddress(ia);
        if (ni2 == null) {
            System.out.println("No local loopback address.");
        } else {
            System.out.println(ni2);
        }

        Enumeration<NetworkInterface> allInterface = NetworkInterface.getNetworkInterfaces();
        while (allInterface.hasMoreElements()) {
            NetworkInterface ni3 = allInterface.nextElement();
            System.out.println(ni3);
        }

        NetworkInterface ni4 = NetworkInterface.getByIndex(4);
        System.out.println(ni4);
    }
}
