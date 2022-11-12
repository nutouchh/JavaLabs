package ru.mirea.lab9;

import ru.mirea.lab9.db.DB;
import ru.mirea.lab9.users.UserUI;
import java.awt.*;
import javax.swing.*;

public class App extends JFrame {

    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    App() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(1000, 500);

        new UserUI(this);

        setVisible(true);
    }

    public static void main(String[] args) {
        new DB();
        new App();
    }
}