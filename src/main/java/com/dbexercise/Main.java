package com.dbexercise;

import com.dbexercise.domain.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        userDao.add(new User("7","RURU", "1234qwer"));
    }
}
