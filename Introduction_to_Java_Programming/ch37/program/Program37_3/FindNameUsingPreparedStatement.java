import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 * Created by copperfield on 09/12/2016.
 */
public class FindNameUsingPreparedStatement extends JApplet {
    private JTextField jtfProduct = new JTextField(9);
    private JTextField jtfType = new JTextField(5);
    private JButton jbtShowName = new JButton("Show Name");
    
    private PreparedStatement preparedStatement;
    
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
    
            String queryString = "select product_cd, name, product_type_cd " +
                    "from product " +
                    "where product_cd = ? and product_type_cd = ?";
            
            preparedStatement = connection.prepareStatement(queryString);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void jbtShowGrade_actionPerformed(ActionEvent e) {
        String product = jtfProduct.getText();
        String type = jtfType.getText();
        try {
            preparedStatement.setString(1, product);
            preparedStatement.setString(2, type);
            
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
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
