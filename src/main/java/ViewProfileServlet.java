import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = (String) request.getSession().getAttribute("user");

        if (username != null) {
            request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
        } else {
            response.sendRedirect("/login");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        boolean correctLogin = (username != null && !username.equals("username")) && (password != null && !password.equals("password"));

        if (correctLogin) {
            HttpSession session = request.getSession();
            session.setAttribute("admin", username);
            session.setAttribute("password", password);
            request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);

        } else{
            request.getSession().invalidate();
            response.sendRedirect("/login");
        }
    }
}
