import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ControlCircle3 extends JFrame {
    private JButton jbtLeft = new JButton("Left");
    private JButton jbtRight = new JButton("Right");
    private JButton jbtUp = new JButton("Up");
    private JButton jbtDown = new JButton("Down");
    private CirclePanel canvas = new CirclePanel();

    public ControlCircle3() {
        JPanel panel = new JPanel();
        panel.add(jbtLeft);
        panel.add(jbtRight);
        panel.add(jbtUp);
        panel.add(jbtDown);

        this.add(canvas, BorderLayout.CENTER);
        this.add(panel, BorderLayout.SOUTH);

        jbtLeft.addActionListener(
          new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              canvas.moveLeft();
            }
          }
        );

        jbtRight.addActionListener(
          new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              canvas.moveRight();
            }
          }
        );

        jbtUp.addActionListener(
          new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              canvas.moveUp();
            }
          }
        );

        jbtDown.addActionListener(
          new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              canvas.moveDown();
            }
          }
        );
    }

    public static void main(String[] args) {
        JFrame frame = new ControlCircle3();
        frame.setTitle("Exercise16_3");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    class CirclePanel extends JPanel {
        private int radius = 5;
        private int xCoordinate = getWidth() / 2 - radius;
        private int yCoordinate = getHeight() / 2 - radius;

        public void moveLeft() {
            xCoordinate -= 5;
            repaint();
        }

        public void moveRight() {
            xCoordinate += 5;
            repaint();
        }

        public void moveUp() {
            yCoordinate -= 5;
            repaint();
        }

        public void moveDown() {
            yCoordinate += 5;
            repaint();
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawOval(xCoordinate, yCoordinate,
                2 * radius, 2 * radius);
        }
    }
 }    

