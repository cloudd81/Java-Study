package oop0919;

import java.util.Vector;

// 상품 구매 관련 클래스
public class Order {
	private int myMoney=1000;	// 나의 총 재산
	private int myMileage=0;	// 나의 마일리지 점수(bonusPoint 누적)
	private int i=0;
	// 상품을 구매했을 때 어떤 상품을 구매했는지 저장 (나의 구매상품 목록)
	private Vector<Product> item=new Vector<>();

	public Order () {}
	
	public void buy(Product p) {
		if(p.price>this.myMoney) {
			System.out.println("잔액이 부족합니다!");
			return;
		} // if end
		
		item.add(p);								// 구매상품
		this.myMoney=this.myMoney-p.price;			// 나의 재산은 감소
		this.myMileage=this.myMileage+p.bonusPoint;	// 나의 마일리지는 증가
	} // buy() end

	// 물건 반품하기
	public void refund(Product p) {
		if(item.remove(p)) { // 구매상품 반품
			System.out.println(p.toString()+" 반품되었습니다~");
			this.myMoney=this.myMoney+p.price;			// 나의 재산은 증가
			this.myMileage=this.myMileage-p.bonusPoint;	// 나의 마일리지는 감소
		} else {
			System.out.println("구매 내역에 상품이 없습니다!!");
		} // if end
	} // refund() end
	
	public void disp() {
		if(item.isEmpty()) {
			System.out.println("구매상품 없음!!");
			return;
		} // if end		
		
		// 문제) 구매 상품 목록과 구매한 상품의 총 합계금액을 구하시오
		int sum=0;
		StringBuilder shoplist = new StringBuilder();
		for(int a=0; a<item.size(); a++) {
			Product p=item.get(a);
			sum+=p.price;
			shoplist.append(p.toString() + " ");
		} // for end
		
		System.out.println("구매 상품 목록 : " + shoplist);
		System.out.println("총 사용 금액 : " + sum);
		System.out.println("나의 남은 재산 : " + this.myMoney);
		System.out.println("나의 마일리지 : " + this.myMileage);
	} // disp() end

	
} // class end
