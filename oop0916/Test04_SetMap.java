package oop0916;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Test04_SetMap {

	public static void main(String[] args) {
		// 2. Set 계열 : 순서가 없다
		
		Set set = new HashSet();
		set.add(3);
		set.add(2.4);
		set.add('R');
		set.add("BUSAN");
		set.add(new Integer(7));
		
		System.out.println(set.size());
		
		// cursor : 가리킬 요소가 있으면 true, 없으면 false 값을 반환
		// cursor를 이용해서 요소를 접근하는 경우
		Iterator iter = set.iterator();
		while(iter.hasNext()) { // 다음 cursor가 있는지
			 // cursor가 가리키는 요소 가져오기
			Object obj=iter.next();
			System.out.println(obj);
		} // while end
		
		
		// 3. Map계열	: 순서가 없다
		// -> Key		: 이름표
		// -> Value		: 값
		
		// JSON, 파이선(딕셔너리), NoSQL 등에서 많이 사용하는 문법
		
		HashMap map = new HashMap();
		map.put("one", 3);
		map.put("two", 2.4);
		map.put("three", 'R');
		map.put("four", "손흥민");
		
		System.out.println(map.size()); // 4
				
		System.out.println(map.get("four")); // "손흥민"
		
		// Properties 클래스
		Properties db = new Properties();
		
		db.put("url", "http://localhost:1521");
		db.put("username", "itwill");
		db.put("password", "12341234");
		
		System.out.println(db.get("url"));
		System.out.println(db.get("username"));
		System.out.println(db.get("password"));
		
		
		
		// 문제)
		// = 문자를 기준으로 문자열을 분리해서
		// = 앞의 문자열은 Key, = 뒤의 문자열은 Value로 구분해서 map에 저장하고
		// map의 key값들 중에서 "read.do"를 호출하면 "net.bbs.Read"가 출력
		
		HashSet command=new HashSet();
        command.add("list.do=net.bbs.List");
        command.add("read.do=net.bbs.Read");
        command.add("write.do=net.bbs.Write");
        
        System.out.println(command.size());
        System.out.println();
        
		// HashMap hm 만들기
		HashMap hm = new HashMap();
		
		// command의 반환자 iter2 만들기
		Iterator iter2 = command.iterator();
		
		// 반환자로 command의 요소 불러오기
		while(iter2.hasNext()) { // 다음 cursor가 있는지 확인
			 // cursor가 가리키는 요소 가져와서 obj에 담기
			Object obj=iter2.next();
			
			// 요소를 String으로 변환해서 str에 담기
			String str = obj.toString();
			
			// pos에 =의 위치값 담기
			int pos=str.indexOf("=");
			
			// =를 기준으로 문자열 나누기
			String key = str.substring(0, pos);
			String value = str.substring(pos+1);
						
			// 나눠진 문자열을 hm 안에 각각 key와 value로 담기
			hm.put(key, value);
			
			/*
			// 번외버전 : 배열로 담아보기
			// str2에 =로 나눈 값들을 담기
			String[] str2 = str.split("=");
			
			// hm의 key와 value에 배열 요소 담기
			hm.put(str2[0], str2[1]);
			*/
			
		} // while end            
		        
		// 결과값
		System.out.println(hm.get("list.do")); // net.bbs.List
		System.out.println(hm.get("read.do")); // net.bbs.Read
		System.out.println(hm.get("write.do")); // net.bbs.Write
        
		
		
	} // main() end
} // class end
