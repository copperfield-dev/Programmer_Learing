import javax.swing.*;
import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by copperfield on 11/12/2016.
 */
public class AppletClient extends JApplet {
    private JLabel jlblCount = new JLabel();
    
    private boolean isStandAlone = true;
    
    private String host = "192.168.1.102";
    
    public void init() {
        
        add(jlblCount);
        
        try {
            Socket socket;
            if (isStandAlone)
                socket = new Socket(host, 8000);
            else
                socket = new Socket(getCodeBase().getHost(), 8000);
            System.out.println(socket.isConnected());
    
            DataInputStream inputFromServer = new DataInputStream(socket.getInputStream());
            
            int count = inputFromServer.readInt();
            jlblCount.setText("You are visitor number " + count);
            
            inputFromServer.close();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Applet CLient");
        
        AppletClient appletClient = new AppletClient();
        appletClient.isStandAlone = true;
        
        if (args.length == 1) appletClient.host = args[0];
        
        frame.getContentPane().add(appletClient, BorderLayout.CENTER);
        
        appletClient.init();
        appletClient.start();
        
        frame.pack();
        frame.setVisible(true);
    }
}
