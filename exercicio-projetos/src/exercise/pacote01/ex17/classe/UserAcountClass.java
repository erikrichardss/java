package exercise.pacote01.ex17.classe;

public class UserAcountClass {
    private String username;
    private String email;
    private String role;
    private boolean active;
    private static int totalAcounts;

    {
        active = true;
        UserAcountClass.totalAcounts += 1;
        System.out.println("New acounts initialization...");
    }

    public UserAcountClass(String username, String email) {
        this.role = "User";
        this.username = username;
        this.email = email;
    }

    public UserAcountClass(String username, String email, String role) {
        this(username, email);
        this.role = role;
    }

    public static int getTotalAcounts() {
        return totalAcounts;
    }

    public static class Builder {
        private String username;
        private String email;
        private String role;

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public UserAcountClass build() {
            if (this.role == null) {
                this.role = "USER";
            }

            return new UserAcountClass(username, email, role);
        }
    }
}
