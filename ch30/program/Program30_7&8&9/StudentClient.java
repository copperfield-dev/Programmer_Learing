import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Created by copperfield on 12/12/2016.
 */
public class StudentClient extends JApplet {
    private JTextField jtfName = new JTextField(32);
    private JTextField jtfStreet = new JTextField(32);
    private JTextField jtfCity = new JTextField(20);
    private JTextField jtfState = new JTextField(2);
    private JTextField jtfZip = new JTextField(5);
    
    private JButton jbtRegister = new JButton("Register to the Server");
    
    private boolean isStandAlone = false;
    
    String host = "127.0.0.1";
    
    public void init() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3,1));
        p1.add(new JLabel("Name"));
        p1.add(new JLabel("Street"));
        p1.add(new JLabel("City"));
        
        JPanel jpState = new JPanel();
        jpState.setLayout(new BorderLayout());
        jpState.add(new JLabel("State"), BorderLayout.WEST);
        jpState.add(jtfState, BorderLayout.CENTER);
        
        JPanel jpZip = new JPanel();
        jpZip.setLayout(new BorderLayout());
        jpZip.add(new JLabel("Zip"), BorderLayout.WEST);
        jpZip.add(jtfZip, BorderLayout.CENTER);
        
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.add(jpState, BorderLayout.WEST);
        p2.add(jpZip, BorderLayout.CENTER);
        
        JPanel p3 = new JPanel();
        p3.setLayout(new BorderLayout());
        p3.add(jtfCity, BorderLayout.CENTER);
        p3.add(p2, BorderLayout.EAST);
        
        JPanel p4 = new JPanel();
        p4.setLayout(new GridLayout(3,1));
        p4.add(jtfName);
        p4.add(jtfStreet);
        p4.add(p3);
        
        JPanel studentPanel = new JPanel(new BorderLayout());
        studentPanel.setBorder(new BevelBorder(BevelBorder.RAISED));
        studentPanel.add(p1, BorderLayout.WEST);
        studentPanel.add(p4, BorderLayout.CENTER);
        
        add(studentPanel, BorderLayout.CENTER);
        add(jbtRegister, BorderLayout.SOUTH);
        
        jbtRegister.addActionListener(new ButtonListener());
        
        if (!isStandAlone)
            host = getCodeBase().getHost();
    }
    
    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Socket socket = new Socket(host, 8000);
    
                ObjectOutputStream toServer = new ObjectOutputStream(socket.getOutputStream());
                
                String name = jtfName.getText().trim();
                String street = jtfStreet.getText().trim();
                String city = jtfCity.getText().trim();
                String state = jtfState.getText().trim();
                String zip = jtfZip.getText().trim();
                
                StudentAddress studentAddress = new StudentAddress(name, street, city, state, zip);
                toServer.writeObject(studentAddress);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Register Student Client");
        
        StudentClient applet = new StudentClient();
        applet.isStandAlone = true;
        
        if (args.length == 1) applet.host = args[0];
        
        frame.add(applet, BorderLayout.CENTER);
        
        applet.init();
        applet.start();
        
        frame.pack();
        frame.setVisible(true);
    }
}
