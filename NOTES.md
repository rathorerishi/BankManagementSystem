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
