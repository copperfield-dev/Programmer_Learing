import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;

public class Headsman extends JFrame {
  private HeadsmanPanel canves = new HeadsmanPanel();

	public Headsman() {
		this.add(canves, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		Headsman frame = new Headsman();
		frame.setTitle("Exercise16.35");
		frame.setSize(450, 280);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

  class HeadsmanPanel extends JPanel {
    int palindromeRadius = 150;
    int ballRadius = 10;
    int leftAngle = 120;
    int rightAngle = 60;
    int angle = leftAngle; // Start from leftAngle
    int angleDelta = 1; // Swing interval
    int delay = 100;

    Timer timer = new Timer(delay, new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        repaint();
      }
    });

    HeadsmanPanel() {
      setNewHiddenWord();

      this.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent e) {
          char letter = e.getKeyChar();

          if (letter == KeyEvent.VK_ENTER)
            setNewHiddenWord();
          else if (Character.isLowerCase(letter)) {
            judge(letter);

            if (numberOfMisses == 7) {
              timer.start();
            }
            else
              timer.stop();
          }

          repaint();
      }});

      setFocusable(true);
    }

    protected void paintComponent(Graphics g) {
      super.paintComponent(g);

      g.setFont(new Font("TimesRoman", Font.BOLD, 20));

      if (isFinished) {
        g.drawString("The word is: " + guessedWord.toString(), 
          120, 210);
        g.drawString("To continue the game, press Enter", 120, 230);
      } else {
        g.drawString("Guess a word: " + guessedWord.toString(), 
          120, 210);
        g.drawString("Misses letters: " + missedLetters.toString(),
          120, 230);
      }

      g.drawArc(20, 200, 80, 40, 0, 180); // Draw the base
      g.drawLine(20 + 40, 200, 20 + 40, 20); // Draw the pole
      g.drawLine(20 + 40, 20, 20 + 40 + 100, 20); // Draw the hanger

      if (numberOfMisses == 7) {
        if (angle < rightAngle)
          angleDelta = 1; // Swing to the left
        else if (angle > leftAngle)
          angleDelta = -1; // Swing to the right
            
        angle += angleDelta;
      }

      if (numberOfMisses < 1)
        return;

      int x1 = 20 + 40 + 100;
      int y1 = 20;
      int radius = 20;
      int x = x1 + (int)(radius * Math.cos(Math.toRadians(angle)));
      int y = y1 + (int)(radius * Math.sin(Math.toRadians(angle)));
      g.drawLine(20 + 40 + 100, 20, x, y); // Draw the hanger

      if (numberOfMisses < 2)
        return;

      // Draw the circle
      double length = 20 + 20;
      x = x1 + (int)(length * Math.cos(Math.toRadians(angle)));
      y = y1 + (int)(length * Math.sin(Math.toRadians(angle)));      
      g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius); // Draw the hanger

      if (numberOfMisses < 3)
        return;

      // Draw the left arm      
      length = distance(x1, y1, 
          20 + 40 + 100 - (int)(radius * Math.cos(Math.toRadians(45))),
          40 + radius + (int)(radius * Math.sin(Math.toRadians(45))));    
      double angle1 = Math.toDegrees(Math.asin(
          radius * Math.cos(Math.toRadians(45)) / length));
      int x2 = x1 + (int)(length * Math.cos(Math.toRadians(angle + angle1)));
      int y2 = y1 + (int)(length * Math.sin(Math.toRadians(angle + angle1)));      
      
      length = (int)distance(x1, y1, 
          20 + 40 + 100 - 60, 40 + radius + 60);
      angle1 = Math.toDegrees(Math.asin(60 / length));
      int x3 = x1 + (int)(length * Math.cos(Math.toRadians(angle + angle1)));
      int y3 = y1 + (int)(length * Math.sin(Math.toRadians(angle + angle1)));      
     
      g.drawLine(x2, y2, x3, y3);
      
      if (numberOfMisses < 4)
        return;

      // Draw the right arm
      length = distance(x1, y1, 
          20 + 40 + 100 + (int)(radius * Math.cos(Math.toRadians(45))),
          40 + radius + (int)(radius * Math.sin(Math.toRadians(45))));    
      angle1 = - Math.toDegrees(Math.asin(
          radius * Math.cos(Math.toRadians(45)) / length));
      x2 = x1 + (int)(length * Math.cos(Math.toRadians(angle + angle1)));
      y2 = y1 + (int)(length * Math.sin(Math.toRadians(angle + angle1)));      
      
      length = (int)distance(x1, y1, 
          20 + 40 + 100 + 60, 40 + radius + 60);
      angle1 = -Math.toDegrees(Math.asin(60 / length));
      x3 = x1 + (int)(length * Math.cos(Math.toRadians(angle + angle1)));
      y3 = y1 + (int)(length * Math.sin(Math.toRadians(angle + angle1))); 
      
      g.drawLine(x2, y2, x3, y3);

      if (numberOfMisses < 5)
        return;

      // Draw the body
      length = 40 + 20;
      x2 = x1 + (int)(length * Math.cos(Math.toRadians(angle)));
      y2 = y1 + (int)(length * Math.sin(Math.toRadians(angle)));
      
      length = 40 + 20 + 60;
      x3 = x1 + (int)(length * Math.cos(Math.toRadians(angle)));
      y3 = y1 + (int)(length * Math.sin(Math.toRadians(angle)));
      
      g.drawLine(x2, y2, x3, y3);

      if (numberOfMisses < 6)
        return;

      // Draw the left leg
      length = distance(x1, y1, 
          20 + 40 + 100 - 40, 40 + radius + 80 + 40);     
      angle1 = Math.toDegrees(Math.asin(
          40.0 / length));
      int x4 = x1 + (int)(length * Math.cos(Math.toRadians(angle + angle1)));
      int y4 = y1 + (int)(length * Math.sin(Math.toRadians(angle + angle1)));            
      g.drawLine(x3, y3, x4, y4);

      if (numberOfMisses < 7)
        return;
  
      // Draw the right leg
      angle1 = -Math.toDegrees(Math.asin(
          40.0 / length));
      x4 = x1 + (int)(length * Math.cos(Math.toRadians(angle + angle1)));
      y4 = y1 + (int)(length * Math.sin(Math.toRadians(angle + angle1)));            
      g.drawLine(x3, y3, x4, y4);
    }

    String[] words = { "write", "program", "that", "receive", "positive",
      "supercalifragilisticexpialidocious", "linger", "violin", "strange", "holiday", "twilight",
      "disney", "school", "teacher", "tutor", "mother", "daughter", "stupidson", "michaelisageek" };
    String hiddenWord;
    StringBuilder guessedWord = new StringBuilder();
    int numberOfMisses = 0;
    StringBuilder missedLetters = new StringBuilder();
    boolean isFinished = false;

    void setNewHiddenWord() {
      angle = 90;

      int index = (int) (Math.random() * words.length);
      hiddenWord = words[index];
      
      guessedWord.setLength(0);
      for (int i = 0; i < hiddenWord.length(); i++) {
        guessedWord.append('*');
      }

      missedLetters.setLength(0);
      numberOfMisses = 0;
      isFinished = false;
    }

    void judge(char letter) {
      if (guessedWord.indexOf(letter + "") >= 0) {
        
      } else if (hiddenWord.indexOf(letter + "") < 0) {
        if (missedLetters.indexOf(letter + "") < 0) {
          numberOfMisses++;
          missedLetters.append(letter);

          if (numberOfMisses == 7) {
            isFinished = true;
            guessedWord = new StringBuilder(hiddenWord);
          }
        }
      } else {
        int k = hiddenWord.indexOf(letter);
        while (k >= 0) {
          guessedWord.setCharAt(k, letter);
          k = hiddenWord.indexOf(letter, k + 1);

          if (guessedWord.indexOf('*' + "") < 0) {
            isFinished = true;
            repaint();
          }
        }
      }
    }
  }

  public static double distance(
    double x1, double y1, double x2, double y2) {
    return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
  }

  
}

