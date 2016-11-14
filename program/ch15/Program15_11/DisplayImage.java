import java.awt.*;
import javax.swing.*;

public class DisplayImage extends JFrame {
	public DisplayImage() {
		add(new ImagePanel());
	}
	
    public static void main(String[] args) {
    	DisplayImage frame = new DisplayImage();
    	frame.setTitle("DisplayImage");
    	frame.setSize(300, 300);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}

class ImagePanel extends JPanel {
	private ImageIcon imageIcon = new ImageIcon("image/us.gif");
	private Image image = imageIcon.getImage();

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		if (image != null)
			g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	}
}