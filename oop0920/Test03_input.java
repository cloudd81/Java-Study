package oop0920;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test03_input {

	public static void main(String[] args) {
		// 3) 메모장 파일의 내용을 엔터 단위로 가져오기
		
		String filename="C:\\java202207\\workspace\\basic01_java\\src\\oop0919\\Order.java";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			// 1) 파일 가져오기
			fr = new FileReader(filename);
			
			// 2) 파일 내용 읽기
			br = new BufferedReader(fr);
			
			int num=0; // 행번호
			
			while(true) {
				String line = br.readLine(); // 3) 엔터(\n)를 기준으로 한 줄씩 가져오기
				if(line==null){	// 파일의 끝(End Of File)인지?
					break;
				} // if end
				System.out.printf("%d %s\n", ++num, line);
				
				// 20행마다 밑줄 긋기
				if(num%20 == 0) {
					System.out.println("--------------------------------------------------------");
				} // if end
				
			} // while end
			
		} catch (Exception e) {
			System.out.println("파일 읽기 실패 : " + e);
		} finally {
			try {
				if(br!=null) { br.close(); }
			} catch (Exception e) {	}
			try {
				if(fr!=null) { fr.close(); }
			} catch (Exception e) {	}
		} // end
		
	} // main() end
} // class end
