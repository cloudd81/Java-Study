package oop0920;

import java.io.FileReader;

public class Test02_input {

	public static void main(String[] args) {
		// 2) char형 기반 -> 한글 안깨짐
		
		String filename = "C:/java202207/workspace/basic01_java/src/oop0920/data.txt";		
		FileReader fr = null;
		
		// 예외처리(파일이 없어도 프로그램이 정상적으로 종료되도록)
		// 파일을 열면 파일을 닫아야 다른 페이지에서 같은 파일을 사용할 때 오류가 나지 않는다
		try {
			
			fr = new FileReader(filename);
			while(true) {
				int data = fr.read();	// 2바이트 읽기
				if(data==-1){	// 파일의 끝(End Of File)인지? * BOF도 있음
					break;
				} // if end
				System.out.printf("%c", data);
			} // while end
			
		} catch (Exception e) {
			System.out.println("파일 읽기 실패 : " + e);
		} finally {
			// 자원 반납
			try {
				if(fr!=null) { fr.close(); }
			} catch (Exception e) {	}
		} // end

	} // main() end
} // class end
