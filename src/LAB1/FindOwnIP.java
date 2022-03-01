package LAB1;

import java.net.*;

public class FindOwnIP {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("localhost");
            System.out.println("Own IP: " + address.getHostAddress());
        } catch (UnknownHostException ua) {
            System.out.println("Error Occurred: " + ua.getLocalizedMessage());
        }
    }
}
