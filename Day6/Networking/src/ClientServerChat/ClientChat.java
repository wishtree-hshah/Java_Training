package ClientServerChat;
import java.io.*;
import java.net.*;

/**
 * Reads message from keyboard and sends it to server
 */
public class ClientChat {
    //manage connection with server
    private Socket socket;
    //for reading user input
    private DataInputStream input;
    //for sending data to the server
    private DataOutputStream output;

    public ClientChat(String address, int port) {
        try {
            //establish a connection with the server at the given address and port
            socket = new Socket(address, port);
            //to read user input from the console
            input = new DataInputStream(System.in);
            //to send data to the server through the socket
            output = new DataOutputStream(socket.getOutputStream());
            System.out.println("Connected to the server.");

            //variable message to store the user's input
            String message = "";
            //loops handles reading input from keyboard and sending
            // to server until the bye message detected
            while (!message.equals("bye")) {
                message = input.readLine();
                //Sends the user's message to the server using the DataOutputStream
                output.writeUTF(message);
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ClientChat("127.0.0.1", 5000);
    }
}

