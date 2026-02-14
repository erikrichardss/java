package exercise.pacote01.ex17.main;

import exercise.pacote01.ex17.classe.UserAcountClass;

public class UserAcountMain {
    public static void main(String[] args) {
        UserAcountClass userAcountOne = new UserAcountClass("Erik", "erik123@gmail.com");
        UserAcountClass userAcountTwo = new UserAcountClass("Ana", "ana123@gmail.com", "ADMIN");
        UserAcountClass userAcountThree = new UserAcountClass.Builder()
                .username("Alice")
                .email("alice123@gmail.com")
                .role("MANAGER")
                .build();

        System.out.println(UserAcountClass.getTotalAcounts());
    }
}
