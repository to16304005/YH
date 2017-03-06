import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pac.*;

public class ResServlet extends HttpServlet{
	
  private String uname;
	
  public void doPost(HttpServletRequest req, HttpServletResponse res)
  throws IOException, ServletException{
    req.setCharacterEncoding("Windows-31J");
    try{
      Executer ex = new Executer();
      String threadId = req.getParameter("threadId");
      HttpSession session = req.getSession();
      UserBean ub = (UserBean)session.getAttribute("loginUser");
    try{
      ex.addRes(threadId, req.getParameter("ResContent"), ub.getUserName());
    }catch(NullPointerException e){
      ex.addRes(threadId, req.getParameter("ResContent"), "–¼–³‚µ‚³‚ñ");
    }	
      req.setAttribute("res",ex.getRes(threadId));

      req.setAttribute("tname", ex.getTname(threadId));

      RequestDispatcher dis = req.getRequestDispatcher("testRes.jsp");

      dis.forward(req, res);
    }catch(Exception e){
      e.printStackTrace();
      System.out.println("error");
    }
  }

  public void doGet(HttpServletRequest req, HttpServletResponse res)
  throws IOException, ServletException{
  	try{
	    req.setCharacterEncoding("Windows-31J");

	    Executer ex = new Executer();
	  	String threadId=req.getParameter("id");

	  	req.setAttribute("res", ex.getRes(threadId));
      req.setAttribute("tname", ex.getTname(threadId));

	  	RequestDispatcher dis = req.getRequestDispatcher("testRes.jsp");

	    dis.forward(req, res);
  	}catch(Exception e){
  		e.printStackTrace();
  	System.out.println("error");
  	}

  }
}
