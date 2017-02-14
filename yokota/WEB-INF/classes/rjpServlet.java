import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rjptest.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class rjpServlet extends HttpServlet{
  public void doGet(HttpServletRequest req, HttpServletResponse res)
  throws IOException, ServletException{
	
    req.setCharacterEncoding("Windows-31J");

	try{
		
		
	  	//Executerをインスタンス化
  		Executer ex = new Executer();
		
		
  		//List<ThreadBean> list = new ArrayList<ThreadBean>();
		
		//Executerからスレットをゲット
		//そのままjspに送る
		req.setAttribute("thread",ex.getThreads());
		RequestDispatcher dis = req.getRequestDispatcher("thread");
		dis.forward(req, res);
		
	}catch(Exception e){
  		e.printStackTrace();
  		System.out.println("error");
  	}
  }
	
	
/*	public void doGet(HttpServletRequest req, HttpServletResponse res)
  throws IOException, ServletException{
  	try{
	    req.setCharacterEncoding("Windows-31J");

	    Executer ex = new Executer();
	  	String threadid=req.getParameter("threadid");
  		
	  	req.setAttribute("res",ex.getRes(threadid));
		
	  	RequestDispatcher dis = req.getRequestDispatcher("thread.jsp");
  		
	  	//threadのオブジェクトをゲットしてきて
	  	//jspに送る
	  	ArrayList<ThreadBean> threadList=new ArrayList<ThreadBean>();
  		//threadList=ex.getThreads();
  		
  		//String st=(String)ex.getThreads();
  		
  		req.setAttribute("thread",ex.getThreads());
  		
  		//System.out.println("hey");
	  	
	    RequestDispatcher dis = req.getRequestDispatcher("thread.jsp");
		
  		
  		
	    dis.forward(req, res);
  	}catch(Exception e){
  		e.printStackTrace();
  	System.out.println("error");
  	}
 
  }
*/
}
