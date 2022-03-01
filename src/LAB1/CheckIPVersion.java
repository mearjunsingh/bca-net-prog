package LAB1;

import java.net.*;

public class CheckIPVersion {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia = InetAddress.getByName("localhost");
        byte[] address = ia.getAddress();

        if (address.length == 4) {
            System.out.println("IPv4");
        } else if (address.length == 6) {
            System.out.println("IPv6");
        } else {
            System.out.println("Unknown");
        }
    }
}
