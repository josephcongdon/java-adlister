import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Cookies")
public class CookiesServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/cookies.jsp");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String name = request.getParameter("name");
        String favorite = request.getParameter("favorite");

        boolean answeredQuestions = (name != null && !name.equals("")) && (favorite != null && !favorite.equals(""));

        if (answeredQuestions) {
            HttpSession session = request.getSession();
            session.setAttribute("name", name);
            session.setAttribute("favorite", favorite);

            response.sendRedirect("/Deals");
        } else {
            response.sendRedirect("/Cookies");
        }

    }
}