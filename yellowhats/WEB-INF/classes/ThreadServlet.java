import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pac.*;

public class ThreadServlet extends HttpServlet{
  public void doPost(HttpServletRequest req, HttpServletResponse res)
  throws IOException, ServletException{
    req.setCharacterEncoding("Windows-31J");

    ThreadBean tb = new ThreadBean();
    Executer exe = new Executer();

    //tb.setThreadName(req.getParameter("ThreadName"));
    exe.addThreads(req.getParameter("ThreadName"));
    req.setAttribute("thread",exe.getThreads());

    RequestDispatcher dis = req.getRequestDispatcher("index.jsp");
    dis.forward(req, res);

  }

  public void doGet(HttpServletRequest req, HttpServletResponse res)
  throws IOException, ServletException{

    req.setCharacterEncoding("Windows-31J");

	   try{
  	  	//Executer
    	Executer ex = new Executer();
  		req.setAttribute("thread",ex.getThreads());
  		RequestDispatcher dis = req.getRequestDispatcher("index.jsp");
  		dis.forward(req, res);

	  }catch(Exception e){
  		e.printStackTrace();
  		System.out.println("Thread‚Ìˆê——•\Ž¦‚Å—áŠO");
  	}
  }
}
