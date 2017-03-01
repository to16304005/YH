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
    try{
      Executer ex = new Executer();
      String threadId = req.getParameter("threadId");

      ex.addRes(threadId, req.getParameter("ResContent"));
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
