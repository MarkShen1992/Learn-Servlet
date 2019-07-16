package com.bjsxt.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestLifeCycleServlet extends HttpServlet {

	public TestLifeCycleServlet() {
		System.out.println("constuctor!");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doGet!");
	}

	@Override
	public void destroy() {
		System.out.println("destroy!");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init!");
	}

	private static final long serialVersionUID = 1L;

}
