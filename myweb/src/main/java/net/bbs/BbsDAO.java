package net.bbs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import net.bbs.*;
import net.utility.DBClose;
import net.utility.DBOpen;

public class BbsDAO {
	private DBOpen dbopen = null;
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private StringBuilder sql = null;
	
	public BbsDAO() {
		dbopen = new DBOpen();
	} // end
	
	public int create(BbsDTO dto) {
		int cnt=0;
		try {
			con=dbopen.getConnection();
			
			sql = new StringBuilder();
			sql.append(" INSERT INTO tb_bbs(bbsno, wname, subject, content, passwd, ip, grpno)");
			sql.append(" VALUES (bbs_seq.nextval, ?, ?, ?, ?, ?, (SELECT NVL(MAX(bbsno),0)+1 FROM tb_bbs))");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getWname());
			pstmt.setString(2, dto.getSubject());
			pstmt.setString(3, dto.getContent());
			pstmt.setString(4, dto.getPasswd());
			pstmt.setString(5, dto.getIp());
			
			cnt = pstmt.executeUpdate();
						
		} catch (Exception e) {
			System.out.println("추가 실패 : " + e);
		} finally {
			DBClose.close(con, pstmt);
		} // end
		return cnt;
	} // create() end
	
	public ArrayList<BbsDTO> list() {
		ArrayList<BbsDTO> list = null;
		
		try {
			con = dbopen.getConnection();
			sql = new StringBuilder();
			sql.append(" SELECT wname, subject, content, regdt ");
			sql.append(" FROM tb_bbs ");
			sql.append(" ORDER BY regdt DESC ");
			
			pstmt = con.prepareStatement(sql.toString());
			rs= pstmt.executeQuery();	
			if(rs.next()) {
				// 전체 행을 저장할 수 있는
				list = new ArrayList<>();
				do {
					BbsDTO dto = new BbsDTO();
					dto.setWname(rs.getString("wname"));
					dto.setSubject(rs.getString("subject"));
					dto.setContent(rs.getString("content"));
					dto.setRegdt(rs.getString("regdt"));
					list.add(dto);
				} while(rs.next());
			} else {
				list = null;
			} // if end
			
		} catch (Exception e) {
			System.out.println("목록 실패 : " + e);
		} finally {
			DBClose.close(con, pstmt, rs);
		} // end
		return list;
	} // list() end
	
	
} // class end
