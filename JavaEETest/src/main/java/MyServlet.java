import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String textInput = req.getParameter("textInput");

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (Connection cont = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres", "1111")) {

            Statement statement = cont.createStatement();
            ResultSet res = statement.executeQuery("select * from superheroes");

            List<String> reslist = new ArrayList<>();
            while (res.next()){
                reslist.add(res.getString(textInput));
            }
            req.setAttribute("res", reslist);
            req.getRequestDispatcher("My.jsp").forward(req, resp);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
