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
  private Histogram histogram = new Histogram();

  public static void main(String[] args) {
    Demo frame = new Demo();
    frame.setTitle("Exercise17_5");
    frame.setSize(400, 300);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public Demo() {
    setLayout(new BorderLayout());

    histogram.setBorder(new LineBorder(Color.BLACK));
    add(histogram, BorderLayout.CENTER);

    panel.setBorder(new LineBorder(Color.BLACK));
    panel.setLayout(new BorderLayout());
    panel.add(new JLabel("Text File"), BorderLayout.WEST);
    jtfFileAddress.setHorizontalAlignment(JTextField.LEFT);
    panel.add(jtfFileAddress, BorderLayout.CENTER);
    add(panel, BorderLayout.SOUTH);

    jtfFileAddress.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String fileAddress = jtfFileAddress.getText();
        File sourceFile = new File(fileAddress);
        String article = new String("");
        try {
          Scanner input = new Scanner(sourceFile);
          
          while (input.hasNext()) {
            article += input.nextLine();
          }
        }
        catch (FileNotFoundException ex) {
          System.out.println("File not found: " + fileAddress);
        }

        int[] count = countLetters(article);
        histogram.showHistogram(count);
        jtfFileAddress.requestFocusInWindow();
      }
    });
  }

  private int[] countLetters(String text) {
    int[] count = new int[26];

    for (int i = 0; i < text.length(); i++) {
      char character = text.charAt(i);

      if ((character >= 'A') && (character <= 'Z')) {
        count[character - 'A']++;
      }
      else if ((character >= 'a') && (character <= 'z')) {
        count[character - 'a']++;
      }
    }

    return count;
  }
}

    