// import javax.swing.*;
// import javax.swing.event.DocumentEvent;
// import javax.swing.event.DocumentListener;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.io.IOException;
// import java.util.regex.Pattern;
// import java.util.*;
// import java.awt.Color;
// import java.awt.event.FocusEvent;
// import java.awt.event.FocusListener;


// public class SignUp extends JFrame {
//     private static Welcome welcome;
//     private JFrame frame;
//     private JButton signUpButton;
//     private JTextField email;
//     private JTextField firstName;
//     private JTextField lastName;
//     private JTextField sexField;
//     private JTextField dobField;
//     private JTextField mobileField;
//     private JTextField city;
//     private JPasswordField password;
//     private JLabel usernameError;
//     private JLabel passwordError;
//     private JLabel nameError;

//     public SignUp() throws IOException {
//         frame = new JFrame("Sign In Form");
//         firstName = new JTextField();
//         lastName = new JTextField();
//         mobileField = new JTextField();
//         sexField = new JTextField();
//         dobField = new JTextField();
//         city = new JTextField();
//         email = new JTextField();
//         password = new JPasswordField();
//         signUpButton = new JButton("Sign In");
//         nameError = new JLabel();
//         usernameError = new JLabel();
//         passwordError = new JLabel();

//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(1000, 800);

//         // Set the background image
//         JPanel backgroundPanel = new JPanel() {
//             @Override
//             protected void paintComponent(Graphics g) {
//                 super.paintComponent(g);
//                 ImageIcon icon = new ImageIcon("images/signupbg.jpg");
//                 Image image = icon.getImage();
//                 g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
//             }
//         };
//         // JPanel backgroundPanel = new JPanel();
//         // backgroundPanel.setBackground(Color.YELLOW);
//         backgroundPanel.setLayout(new BorderLayout());

//         // Adding Event Listeners
//         email.getDocument().addDocumentListener(new DocumentListener() {
//             @Override
//             public void insertUpdate(DocumentEvent e) {
//                 validateEmail();
//             }

//             @Override
//             public void removeUpdate(DocumentEvent e) {
//                 validateEmail();
//             }

//             @Override
//             public void changedUpdate(DocumentEvent e) {
//                 validateEmail();
//             }

//             private void validateEmail() {
//                 String emailText = email.getText().trim();
//                 if (emailText.length() > 0 && !emailText.equals("Enter your email")) {
//                     if (validateMail(emailText)) {
//                         usernameError.setForeground(new Color(50, 168, 58));
//                         usernameError.setText("Email is valid");
//                     } else {
//                         usernameError.setForeground(Color.RED);
//                         usernameError.setText("Email is not valid");
//                     }
//                 } else {
//                     usernameError.setText("");
//                 }
//             }
//         });

//         // private boolean validatePasswordForBox(String passwordText) {
//         //     passwordText = passwordText.trim();
//         //     if (passwordText.length() > 0 && !passwordText.equals("Enter your password")) {
//         //         if (passwordText.length() < 8) {
//         //             passwordError.setForeground(Color.RED);
//         //             passwordError.setText("Password must be of length 8");
//         //             return false;
//         //         } else if (!passwordText.matches(".*[a-zA-Z]+.*")) {
//         //             passwordError.setForeground(Color.RED);
//         //             passwordError.setText("Password must contain alphabets");
//         //             return false;
//         //         } else if (!passwordText.matches(".*\\d.*")) {
//         //             passwordError.setForeground(Color.RED);
//         //             passwordError.setText("Password must contain digits");
//         //             return false;
//         //         } else {
//         //             passwordError.setForeground(new Color(50, 168, 58));
//         //             passwordError.setText("Valid Password");
//         //             return true;
//         //         }
//         //     } else {
//         //         passwordError.setText("");
//         //         return false;
//         //     }
//         // }
        
//         // // Add the DocumentListener to validate the password
//         // password.getDocument().addDocumentListener(new DocumentListener() {
//         //     @Override
//         //     public void insertUpdate(DocumentEvent e) {
//         //         validatePasswordForBox(String.valueOf(password.getPassword()));
//         //     }
        
//         //     @Override
//         //     public void removeUpdate(DocumentEvent e) {
//         //         validatePasswordForBox(String.valueOf(password.getPassword()));
//         //     }
        
