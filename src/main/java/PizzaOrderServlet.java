import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pizza-order-form.jsp").forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String crust = request.getParameter("crust-type");
        String sauce = request.getParameter("sauce-type");
        String size = request.getParameter("size-type");
        String[] toppings = new String[] {
                request.getParameter("peperoni"),
                request.getParameter("sausage"),
                request.getParameter("bacon")
        };
        String address = request.getParameter("address");

        System.out.println(crust);
        System.out.println(sauce);
        System.out.println(size);
        System.out.println(toppings[0]);
        System.out.println(toppings[1]);
        System.out.println(toppings[2]);
        System.out.println(address);

    }

}