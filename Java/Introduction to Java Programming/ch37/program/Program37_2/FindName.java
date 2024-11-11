import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 * Created by copperfield on 02/12/2016.
 */
public class FindName extends JApplet {
    private JTextField jtfProduct = new JTextField(9);
    private JTextField jtfType = new JTextField(5);
    private JButton jbtShowName = new JButton("Show Grade");
    private Statement stmt;
    
    public void init() {
        initialzeDB();
        
        jbtShowName.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jbtShowGrade_actionPerformed(e);
                }
            }
        );
        
        JPanel jPanel1 = new JPanel();
        jPanel1.add(new JLabel("SSN"));
        jPanel1.add(jtfProduct);
        jPanel1.add(new JLabel("Course ID"));
        jPanel1.add(jtfType);
        jPanel1.add(jbtShowName);
        
        add(jPanel1, BorderLayout.NORTH);
    }
    
    private void initialzeDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
    
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost/bank", "root", "123456");
            System.out.println("Database connected");
            stmt = connection.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void jbtShowGrade_actionPerformed(ActionEvent e) {
        String product = jtfProduct.getText();
        String type = jtfType.getText();
        try {
            String queryString = "select product_cd, name, product_type_cd " +
                    "from product " +
                    "where product_cd = '" + product + "' and " +
                    "product_type_cd = '" + type + "'";
            System.out.println(queryString);
    
            ResultSet resultSet = stmt.executeQuery(queryString);
            
            if (resultSet.next()) {
                String product_cd = resultSet.getString(1);
                String name = resultSet.getString(2);
                String product_type_cd = resultSet.getString(3);
                
                JOptionPane.showMessageDialog(null, product_cd + " " +
                    name + " " + product_type_cd);
            } else {
                JOptionPane.showMessageDialog(null, "Nothing found!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
  
}