//         //     @Override
//         //     public void changedUpdate(DocumentEvent e) {
//         //         validatePasswordForBox(String.valueOf(password.getPassword()));
//         //     }
//         // });
        
//         // // Add the ActionListener to the signUpButton
//         // signUpButton.addActionListener(new ActionListener() {
//         //     @Override
//         //     public void actionPerformed(ActionEvent e) {
//         //         String emailText = email.getText().trim();
//         //         String passwordText = String.valueOf(password.getPassword()).trim();
        
//         //         if (!validateMail(emailText)) {
//         //             JOptionPane.showMessageDialog(frame, "Please enter a valid email.", "Warning",
//         //                     JOptionPane.WARNING_MESSAGE);
//         //         } else if (!validatePasswordForBox(passwordText)) {
//         //             JOptionPane.showMessageDialog(frame,
//         //                     "Password must be of length 8 and contain both letters and digits.", "Warning",
//         //                     JOptionPane.WARNING_MESSAGE);
//         //         } else {
//         //             JOptionPane.showMessageDialog(frame,
//         //                     "Successfully Logged In !!!\nUsername: " + emailText + "\nPassword: " + passwordText);
//         //             password.setText(null);
//         //             email.setText(null);
//         //             Welcome welcomeFrame = new Welcome(); // Show the existing Welcome screen
//         //             welcomeFrame.setVisible(true);
//         //             dispose(); // Assuming you're calling this from the SignUp JFrame, to dispose of the current frame
//         //         }
//         //     }
//         // });
        

//         // signUpButton.addActionListener(new ActionListener() {
//         //     @Override
//         //     public void actionPerformed(ActionEvent e) {
//         //         String emailText = email.getText().trim();
//         //         String passwordText = String.valueOf(password.getPassword()).trim();

//         //         if (!validateMail(emailText)) {
//         //             JOptionPane.showMessageDialog(frame, "Please enter a valid email.", "Warning",
//         //                     JOptionPane.WARNING_MESSAGE);
//         //         } else if (!validatePassword(passwordText)) {
//         //             JOptionPane.showMessageDialog(frame,
//         //                     "Password must be of length 8 and contain both letters and digits.", "Warning",
//         //                     JOptionPane.WARNING_MESSAGE);
//         //         } else {
//         //             JOptionPane.showMessageDialog(frame,
//         //                     "Successfully Logged In !!!\nUsername: " + emailText + "\nPassword: " + passwordText);
//         //             password.setText(null);
//         //             email.setText(null);
//         //             Welcome welcomeFrame = new Welcome(); // Show the existing Welcome screen
//         //             welcomeFrame.setVisible(true);
//         //             frame.dispose();
//         //         }
//         //     }

//         //     private boolean validatePassword(String passwordText) {
//         //         passwordText = passwordText.trim();
//         //         if (passwordText.length() > 0 && !passwordText.equals("Enter your password")) {
//         //             if (passwordText.length() < 8) {
//         //                 passwordError.setForeground(Color.RED);
//         //                 passwordError.setText("Password must be of length 8");
//         //                 return false;
//         //             } else if (!passwordText.matches(".*[a-zA-Z]+.*")) {
//         //                 passwordError.setForeground(Color.RED);
//         //                 passwordError.setText("Password must contain alphabets");
//         //                 return false;
//         //             } else if (!passwordText.matches(".*\\d.*")) {
//         //                 passwordError.setForeground(Color.RED);
//         //                 passwordError.setText("Password must contain digits");
//         //                 return false;
//         //             } else {
//         //                 passwordError.setText("");
//         //                 return true;
//         //             }
//         //         } else {
//         //             passwordError.setText("");
//         //             return false;
//         //         }
//         //     }
//         // });

//         // FocusListener emailFocusListener = new FocusListener() {
//         //     public void focusLost(FocusEvent e) {
//         //         if (email.getText().equals("")) {
//         //             email.setText("Enter your email");
//         //             email.setForeground(Color.gray);
//         //         }
//         //     }

//         //     public void focusGained(FocusEvent e) {
//         //         if (email.getText().equals("Enter your email")) {
//         //             email.setText("");
//         //             email.setForeground(Color.black);
//         //         }
//         //     }
//         // };

//         // email.addFocusListener(emailFocusListener);

