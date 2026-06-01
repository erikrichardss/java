package exercise.pacote02.ex28.main;

import exercise.pacote02.ex28.classe.UserRepository;

public class Optional01 {

    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();

        userRepository.findUsersByEmail("erik@gmail.com")
                .ifPresent(user -> System.out.println(user.getName()));
    }
}
