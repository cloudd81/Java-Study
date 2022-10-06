-- sungjuk.sql

-- 성적테이블 삭제
drop table sungjuk;

-- 성적테이블 생성
create table sungjuk(
     sno   int         not null --일련번호
    ,uname varchar(50) not null --이름
    ,kor   int         not null --국어
    ,eng   int         not null --영어
    ,mat   int         not null --수학
    ,aver  int         null     --평균
    ,addr  varchar(50)          --주소
    ,wdate date                 --등록일(년월일시분초)
    ,primary key(sno)
);
-------------------------------------------------------------

[시퀀스 Sequence] - 일련번호 자동 생성
-- 시퀀스 생성 : create sequence 시퀀스명 
-- 시퀀스 삭제 : delete sequence 시퀀스명

-- sungjuk 테이블에서 사용할 시퀀스 생성
create sequence sungjuk_seq;

-- sungjuk_seq 시퀀스 삭제
delete sequence sungjuk_seq;

---------------------------------------------------------------

[행추가] sungjukIns.jsp
insert into sungjuk(sno, uname, kor, eng, mat, aver, addr, wdate)
value(sungjuk_seq.nextval, ?, ?, ?, ?, ?, ?, sysdate);

[전체목록] sungjukList.jsp
select * from sungjuk order by sno desc;

[상세보기] sungjukRead.jsp
select * from sungjuk where sno=?;

[행삭제] sungjukDel.jsp
delete from sungjuk where sno=?;

[행수정] sungjukUpdate.jsp
update su0ngjuk
set uname=?, kor=?, eng=?, mat=?, aver=?, addr=?, wdate=sysdate
where sno=?
---------------------------------------------------------------------

● [성적 게시판 페이지 흐름]
 입력 -> 목록 -> 상세보기 -> 삭제/수정
 
 1) 입력 페이지 만들기
  sungjukForm.jsp -> sungjukIns.jsp
  
 2) 목록 페이지 만들기
 				sno=3              sno=3
  sungjukList.jsp -> sungjukRead.jsp -> 삭제 sungjukDel.jsp
                                   sno=3
  									 -> 수정 sungjukUpdate.jsp

 3) 수정
  ① sungjukUpdate.jsp
  	수정하고자 하는 행을 DB에서 가져와서(select문), 사용자가 작성했던 내용을 그대로 성적폼에 출력하고
  	                 sungjukRead.jsp								sungjukForm.jsp
  	사용자가 다시 입력한 내용으로 수정을 해준다(update문).
  	                 sungjukUpdate.jsp
 
 