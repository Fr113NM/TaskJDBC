package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

//public class UserServiceImpl extends UserDaoJDBCImpl implements UserService {

    //public UserServiceImpl() {
        //super();
   // }


    //public void createUsersTable() {
        //super.createUsersTable();
    //}

    //public void dropUsersTable() {
        //super.dropUsersTable();
    //}

    //public void saveUser(String name, String lastName, byte age) {
        //super.saveUser(name, lastName, age);
    //}

    //public void removeUserById(long id) {
        //super.removeUserById(id);
    //}

    //public List<User> getAllUsers() {
        //return super.getAllUsers();
    //}

    //public void cleanUsersTable() {
        //super.cleanUsersTable();
    //}
//}

public class UserServiceImpl implements UserService {

    UserDaoJDBCImpl daoJDBC = new UserDaoJDBCImpl();

    public void createUsersTable() {
        daoJDBC.createUsersTable();
    }

    public void dropUsersTable() {
        daoJDBC.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        daoJDBC.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        daoJDBC.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return daoJDBC.getAllUsers();
    }

    public void cleanUsersTable() {
        daoJDBC.cleanUsersTable();
    }

}
