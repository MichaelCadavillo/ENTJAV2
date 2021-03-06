package bpi.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import bpi.model.ForexBean;

@WebServlet("/processcurrencyexchange.html")
public class ProcessCurrencyExchangeConversionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String exceptionMessage = "";
		int exceptionFlagTrigger = 0; // 0 means no error, 1 means error
		try {
			int pesoAmount = (request.getParameter("pesoAmount") != null) ? Integer
					.parseInt(request.getParameter("pesoAmount")) : 0;
			String currencyType = (request.getParameter("currencyType") != null) ? request
					.getParameter("currencyType") : null;

			if (pesoAmount < 1000) {
				exceptionMessage += "Invalid amount - must be a number and must be at least Php1,000.00 pesos.";
				exceptionFlagTrigger = 1;
			}

			if (currencyType != null) {
				switch (currencyType) {
				case "USD":
				case "EUR":
				case "YEN":
				case "AUS":
					break;
				default:
					exceptionMessage += "<br>Invalid Currency Type";
					exceptionFlagTrigger = 1;
					break;
				}
			} else {
				exceptionMessage += "<br>Missing Currency Type";
				exceptionFlagTrigger = 1;
			}

			if (exceptionFlagTrigger != 1) { //all inputs are valid
				//step 3 - instantiate the bean, populate the bean and call the business logic methods
				ForexBean forex = new ForexBean();
				forex.setPesoAmount(pesoAmount);
				forex.setCurrencyType(currencyType);
				forex.compute();
				
				//step 3 - perform binding name is forex on forex
				request.setAttribute("forex", forex);
				
				forex.insertRecord();
			} else {
				throw new RuntimeException(exceptionMessage);
			}

		} catch (NumberFormatException nfe) {
			
			/* response.sendRedirect("error.jsp?message="+nfe.getMessage()); */
			exceptionMessage += "<br>Invalid input for Philippine peso amount - must be integer positive number.";
			
			//step 4 - perform binding
			request.setAttribute("errMsg", exceptionMessage);
		} catch (RuntimeException re) {
			/* response.sendRedirect("error.jsp?message="+re.getMessage()); */
			System.err.println(re.getMessage());
			
			//step 4 - perform binding
			request.setAttribute("errMsg", exceptionMessage);
		}
		
		request.getRequestDispatcher((exceptionFlagTrigger == 0)
				?"display.jsp"
				:"error.jsp").forward(request, response);
	}

}