//         // password.addFocusListener(new FocusListener() {
//         //     public void focusLost(FocusEvent e) {
//         //         char[] passwordChars = password.getPassword();
//         //         if (passwordChars.length == 0) {
//         //             password.setText("Enter your password");
//         //             password.setForeground(Color.gray);
//         //             password.setEchoChar((char) 0); // Show the text as it is
//         //         }
//         //     }

//         //     public void focusGained(FocusEvent e) {
//         //         char[] passwordChars = password.getPassword();
//         //         if (Arrays.equals(passwordChars, "Enter your password".toCharArray())) {
//         //             password.setText("");
//         //             password.setEchoChar('•'); // Set echo character to bullet
//         //             password.setForeground(Color.black);
//         //         }
//         //     }
//         // });

//         JPanel bottomPanel = new JPanel(new GridBagLayout());
//         bottomPanel.setOpaque(false); // Make the bottom panel transparent

//         // Add components to the bottom panel
//         GridBagConstraints input = new GridBagConstraints();
//         // Insets textInsets = new Insets(10, 10, 5, 10);
//         Insets errorInsets = new Insets(0, 20, 0, 0);
//         input.fill = GridBagConstraints.HORIZONTAL;
//         input.insets = new Insets(10, 10, 5, 10);

//         Font font = new Font("Times New Roman", Font.BOLD, 20);
//         Color textColor = Color.WHITE;

//         JLabel signUpLabel = new JLabel("Sign Up for FREE!");
//         Font signUpLabelFont = new Font("Times New Roman", Font.BOLD, 30);
//         signUpLabel.setFont(signUpLabelFont);
//         signUpLabel.setForeground(textColor);
//         input.gridx = 0;
//         input.gridy = 0;
//         input.gridwidth = 3; // Span across 3 columns
//         input.anchor = GridBagConstraints.CENTER;
//         bottomPanel.add(signUpLabel, input);

//         JLabel nameLabel = new JLabel("Name:");
//         nameLabel.setFont(font);
//         nameLabel.setForeground(textColor);

//         JLabel mobileLabel = new JLabel("Mobile Number:");
//         mobileLabel.setFont(font);
//         mobileLabel.setForeground(textColor);

//         JLabel sexLabel = new JLabel("Sex:");
//         sexLabel.setFont(font);
//         sexLabel.setForeground(textColor);

//         JLabel dobLabel = new JLabel("Date of Birth:");
//         dobLabel.setFont(font);
//         dobLabel.setForeground(textColor);

//         JLabel cityLabel = new JLabel("City:");
//         cityLabel.setFont(font);
//         cityLabel.setForeground(textColor);

//         JLabel emailLabel = new JLabel("Email:");
//         emailLabel.setFont(font);
//         emailLabel.setForeground(textColor);

//         JLabel passwordLabel = new JLabel("Password:");
//         passwordLabel.setFont(font);
//         passwordLabel.setForeground(textColor);

//         JLabel nameError = new JLabel();
//         JLabel usernameError = new JLabel();
//         JLabel passwordError = new JLabel();

//         // All Text Fields
//         textColor = Color.BLACK;

//         JTextField firstName = new JTextField(20);
//         textColor = Color.BLACK;
//         firstName.setForeground(textColor);
//         firstName.setText("Enter your first name"); // Placeholder text
//         firstName.setPreferredSize(new Dimension(200, 25));

//         JTextField lastName = new JTextField(20);
//         lastName.setForeground(textColor);
//         lastName.setText("Enter your last name"); // Placeholder text
//         lastName.setPreferredSize(new Dimension(200, 25));

//         JTextField mobileField = new JTextField(20);
//         mobileField.setForeground(textColor);
//         mobileField.setText("Enter your mobile number"); // Placeholder text
//         mobileField.setPreferredSize(new Dimension(200, 25));

//         JTextField sexField = new JTextField(20);
//         sexField.setForeground(textColor);
//         sexField.setText("Enter your Sex");
//         sexField.setPreferredSize(new Dimension(200, 25));

//         JTextField dobField = new JTextField(20);
//         dobField.setForeground(textColor);
//         dobField.setText("YYYY/MM/DD");
//         dobField.setPreferredSize(new Dimension(200, 25));

//         JTextField city = new JTextField(20);
//         city.setText("Enter your City");
//         city.setForeground(textColor);
//         city.setPreferredSize(new Dimension(200, 25));

//         JTextField email = new JTextField(20);
//         email.setForeground(textColor);
//         email.setText("Enter your Email");
//         email.setPreferredSize(new Dimension(200, 25));

