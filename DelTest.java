import java.io.File;

public class DelTest {

	public static void main(String[] args) {
		// CMD 명령어 파일 삭제하기
	    // 결과확인 CMD 창에서 실습합니다		
		
        // >javac TypeTest.java      컴파일하기
        // >java TypeTest 대상파일      자바 클래스 실행하기
		

		try {
			
			File file = new File(args[0]);
			
			if(file.exists()) {
				if(file.delete()) {
					System.out.println("1 File deleted");
				} else {
					System.out.println("deletion failure");
				}
			} else {
				System.out.println("File Not Found!!");
			} // if end		
			
		} catch (Exception e) {
			System.out.println("deletion failure : ");
			
		} finally {	} // end
		

	} // main() end
} // main() end
