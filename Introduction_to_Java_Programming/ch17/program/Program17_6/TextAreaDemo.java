import java.awt.*;
import javax.swing.*;

public class TextAreaDemo extends JFrame {
  private DescriptionPanel descriptionPanel = new DescriptionPanel();

  public static void main(String[] args) {
    TextAreaDemo frame = new TextAreaDemo();
    frame.setTitle("TextFieldDemo");
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public TextAreaDemo() {
    descriptionPanel.setTitle("Canada");
    String description = "The Maple Leaf flag \n\n" +
      "The Canadian National Flag was adopted by the Canadian " +
      "Parliament on October 22, 1964 and was proclaimed into law " +
      "by Her Majesty Queen Elizabeth II (the Queen of Canada) on " +
      "February 15, 1965. The Canadian Flag (colloquially known " +
      "as The Maple Leaf Flag) is a red flag of the proportions " +
      "two by length and one by width, containing in its center a " +
      "white square, with a single red stylized eleven-point " +
      "mapleleaf centered in the white square.";
    descriptionPanel.setDescription(description);
    descriptionPanel.setImageIcon(new ImageIcon("image/ca.gif"));

    setLayout(new BorderLayout());
    add(descriptionPanel, BorderLayout.CENTER);
  }
}