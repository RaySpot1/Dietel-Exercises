package africa.semicolon.sendAm.data.models;

import africa.semicolon.sendAm.data.models.User;

import java.util.List;

public interface UserRepository {
    User save(User aUser);
    User findByEmail(String email);
    void delete(String email);

    void delete(User aUser);

    List<User> findAll();

    int count();
}
