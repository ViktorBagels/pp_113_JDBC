package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDao userDao = new UserDaoJDBCImpl(); // DAO-слой для взаимодействия с базой

    @Override
    public void createUsersTable() {
        userDao.createUsersTable(); // Перенаправляет вызов к DAO
    }

    @Override
    public void dropUsersTable() {
        userDao.dropUsersTable(); // Перенаправляет вызов к DAO
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age); // Перенаправляет вызов к DAO
    }

    @Override
    public void removeUserById(long id) {
        userDao.removeUserById(id); // Перенаправляет вызов к DAO
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers(); // Перенаправляет вызов к DAO и возвращает результат
    }

    @Override
    public void cleanUsersTable() {
        userDao.cleanUsersTable(); // Перенаправляет вызов к DAO
    }
}
