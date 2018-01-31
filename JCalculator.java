import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JCalculator implements ActionListener
{
    JLabel screen = new JLabel ("Screen");
    String current_screen = "";
    final int DIGITCOUNTER = 10;
    int digits = 0;
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
        frm.setLayout( new BoxLayout(frm.getContentPane(), BoxLayout.Y_AXIS ) );

        // Center JFrame
        frm.pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        frm.setSize(width/2, height/2);
        frm.setLocationRelativeTo(null);

        // Create Display Panel
        
        JPanel display_panel = new JPanel();
        display_panel.setBorder(BorderFactory.createLineBorder(Color.black));
        display_panel.setSize(300,300);
        display_panel.add(screen);
        frm.add(display_panel);
        

        // Create Button Panel
        JPanel digits_button_panel = new JPanel();
        frm.add(digits_button_panel);
        digits_button_panel.setLayout( new GridLayout ( 4, 4) );
        
        // Add image icon                             // ***********************
        String imagePath = "JCalculator.png";         // *Icon needs to be in  *
        ImageIcon icon = new ImageIcon ( imagePath ); // *same directory as    *
        frm.setIconImage( icon.getImage() );          // *project folder       *
                                                      // ***********************
        
        // Set dimensions of window
        frm.setSize ( 600, 600 );
                
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
        digits_button_panel.add(button_add);
        
        digits_button_panel.add(button_4); // 4 5 6
        digits_button_panel.add(button_5);
        digits_button_panel.add(button_6);
        digits_button_panel.add(button_subtract);

        digits_button_panel.add(button_1); // 1 2 3
        digits_button_panel.add(button_2);
        digits_button_panel.add(button_3);
        digits_button_panel.add(button_multiply);

        digits_button_panel.add(button_clear); // C 0 =
        digits_button_panel.add(button_0);
        digits_button_panel.add(button_equals);
        digits_button_panel.add(button_divide);

        // Add Action Listeners
        button_1.addActionListener(this);
        button_2.addActionListener(this);
        button_3.addActionListener(this);
        button_4.addActionListener(this);
        button_5.addActionListener(this);
        button_6.addActionListener(this);
        button_7.addActionListener(this);
        button_8.addActionListener(this);
        button_9.addActionListener(this);
        button_add.addActionListener(this);
        button_subtract.addActionListener(this);
        button_multiply.addActionListener(this);
        button_divide.addActionListener(this);
        button_equals.addActionListener(this);
        button_clear.addActionListener(this);

        // Set default button (=)
       digits_button_panel.getRootPane().setDefaultButton(button_equals);

        // Exit on close
        frm.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // Display frame(s)
        frm.setVisible(true);
        digits_button_panel.setVisible(true);
        display_panel.setVisible(true);
    }   
    
    
    
    public void actionPerformed (ActionEvent e)
    {

        if (e.getSource() == button_0 &&  ( digits < DIGITCOUNTER ) )
        {
            current_screen = current_screen + "0";
            screen.setText(current_screen);
            digits++;
        }
        if (e.getSource() == button_1 &&  ( digits < DIGITCOUNTER ) )
        {
            current_screen = current_screen + "1";
            screen.setText(current_screen);
            digits++;
        }
        if (e.getSource() == button_2 &&  ( digits < DIGITCOUNTER ) )
        {
            current_screen = current_screen + "2";
            screen.setText(current_screen);
            digits++;
        }
        if (e.getSource() == button_3 &&  ( digits < DIGITCOUNTER ) )
        {
            current_screen = current_screen + "3";
            screen.setText(current_screen);
            digits++;
        }
        if (e.getSource() == button_4 &&  ( digits < DIGITCOUNTER ) )
        {
            current_screen = current_screen + "4";
            screen.setText(current_screen);
            digits++;
        }
        if (e.getSource() == button_5 &&  ( digits < DIGITCOUNTER ) )
        {
            current_screen = current_screen + "5";
            screen.setText(current_screen);
            digits++;
        }
        if (e.getSource() == button_6 &&  ( digits < DIGITCOUNTER ) )
        {
            current_screen = current_screen + "6";
            screen.setText(current_screen);
            digits++;
        }
        if (e.getSource() == button_7 &&  ( digits < DIGITCOUNTER ) )
        {
            current_screen = current_screen + "7";
            screen.setText(current_screen);
            digits++;
        }
        if (e.getSource() == button_8 &&  ( digits < DIGITCOUNTER ) )
        {
            current_screen = current_screen + "8";
            screen.setText(current_screen);
            digits++;
        }
        if (e.getSource() == button_9 &&  ( digits < DIGITCOUNTER ) )
        {
            current_screen = current_screen + "9";
            screen.setText(current_screen);
            digits++;
        }
        
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