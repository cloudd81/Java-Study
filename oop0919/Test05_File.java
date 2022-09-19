package oop0919;

import java.io.*;

public class Test05_File {

	public static void main(String[] args) throws Exception {
		// File 클래스
		// -> 파일과 관련된 정보를 알 수 있다
		// -> 파일명, 파일 크기, 확장명, 파일타입 등등
		
		try {
			// 예외 발생이 예상되는 코드 작성
			
			// 경로명 + 파일명
			
			// 경로명으로 \ 기호를 사용하려면 2번씩 사용해야한다.			
			// String pathname = "C:\\java202207\\공지사항.txt";
			
			// 경로명으로 / 기호도 사용 가능하다
			String pathname = "C:/java202207/공지사항.txt";
			
			File file = new File(pathname); // File 클래스에 파일 담기
			if(file.exists()) {
				System.out.println("파일 있어요!!");
				
				long filesize = file.length();
				System.out.println("파일크기 : " + filesize);
				System.out.println("파일크기 : " + filesize/1024 + "KB");
				System.out.println("파일크기 : " + filesize/1024/1024 + "MB");
				
				String filename = file.getName();
				System.out.println("파일이름 : " + filename);
				
				// 파일 삭제
				// -> 실제 파일이 삭제되니 복사본 남겨놓으시기 바랍니다
				/*
				if(file.delete()) {
					System.out.println(filename + "파일이 삭제되었습니다.");
				} else {
					System.out.println(filename + "파일 삭제 실패");
				} // if end
				 */
				
				// 문) 파일명과 확장명을 분리해서 출력하시오
				//	   파일명 : 공지사항
				//     확장명 : txt
				int lastdot = filename.lastIndexOf(".");
				String name	= filename.substring(0, lastdot);
				String ext	= filename.substring(lastdot+1);
				System.out.println("파일명 : " + name);
				System.out.println("확장명 : " + ext);
								
			} else {
				System.out.println("파일 없어요!!");				
			} // if end
			
		} catch (Exception e) {
			// 예외가 발생되면 처리할 코드할 작성
			System.out.println(e);
		} // end
		System.out.println("END");
		

	} // main() end
} // class end
