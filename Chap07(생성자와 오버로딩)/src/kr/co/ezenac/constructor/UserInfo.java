package kr.co.ezenac.constructor;

public class UserInfo {
	
	String userId;
	String userPassWord;
	String userName;
	String userAddress;
	String phoneNumber;
	
	//========== 기본 생성자 ==========
	public UserInfo() {
		
	}
	// ==================== 기본 생성자가 아닌 생성자 추가 ====================
	public UserInfo(String userId, String userPassWord, String userName) {
		//super();
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}
	
	public String showUserInfo() {
		return "고객님의 아이디는 "+ userId +"이고, 등록된 이름은 "+ userName +"입니다.";
	}
	
	
}
