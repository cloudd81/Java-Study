package crawling0923;

import java.io.FileWriter;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test07_NaverMovie {

	public static void main(String[] args) {
		// 네이버 영화 평점 후기 크롤링하기
		
			try {
				
				String fileName = "C:/java202207/gongjo.txt";
				FileWriter fw = new FileWriter(fileName, true); // 추가모드
				PrintWriter out = new PrintWriter(fw, true);
				
				String URL = "https://movie.naver.com/movie/bi/mi/pointWriteFormList.naver";

				for(int p=1; p<=969; p++) {
					System.out.println("데이터 수집중...");
					String params = "?code=201641"; // 영화 코드 번호
					params += "&type=after&onlyActualPointYn=N&onlySpoilerPointYn=N";
					params += "&order=sympathyScore"; // 공감순
					params += "&page=";
					params += p;
					
					Document doc = Jsoup.connect(URL+params).get();

					Elements elements = doc.select(".score_reple p");
					elements.select(".ico_viewer").remove();
					for( Element element : elements ) {
						//System.out.println(element.text());
						out.println(element.text());
					} // for end
				} // for end
				
				out.close();
				fw.close();	
				System.out.println("--------------gongjo.txt 공조 2 평점 저장 완성!");			
				
			} catch (Exception e) {
				System.out.println("크롤링 실패 : " + e);
			} // end

	} // main() end
} // class end
