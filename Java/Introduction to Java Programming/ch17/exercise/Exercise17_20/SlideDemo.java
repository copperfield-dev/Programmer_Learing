import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class SlideDemo extends JFrame {
  private final static int NUMBER_OF_SLIDES = 10;
  private final static int SHOW_TIME_PER_SLIDE = 5000;

  private int current = 0;
  private JTextArea jtaShow = new JTextArea();

  public SlideDemo() {
    add(jtaShow);

    jtaShow.setLineWrap(true);
    jtaShow.setWrapStyleWord(true);
    jtaShow.setEditable(false);
    jtaShow.setText("Start");
    javax.swing.Timer timer = new javax.swing.Timer(SHOW_TIME_PER_SLIDE, new TimerListener());
    timer.start();
  }

  public static void main(String[] args) {
    SlideDemo frame = new SlideDemo();
    frame.setSize(800, 600);
    frame.setTitle("Exercise17_20");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  class TimerListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      File sourceFile = new File("text/slide" + String.valueOf(current) + ".txt");
      String slide = new String("");
      try {
        Scanner input = new Scanner(sourceFile);
        
        while (input.hasNext()) {
          slide += input.nextLine() + "\n";
        }
      }
      catch (FileNotFoundException ex) {
        System.out.println("File not found");
      }

      jtaShow.setText(slide);
      current = (current + 1) % NUMBER_OF_SLIDES;
    }
  }
}
  
