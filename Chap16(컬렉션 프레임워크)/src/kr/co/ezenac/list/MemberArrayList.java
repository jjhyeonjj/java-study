package kr.co.ezenac.list;

import java.util.ArrayList;

public class MemberArrayList {

	private ArrayList<Member> arrayList;			// arrayList 선언
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		// 해당 아이디를 가진 멤버를 ArrayList에서 찾음
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			// 멤버아이디가 매개변수 memberId와 일치하면
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				// 해당 멤버 삭제
				arrayList.remove(i);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMembers() {
		for(Member member : arrayList) 
			System.out.println(member);
		System.out.println();
		
	}
	
}
