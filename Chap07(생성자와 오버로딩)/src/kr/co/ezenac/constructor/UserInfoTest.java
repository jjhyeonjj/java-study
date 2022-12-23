package kr.co.ezenac.constructor;

public class UserInfoTest {
	
	public static void main(String[] args) {
	
		UserInfo userInfo = new UserInfo();
		userInfo.userId = "ezen";
		userInfo.userPassWord = "0111";
		userInfo.userName = "Admiral Yi";
		userInfo.userAddress = "Korea";
		userInfo.phoneNumber = "112";
		
		System.out.println(userInfo.showUserInfo());
		
		// 다른 형태로 객체에 값이 저장이 됨.
		UserInfo userInfo2 = new UserInfo("ezenac", "2023", "Shin");
		System.out.println(userInfo2.showUserInfo());
	}
}
