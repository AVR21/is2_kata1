package is2.ulpgc.kata;

import java.time.LocalDate;

public class Profile {
    private String userId;
    private String userPass;
    private final LocalDate registerDate;

    public Profile(String userId, String userPass, LocalDate registerDate) {
        this.userId = userId;
        this.userPass = userPass;
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "userId='" + userId + '\'' +
                ", userPass='" + userPass + '\'' +
                ", registerDate=" + registerDate +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }
}
