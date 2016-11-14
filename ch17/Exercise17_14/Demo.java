import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

public class Demo extends JFrame { 
  private String[] selectModels = {"SINGLE_SELECTION", "SINGLE_INTERVAL_SELECTION", "MULTIPLE_INTERVAL_SELECTION"};
  private String[] countries = {"United States", "United Kingdom", "China", "Germany", "France"};
  private JPanel panel1 = new JPanel();
  private JComboBox jcboSelectModel = new JComboBox(selectModels);

  private JList jlstCountry = new JList(countries);

  private JPanel panel2 = new JPanel();
  private JLabel[] jlblShow = new JLabel[5];

  public static void main(String[] args) {
    Demo frame = new Demo();
    frame.setTitle("Exercise17_14");
    frame.setSize(400, 300);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public Demo() {
    setLayout(new BorderLayout());

    panel1.add(new JLabel("Choose Selection Mode"));
    panel1.add(jcboSelectModel);
    add(panel1, BorderLayout.NORTH);

    JScrollPane scrollPane = new JScrollPane(jlstCountry);
    scrollPane.setBorder(new LineBorder(Color.BLACK));
    add(scrollPane, BorderLayout.CENTER);
    
    for (int i = 0; i < 5; i++) {
      panel2.add(jlblShow[i] = new JLabel());
    }
    add(panel2, BorderLayout.SOUTH);

    jcboSelectModel.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        int select = jcboSelectModel.getSelectedIndex();
        if (select == 0)
          jlstCountry.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        else if (select == 1) {
          jlstCountry.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        }
        else if (select == 2) {
          jlstCountry.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        }
      }
    });

    jlstCountry.addListSelectionListener(new ListSelectionListener() {
      public void valueChanged(ListSelectionEvent e) {
        int[] indices = jlstCountry.getSelectedIndices();

        int i;
        for (i = 0; i < indices.length; i++) {
          jlblShow[i].setText(countries[indices[i]]);
        }

        for (; i < 5; i++) {
          jlblShow[i].setText(null);
        }
      }
    }); 
  }
}