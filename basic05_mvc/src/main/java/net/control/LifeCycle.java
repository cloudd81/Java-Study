package net.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
	● HttpServlet 클래스의 계층도
	 class GenericServlet {}
	 class HttpServlet extends GenericServlet {}
	 class LifeCycle extends HttpServlet {}
	 
	● HttpServlet 생명주기 ---------------------------------------	 
	 	init() 서블릿이 호출되면 1번만 호출
	 		-> service()
	 		-> service()
	 		-> service()	사용자가 요청할 때마다 계속 호출
	 		-> service()	(doGet()과 doPost()를 구분하는 역할)
	 		-> service()
	 		-> service()
	 	destroy()	서버가 중지되면 1번만 호출
	--------------------------------------------------------------
	
	● LifeCycle 서블릿을 /WEB-INF/web.xml에 등록해야함
	● 결과 확인 http://localhost:9090/basic05_mvc/life.do
*/

public class LifeCycle extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("init() 호출...");
	} // init() end
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
		System.out.println("service() 호출...");
	} // service() end
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		System.out.println("doGet() 호출...");
	} // doGet() end

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		System.out.println("doPost() 호출...");
	} // doPost() end

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("destroy() 호출...");
	} // destroy() end
	
} // class end
