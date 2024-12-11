package ClientServerChat;

import java.io.*;
import java.net.*;

/**
 * Reads message coming from client
 */
public class ServerChat {
    //to listen for incoming client connections
    private ServerSocket serverSocket;
    //connection between the server and the client
    private Socket socket;
    //object for reading data from the client
    private DataInputStream input;

    public ServerChat(int port) {
        try {
            //server will listen for incoming client connections on this port
            serverSocket = new ServerSocket(port);
            System.out.println("Server started. Waiting for a client...");
            //blocks and waits for an incoming client connection
            socket = serverSocket.accept();
            System.out.println("Client connected.");
            //to read data from the client
            input = new DataInputStream(socket.getInputStream());

            String message = "";
            while (!message.equals("bye")) {
                //Reads the message sent by the client using readUTF()
                message = input.readUTF();
                System.out.println("Client says: " + message);
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ServerChat(5000);
    }
}
