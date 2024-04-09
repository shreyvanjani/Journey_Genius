
// import javax.swing.*;
// import java.awt.*;

// public class Login {
// 	JButton button;
// 	JButton button2;
//     JFrame frame = new JFrame();
// 	boolean isFaceVisible = false;

//     public Login() {
//         // Image for Logo
//         ImageIcon image = new ImageIcon("images//logo.png");
//         frame.setIconImage(image.getImage());

//         // Resizing the image to fit within the label
//         Image img = image.getImage();
//         int logoWidth = 300; // Adjust the width as desired
//         int logoHeight = 300; // Adjust the height as desired
//         Image resizedImg = img.getScaledInstance(logoWidth, logoHeight, Image.SCALE_SMOOTH);
//         ImageIcon resizedIcon = new ImageIcon(resizedImg);

// 		button=new JButton();
// 		button.setBounds(430,520,120,45);//(x,y,Width,Height)
// 		button.setText("Login");//Set the button text
// 		button.setFocusable(true);//Focus on the botton after clock it

// 		button2=new JButton();
// 		button2.setBounds(630,520,120,45);//(x,y,Width,Height)
// 		button2.setText("Sign Up");//Set the button text
// 		button2.setFocusable(true);//Focus on the botton after clock it

//         // Making the Icon image
//         JLabel jglogo = new JLabel();
//         jglogo.setIcon(resizedIcon);
// 		jglogo.setHorizontalAlignment(JLabel.CENTER);
// 		jglogo.setVerticalAlignment(JLabel.CENTER);

//         // Setting the Main Frame Properties
//         frame.setTitle("Journey Genius");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(1200, 700); // Initial size
// 		frame.setResizable(false);
//         frame.setVisible(true);
// 		frame.add(button);
// 		frame.add(button2);
// 		frame.add(jglogo); //Add Label after the Button

//         ImageIcon bgimage=new ImageIcon("images//logo.png");
//         frame.setIconImage(bgimage.getImage()); // Set an image for the GUI Icon on top
//         frame.getContentPane().setBackground(new Color(0x000000)); // Black Background for the frame
//     }

// 	public void actionPerformed(ActionEvent e){
// 		if(e.getSource()==button){
// 			// System.out.println("POO");
// 		}
// 	}
// }
