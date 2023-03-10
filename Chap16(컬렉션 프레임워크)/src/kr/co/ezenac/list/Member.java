package kr.co.ezenac.list;

public class Member {

	private int memberId;
	private String memberName;
	
	// ========== 생성자 ==========
	public Member(int memberId, String memberName) {
		//super();
		this.memberId = memberId;
		this.memberName = memberName;
	}
	// ========== get & set ==========
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}
}
