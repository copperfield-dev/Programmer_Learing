import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class Demo extends JFrame {
  private String[] flagTitles = {"Canada", "China", "Denmark",
    "France", "Germany", "India", "Norway", "United Kingdom",
    "United States of America"};

  private ImageIcon[] flagImage = {
    new ImageIcon("image/ca.gif"),
    new ImageIcon("image/china.gif"),
    new ImageIcon("image/denmark.gif"),
    new ImageIcon("image/fr.gif"),
    new ImageIcon("image/germany.gif"),
    new ImageIcon("image/india.gif"),
    new ImageIcon("image/norway.gif"),
    new ImageIcon("image/uk.gif"),
    new ImageIcon("image/us.gif")
  };

  private String[] flagDescription = new String[9];

  private DescriptionPanel descriptionPanel = new DescriptionPanel();

  private JComboBox jcbo = new JComboBox(flagTitles);

  public static void main(String[] args) {
    Demo frame = new Demo();
    frame.pack();
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Exercise17_19");
    frame.setVisible(true);
  }

  public Demo() {
    for (int i = 0; i < 9; i++) {
      File sourceFile = new File("text/description" + String.valueOf(i) + ".txt");
      flagDescription[i] = new String("");

      try {
          Scanner input = new Scanner(sourceFile);
          
          while (input.hasNext()) {
            flagDescription[i] += input.nextLine();
          }
        }
        catch (FileNotFoundException ex) {
          System.out.println("File not found");
        }
    }

    setDisplay(0);

    add(jcbo, BorderLayout.NORTH);
    add(descriptionPanel, BorderLayout.CENTER);

    jcbo.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        setDisplay(jcbo.getSelectedIndex());
      }
    });
  }

  public void setDisplay(int index) {
    descriptionPanel.setTitle(flagTitles[index]);
    descriptionPanel.setImageIcon(flagImage[index]);
    descriptionPanel.setDescription(flagDescription[index]);
  }
}