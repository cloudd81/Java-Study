package crawling0923;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test03_choongang {

	public static void main(String[] args) {
		// 중앙정보처리학원 웹페이지의 공지사항 제목만 크롤링하기
		try {
			
			String URL = "https://www.choongang.co.kr/html/sub07_01_n.php";
			
			// 1~11 웹페이지 소스 가져오기
			for(int p=1; p<=11; p++) {
				String params = "?page=" + p + "&mod=&idx=";
				//System.out.println(params);
				Document doc = Jsoup.connect(URL+params).get();
				// System.out.println(doc);
				
				// 요소 선택하기
				/*
					<td class="default_title">[22년 9월 02일] 9월 기업인 초청 취업 특강</td>
				 */
				Elements elements = doc.select(".board_default_list .default_title");
				for( Element element : elements ) {
					System.out.println(element.text());
				} // for end
				// remove > 요소 제거하기
				
			} // for end
			
		} catch (Exception e) {
			System.out.println("크롤링 실패 : " + e);
		} // end

	} // main() end
} // class end
