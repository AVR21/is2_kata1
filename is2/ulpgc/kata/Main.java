package is2.ulpgc.kata;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Profile profile = new Profile("JohnDoe", "Pass12345", LocalDate.now());
        System.out.println(profile.toString());
    }
}
