import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;

/**
 * Created by copperfield on 10/12/2016.
 */
public class Client extends JFrame {
    private JTextField jtf = new JTextField();
    private JTextArea jta = new JTextArea();
    
    private DataOutputStream toServer;
    private DataInputStream fromServer;
    
    public static void main(String[] args) {
        new Client();
    }
    
    public Client() {
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(new Label("Enter radius"), BorderLayout.WEST);
        p.add(jtf, BorderLayout.CENTER);
        jtf.setHorizontalAlignment(JTextField.RIGHT);
        
        setLayout(new BorderLayout());
        add(p, BorderLayout.NORTH);
        add(new JScrollPane(jta), BorderLayout.CENTER);
        
        jtf.addActionListener(new TextFieldListener());
        
        setTitle("Client");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        try {
            Socket socket = new Socket("localhost", 8000);
            System.out.println(socket.isConnected());
            
            fromServer = new DataInputStream(socket.getInputStream());
            toServer = new DataOutputStream(socket.getOutputStream());
        } catch (IOException ex) {
            jta.append(ex.toString() + '\n');
        }
    }
    
    private class TextFieldListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double radius = Double.parseDouble(jtf.getText().trim());
                
                toServer.writeDouble(radius);
                toServer.flush();
                
                double area = fromServer.readDouble();
                
                jta.append("Radius is " + radius + "\n");
                jta.append("Area received from the server is " + area + '\n');
                
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
