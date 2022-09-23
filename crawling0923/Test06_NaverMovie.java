package crawling0923;

import java.io.FileWriter;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test06_NaverMovie {

	public static void main(String[] args) {
		// 네이버 영화 평점 후기 크롤링하기
		
			try {
				
				String fileName = "C:/java202207/NaverMovie.txt";
				FileWriter fw = new FileWriter(fileName, true); // 추가모드
				PrintWriter out = new PrintWriter(fw, true);
				
				String URL = "https://movie.naver.com/movie/bi/mi/pointWriteFormList.naver";

				for(int p=1; p<=1; p++) {
					String params = "?code=201641"; // 영화 코드 번호
					params += "&type=after&onlyActualPointYn=N&onlySpoilerPointYn=N";
					params += "&order=sympathyScore"; // 공감순
					params += "&page="+p;
					
					Document doc = Jsoup.connect(URL+params).get();
					
//					// 1. id로 접근하기
//					for(int ment=0; ment<10; ment++) {
//						Elements elements = doc.select("#_filtered_ment_" + ment);				
//						for( Element element : elements ) {
//							System.out.println(element.text());
//							out.println(element.text());
//						} // for end
//					} // for end
					
					// 2. class로 접근하기
					Elements elements = doc.select("ul li .score_reple p");
					elements.select(".ico_viewer").remove();
					for( Element element : elements ) {
						System.out.println(element.text());
						//out.println(element.text());
					} // for end
				} // for end
				
				out.close();
				fw.close();				
				System.out.println("soldesk.txt 파일 완성!");			
				
			} catch (Exception e) {
				System.out.println("크롤링 실패 : " + e);
			} // end

	} // main() end
} // class end
