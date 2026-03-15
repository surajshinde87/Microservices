package com.microservices.rest.web_services.dao;

import com.microservices.rest.web_services.modal.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDao {

  private static List<User> users = new ArrayList<>();
  private static int usersCount = 0;

  static {
      users.add(new User(++usersCount, "Suraj", LocalDate.now().minusYears(22)));
      users.add(new User(++usersCount, "Rushikesh", LocalDate.now().minusYears(23)));
      users.add(new User(++usersCount, "Yogesh", LocalDate.now().minusYears(25)));
  }

  public List<User> findAll(){
      return users;
  }

  public User save(User user){
      user.setId(++usersCount);
      users.add(user);
      return user;
  }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId() == id;
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public void deleteById(int id) {
        Predicate<? super User> predicate = user -> user.getId() == id;
        users.removeIf(predicate);
     }


}
