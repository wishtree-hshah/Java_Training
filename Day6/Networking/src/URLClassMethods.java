import java.net.MalformedURLException;
import java.net.URL;

public class URLClassMethods {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com:80/path/to/resource");

            // print the string representation of the URL
            String s = url.toString();
            System.out.println("URL :" + s);

            // to get and print the protocol of the URL
            String protocol = url.getProtocol();
            System.out.println("Protocol : " + protocol);

            // to get and print the hostName of the URL
            String host = url.getHost();
            System.out.println("HostName : " + host);

            // to get and print the file name of the URL
            String fileName = url.getFile();
            System.out.println("File Name : " + fileName);


            // to get and print the default port of the URL
            int defaultPort = url.getDefaultPort();
            System.out.println("Default Port : " + defaultPort);

            // to get and print the path of the URL
            String path = url.getPath();
            System.out.println("Path : " + path);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

}
