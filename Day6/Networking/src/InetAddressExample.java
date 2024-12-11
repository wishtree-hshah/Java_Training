import java.net.*;

public class InetAddressExample {

    public static void main(String[] args) {
        try {
            InetAddress yahooAddress = InetAddress.getByName("yahoo.com");
            System.out.println("Inet Address of yahoo.com: " + yahooAddress);

            // Get and print all InetAddresses of a host (yahoo.com)
            InetAddress[] yahooAddresses = InetAddress.getAllByName("yahoo.com");
            System.out.println("\nAll Inet Addresses of yahoo.com:");
            for (InetAddress address : yahooAddresses) {
                System.out.println(address);
            }

            // Get and print the local machine's InetAddress (localhost)
            InetAddress localAddress = InetAddress.getLocalHost();
            System.out.println("\nInet Address of Local Host: " + localAddress);

        } catch (UnknownHostException e) {
            System.out.println("Unable to find host.");
            e.printStackTrace();
        }
    }
}
