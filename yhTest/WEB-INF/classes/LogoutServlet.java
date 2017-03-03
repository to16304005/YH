import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pac.*;

public class LoginServlet extends HttpServlet{

  private boolean loginResult = false;
  private UserBean ub;

  public void doPost(HttpServletRequest req, HttpServletResponse res)
  throws IOException, ServletException{
    req.setCharacterEncoding("Windows-31J");


    Executer exe = new Executer();
    ArrayList<UserBean> userBeanList = new ArrayList<UserBean>();
    userBeanList = exe.getUserList();
    Iterator<UserBean> it = userBeanList.iterator();

    while(it.hasNext()){
      ub = (UserBean)it.next();
      String name = ub.getUserName();
      String pass = ub.getUserPass();
      if(name.equals(req.getParameter("id")) && pass.equals(req.getParameter("pass"))){
        loginResult = true;
        break;
      }
    }

    if(loginResult){
      HttpSession session = req.getSession();
      session.setAttribute("loginUser", ub);
    }

    RequestDispatcher dis = req.getRequestDispatcher("login.jsp");
    dis.forward(req, res);

  }
}
