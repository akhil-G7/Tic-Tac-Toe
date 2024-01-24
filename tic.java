import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Tic class representing the Tic Tac Toe game
class Tic {
    static int val = 0; // Counter to keep track of the number of moves
    static int x1, x2, x3, x4, x5, x6, x7, x8, x9;  // Variables to represent X's moves
    static int o1, o2, o3, o4, o5, o6, o7, o8, o9;  //// Variables to represent O's moves

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(360, 100, 420, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setBackground(Color.ORANGE);
        c.setLayout(null);
        frame.setTitle("Tic Tac Toe Game");
        JLabel name = new JLabel("Tic Tac Toe");
        c.add(name);
        name.setBounds(150, 5, 200, 100);
        Font font = new Font("time romans", Font.BOLD, 20);
        name.setFont(font);
        JButton b1 = new JButton();
        c.add(b1);
        JLabel player1 = new JLabel("Player one {X} | Player two {O}");
        player1.setFont(font);
        c.add(player1);
        player1.setBounds(80, 240, 300, 100);
        JLabel who = new JLabel();
        c.add(who);
        who.setFont(font);
        who.setBounds(130, 240, 300, 100);
        // ActionListener for button b1
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (val % 2 == 0) {
                    b1.setText("X");
                    val += 1;
                    x1 = 1;
                    // Check for winning conditions
                    if (x1 == 1 && x2 == 1 && x3 == 1) {
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (x1 == 1 && x4 == 1 && x7 == 1) {
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (x1 == 1 && x5 == 1 && x9 == 1) {
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    // Check for a tie
                    if(val==9){
                        JOptionPane.showMessageDialog(frame,"TIE MATCH","Details",JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    who.setText("Player two turn");
                    player1.setText("");
                } else {
                    b1.setText("O");
                    val += 1;
                    o1 = 2;
                    // Check for winning conditions
                    if (o1 == 2 && o2 == 2 && o3 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (o1 == 2 && o4 == 2 && o7 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (o1 == 2 && o5 == 2 && o9 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    who.setText("Player one turn");
                    player1.setText("");
                }
            }
        });
        b1.setBounds(100, 100, 50, 30);
        JButton b2 = new JButton();
        c.add(b2);
        b2.setBounds(180, 100, 50, 30);
        // ActionListener for button b2
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (val % 2 == 0) {
                    b2.setText("X");
                    val += 1;
                    x2 = 1;
                    // Check for winning conditions
                    if (x2 == 1 && x5 == 1 && x8 == 1) {
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (x1 == 1 && x2 == 1 && x3 == 1) {
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    // Check for a tie
                    if(val==9){
                        JOptionPane.showMessageDialog(frame,"TIE MATCH","Details",JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    who.setText("Player two turn");
                    player1.setText("");
                } else {
                    b2.setText("O");
                    val += 1;
                    o2 = 2;
                    // Check for winning conditions
                    if (o2 == 2 && o5 == 2 && o8 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (o1 == 2 && o2 == 2 && o3 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    who.setText("Player one turn");
                    player1.setText("");
                }
            }
        });
        JButton b3 = new JButton();
        c.add(b3);
        b3.setBounds(260, 100, 50, 30);
        // ActionListener for button b3
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (val % 2 == 0) {
                    b3.setText("X");
                    val += 1;
                    x3 = 1;
                    // Check for winning conditions
                    if (x1 == 1 && x2 == 1 && x3 == 1) {
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (x3 == 1 && x6 == 1 && x9 == 1) {
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (x3 == 1 && x5 == 1 && x7 == 1) {
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    // Check for a tie
                    if(val==9){
                        JOptionPane.showMessageDialog(frame,"TIE MATCH","Details",JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    who.setText("Player two turn");
                    player1.setText("");
                } else {
                    b3.setText("O");
                    val += 1;
                    o3 = 2;
                    // Check for winning conditions
                    if (o1 == 2 && o2 == 2 && o3 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (o3 == 2 && o6 == 2 && o9 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (o3 == 2 && o5 == 2 && o7 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    who.setText("Player one turn");
                    player1.setText("");
                }
            }
        });
        JButton b4 = new JButton();
        c.add(b4);
        b4.setBounds(100, 160, 50, 30);
        // ActionListener for button b4
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (val % 2 == 0) {
                    b4.setText("X");
                    val += 1;
                    x4 = 1;
                    // Check for winning conditions
                    if (x1 == 1 && x4 == 1 && x7 == 1) {
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (x4 == 1 && x5 == 1 && x6 == 1) {
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    // Check for a tie
                    if(val==9){
                        JOptionPane.showMessageDialog(frame,"TIE MATCH","Details",JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    who.setText("Player two turn");
                    player1.setText("");
                } else {
                    b4.setText("O");
                    val += 1;
                    o4 = 2;
                    // Check for winning conditions
                    if (o1 == 2 && o4 == 2 && o7 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (o4 == 2 && o5 == 2 && o6 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    who.setText("Player one turn");
                    player1.setText("");
                }
            }

        });
        JButton b5 = new JButton();
        c.add(b5);
        b5.setBounds(180, 160, 50, 30);
        // ActionListener for button b5
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (val % 2 == 0) {
                    b5.setText("X");
                    val += 1;
                    x5 = 1;
                    // Check for winning conditions
                    if (x4 == 1 && x5 == 1 && x6 == 1) {
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (x2 == 1 && x5 == 1 && x8 == 1) {
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (x3 == 1 && x5 == 1 && x7 == 1) {
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (x1 == 1 && x5 == 1 && x9 == 1) {
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    // Check for a tie
                    if(val==9){
                        JOptionPane.showMessageDialog(frame,"TIE MATCH","Details",JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    who.setText("Player two turn");
                    player1.setText("");
                } else {
                    b5.setText("O");
                    val += 1;
                    o5 = 2;
                    // Check for winning conditions
                    if (o4 == 2 && o5 == 2 && o6 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (o2 == 2 && o5 == 2 && o8 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (o3 == 2 && o5 == 2 && o7 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (o1 == 2 && o5 == 2 && o9 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    who.setText("Player one turn");
                    player1.setText("");
                }
            }
        });
        JButton b6 = new JButton();
        c.add(b6);
        b6.setBounds(260, 160, 50, 30);
        // ActionListener for button b6
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (val % 2 == 0) {
                    b6.setText("X");
                    val += 1;
                    x6 = 1;
                    // Check for winning conditions
                    if (x4 == 1 && x5 == 1 && x6 == 1) {
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (x3 == 1 && x6 == 1 && x9 == 1) {
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    // Check for a tie
                    if(val==9){
                        JOptionPane.showMessageDialog(frame,"TIE MATCH","Details",JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    who.setText("Player two turn");
                    player1.setText("");
                } else {
                    b6.setText("O");
                    val += 1;
                    o6 = 2;
                    // Check for winning conditions
                    if (o3 == 2 && o6 == 2 && o9 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (o4 == 2 && o5 == 2 && o6 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    who.setText("Player one turn");
                    player1.setText("");
                }
            }
        });
        JButton b7 = new JButton();
        c.add(b7);
        b7.setBounds(100, 220, 50, 30);
        // ActionListener for button b7
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (val % 2 == 0) {
                    b7.setText("X");
                    val += 1;
                    x7 = 1;
                    // Check for winning conditions
                    if (x1 == 1 && x4 == 1 && x7 == 1) {
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (x7 == 1 && x8 == 1 && x9 == 1) {
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (x3 == 1 && x5 == 1 && x7 == 1) {
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    // Check for a tie
                    if(val==9){
                        JOptionPane.showMessageDialog(frame,"TIE MATCH","Details",JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    who.setText("Player two turn");
                    player1.setText("");
                } else {
                    b7.setText("O");
                    val += 1;
                    o7 = 2;
                    // Check for winning conditions
                    if (o1 == 2 && o4 == 2 && o7 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (o7 == 2 && o8 == 2 && o9 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (o3 == 2 && o5 == 2 && o7 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    who.setText("Player one turn");
                    player1.setText("");
                }
            }
        });
        JButton b8 = new JButton();
        c.add(b8);
        b8.setBounds(180, 220, 50, 30);
        // ActionListener for button b8
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (val % 2 == 0) {
                    b8.setText("X");
                    val += 1;
                    x8 = 1;
                    // Check for winning conditions
                    if (x2 == 1 && x5 == 1 && x8 == 1) {
                        who.setText("");
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (x7 == 1 && x8 == 1 && x9 == 1) {
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    // Check for a tie
                    if(val==9){
                        JOptionPane.showMessageDialog(frame,"TIE MATCH","Details",JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    who.setText("Player two turn");
                    player1.setText("");
                } else {
                    b8.setText("O");
                    val += 1;
                    o8 = 2;
                    // Check for winning conditions
                    if (o2 == 2 && o5 == 2 && o8 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (o7 == 2 && o8 == 2 && o9 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    who.setText("Player one turn");
                    player1.setText("");
                }
            }
        });
        JButton b9 = new JButton();
        c.add(b9);
        b9.setBounds(260, 220, 50, 30);
        // ActionListener for button b9
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (val % 2 == 0) {
                    b9.setText("X");
                    val += 1;
                    x9 = 1;
                    // Check for winning conditions
                    if (x3 == 1 && x6 == 1 && x9 == 1) {
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (x1 == 1 && x5 == 1 && x9 == 1) {
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (x7 == 1 && x8 == 1 && x9 == 1) {
                        JOptionPane.showMessageDialog(frame, "Player one won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    // Check for a tie
                    if(val==9){
                        JOptionPane.showMessageDialog(frame,"TIE MATCH","Details",JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    who.setText("Player two turn");
                    player1.setText("");
                } else {
                    b9.setText("O");
                    val += 1;
                    o9 = 2;
                    // Check for winning conditions
                    if (o3 == 2 && o6 == 2 && o9 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (o1 == 2 && o5 == 2 && o9 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (o7 == 2 && o8 == 2 && o9 == 2) {
                        JOptionPane.showMessageDialog(frame, "Player two won the match",
                                "WINNER", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    who.setText("Player one turn");
                    player1.setText("");
                }
            }
        });
    }
}