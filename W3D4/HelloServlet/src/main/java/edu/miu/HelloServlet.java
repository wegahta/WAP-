package edu.mum.cs472.servletlesson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculate")
public class HelloServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int op1=Integer.parseInt(request.getParameter("operand1"));
		int op2=Integer.parseInt(request.getParameter("operand2"));
		int result1=op1+op2;
		int op3=Integer.parseInt(request.getParameter("operand3"));
		int op4=Integer.parseInt(request.getParameter("operand4"));
		int result2=op3*op4;
		out.print("<html><head><style background-color: grey></style><title>Test</title></head><body>" );
		out.print("<input "+ "value" +"=" + op1 + " style='width:50px' "+" />"+"+");
		
		out.print("<input "+ "value" +"=" + op2 +" style='width:50px' "+">"+"=");
		out.print("<input "+ "value" +"=" + result1+ " style='width:50px' " +">"+"<br />");
		
		out.print("<input "+ "value" +"=" + op3+ " style='width:50px' "+">"+"*");
		out.print("<input "+ "value" +"=" + op4+ " style='width:50px' "+">"+"=");
		out.print("<input "+ "value" +"=" + result2+" style='width:50px' "+">"+"<br />");
	
		
	
		out.print("</body></html>");

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}
}
