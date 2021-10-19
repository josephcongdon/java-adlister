package servlets;

import dao.DaoFactory;
import model.Product;
import model.Products;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/products")
public class ProductIndexServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
        Products productsDao = DaoFactory.getProductsDao();

        List<Product> products = productsDao.findAll();

        request.setAttribute("products", products);
        request.getRequestDispatcher("products.jsp").forward(request,response);
    }
}
