package tien.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tien.service.LoginService;

@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class Login extends HttpServlet {
	
	private LoginService loginService = new LoginService();
	@Override
	public void init(ServletConfig config) throws ServletException {
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/login.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		boolean isLogin = loginService.checkLogin(username, password);
		System.out.println(isLogin);
		
		req.getRequestDispatcher("/login.jsp").forward(req, resp);
	}

}
