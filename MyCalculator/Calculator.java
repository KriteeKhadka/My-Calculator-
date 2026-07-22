package MyCalculator;
// Importing all the necessary libraries for GUI creation and event handling
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

// Main class that handles the calculator logics and user interactions
public class Calculator implements ActionListener{
    // Declaring GUI components of the calculator
    private JFrame frame;
    private JLabel titleLabel,firstLabel,secondLabel,resultLabel;
    private JTextField firstText,secondText,resultText;
    private JButton addButton,subtractButton,multiplyButton,divideButton,clearButton;
    
    // Constructor to design and display the GUI window
    public Calculator(){
        //Creating the main window
        frame=new JFrame("My Calculator");
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.ORANGE);

        
        // Setting up the Title 
        titleLabel = new JLabel("Casiofx");
        titleLabel.setBounds(10, 10, 100, 30);
        frame.add(titleLabel);
        
        // Label for the first input 
        firstLabel=new JLabel("Number 1: ");
        firstLabel.setBounds(10,50,100,30);
        frame.add(firstLabel);
        
        // Label for the second input 
        secondLabel=new JLabel("Number 2: ");
        secondLabel.setBounds(10, 100, 100,30);
        frame.add(secondLabel);
        
        //Label for the result display
        resultLabel=new JLabel ("Result: ");
        resultLabel.setBounds(10, 150, 100,30);
        frame.add(resultLabel);
        
        
        //Text field for first input value
        firstText=new JTextField();
        firstText.setBounds(120, 50,200,30);
        frame.add(firstText);
        
        //Text field for second input value
        secondText=new JTextField();
        secondText.setBounds(120, 100,200,30);
        frame.add(secondText);
        
        //Text field to show result (non-editable)
        resultText=new JTextField();
        resultText.setBounds(120, 150, 200, 30);
        resultText.setEditable(false);  // Prevent user from editing the result
        frame.add(resultText);
        
        //Button (addition)
        addButton=new JButton("+");
        addButton.setBounds(30,200,130,40);
        addButton.setBackground(Color.yellow);
        addButton.addActionListener(this);     // Adding event listener
        frame.add(addButton);

        //Button (subtraction)
        subtractButton = new JButton("-");
        subtractButton.setBounds(200, 200, 130, 40);
        subtractButton.setBackground(Color.yellow);
        subtractButton.addActionListener(this);     // Adding event listener
        frame.add(subtractButton);

        //Button (Multiplication)
        multiplyButton = new JButton("*");
        multiplyButton.setBounds(30, 260, 130, 40);
        multiplyButton.setBackground(Color.yellow);
        multiplyButton.addActionListener(this);       // Adding event listener
        frame.add(multiplyButton);

        //Button (division)
        divideButton = new JButton("/");
        divideButton.setBounds(200, 260, 130, 40);
        divideButton.setBackground(Color.yellow);
        divideButton.addActionListener(this);             // Adding event listener
        frame.add(divideButton);

        // Button ( Cleaing all fields)
        clearButton = new JButton("Clear");
        clearButton.setBounds(100, 320, 140, 40);
        clearButton.setBackground(Color.yellow);
        clearButton.addActionListener(this);           // Adding event listener
        frame.add(clearButton);
        
         //Displaying the GUI Frame
        frame.setVisible(true); 
    }
    
    
    // Method to handle all button clicks events
    @Override
    public void actionPerformed(ActionEvent e){
        // When"+" button is clicked , addition operation is performed
        if(e.getSource()==addButton){
            int first=Integer.valueOf(firstText.getText());
            int second=Integer.valueOf(secondText.getText());
            int result=first+second;
            resultText.setText(String.valueOf(result));
        }
        // When"-" button is clicked, subtraction operation is performed
        else if (e.getSource()==subtractButton){
            int first=Integer.valueOf(firstText.getText());
            int second=Integer.valueOf(secondText.getText());
            int result= first-second;
            resultText.setText(String.valueOf(result));   
        }
        // When"*" button is clicked,multiplication operation is performed
        else if (e.getSource()==multiplyButton){
            int first=Integer.valueOf(firstText.getText());
            int second=Integer.valueOf(secondText.getText());
            int result= first*second;
            resultText.setText(String.valueOf(result));   
        }
        // When"/" button is clicked , division operation is performed
        else if (e.getSource()==divideButton){
            int first=Integer.valueOf(firstText.getText());
            int second=Integer.valueOf(secondText.getText());
            int result= first/second;
            resultText.setText(String.valueOf(result));   
        }
        // When "clear" button is clicked, (all the fields will be cleared)
        else if(e.getSource()==clearButton){
            firstText.setText("");
            secondText.setText("");
            resultText.setText("");
        }
    }
    
    // Main method to run the program
    public static void main(String[] args){
        Calculator gui=new Calculator();    // object creation to show the GUI
    }
    
}
