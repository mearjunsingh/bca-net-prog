package LAB1;

import java.net.*;

public class IPCharacteristics {
    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getByName("127.0.0.1");
            if (ia.isAnyLocalAddress()) {
                System.out.println(ia + " is local address.");
            }
            if (ia.isLoopbackAddress()) {
                System.out.println(ia + " is loop back address");
            }
            if (ia.isLinkLocalAddress()) {
                System.out.println(ia + " is link local address.");
            }
            if (ia.isSiteLocalAddress()) {
                System.out.println(ia + " is site local address.");
            }
            if (ia.isMulticastAddress()) {
                System.out.println(ia + " is multicast address.");
            }
            if (ia.isMCGlobal()) {
                System.out.println(ia + " is multicast global address.");
            }
            if (ia.isMCNodeLocal()) {
                System.out.println(ia + " is multicast node local address.");
            }
            if (ia.isMCLinkLocal()) {
                System.out.println((ia + " is multicast link local address"));
            }
            if (ia.isMCSiteLocal()) {
                System.out.println(ia + " is multicast site local address.");
            }
            if (ia.isMCOrgLocal()) {
                System.out.println(ia + " is multicast organization local address.");
            }
        } catch (UnknownHostException ue) {
            System.out.println("Error Occurred: " + ue.getLocalizedMessage());
        }
    }
}
