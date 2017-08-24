package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EmployeeBean;


@WebServlet("/process.html")
public class ProcessComputeTakeHomePayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String exceptionMessage = "";
		int exceptionTrigger = 0;
		
		try{
		String name = request.getParameter("name");
		String code = request.getParameter("code").toUpperCase();
		double sales = Double.parseDouble(request.getParameter("sales"));

		if(name.isEmpty() || code.isEmpty()){
			exceptionMessage += "One or more input fields are empty!!<br>";
			exceptionTrigger = 1;
		}
		
		if(!code.equals("A") && !code.equals("B") && !code.equals("C")){
			exceptionMessage += "Invalid Sales Code!!<br>";
			exceptionTrigger = 1;
		}
		
		if(sales <= 0){
			exceptionMessage += "Invalid Sales Amount!! Must be Greater than Zero <br>";
			exceptionTrigger = 1;
		}
		
		if(exceptionTrigger == 1){
			throw new RuntimeException(exceptionMessage);
		}else{
				EmployeeBean emp = new EmployeeBean();
				emp.setName(name);
				emp.setCode(code);
				emp.setSales(sales);
				emp.compute();
				
				getServletContext().setAttribute("emp", emp);
		}
		
		}catch(RuntimeException re){
			getServletContext().setAttribute("error", exceptionMessage);
		}
		
		request.getRequestDispatcher((exceptionTrigger == 0)
				? "display.jsp":"error.jsp").forward(request, response);
	}

}
