package UDP;

import java.net.*;
import java.util.Scanner;

/**
 * Main method to execute the server program
 */
public class Server {
    public static void main(String[] args) throws Exception {
        // Create a DatagramSocket bound to port 12345 to receive and send UDP packets
        DatagramSocket serverSocket = new DatagramSocket(12345);
        System.out.println("UDP Server is running...");
        //Buffer to store incoming message from client
        byte[] receiveBuffer = new byte[1024];
        //Buffer to store outgoing message to client
        byte[] sendBuffer;
        // Scanner to take server's response input from the console.
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Receive data from the client
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            // Wait to receive a packet from the client.
            serverSocket.receive(receivePacket);
            // Extract the received data as a string.
            String received = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Client: " + received);

            // Exit condition for client
            if (received.equalsIgnoreCase("exit")) {
                System.out.println("Client disconnected.");
                break;
            }

            // Send response to the client
            System.out.print("Enter response: ");
            String response = scanner.nextLine();
            // Convert the response string to bytes for sending.
            sendBuffer = response.getBytes();
            // Create a DatagramPacket to send the response to the client.
            DatagramPacket sendPacket = new DatagramPacket(
                    sendBuffer, sendBuffer.length, receivePacket.getAddress(), receivePacket.getPort());
            serverSocket.send(sendPacket);

            // Exit condition for server
            if (response.equalsIgnoreCase("exit")) {
                System.out.println("Server shutting down.");
                break;
            }
        }

        serverSocket.close();
        scanner.close();
    }
}
