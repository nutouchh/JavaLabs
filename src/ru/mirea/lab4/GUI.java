package ru.mirea.lab4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//TextField
 /*
class LabExample extends JFrame
{
    JTextField jta = new JTextField(10);
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    LabExample()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,100);
        add(jta);
        jta.setForeground(Color.RED);
        jta.setFont(fnt);
        setVisible(true);
    }
    public static void main(String[]args)
    {
        new LabExample();
    }
}*/

//TextField ввод чисел
/*
class LabExample extends JFrame
{
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button = new JButton(" Add them up");
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    LabExample()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,150);
        add(new JLabel("1st Number"));
        add(jta1);
        add(new JLabel("2nd Number"));
        add(jta2);
        add(button);
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    double x1 =
                            Double.parseDouble(jta1.getText().trim());
                    double x2 =
                            Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = "+(x1+x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }
    public static void main(String[]args)
    {
        new LabExample();
    }
}*/

//TextArea
/*
class TextAreaExample extends JFrame
{
    JTextArea jta1 = new JTextArea(10,25);
    JScrollPane Scroll = new JScrollPane(jta1);

    JButton button = new JButton("Add some Text");
    public TextAreaExample()
    {
        super("Example");
        setSize(300,300);
        setLayout(new FlowLayout());
        add(jta1);
        add(Scroll); // we add the scrollPane and not the text area.
        add(button);
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String txt = JOptionPane.showInputDialog(null,"Insert some text");
                        jta1.append(txt);
            }
        });
    }
    public static void main(String[]args)
    {
        new TextAreaExample().setVisible(true);
    }
}*/

//BorderExample
/*
class BorderExample extends JFrame
{
    JPanel[] pnl = new JPanel[12];
    public BorderExample()
    {
        setLayout(new GridLayout(3,4));
        for(int i = 0 ; i < pnl.length ; i++)
        {
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(r,g,b));
            add(pnl[i]);
        }
        pnl[4].setLayout(new BorderLayout());
        pnl[4].add(new JButton("one"),BorderLayout.WEST);
        pnl[4].add(new JButton("two"),BorderLayout.EAST);
        pnl[4].add(new JButton("three"),BorderLayout.SOUTH);
        pnl[4].add(new JButton("four"),BorderLayout.NORTH);
        pnl[4].add(new JButton("five"),BorderLayout.CENTER);
        pnl[10].setLayout(new FlowLayout());
        pnl[10].add(new JButton("one"));
        pnl[10].add(new JButton("two"));
        pnl[10].add(new JButton("three"));
        pnl[10].add(new JButton("four"));
        pnl[10].add(new JButton("fve"));
        setSize(800,500);
    }
    public static void main(String[]args)
    {
        new BorderExample().setVisible(true);
    }
}*/

//NullLayout
/*
class NullLayout extends JFrame
{
    JButton but1 = new JButton("One");;
    JButton but2 = new JButton("two");;
    JButton but3 = new JButton("three");;
    public NullLayout()
    {
        setLayout(null);
        but1.setBounds(150,300,100,20); // added at 150,300 width = 100, height=20
        but2.setSize(80,400); // added at 0,0 width = 80, height=400
        but3.setLocation(300,100);
        but3.setSize(200,75);
// those two steps can be combined in one setBounds method call
        add(but1);
        add(but2);
        add(but3);
        setSize(500,500);
    }
    public static void main(String[]args)
    {
        new NullLayout().setVisible(true);
    }
}*/

//MouseListener
/*
class MyMouse extends JFrame
{
    JLabel lbl = new JLabel("");
    public MyMouse()
    {
        super("Dude! Where's my mouse ?");
        setSize(400,400);
        setLayout(new BorderLayout());
        add(lbl,BorderLayout.SOUTH);
        addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {lbl.setText("X="+a.getX()+" Y="+a.getY());}
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
    }
    public static void main(String[]args)
    {
        new MyMouse().setVisible(true);
    }
}*/


class MatchResult extends JFrame{
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel last = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");
    JButton madrid = new JButton("Real Madrid");
    JButton milan = new JButton("AC Milan");
    int sMad = 0;
    int sMil = 0;
    public MatchResult(){
        super("Match Result");
        setSize(700, 500);
        setLayout(null);
        madrid.setBounds(40,100,160,80);
        milan.setBounds(500,100, 160, 80);
        madrid.setForeground(Color.BLUE);
        milan.setForeground(Color.BLUE);
        madrid.setFont(new Font("Serif", Font.BOLD, 20));
        milan.setFont(new Font("Serif", Font.BOLD, 20));

        result.setBounds(265,100,200,80);
        result.setFont(new Font("Serif", Font.PLAIN, 30));
        result.setForeground(Color.RED);

        winner.setBounds(220,220,300,80);
        winner.setFont(new Font("Serif", Font.PLAIN, 30));
        winner.setForeground(Color.RED);

        last.setBounds(210,340,350,80);
        last.setFont(new Font("Serif", Font.PLAIN, 30));
        last.setForeground(Color.RED);

        add(madrid);
        add(milan);
        add(result);
        add(last);
        add(winner);

       madrid.addMouseListener(new MouseListener() {

           @Override
           public void mousePressed(MouseEvent e) {
               sMad++;
               result.setText("Result: "+ sMad +" X "+ sMil);
               last.setText("Last Scorer: Real Madrid");
               if (sMad > sMil)
                   winner.setText("Winner: Real Madrid");
               else if (sMad == sMil) winner.setText("Winner: DRAW");
           }
           @Override
           public void mouseClicked(MouseEvent e) {
           }
           @Override
           public void mouseReleased(MouseEvent e) {
           }
           @Override
           public void mouseEntered(MouseEvent e) {
           }
           @Override
           public void mouseExited(MouseEvent e) {
           }
       });

        milan.addMouseListener(new MouseListener() {

            @Override
            public void mousePressed(MouseEvent e) {
                sMil++;
                result.setText("Result: "+ sMad +" X "+ sMil);
                last.setText("Last Scorer: AC Milan");
                if (sMad < sMil)
                    winner.setText("Winner: AC Milan");
                else if (sMad == sMil) winner.setText("Winner: DRAW");
            }
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }

    public static void main(String[]args)
    {
        new MatchResult().setVisible(true);
    }
}



