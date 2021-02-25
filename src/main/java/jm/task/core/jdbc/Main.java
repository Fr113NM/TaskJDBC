package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("NIK", "CAVE", (byte) 63);
        userService.saveUser("TIM", "ROTH", (byte) 59);
        userService.saveUser("DICK", "TRACY", (byte) 35);
        userService.saveUser("KIM", "WHILDE", (byte) 61);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
