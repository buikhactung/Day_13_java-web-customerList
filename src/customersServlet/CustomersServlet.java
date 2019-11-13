package customersServlet;

import customer.customers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomersServlet")
public class CustomersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<customers> customer = new ArrayList<>();
        customer.add(new customers("Đỗ Quốc Dư","20-06-1992","TỪ Sơn - Bắc Ninh","https://sohanews.sohacdn.com/thumb_w/660/2018/photo1516730315799-1516730315799.jpg" ));
        customer.add(new customers("Nguyễn Nam Tùng", "3-4-1993", "Tp-Thái Nguyên","https://vnreview.vn/image/19/59/91/1959911.jpg"));
        customer.add(new customers("Đặng Thiên Hoàng", "28-12-1995","Phù Cừ- Hưng Yên","https://meowwoof.vn/pub/media/wysiwyg/MWPOSTPIC/ThuCung/dog.jpg"));
        customer.add(new customers("Lương Văn Quý","29-11-1993","Tp-Thái Nguyên","https://live.staticflickr.com/1811/29067666127_01e9aa9bdb_b.jpg"));

        request.setAttribute("customer", customer);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(request,response);
    }
}
