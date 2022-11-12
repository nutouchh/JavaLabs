package ru.mirea.lab9.users.ui;

import ru.mirea.lab9.db.DB;
import ru.mirea.lab9.users.UserController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class UserSortBtn {

    JButton sortBtn = new JButton("Сортировать пользователей");

    public UserSortBtn(JFrame window) {
        window.add(sortBtn);

        sortBtn.addActionListener(new UserSortBtn.UserSortBtnListener());
    }

    class UserSortBtnListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            UserController.sortedById(DB.getUsers());
            System.out.println(DB.getUsers());
        }
    }
}