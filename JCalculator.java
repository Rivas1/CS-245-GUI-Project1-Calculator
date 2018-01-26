import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCalculator
{
    // Digits
    JButton button_0,button_1,button_2,
            button_3,button_4,button_5,
            button_6,button_7,button_8,
            button_9;
    // Operations
    JButton button_add, button_subtract, 
            button_multiply, button_divide,
            button_equals, button_clear;
    
    
    public JCalculator ()
    {
        JFrame frm = new JFrame("Calculator");
        
        // Create Display Panel
        JPanel display_panel = new JPanel();
        display_panel.setLayout( new FlowLayout() );
        JLabel display = new JLabel("Display");
        frm.add(display);
        
        // Create Button Panel
        JPanel digits_button_panel = new JPanel();
        frm.getContentPane().add( BorderLayout.PAGE_END, digits_button_panel);
        digits_button_panel.setLayout( new GridLayout ( 4, 3) );
        
        // Create Operations Panel
        JPanel operations_button_panel = new JPanel();
        frm.getContentPane().add(BorderLayout.EAST, operations_button_panel);
        operations_button_panel.setLayout( new GridLayout ( 4, 1 ) );
        
        // Add image icon                             // ***********************
        String imagePath = "JCalculatorIcon.png";     // *Icon needs to be in  *
        ImageIcon icon = new ImageIcon ( imagePath ); // *same directory as    *
        frm.setIconImage( icon.getImage() );          // *project folder       *
                                                      // ***********************
        
        // Set dimensions of window
        frm.setSize ( 600, 600 );
        
        // Set layout, 4x4 grid
        frm.setLayout( new GridBagLayout( ) );
        
        
                
        // Create buttons
        button_0 = new JButton("0");
        button_1 = new JButton("1");
        button_2 = new JButton("2");
        button_3 = new JButton("3");
        button_4 = new JButton("4");
        button_5 = new JButton("5");
        button_6 = new JButton("6");
        button_7 = new JButton("7");
        button_8 = new JButton("8");
        button_9 = new JButton("9");
        button_add = new JButton("+");
        button_subtract = new JButton("-");
        button_multiply = new JButton("*");
        button_divide = new JButton("/");
        button_equals = new JButton("="); // set as default button
        button_clear = new JButton("C"); // set mnemonic C
               
        
        // Add buttons
        digits_button_panel.add(button_7); // 7 8 9
        digits_button_panel.add(button_8);
        digits_button_panel.add(button_9);
        
        digits_button_panel.add(button_4); // 4 5 6
        digits_button_panel.add(button_5);
        digits_button_panel.add(button_6);
        
        digits_button_panel.add(button_1); // 1 2 3
        digits_button_panel.add(button_2);
        digits_button_panel.add(button_3);
        
        digits_button_panel.add(button_clear); // C 0 =
        digits_button_panel.add(button_0);
        digits_button_panel.add(button_equals);
        
        operations_button_panel.add(button_add);
        operations_button_panel.add(button_subtract);
        operations_button_panel.add(button_multiply);
        operations_button_panel.add(button_divide);
        
        
        
        // Exit on close
        frm.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        // Display frame
        frm.setVisible(true);
        digits_button_panel.setVisible(true);
        operations_button_panel.setVisible(true);
        display_panel.setVisible(true);
    }   
    
    
    
    
    
    
    
    public static void main ( String[] args )
    {
        SwingUtilities.invokeLater( new Runnable() {
            public void run ()
            {
               new JCalculator();
            }
        });
    }
}