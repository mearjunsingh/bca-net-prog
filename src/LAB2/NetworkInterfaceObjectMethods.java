package LAB2;

import java.net.*;
import java.util.*;

public class NetworkInterfaceObjectMethods {
    public static void main(String[] args) throws UnknownHostException, SocketException {
        NetworkInterface ni = NetworkInterface.getByName("lo");

        InetAddress ia = InetAddress.getByName("localhost");
        NetworkInterface ni2 = NetworkInterface.getByInetAddress(ia);

        if (ni.equals(ni2)) {
            System.out.println("They both are equal");
        }

        System.out.println(ni.getDisplayName());
        System.out.println(ni.getHardwareAddress());
        System.out.println(ni.getIndex());
        System.out.println(ni.getMTU());
        System.out.println(ni.getName());
        System.out.println(ni.hashCode());
        System.out.println(ni.toString());

        Enumeration<InetAddress> ia2 = ni.getInetAddresses();
        while (ia2.hasMoreElements()) {
            System.out.println(ia2.nextElement());
        }

        Enumeration<NetworkInterface> ni3 = ni.getSubInterfaces();
        while (ni3.hasMoreElements()) {
            System.out.println(ni3.nextElement());
        }

        List<InterfaceAddress> allInterfaceAddress = ni.getInterfaceAddresses();
        for (InterfaceAddress ifa : allInterfaceAddress) {
            System.out.println(ifa);
        }

        NetworkInterface ni4 = ni.getParent();
        System.out.println(ni4);
    }
}
