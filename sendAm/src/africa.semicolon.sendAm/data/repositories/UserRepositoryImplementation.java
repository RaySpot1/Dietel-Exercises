package africa.semicolon.sendAm.data.repositories;

import africa.semicolon.sendAm.data.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImplementation implements UserRepository {
    private final List <User> data = new ArrayList<>();
    @Override
    public User save(User aUser) {
        data.add(aUser);
        System.out.println(aUser);
        return aUser;
    }

    @Override
    public User findByEmail(String email) {
        for (User aUser : data) {
            if (aUser.getEmail().equals(email))
                return aUser;
        }
        return null;
    }

    @Override
    public void delete(String email) {
        User searchUser = findByEmail(email);
        data.remove(searchUser);
    }

    @Override
    public void delete(User aUser) {
        data.remove(aUser);
    }

    @Override
    public List<User> findAll() {
        return data;
    }

    @Override
    public int count() {
        return data.size();
    }
}
