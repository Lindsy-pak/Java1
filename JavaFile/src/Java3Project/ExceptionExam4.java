package Project;

import java.sql.*;

public class ExceptionExam4 {
	// 싱글톤 : 싱글톤 프로그램 안에서 객체 1개만 만들어지도록 유도
	// 2개 이상 만들 수 없도록 한다. 
	// 싱글톤은 오류가 많이 때문에 이용하지 않는 것이 좋다.
	public static void main(String[] args) {
//		DbUtils du = new DbUtils();
//		Connection con = du.getCon();
		
		DbUtils du = DbUtils.getInstance();
		DbUtils du2 = DbUtils.getInstance();
		
		System.out.println(du);
		System.out.println(du2);
		System.out.println(du == du2);
	}

}
// 외부 라이브러리를 사용하기 위한 import
// jdbc - java data base connection 
// my sql jdbc driver로 구글 검색 - platform independent
// 연결방법 : 자바프로젝트 우클릭 - build path - Configure build path - 라이브러리 - add external JARS - file선택 

class DbUtils { // 자바랑 디비 연결시켜줌
	// 싱글톤 하는방법 
	private DbUtils() {}
	private static DbUtils dbutils = new DbUtils(); 
	
	public static DbUtils getInstance() { //static을 안하면 메서드 사용 불가 
//		if(dbutils == null) {
//			dbutils = new DbUtils();
//		}
		return dbutils;
	}
	
	// 임폴트 방법으로 연결
	Connection getCon() { // import를 시켜주어야 한다. 
		Connection con = null; // 지역변수는 null이라도 값을 줘야 오류가 뜨지 않는다. 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //시작전 로딩 개념
			//					jdbc:mysql://ip주소:포트번호/데이터베이스명
			final String URL = "jdbc:mysql://localhost:3308/java";
			final String USERNAME = "root";
			final String PASSWARD = "koreait";
			
			con = DriverManager.getConnection(URL, USERNAME, PASSWARD); 
			System.out.println("접속 성공!!");
			// DriverManager.getConnection() : 객체화를 하지않고 쓰는 메소드는 static매서드 
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("접속실패!!");
		}
		return con;
	}
}
/*
final
// 값 수정 금지 
final int 상수

// 오버라이딩 금지!!
final void sum () {	
}
// 상속 금지 
final class ExceptionExam4

*/