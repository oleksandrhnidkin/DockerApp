import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        pw.println("<html");
        pw.println("<h1>Hello</h1>");
        pw.println("</html>");

        int numbIn1 = Integer.parseInt(req.getParameter("numbInput1"));
        int numbIn2 = Integer.parseInt(req.getParameter("numbInput2"));

        req.setAttribute("res", numbIn1 + numbIn2);
        req.getRequestDispatcher("First.jsp").forward(req, resp);
    }
}
