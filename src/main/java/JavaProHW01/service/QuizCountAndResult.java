package JavaProHW01.service;

import JavaProHW01.Question;
import JavaProHW01.User;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class QuizCountAndResult {

    private static List<Question> allResults;

    static {
        allResults = new ArrayList<>();

        Question firstQuestion = new Question("Do you want eat?");
        firstQuestion.setAnswer("Yes", 0);
        firstQuestion.setAnswer("No", 0);

        Question secondQuestion = new Question("Are you happy?");
        secondQuestion.setAnswer("Yes", 0);
        secondQuestion.setAnswer("Ofcourse Yes", 0);
        secondQuestion.setAnswer("Absolutely Yes", 0);

        Question thirdQuestion = new Question("Do you want a vacation?");
        thirdQuestion.setAnswer("Yes", 0);
        thirdQuestion.setAnswer("Ofcourse!!!", 0);

        allResults.add(firstQuestion);
        allResults.add(secondQuestion);
        allResults.add(thirdQuestion);
    }

    public void quizCount(HttpServletRequest req) {

        updateResults(req,allResults);
        req.getSession().setAttribute("allResults", allResults);

        User user = (User) req.getSession().getAttribute("loginedUser");
        updateResults(req, user.getResults());

    }

    public void updateResults (HttpServletRequest req, List<Question> someResults) {

        someResults.get(0).updateAnswer(req.getParameter("1stQ"));
        someResults.get(1).updateAnswer(req.getParameter("2ndQ"));
        someResults.get(2).updateAnswer(req.getParameter("3rdQ"));
    }
}


