September 21:
Started working on the **Bank Management System** project.
- Installed **MySQL** in my system (will be used later for backend database).
- Designed and implemented the **Login Screen UI** using **Java Swing**.
- Created the `Login.java` class which:
  - Inherits from `JFrame` to create a custom window.
  - Implements `ActionListener` to handle button click events.

UI Elements Used:
- `JLabel` → for text labels like "Card No", "Pin", and welcome text.
- `JTextField` → to allow users to input the card number.
- `JPasswordField` → to securely input the PIN.
- `JButton` → created three buttons: **Sign In**, **Clear**, and **Sign Up**.
- `ImageIcon` → added a logo image to the frame using JLabel.

Learnings:
- Learned how to create and display a **custom JFrame** with layout, size, and positioning.
- Understood the use of `setLayout(null)` to allow absolute positioning using `setBounds(x, y, width, height)`.
- Learned how to **scale images** and add them to the UI using `ImageIcon`, `ClassLoader`, and `JLabel`.
- Understood how **constructors work** in Java and how to initialize components inside them.
- Declared UI components (like buttons and fields) **outside the constructor** to make them accessible in the `actionPerformed()` method.
- Implemented the `ActionListener` interface to **handle button clicks**.
  - On **Clear button click**, both text fields are reset.
  - **Login and Signup** buttons are functional with placeholders for further logic.

Thats it for today.See you tomorrow

Sept. 22, 2025:
Started working on sign up screen
add name,father's name,email,address,city,state and pincode textfield and label
Also added dob Jdatachooser by adding calendar jar fle inside library folder
Also added radio button for marital status and gender label and also added button group so that out of two gender lablel(male and female) user can choose only one and also added button group for marital status so that user can choose only one radiobutton out of three(married,unmarried or other).

September 23,2025:
Added the next button 
Also implement ActionListenerin button "next" and inside that if user left the name textfield as empty and user clicks on next button then a pop up screen will open which shows name is required field.This we can do for all the textfields.
Lets move to login screen again and in that if user clicks on sign up button then the present should be invisible so we set visible to false and then calls the signupone object and it calls the constructor and we set the visible to be true and hence by doing so when user clicks on signup button then user will navigate to signupone screen from login screen.
Next I did database connection using jdbc so for that 5 steps is required:
1. register driver
2. create connection
3. create statement
4. execute query
5. close connection

So to connect to database i made another java file as Conn.java and as database is etended entity so we have chances to get errors during run time not compile time,so to catch errors we have to do exception handling.
 c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Password");//create connection
s=c.createStatement();//create statement
and now to execute this we have action listener in signupone.java file where we have another method ActionPositioned(ae) and inside that first we will try to extract all the data from the formno,dob and otehr fields fill by user so we have to extract that data and add to database so to add to the database all the field values should be in string and after that for radio buttons will run conditional statements and then we have exception handlings in which the name field if its empty will show a pop up window with message name is required else will call conn object and that will cnnect to database.
Inside database first will create a table say signup and write all the columns like formno,dob etc and once we run the SignupOne.java file and fill all the texxtfield and choose among radio button and then click on next and after that inside just write Select * from signup and run query you will see the row of formno,name,do etc whatever user filled during signup and hence we got it in our database and ya our db is connected.
So thats what I did today!


