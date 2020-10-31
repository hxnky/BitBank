package bank;

public class Bankpassword {
	
	private boolean equals(Object o) {
		if(o instanceof BankMemberDTO) {
			BankMemberDTO bm = (BankMemberDTO) o;
			if(password.equals(bm.getPassword())&&name.equals(bm.getName())) {
				return true;
			}
			else
				return false;
		}
	}
	
	else {
		int index = members.indexOf(name);
		System.out.println(name+"님의 비밀번호는 "+members.get(index)+"입니다.");
	}

	private void deleteAccount() {
		sc.nextLine();
		String name = getStrInput("이름을 입력하세요 : ");
		String password = getStrInput("비밀번호를 입력하세요 : ");

		if (!(nameCheck(name)) || !(passwordCheck(password))) {
			System.out.println("정보가 존재하지 않거나 이름이나 비밀번호가 일치하지 않습니다..");
		} else {
			String answer = getStrInput("정말 탈퇴하시겠습니까?(Y/N)");
			if (answer.equals("y") || answer.equals("Y")) {
				for(BankMemberDTO index : members) {
					if(index.getPassword().contentEquals(password)) {
						members.remove(index);
					}
				}
				System.out.println("삭제되었습니다.");
			} else if (answer.equals("N") || answer.equals("n")) {
				System.out.println("초기 메뉴로 돌아갑니다.");
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}

	}
}