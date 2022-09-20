import java.io.FileReader;

public class TypeTest {

	public static void main(String[] args) {
		// CMD 명령어 type 작성하기
	    // 결과확인 CMD 창에서 실습합니다
		
	    // >javac TypeTest.java      컴파일하기
        // >java TypeTest 대상파일      자바 클래스 실행하기
	      
	      String filename = args[0];
	      FileReader fr = null;
	      
	      try {
	         fr = new FileReader(filename);
	         
	         while (true) {
	            int data = fr.read();   // 2바이트 읽기
	            if (data == -1) {
	               break;
	            } // if end
	            System.out.printf("%C", data);
	         } // while end
	      }catch(Exception e) {
	         System.out.println("파일 읽기 실패 : "+e);
	      } finally {
	         // 자원 반납
	         try {
	            if (fr != null) { fr.close(); }
	         } catch (Exception e) {}
	      } // end
	} // main() end
} // class end