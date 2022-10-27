package net.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginProc_v1 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 전송방식 method=post 요청
		
		try {
			// 1) 한글 인코딩
			req.setCharacterEncoding("UTF-8");
			
			// 2) 사용자가 요청한 정보를 req에서 가져와서 변수에 옮겨 담기
			String uid = req.getParameter("uid").trim();
			String upw = req.getParameter("upw").trim();
			
			// 3) 요청한 사용자에게 응답
			resp.setContentType("text/html; charset=UTF-8");
			PrintWriter out = resp.getWriter();
			out.print(" <!DOCTYPE html> ");
			out.print(" <html> ");
			out.print(" <head> ");
			out.print(" 	<meta charset='UTF-8'> ");
			out.print(" 	<title>환영합니다</title> ");
			out.print(" </head> ");
			out.print(" <body> ");
			out.print(" <strong>로그인 결과</strong><br> ");
			out.print(" 아이디 : <strong>" + uid + "</strong><br>");
			out.print(" 비밀번호 : <strong>" + upw + "</strong>");
			out.print(" </body> ");
			out.print(" </html> ");
			out.close();
			
		} catch (Exception e) {
			System.out.println("요청 실패 : " + e);
		} // end

		
	} // doPost() end
	
}
