package UDP;

import java.net.*;
import java.util.Scanner;

/**
 * Main method to run the client application
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // Creating a DatagramSocket to send and receive packets via UDP.
        DatagramSocket clientSocket = new DatagramSocket();
        //Getting the IP address of the server. '127.0.0.1' refers to localhost.
        InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
        // Buffer to hold the data being sent.
        byte[] sendBuffer;
        //Buffer to hold the data being received, with a size of 1024 bytes.
        byte[] receiveBuffer = new byte[1024];
        // Creating a scanner to read user input from the console.
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter message: ");
            String message = scanner.nextLine();
            // Converting the message string to bytes for sending via UDP
            sendBuffer = message.getBytes();
            // Creating a DatagramPacket to send the data to the server at port 12345.
            DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, serverAddress, 12345);
            // Sending the packet to the server.
            clientSocket.send(sendPacket);

            // Exit condition for client
            if (message.equalsIgnoreCase("exit")) {
                System.out.println("Client shutting down.");
                break;
            }

            // Receive response from the server
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            clientSocket.receive(receivePacket);
            // Converting the received data bytes into a string.
            String received = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Server: " + received);

            // Exit condition for server
            if (received.equalsIgnoreCase("exit")) {
                System.out.println("Server disconnected.");
                break;
            }
        }

        clientSocket.close();
        scanner.close();
    }
}
