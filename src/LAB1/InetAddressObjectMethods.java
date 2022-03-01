package LAB1;

import java.net.*;

public class InetAddressObjectMethods {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("localhost");
        InetAddress address2 = InetAddress.getByName("127.0.0.1");

        if (address.equals(address2)) {
            System.out.println("They both are equal");
        }

        System.out.println(address.hashCode());
        System.out.println(address.toString());
    }
}
