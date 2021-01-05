import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/* 
 * Our class "GUI" that implements the ActionListener interface. 
 * The ActionListener interface listens for and receives action events such as when the user clicks on a button.
 */

public class GUI implements ActionListener {
	
	// Creates the label displayed at the top of the GUI; in this case, it is the user's current quiz question. 
	private JLabel label = new JLabel("Question 1: How do you do in frustrating situations?");
	
	// Creates the GUI's frame that the user will see, contributing to component architecture. 
	private JFrame frame = new JFrame();
	
	// Creates the GUI's panel that the user will see. 
	private JPanel panel = new JPanel();
	
	
	
	// Creates a new button that the user will be able to click on and is labeled with some text.
	JButton iroh_trait_button = new JButton("I tend to maintain my patience well and see every side of the situation.");
    JButton zuko_trait_button = new JButton("My friends say I'm too short-tempered.");
    JButton katara_trait_button = new JButton("It depends on how my day had been going prior.");
    JButton aang_trait_button = new JButton("I always do my best to make every situation positive for everyone.");
    
    
    private JLabel label2 = new JLabel("Question 2: What is your worst fear?");
    
    JButton iroh_trait_button2 = new JButton("Not being able to find meaning in life.");
    JButton zuko_trait_button2 = new JButton("Disappointing the people that I want to perform best for.");
    JButton katara_trait_button2 = new JButton("Losing my loved ones.");
    JButton aang_trait_button2 = new JButton("Not meeting my own expectations.");
    
    private JLabel label3 = new JLabel("Question 3: Which would you want to be your companion?");
    
    JButton iroh_trait_button3 = new JButton("The world's spirits.");
    JButton zuko_trait_button3 = new JButton("A dragon.");
    JButton katara_trait_button3 = new JButton("The moon.");
    JButton aang_trait_button3 = new JButton("A sky bison.");
    
    
    private JButton doneButton = new JButton("Submit answers");
    
    // GUI class constructor.
    public GUI() {
    	// Registers each button with the addActionListener method so that the event of the user clicking on a button can be processed.
    	
   
    	
       
        // Constructs GUI visuals. 
        //panel.setBorder(BorderFactory.createEmptyBorder(10, 100, 10, 10));
        panel.setLayout(new GridLayout(20, 0));
        
        panel.add(label);
        panel.add(iroh_trait_button);
        panel.add(zuko_trait_button);
        panel.add(katara_trait_button);
        panel.add(aang_trait_button);
        
        panel.add(label2);
        panel.add(iroh_trait_button2);
        panel.add(zuko_trait_button2);
        panel.add(katara_trait_button2);
        panel.add(aang_trait_button2);
        
        panel.add(label3);
        panel.add(iroh_trait_button3);
        panel.add(zuko_trait_button3);
        panel.add(katara_trait_button3);
        panel.add(aang_trait_button3);
        
       
        panel.add(doneButton);
        
        

        
        // Details the GUI visuals.
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);  
        
    }

  
    int count = 0; 
    
    public void setUpButtonListeners() {
    	ActionListener buttonListener = new ActionListener() {
    		// Method part of the ActionListener interface that is invoked when an action event occurs
    		// for an object.
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			if (e.getSource() == iroh_trait_button 
    					|| e.getSource() == iroh_trait_button2
    					|| e.getSource() == iroh_trait_button3) {
    				count += 10;
    				// Iroh sum = 30
    				
    			} else if (e.getSource() == zuko_trait_button
    						|| e.getSource() == zuko_trait_button2
    						|| e.getSource() == zuko_trait_button3) {
    				count += 15;
    				// Zuko sum = 45
    				
    			} else if (e.getSource() == katara_trait_button 
    						|| e.getSource() == katara_trait_button2 
    						|| e.getSource() == katara_trait_button3) {
    				count += 20;
    				// Katara sum = 60
    				
    			} else if (e.getSource() == aang_trait_button
    						|| e.getSource() == aang_trait_button2
    						|| e.getSource() == aang_trait_button3) {
    				count += 25;
    				// Aang sum = 75
    				
    			}
    			
    			if (e.getSource() == doneButton) {
    				if (count <= 30) {
    					JLabel answer = new JLabel("You are most like Uncle Iroh!");
    					panel.add(answer);
    				} else if (count <= 45) {
    					JLabel answer = new JLabel("You are most like Zuko!");
    					panel.add(answer);
    				} else if (count <= 60) {
    					JLabel answer = new JLabel("You are most like Katara!");
    					panel.add(answer);
    				} else if (count <= 75) {
    					JLabel answer = new JLabel("You are most like Aang!");
    					panel.add(answer);
    				}
    				
    			}
    		}
    	};
    	// Anonymous class?
    	
    	iroh_trait_button.addActionListener(buttonListener);
    	zuko_trait_button.addActionListener(buttonListener);
    	katara_trait_button.addActionListener(buttonListener);
    	aang_trait_button.addActionListener(buttonListener);
    	
    	iroh_trait_button2.addActionListener(buttonListener);
    	zuko_trait_button2.addActionListener(buttonListener);
    	katara_trait_button2.addActionListener(buttonListener);
    	aang_trait_button2.addActionListener(buttonListener);
    	
    	iroh_trait_button3.addActionListener(buttonListener);
    	zuko_trait_button3.addActionListener(buttonListener);
    	katara_trait_button3.addActionListener(buttonListener);
    	aang_trait_button3.addActionListener(buttonListener);
    	
    	doneButton.addActionListener(buttonListener);
    	
    	
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
    	
    }
   
    
    // Program's main method that will allow us to see our GUI and compile our code. 
    public static void main(String[] args) {
    	GUI gui = new GUI();
    	gui.setUpButtonListeners();
    	
    }

}