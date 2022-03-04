package com.webdev.productsystem.Users.User.Infrastructure.Adapters;

import com.webdev.productsystem.Users.User.Domain.Ports.UserRepository;
import com.webdev.productsystem.Users.User.Domain.User;
import com.webdev.productsystem.Users.User.Domain.ValueObjects.UserEmail;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InMemoryUserRepository implements UserRepository {

    private List<User> users = new ArrayList<>();

    public void save(User user) {
        System.out.println("Estoy en el repo");
        System.out.println(user.data());
        users.add(user);
    }

    @Override
    public User findByEmail(UserEmail email) {
        System.out.println(email.value());
        users.stream().forEach(user -> System.out.println(user.data().get("email")));
        return users.stream().filter(user -> user.data().get("email").equals(email.value())).collect(Collectors.toList()).get(0);
    }

    public List<User> all() {
        return users;
    }

}
