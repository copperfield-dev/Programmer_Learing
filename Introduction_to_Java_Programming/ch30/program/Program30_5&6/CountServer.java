import java.io.DataOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by copperfield on 11/12/2016.
 */
public class CountServer {
    private RandomAccessFile raf;
    private int count;
    
    public static void main(String[] args) {
        new CountServer();
    }
    
    public CountServer() {
        try {
            ServerSocket serverSocket = new ServerSocket(8000);
            System.out.println("Server start");
            
            raf = new RandomAccessFile("count.dat", "rw");
            
            if (raf.length() == 0)
                count = 0;
            else
                count = raf.readInt();
            
            while (true) {
                Socket socket = serverSocket.accept();
    
                DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());
                count++;
                outputToClient.writeInt(count);
                
                raf.seek(0);
                raf.writeInt(count);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

