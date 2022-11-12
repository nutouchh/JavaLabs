package ru.mirea.lab9.users;

import ru.mirea.lab9.db.DB;
import ru.mirea.lab9.errors.IncorrectINNErr;
import ru.mirea.lab9.errors.ResWithErr;
import ru.mirea.lab9.errors.SearchUserErr;
import ru.mirea.lab9.users.dto.UserSearchDto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class UserController {

    public static class CheckINNRes extends ResWithErr {

        private boolean res;

        CheckINNRes(boolean res, IncorrectINNErr err) {
            super(err);
            this.res = res;
        }

        public boolean getRes() {
            return res;
        }

        @Override
        public String toString() {
            return super.toString(
                    Arrays.asList(new ToStringField<Boolean>("inn-correct", res))
            );
        }
    }

    public static CheckINNRes checkINN(String INN) {
        if (Pattern.matches("\\d{12}", INN)) return new CheckINNRes(true, null);
        return new CheckINNRes(false, new IncorrectINNErr("Incorrect INN"));
    }

    public static class SearchRes extends ResWithErr {

        private User user;

        SearchRes(User user, SearchUserErr err) {
            super(err);
            this.user = user;
        }

        public User getUser() {
            return user;
        }

        @Override
        public String toString() {
            return super.toString(
                    Arrays.asList(new ToStringField<User>("user", user))
            );
        }
    }

    public static SearchRes search(UserSearchDto user) {
        for (User userInDB : DB.getUsers()) {
            if (userInDB.checkUser(user)) {
                return new SearchRes(userInDB, null);
            }
        }

        return new SearchRes(null, new SearchUserErr("User is not found"));
    }

    public static void sortedById(ArrayList<User> arr) {
        User current;
        for (int i = 1; i < arr.size(); i++) {
            current = arr.get(i);
            for (int j = i; j > 0; j--) {
                if (arr.get(j - 1).compareTo(current) == 1) {
                    arr.set(j, arr.get(j - 1));
                } else {
                    arr.set(j, current);
                    break;
                }
            }
        }
    }
}