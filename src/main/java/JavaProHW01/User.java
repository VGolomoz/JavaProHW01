package JavaProHW01;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {

    private String login;
    private String password;
    private List<Question> results;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.results = new ArrayList<>();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Question> getResults() {
        return results;
    }

    public void setResults(List<Question> results) {
        this.results = results;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return login.equals(user.login) &&
                password.equals(user.password) &&
                Objects.equals(results, user.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, results);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", results=" + results +
                '}';
    }
}