//         JPasswordField password = new JPasswordField(20);
//         password.setForeground(textColor);
//         password.setText("Enter your Password");
//         password.setPreferredSize(new Dimension(200, 25));

//         JButton signUpButton = new JButton("Sign Up");
//         signUpButton.setForeground(Color.black);
//         Font buttonFont = new Font("Times New Roman", Font.BOLD, 15);
//         signUpButton.setFont(buttonFont);

//         // Name Label
//         // input.anchor = GridBagConstraints.WEST; // Position at the top
//         input.gridwidth = 1;
//         input.gridx = 0;
//         input.gridy = 1;
//         input.anchor = GridBagConstraints.EAST;
//         bottomPanel.add(nameLabel, input);

//         // First Name Text Field
//         input.gridx = 1;
//         input.anchor = GridBagConstraints.CENTER; 
//         bottomPanel.add(firstName, input);

//         // Last Name Text Field
//         // input.anchor = GridBagConstraints.WEST;
//         input.gridx = 2;
//         input.gridy = 1;
//         bottomPanel.add(lastName, input);

//         // mOBILE nUMber
//         input.gridy = 2;
//         input.gridx = 0;
//         input.anchor = GridBagConstraints.EAST;
//         bottomPanel.add(mobileLabel, input);

//         input.gridx = 1;
//         input.gridy = 2;
//         input.anchor = GridBagConstraints.CENTER;
//         bottomPanel.add(mobileField, input);

//         input.gridy = 3;
//         input.gridx = 0;
//         input.anchor = GridBagConstraints.EAST;
//         bottomPanel.add(sexLabel, input);

//         input.gridx = 1;
//         input.anchor = GridBagConstraints.CENTER;
//         bottomPanel.add(sexField, input);

//         input.gridy = 4;
//         input.gridx = 0;
//         input.anchor = GridBagConstraints.EAST;
//         bottomPanel.add(dobLabel, input);

//         input.gridx = 1;
//         input.anchor = GridBagConstraints.CENTER;
//         bottomPanel.add(dobField, input);

//         input.gridy = 5;
//         input.gridx = 0;
//         input.anchor = GridBagConstraints.EAST;
//         bottomPanel.add(cityLabel, input);

//         input.gridx = 1;
//         input.anchor = GridBagConstraints.CENTER;
//         bottomPanel.add(city, input);

//         input.gridy = 7;
//         input.gridx = 0;
//         input.anchor = GridBagConstraints.EAST;
//         bottomPanel.add(emailLabel, input);

//         input.gridx = 1;
//         input.anchor = GridBagConstraints.CENTER;
//         bottomPanel.add(email, input);

//         input.gridy = 8;
//         input.gridx = 0;
//         input.anchor = GridBagConstraints.EAST;
//         bottomPanel.add(passwordLabel, input);

//         input.gridx = 1;
//         input.anchor = GridBagConstraints.CENTER;
//         bottomPanel.add(password, input);

//         input.gridy = 9;
//         input.gridx = 0;
//         input.gridwidth = 2;
//         input.anchor = GridBagConstraints.EAST;
//         bottomPanel.add(nameError, input);

//         input.gridy = 10;
//         input.gridwidth = 1;
//         input.insets = errorInsets;
//         input.anchor = GridBagConstraints.EAST;
//         bottomPanel.add(usernameError, input);

//         input.gridy = 11;
//         input.anchor = GridBagConstraints.EAST;
//         bottomPanel.add(passwordError, input);

//         input.gridy = 12;
//         input.gridx = 1;
//         input.insets = new Insets(20, 50, 0, 300);
//         bottomPanel.add(signUpButton, input);
//         signUpButton.setPreferredSize(new Dimension(90, 35));

//         backgroundPanel.add(bottomPanel, BorderLayout.CENTER);
//         frame.add(backgroundPanel);
//         frame.setVisible(true);
//     }

//     // The Event Listener Functions
//     private boolean validateMail(String mail) {
//         String regExp = "^[a-zA-Z0-9_+&*-]+(?:\\." +
//                 "[a-zA-Z0-9_+&*-]+)*@" +
//                 "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
//                 "A-Z]{2,7}$";
//         Pattern pattern = Pattern.compile(regExp);
//         return pattern.matcher(mail).matches();
//     }
// }