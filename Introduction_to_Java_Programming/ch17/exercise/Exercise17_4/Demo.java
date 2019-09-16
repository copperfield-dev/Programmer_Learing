import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import java.io.*;
import java.util.*;

public class Demo extends JFrame { 
  private JPanel panel= new JPanel();
  private JTextField jtfFileAddress = new JTextField();
  private JTextArea jtaArticle = new JTextArea();
  private JButton jbtView = new JButton("View");

  public static void main(String[] args) {
    Demo frame = new Demo();
    frame.setTitle("Exercise17_4");
    frame.setSize(400, 300);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public Demo() {
    setLayout(new BorderLayout());

    JScrollPane scrollPane = new JScrollPane(jtaArticle);
    scrollPane.setBorder(new LineBorder(Color.BLACK));
    add(scrollPane, BorderLayout.CENTER);

    panel.setBorder(new LineBorder(Color.BLACK));
    panel.setLayout(new BorderLayout());
    panel.add(new JLabel("Filename"), BorderLayout.WEST);
    jtfFileAddress.setHorizontalAlignment(JTextField.LEFT);
    panel.add(jtfFileAddress, BorderLayout.CENTER);
    panel.add(jbtView, BorderLayout.EAST);
    add(panel, BorderLayout.SOUTH);

    jbtView.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String fileAddress = jtfFileAddress.getText();
        File sourceFile = new File(fileAddress);
        if (!sourceFile.exists()) {
          System.out.println("Source file " + fileAddress + " does not exist");
          System.exit(0);
        }

        try {
          Scanner input = new Scanner(sourceFile);
          
          while (input.hasNext()) {
            jtaArticle.append(input.nextLine() + '\n');
          }
        }
        catch (FileNotFoundException ex) {
          System.out.println("File not found: " + fileAddress);
        }
      }
    });
  }
}

    