package projects.ex09.repository;

import projects.ex09.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements Repository<User> {

    private List<User> users = new ArrayList<>();

    public void findUserByName(String name) {

        users.stream()
                .filter(u -> u.getName().equals(name))
                .forEach(System.out::println);
    }

    private int limitMaterial = 0;
    public int limitLoan() {

        return limitMaterial++;
    }

    @Override
    public void saveElement(User user) { users.add(user); }

    @Override
    public void listAll() { users.forEach(User::toString); }

    @Override
    public User searchById(int id) {

        return users.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public void removeElement(User user) { users.remove(user); }
}
