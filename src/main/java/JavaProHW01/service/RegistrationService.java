package JavaProHW01.service;

import JavaProHW01.Question;
import JavaProHW01.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class RegistrationService {

    private static List<User> userList;
    private User user;

    static {
        userList = new ArrayList<>();
        userList.add(new User("admin", "admin"));
    }

    public synchronized void registration(HttpServletRequest req, HttpServletResponse resp) throws IOException {


        String login = req.getParameter("login");
        String pass = req.getParameter("pass");
        req.getSession(true);

        if (getUserIfExist(login, pass) != null) {
            if(user.getResults().isEmpty()) {
                user.setResults(makeFirstQuiz());
                req.getSession().setAttribute("loginedUser", user);
                resp.sendRedirect("/quiz");
            } else {
                req.getSession().setAttribute("loginedUser", user);
                resp.sendRedirect("/result.jsp");
            }

        } else {
            user = new User(login, pass);
            user.setResults(makeFirstQuiz());
            userList.add(user);
            req.getSession().setAttribute("loginedUser", user);
            resp.sendRedirect("/quiz");
        }
    }

    private void startSession(){

    }

    public User getUserIfExist(String login, String password) {

        user = null;
        for (User u : userList) {
            if (u.getLogin().equals(login) && u.getPassword().equals(password)) user = u;
        }

        return user;
    }

    public List<Question> makeFirstQuiz() {

        List<Question> firstQuiz = new ArrayList<>();

        Question first = new Question("Do you want eat?");
        first.setAnswer("Yes", 0);
        first.setAnswer("No", 0);

        Question second = new Question("Are you happy?");
        second.setAnswer("Yes", 0);
        second.setAnswer("Ofcourse Yes", 0);
        second.setAnswer("Absolutely Yes", 0);

        Question third = new Question("Do you want a vacation?");
        third.setAnswer("Yes", 0);
        third.setAnswer("Ofcourse!!!", 0);

        firstQuiz.add(0, first);
        firstQuiz.add(1, second);
        firstQuiz.add(2, third);

        return firstQuiz;
    }
}
