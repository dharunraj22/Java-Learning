import java.net.Socket;
import java.net.ServerSocket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class ClientHandler extends Thread {
    private Socket clientSocket;

    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream())
            );
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);       

            String choice="0";
            boolean running = true;
            while (running) {
                switch (choice) {
                    case "0":
                        out.println("Welcome to the Bank!");
                        break;
                    case "1":
                        try{
                            sleep(1000);
                        }
                        catch(Exception e){
                            e.printStackTrace();;
                        }
                        out.println("Your balance is $10,000");
                        break;
                    case "2":
                        try{
                            sleep(2000);
                        }
                        catch(Exception e){
                            e.printStackTrace();;
                        }
                        out.println("Money transfer successful ✅");
                        break;
                    case "3":
                        try{
                            sleep(3000);
                        }
                        catch(Exception e){
                            e.printStackTrace();;
                        }
                        out.println("Transactions: Salary +5000, Rent -2000, Shopping -500");
                        break;
                    case "4":
                        out.println("Thank you for using our services");
                        running = false;
                        break;
                    default:
                        out.println("Invalid option ❌");
                }

                if (running) {
                    out.println("Choose an option:");
                    out.println("1. Check Balance");
                    out.println("2. Transfer Money");
                    out.println("3. View Transactions");
                    out.println("4. Quit");

                    choice = in.readLine();
                }
            }

            clientSocket.close();
        } catch (IOException e) {
            System.out.println("Client disconnected.");
        }
    }
}

public class BankBalance {
    static final int PORT = 9000;

    public static void main(String[] args){

        try(ServerSocket serverSocket = new ServerSocket(PORT) ){
            System.out.println("Server started.... Listening on port " + PORT);
            while(true){
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected: " + clientSocket.getInetAddress().getHostAddress());
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                clientHandler.start();
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
