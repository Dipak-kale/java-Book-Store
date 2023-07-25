package Hola;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class demo implements ActionListener {
    JButton button;
    JButton button2;
    JLabel Label1;
    JLabel Label2;
    JFrame f;
    JFrame f2;
    JFrame f3;
    JFrame f4;
    JLabel Label3;
    JLabel Label5;
    JTextField text1;
    JButton Button4 = new JButton("done");
    JLabel Label4;
    JList list;
    Boolean check = true;
    JPanel panel = new JPanel(null);
    String Genre;
    String price;
    JButton Button5;
    JComboBox c2;
    JFrame f5;
    JLabel label6;

    public demo() {
        f = new JFrame();
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout(3, 3));
        Label1 = new JLabel("Welcome to the virtual bookstore application");
        text1 = new JTextField("Please write your name or coustmer ID");
        Label2 = new JLabel("Please hit next button to begin the experience");
        button = new JButton("next");
        f.add(Label1, BorderLayout.NORTH);
        f.add(Label2, BorderLayout.CENTER);
        f.add(button, BorderLayout.PAGE_END);
        f.setTitle("BorderLayout Demo");
        f.setSize(480, 200);
        f.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                f.dispose();
                GenreFrame();
            }
        });

    }

    void GenreFrame() {
        // System.out.println("hhh2");
        f2 = new JFrame("Genre");
        f2.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f2.add(panel);
        f2.setPreferredSize(new Dimension(480, 200));
        f2.pack();
        f2.setVisible(true);
        Label3 = new JLabel("Please select your prefferred genre and press done");
        Label3.setBounds(0, 0, 480, 20);
        panel.add(Label3);
        DefaultListModel<String> i1 = new DefaultListModel<>();
        final JList<String> list = new JList<>(i1);
        i1.addElement("Drama");
        i1.addElement("Crime");
        i1.addElement("Kids");
        list.setBounds(0, 25, 50, 70);
        panel.add(list);
        // Label4.setSize(480,100);
        // Label4.setBounds(70, 40, 200, 200);
        panel.add(Button4);
        // panel.add(Label4);
        Button4.setBounds(50, 40, 50, 50);
        // System.out.println("hh2h");
        Button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Genre = (String) list.getSelectedValue();
                f2.dispose();
                PriceFrame(Genre);

            }
        });

    }

    void PriceFrame(String Genre) {
        System.out.println(Genre);
        f3 = new JFrame("price range");
        f3.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f3.setLayout(new FlowLayout(5, 5, 5));
        Label4 = new JLabel("Please select your suitable price range");
        String price[] = { "High", "low" };
        JComboBox c1 = new JComboBox(price);

        Button5 = new JButton("done");
        f3.add(Label4);
        f3.add(c1);
        f3.add(Button5);
        f3.setPreferredSize(new Dimension(480, 200));
        f3.pack();
        f3.setVisible(true);
        Button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String price = (String) c1.getSelectedItem();
                ChooseBook(price, Genre);
                f3.dispose();
            }
        });

    }

    void finalj(String choice) {
        System.out.println(choice);
        f5 = new JFrame("choose book");
        f5.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f5.setLayout(new FlowLayout());
        label6 = new JLabel();
        JLabel label7 = new JLabel();
        if (choice.equals("Crime1_High")) {
            label6 = new JLabel("Your bill is 7 dollars ");
        } else if (choice.equals("Crime2_High")) {
            label6.setText("Your bill is 7 dollars ");
        } else if (choice.equals("Crime3_High")) {
            label6.setText("Your bill is 7 dollars ");
        } else if (choice.equals("Crime1_Low")) {
            label6.setText("Your bill is 3 dollars ");
        } else if (choice.equals("Crime2_Low")) {
            label6.setText("Your bill is 3 dollars ");
        } else if (choice.equals("Crime3_Low")) {
            label6.setText("Your bill is 3 dollars ");
        } else if (choice.equals("Drama1_High")) {
            label6 = new JLabel("Your bill is 9 dollars ");
        } else if (choice.equals("Drama2_High")) {
            label6.setText("Your bill is 9 dollars ");
        } else if (choice.equals("Drama3_High")) {
            label6.setText("Your bill is 9 dollars ");
        } else if (choice.equals("Drama1_Low")) {
            label6.setText("Your bill is 5 dollars ");
        } else if (choice.equals("Drama2_Low")) {
            label6.setText("Your bill is 5 dollars ");
        } else if (choice.equals("Drama3_Low")) {
            label6.setText("Your bill is 5 dollars ");
        } else if (choice.equals("Kids1_High")) {
            label6 = new JLabel("Your bill is 11 dollars ");
        } else if (choice.equals("Kids2_High")) {
            label6.setText("Your bill is 11 dollars ");
        } else if (choice.equals("Kids3_High")) {
            label6.setText("Your bill is 11 dollars ");
        } else if (choice.equals("Kids1_Low")) {
            label6.setText("Your bill is 8 dollars ");
        } else if (choice.equals("Kids2_Low")) {
            label6.setText("Your bill is 8 dollars ");
        } else if (choice.equals("Kids3_Low")) {
            label6.setText("Your bill is 8 dollars ");
        }
        f5.add(label6);
        f5.setPreferredSize(new Dimension(480, 200));
        f5.pack();
        f5.setVisible(true);
    }

    void ChooseBook(String price, String Genre) {
        f4 = new JFrame("choose book");
        f4.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f4.setLayout(new FlowLayout(5, 5, 5));
        Label5 = new JLabel("Please select your book");
        if (Genre.equals("Crime") && price.equals("High")) {
            String s1[] = { "Crime1_High", "Crime2_High", "Crime3_High" };
            c2 = new JComboBox(s1);
        } else if (Genre.equals("Crime") && price.equals("low")) {
            String s1[] = { "Crime1_Low", "Crime2_Low", "Crime3_Low" };
            c2 = new JComboBox(s1);
        } else if (Genre.equals("Drama") && price.equals("High")) {
            String s1[] = { "Drama1_High", "Drama2_High", "Drama3_High" };
            c2 = new JComboBox(s1);
        } else if (Genre.equals("Drama") && price.equals("low")) {
            String s1[] = { "Drama1_Low", "Drama2_Low", "Drama3_Low" };
            c2 = new JComboBox(s1);
        } else if (Genre.equals("Kids") && price.equals("High")) {
            String s1[] = { "Kids1_High", "Kids2_High", "Kids3_High" };
            c2 = new JComboBox(s1);
        } else if (Genre.equals("Kids") && price.equals("low")) {
            String s1[] = { "Kids1_Low", "Kids2_Low", "Kids3_Low" };
            c2 = new JComboBox(s1);
        }
        JButton Button6 = new JButton("done");
        f4.add(Label5);
        f4.add(c2);
        f4.add(Button6);
        f4.setPreferredSize(new Dimension(480, 200));
        f4.pack();
        f4.setVisible(true);
        Button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String choice = (String) c2.getSelectedItem();

                f4.dispose();
                finalj(choice);
            }
        });

    }

    public static void main(String args[]) {

        demo b = new demo();

    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub

    }
}
