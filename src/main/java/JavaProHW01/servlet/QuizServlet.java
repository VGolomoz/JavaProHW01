package JavaProHW01.servlet;

import JavaProHW01.service.QuizCountAndResult;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/quiz")
public class QuizServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Quiz doGet method");
        if (req.getSession().getAttribute("loginedUser") != null) resp.sendRedirect("/quiz.jsp");
        else resp.sendRedirect("/index.jsp");
          }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Quiz doPost method");
        new QuizCountAndResult().quizCount(req);
        resp.sendRedirect("/result.jsp");
    }
}
