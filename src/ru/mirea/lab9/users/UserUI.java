package ru.mirea.lab9.users;

import ru.mirea.lab9.users.ui.INNInput;
import ru.mirea.lab9.users.ui.UserSearch;
import ru.mirea.lab9.users.ui.UserSortBtn;
import javax.swing.JFrame;

public class UserUI {

    public UserUI(JFrame window) {
        new INNInput(window);
        new UserSearch(window);
        new UserSortBtn(window);
    }
}