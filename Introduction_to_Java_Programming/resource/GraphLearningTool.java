import java.util.List;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class GraphLearningTool extends JApplet {
  private JTextField jtfVertexName = new JTextField(5);
  private JTextField jtfX = new JTextField(5);
  private JTextField jtfY = new JTextField(5);
  private JButton jbtAddVertex = new JButton("Add Vertex");
  
  private JTextField jtfu = new JTextField(5);
  private JTextField jtfv = new JTextField(5);
  private JButton jbtAddEdge = new JButton("Add Edge");
  
  private JTextField jtfStartVertex = new JTextField(5);
  private JButton jbtDFS = new JButton("DFS Tree");
  private JButton jbtBFS = new JButton("BFS Tree");

  private JTextField jtfStartVertex1 = new JTextField(5);
  private JTextField jtfEndVertex1 = new JTextField(5);
  private JButton jbtShortestPath = new JButton("Shortest Path");

  private JButton jbtStartOver = new JButton("Start Over (Clear Graph)");
  
  private UnweightedGraph<Vertex> graph = new UnweightedGraph<Vertex>();
  private GraphView view = new GraphView(graph);
  
  public GraphLearningTool() { 
	jtfVertexName.setHorizontalAlignment(JTextField.RIGHT);
	jtfX.setHorizontalAlignment(JTextField.RIGHT); 
	jtfY.setHorizontalAlignment(JTextField.RIGHT); 
    jtfu.setHorizontalAlignment(JTextField.RIGHT); 
    jtfv.setHorizontalAlignment(JTextField.RIGHT); 
    jtfStartVertex.setHorizontalAlignment(JTextField.RIGHT); 
    jtfStartVertex1.setHorizontalAlignment(JTextField.RIGHT); 
    jtfEndVertex1.setHorizontalAlignment(JTextField.RIGHT);
    
    JPanel panel1 = new JPanel(new GridLayout(4, 2));
    panel1.add(new JLabel("Vertex index: "));
    panel1.add(jtfVertexName);
    panel1.add(new JLabel("x-coordinate: "));
    panel1.add(jtfX);
    panel1.add(new JLabel("y-coordinate: "));
    panel1.add(jtfY);
    panel1.add(new JLabel());
    panel1.add(jbtAddVertex);
    panel1.setBorder(new TitledBorder("Add a new vertex"));
    
    JPanel panel2 = new JPanel(new GridLayout(3, 2));
    panel2.add(new JLabel("Vertex u (index): "));
    panel2.add(jtfu);
    panel2.add(new JLabel("Vertex v (index): "));
    panel2.add(jtfv);
    panel2.add(new JLabel(""));
    panel2.add(jbtAddEdge);
    panel2.setBorder(new TitledBorder("Add a new edge"));

    JPanel panel3 = new JPanel(new GridLayout(3, 2));
    panel3.add(new JLabel("Starting vertex: "));
    panel3.add(jtfStartVertex);
    panel3.add(new JLabel(""));
    panel3.add(jbtDFS);
    panel3.add(new JLabel(""));
    panel3.add(jbtBFS);
    panel3.setBorder(new TitledBorder("Display DFS/BFS"));

    JPanel panel4 = new JPanel(new GridLayout(3, 2));
    panel4.add(new JLabel("Starting vertex: "));
    panel4.add(jtfStartVertex1);
    panel4.add(new JLabel("Ending vertex: "));
    panel4.add(jtfEndVertex1);
    panel4.add(new JLabel(""));
    panel4.add(jbtShortestPath);
    panel4.setBorder(new TitledBorder("Find a shortest path"));
    
    JPanel panel5 = new JPanel(new GridLayout(1, 4));
    panel5.add(panel1);
    panel5.add(panel2);
    panel5.add(panel3);
    panel5.add(panel4);
    
    JPanel panel6 = new JPanel(new BorderLayout());
    panel6.add(panel5, BorderLayout.CENTER);
    panel6.add(jbtStartOver, BorderLayout.SOUTH);
    
    add(new JScrollPane(view));
    add(panel6, BorderLayout.SOUTH);
    
    jbtAddVertex.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
    	try {
          String name = jtfVertexName.getText();
          if (graph.getSize() != Integer.parseInt(name.trim()))
            JOptionPane.showMessageDialog(
              null, "The next vertex to be added must be index " + graph.getSize());
          else {         
            int x = Integer.parseInt(jtfX.getText().trim());
            int y = Integer.parseInt(jtfY.getText().trim());
          
            graph.addVertex(new Vertex(name, x, y));
            view.repaint();
          }
        }
    	catch (Exception ex) {
            JOptionPane.showMessageDialog(
               null, "The input must be an integer index");   		
    	}
      }
    });   
    
    jbtAddEdge.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
    	try {
	        int u = Integer.parseInt(jtfu.getText().trim());
	        int v = Integer.parseInt(jtfv.getText().trim());
	
	        if (u < 0 || u >= graph.getSize())
	          JOptionPane.showMessageDialog(
	            null, "Vertex " + u + " is not in the graph");
	        else if (v < 0 || v >= graph.getSize())
	          JOptionPane.showMessageDialog(
	            null, "Vertex " + v + " is not in the graph");
	        else if (u == v) 
	          JOptionPane.showMessageDialog(
	              null, "Two vertices cannot be the same");
	        else {
	          graph.addEdge(u, v);
	          view.repaint();
	        }
        }
     	catch (Exception ex) {
          JOptionPane.showMessageDialog(
             null, "The input must be an integer index");   		
  	     }
       }
    });    
    
    jbtDFS.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      	try {
          int u = Integer.parseInt(jtfStartVertex.getText().trim());        
          AbstractGraph<Vertex>.Tree tree = graph.dfs(u);
          view.setPath(null);
          view.setTree(tree);
          view.repaint();
        }
        catch (Exception ex) {
          JOptionPane.showMessageDialog(
             null, "The input must be an integer index");   		
  	    }
      }
    });  
    
    jbtBFS.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
    	try {
          int u = Integer.parseInt(jtfStartVertex.getText().trim());        
          AbstractGraph<Vertex>.Tree tree = graph.bfs(u);
          view.setPath(null);
          view.setTree(tree);
          view.repaint();
        }
   	    catch (Exception ex) {
           JOptionPane.showMessageDialog(
             null, "The input must be an integer index");   		
	    }
      }
    });    
    
    jbtStartOver.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        graph.clear();
        view.setTree(null);
        view.repaint();
      }
    });
    
    jbtShortestPath.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      	try {
          int u = Integer.parseInt(jtfStartVertex1.getText().trim());
          int v = Integer.parseInt(jtfEndVertex1.getText().trim());
          
          AbstractGraph<Vertex>.Tree tree = graph.bfs(u);
          List<Vertex> path = tree.getPath(v);
          
          view.setTree(null);
          view.setPath(path);
          view.repaint();
       }
       catch (Exception ex) {
         JOptionPane.showMessageDialog(
           null, "The input must be an integer index");   		
  	   }
     }
    });    
  }
  
  class Vertex implements Displayable {
    private int x, y;
    private String name;
    
    Vertex(String name, int x, int y) {
      this.name = name;
      this.x = x;
      this.y = y;
    }
    
    public int getX() {
      return x;
    }
    
    public int getY() {
      return y;
    }
    
    public String getName() {
      return name;
    }
    
    public boolean equals(Object o) {
      return ((Vertex)o).name.equals(this.name);
    }
  }
  
  class GraphView extends javax.swing.JPanel {
    private Graph<? extends Displayable> graph;
    private AbstractGraph<? extends Displayable>.Tree tree;
    List<? extends Displayable> path;
    
    public GraphView(Graph<? extends Displayable> graph, 
        AbstractGraph<? extends Displayable>.Tree tree) {
      this.graph = graph;
      this.tree = tree;
    }
    
    public GraphView(Graph<? extends Displayable> graph) {
      this.graph = graph;
    }

    public void setTree(AbstractGraph<? extends Displayable>.Tree tree) {
      this.tree = tree;
      repaint();
    }
    
    public void setPath(List<? extends Displayable> path) {
        this.path = path;
        repaint();
      }
   
    protected void paintComponent(java.awt.Graphics g) {
      super.paintComponent(g);
      
      // Draw vertices
      List<? extends Displayable> vertices = graph.getVertices();
      
      for (int i = 0; i < graph.getSize(); i++) {
        int x = vertices.get(i).getX();
        int y = vertices.get(i).getY();
        String name = vertices.get(i).getName();
        
        g.fillOval(x - 8, y - 8, 16, 16);
        g.drawString(name, x - 12, y - 12);
      }
      
      // Draw edges
      for (int i = 0; i < graph.getSize(); i++) {
        List<Integer> edges = graph.getNeighbors(i);
        for (int j = 0; j < edges.size(); j++) {
          int v = edges.get(j);
          int x1 = graph.getVertex(i).getX();
          int y1 = graph.getVertex(i).getY();
          int x2 = graph.getVertex(v).getX();
          int y2 = graph.getVertex(v).getY();
          
          g.drawLine(x1, y1, x2, y2);
        }
      }
      
      // Highlight the edges in the spanning tree
      if (tree != null) {
        g.setColor(java.awt.Color.RED);
        for (int i = 0; i < graph.getSize(); i++) {
          if (tree.getParent(i) != -1) {
            int v = tree.getParent(i);
            int x1 = graph.getVertex(i).getX();
            int y1 = graph.getVertex(i).getY();
            int x2 = graph.getVertex(v).getX();
            int y2 = graph.getVertex(v).getY();
          
            drawArrowLine(x2, y2, x1, y1, g);  
          }
        }
      }
      else if (path != null) {
        // Display the path
     
        g.setColor(Color.RED);
        for (int i = 1; i < path.size(); i++) {
          int x1 = path.get(i).getX();
          int y1 = path.get(i).getY();
          int x2 = path.get(i - 1).getX();
          int y2 = path.get(i - 1).getY();
          drawArrowLine(x1, y1, x2, y2, g);
        }  
      }
    }
    
    public Dimension getPreferredSize() {
      return new Dimension(1200, 800);
    }
  }

  public static void drawArrowLine(int x1, int y1, 
      int x2, int y2, Graphics g) {
    g.setColor(Color.red);
    g.drawLine(x1, y1, x2, y2);
    
    // find slope of this line
    double slope = ((((double) y1) - (double) y2))
        / (((double) x1) - (((double) x2)));

    double arctan = Math.atan(slope);

    // This will flip the arrow 45 off of a
    // perpendicular line at pt x2
    double set45 = 1.57 / 2;
    
    // arrows should always point towards i, not i+1
    if (x1 < x2) {
      // add 90 degrees to arrow lines
      set45 = -1.57 * 1.5;
    }

    // set length of arrows
    int arrlen = 15;

    // draw arrows on line
    g.drawLine(x2, y2, (int) ((x2 + (Math.cos(arctan + set45) * arrlen))),
        (int) (((y2)) + (Math.sin(arctan + set45) * arrlen)));

    g.drawLine(x2, y2, (int) ((x2 + (Math.cos(arctan - set45) * arrlen))),
        (int) (((y2)) + (Math.sin(arctan - set45) * arrlen)));
  }
  
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    GraphLearningTool applet = new GraphLearningTool();
    frame.add(applet);
    frame.setTitle("Graph Learning Tool: Dynamic Graph");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}