

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    JButton login,signup,clear;//to access globally thats why we defined it outside constructor
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){//constructor bnaya h
        setLayout(null);//this will set to custom layout not border layout
        setTitle("Automated Teller Machine");//set title of the frame
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);//as frame me directly icon ko nhi daal skte first hme jlabel pr daalna hoga image icon ko then usko hme add krna hoga
        label.setBounds(70,10,100,100);
        add(label);
        JLabel text=new JLabel("Welcome To ATM");
        text.setFont(new Font("Osward", Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardno=new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD,30));
        cardno.setBounds(120,150,150,30);
        add(cardno);

        cardTextField=new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);

        JLabel pin=new JLabel("Pin:");
        pin.setFont(new Font("Raleway", Font.BOLD,30));
        pin.setBounds(120,220,250,30);
        add(pin);

        pinTextField=new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);

        login=new JButton("Sign In");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear=new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup=new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.white);//set the bakcground color of frame to white
        setSize(800,480);//this is the function wwe use to create frame 
        setVisible(true);//this function is used to make frame visible for users as frame is invisible by default
        setLocation(350,200);//bascially to set the location of frame as by default its showing on top left so to make it visible in middle we set the location

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");

        }
        
        else if(ae.getSource()==signup){
            setVisible(false);
            new SignupOne().setVisible(true);
            
        }
    }
    public static void main(String[] args){
        new Login();// created an object and as sson as object is created constructor will be called so we need to write our ocde inside constructor
    }

    
}
