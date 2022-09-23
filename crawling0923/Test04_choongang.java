package crawling0923;

import java.io.FileWriter;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test04_choongang {

	public static void main(String[] args) {
		// 중앙정보처리학원 웹페이지의 공지사항 제목만 크롤링해서 파일에 저장하기
		
		
		try {
			
			String fileName = "C:/java202207/choongang.txt";
			FileWriter fw = new FileWriter(fileName, true); // 추가모드
			PrintWriter out = new PrintWriter(fw, true);
			
			String URL = "https://www.choongang.co.kr/html/sub07_01_n.php";

			for(int p=1; p<=11; p++) {
				String params = "?page=" + p + "&mod=&idx=";
				Document doc = Jsoup.connect(URL+params).get();

				Elements elements = doc.select(".board_default_list .default_title");
				for( Element element : elements ) {
					out.println(element.text());
				} // for end
			} // for end
			
			System.out.println("choongang.txt 파일 완성!");			
			
		} catch (Exception e) {
			System.out.println("크롤링 실패 : " + e);
		} // end

	} // main() end
} // class end
