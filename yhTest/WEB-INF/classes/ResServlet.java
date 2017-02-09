import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pac.*;

public class ResServlet extends HttpServlet{
  public void doPost(HttpServletRequest req, HttpServletResponse res)
  throws IOException, ServletException{
    req.setCharacterEncoding("Windows-31J");

    Executer exe = new Executer();

    exe.addRes("1", req.getParameter("ResContent"));

/*
    req.setAttribute();
    req.setAttribute();

    RequestDispatcher dis = req.getRequestDispatcher();

    dis.forward(req, res);
*/
  }
}
