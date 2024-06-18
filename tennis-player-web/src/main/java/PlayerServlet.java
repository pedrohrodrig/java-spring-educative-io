import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/player.do")
public class PlayerServlet extends HttpServlet {

    private PlayerService service = new PlayerService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String playerName = request.getParameter("name");
        System.out.println(playerName);
        request.setAttribute("name", playerName);

        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String playerName = request.getParameter("name");
        Player player = service.getPlayerByName(playerName);
        request.setAttribute("name", playerName);
        request.setAttribute("country", player.getNationality());
        request.setAttribute("dob", player.getBirthDate());
        request.setAttribute("titles", player.getTitles());
        request.getRequestDispatcher("/WEB-INF/views/info.jsp").forward(request, response);
    }
}
