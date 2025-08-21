package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import File.*;
 
public class LoginPage extends JFrame  implements ActionListener, MouseListener,KeyListener {
 
    JLabel userLabel1;
	JLabel userLabel2;
	JLabel userLabel3;
    JLabel passwordLabel;

    JTextField userField;
	JPasswordField passField;

    JButton loginButton;
	JButton exitButton;
    JButton registerButton;

	//ImageIcon image;
        
    Font font15 = new Font("Georgia", Font.BOLD, 15);
	Font font17 = new Font("Georgia", Font.BOLD, 17);
    Font font30 = new Font("Cooper Black", Font.BOLD, 30);
	Font fontA = new Font("Arial", Font.BOLD, 20);
	Font fontT  = new Font("Times New Roman", Font.BOLD, 15);
	Font fontV  = new Font("Verdana", Font.BOLD, 15);


    public LoginPage() {

		super("LOGIN PAGE"); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setBounds(500, 800, 950, 800); 
        this.setLocation(350, 10);
		this.getContentPane().setBackground(new Color(173, 195, 209));
        this.setLayout(null);
		
		//image = new ImageIcon("./Image/pic 1.jpg");

		userLabel1 = new JLabel("USER LOGIN");
		userLabel1.setBounds(380,150,300,30);
		userLabel1.setFont(font30);
		this.add(userLabel1);

		userLabel2 = new JLabel("USERNAME: ");
		userLabel2.setBounds(245,220,200,30);
		userLabel2.setFont(fontV);
		this.add(userLabel2);

		userField = new JTextField();
		userField.setBounds(350,220,300,35);
		userField.setFont(fontA);
		userField.setBackground(new Color(238, 236, 241));
		userField.addKeyListener(this);
		this.add(userField);

		passwordLabel= new JLabel("PASSWORD: ");
		passwordLabel.setBounds(240,270,300,30);
		passwordLabel.setFont(fontV);
		this.add(passwordLabel);

		passField = new JPasswordField();
		passField.setEchoChar('*');
		passField.setBounds(350,270,300,35);
		passField.setFont(fontA);
		passField.setBackground(new Color(238, 236, 241));
		passField.addKeyListener(this);
		this.add(passField);

		loginButton = new JButton("LOGIN");
		loginButton.setBounds(240,380,150,30);
		loginButton.setFont(fontT);
		loginButton.setBackground(new Color(249, 231, 149));
		loginButton.setForeground(Color.BLACK);
		loginButton.addActionListener(this);
		loginButton.addMouseListener(this);
		loginButton.addKeyListener(this);
		this.add(loginButton);

		exitButton = new JButton("EXIT");
		exitButton.setBounds(500,380,150,30);
		exitButton.setFont(fontT);
		exitButton.setBackground(new Color(255, 103, 95));
		exitButton.setForeground(Color.BLACK);
		exitButton.addActionListener(this);
		exitButton.addMouseListener(this);
		exitButton.addKeyListener(this);
		this.add(exitButton);

		userLabel3 = new JLabel("If you don't have an account, please register.");
		userLabel3.setBounds(240,450,500,30);
		userLabel3.setFont(font17);
		this.add(userLabel3);

		registerButton = new JButton("REGISTER");
		registerButton.setBounds(380,520,150,30);
		registerButton.setFont(font15);
		registerButton.setBackground(new Color(44, 56, 156));
		registerButton.setForeground(Color.WHITE);
		registerButton.addActionListener(this);
		registerButton.addMouseListener(this);
		registerButton.addKeyListener(this);
		this.add(registerButton);
 
		//this.setIconImage(image.getImage());
        this.setVisible(true); 
    }

	public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER){
        
			String userName =userField.getText();
			String userPassword = String.valueOf(passField.getPassword());
			if(FileIO.checkUser(userName,userPassword)){
				JOptionPane.showMessageDialog(this,"User Verified");
				freightForwardingPage ffp = new freightForwardingPage();
				ffp.previousPage = this;
				this.setVisible(false);}
			else{JOptionPane.showMessageDialog(this,"Please input valid username or password.","Invalid User",JOptionPane.WARNING_MESSAGE);}}

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (passField.hasFocus()) {userField.requestFocus();} 
			else if (loginButton.hasFocus()) {passField.requestFocus();} 
			else if (registerButton.hasFocus()) {loginButton.requestFocus();}}
 
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (userField.hasFocus()) {passField.requestFocus();} 
			else if(passField.hasFocus()) {loginButton.requestFocus();} 
			else if (loginButton.hasFocus()) {registerButton.requestFocus();}}
 
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (exitButton.hasFocus()) {loginButton.requestFocus();} 
			else if(registerButton.hasFocus()) {exitButton.requestFocus();}}
 
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (loginButton.hasFocus()) {exitButton.requestFocus();} 
			else if(exitButton.hasFocus()) {registerButton.requestFocus();}}}
 
 
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

	public void mouseEntered(MouseEvent e){
		if(e.getSource()==loginButton){
            loginButton.setBackground(Color.BLACK);
		    loginButton.setForeground(Color.WHITE);}

		else if (e.getSource()==exitButton){
			exitButton.setBackground(Color.BLACK);
			exitButton.setForeground(Color.WHITE);}

		else if (e.getSource()==registerButton){
			registerButton.setBackground(Color.BLACK);
			registerButton.setForeground(Color.WHITE);}}

	public void mouseExited(MouseEvent e){
		if(e.getSource() == loginButton){
		    loginButton.setBackground(new Color(249, 231, 149));
			loginButton.setForeground(Color.BLACK);}

		else if (e.getSource() ==exitButton){
		   exitButton.setBackground(new Color(253, 103, 95));
		   exitButton.setForeground(Color.BLACK);}

		else if (e.getSource() ==registerButton){
		   registerButton.setBackground(new Color(44, 56, 156));
		   registerButton.setForeground(Color.WHITE);}}

	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == loginButton){
			String userName =userField.getText();
			String userPassword = String.valueOf( passField.getPassword());
			if(FileIO.checkUser(userName,userPassword)){
				JOptionPane.showMessageDialog(this,"User Verified");
				freightForwardingPage ffp = new freightForwardingPage();
				ffp.previousPage = this;
				this.setVisible(false);}

			else{JOptionPane.showMessageDialog(this,"Please input valid User Name or Password","Invalid User",JOptionPane.WARNING_MESSAGE);}}

		else if(e.getSource() == registerButton){JOptionPane.showMessageDialog(this,"Register Button Pressed","Register",JOptionPane.WARNING_MESSAGE);}

		else if(e.getSource() == exitButton){
            JOptionPane.showMessageDialog(this,"Please press OK for Exit.","EXIT",JOptionPane.INFORMATION_MESSAGE);
	          System.exit(0);	
		}}}