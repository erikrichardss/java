package exercise.pacote02.ex28.classe;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    private List<User> users = new ArrayList<>();

    public UserRepository() {

        users = List.of(
                new User("Erik", "erik@gmail.com"),
                new User("Ana", "ana@gmail.com"),
                new User("Bianca", "bianca@gmail.com")
        );
    }

    public Optional<User> findUsersByEmail(String email) {

        for (User user : users) {

            if (user.getEmail().equals(email)) {

                Optional.of(email);
            }
        }

        return Optional.empty();
    }
}
