package LAB1;

import java.net.*;

public class InetAdressGetters {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("127.0.0.1");
        System.out.println(address);

        InetAddress[] allAddress = InetAddress.getAllByName("localhost");
        for (InetAddress address2 : allAddress) {
            System.out.println(address2);
        }

        InetAddress address3 = InetAddress.getLocalHost();
        System.out.println(address3);

        InetAddress address4 = InetAddress.getLoopbackAddress();
        System.out.println(address4);

        byte[] addr = { 107, 23, (byte) 216, (byte) 196 };
        InetAddress address5 = InetAddress.getByAddress(addr);
        InetAddress address6 = InetAddress.getByAddress("lesswrong.com", addr);
        System.out.println(address5);
        System.out.println(address6);

        System.out.println(address.getAddress());
        System.out.println(address.getHostAddress());
        System.out.println(address.getCanonicalHostName());
        System.out.println(address.getHostName());
    }
}
