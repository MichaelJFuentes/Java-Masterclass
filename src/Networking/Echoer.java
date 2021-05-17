package Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Echoer extends Thread {
    private Socket socket;

    public Echoer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            System.out.println("Connection Established " + this.socket.getPort());
            while (true) {
                String echoString = input.readLine();
                System.out.println("Received: " + echoString);
                if(echoString.equals("exit")) {
                    break;
                }
                try {
                    Thread.sleep(15000);
                } catch (InterruptedException e) {

                }
                System.out.println("Sending back: " + echoString);
                writer.println(echoString);
            }
        } catch (IOException e ) {
            System.out.println("Opps: " + e.getMessage());
        } finally {
            try {
                System.out.println("Closing connection");
                socket.close();
            } catch (IOException ioException) {

            }
        }
    }
}
