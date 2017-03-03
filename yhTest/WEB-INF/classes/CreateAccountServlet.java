import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pac.*;

public class CreateAccountServlet extends HttpServlet{
  public void doPost(HttpServletRequest req, HttpServletResponse res)
  throws IOException, ServletException{
    req.setCharacterEncoding("Windows-31J");

    Executer exe = new Executer();
    req.setAttribute("mess", exe.createAccount(req.getParameter("id"), req.getParameter("id")));


    RequestDispatcher dis = req.getRequestDispatcher("index.jsp");
    dis.forward(req, res);

  }
}
