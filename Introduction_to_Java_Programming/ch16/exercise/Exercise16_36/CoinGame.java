import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

public class CoinGame extends JFrame {
	public CoinGame() {
    setLayout(new GridLayout(3, 3));

    for (int i = 0; i < 9; i++) {
      add(new CoinLabel("H"));
    }
	}

	public static void main(String[] args) {
		CoinGame frame = new CoinGame();
		frame.setTitle("Exercise16.36");
		frame.setSize(280, 280);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

  static class CoinLabel extends JLabel {
    public CoinLabel(String s) {
      setBorder(new LineBorder(Color.black, 1)); // Cell border
      setHorizontalAlignment(JLabel.CENTER);
      setFont(new Font("TimesRoman", Font.BOLD, 20));
      setText(s);
      
      addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          if (getText().equals("H")) {
            setText("T"); // Flip from H to T
          }
          else {
            setText("H"); // Flip from T to H
          }
        }
      });
    }
  }
}

