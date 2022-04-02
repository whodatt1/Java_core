package list.ex;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginMenu {
	private Scanner sc = new Scanner(System.in);
	private boolean flag = true;
	private final String MENU = "1.회원가입  2.로그인  3.종료";

	public void menu(ArrayList<LoginData> ld) {

		while (flag) {
			System.out.println(MENU);
			int chNum = sc.nextInt();

			switch (chNum) {
			case 1:
				String id = idCheck(ld, "join");
				if (id != null) {
					System.out.println("비밀번호를 입력하세요 > ");
					String pw = sc.next();
					ld.add(new LoginData(id, pw));
					System.out.println("입력 완료");
				}
				break;
			case 2:
				String loginId = idCheck(ld, "login");
				if (loginId != null) {
					pwCheck(ld, loginId);
				}
				break;
			case 3:

				break;

			default:
				break;
			}
		}
	}

	private void pwCheck(ArrayList<LoginData> ld, String loginId) {
		System.out.println("비밀번호를 입력하세요 > ");
		String pw = sc.next();

		for (int i = 0; i < ld.size(); i++) {
			if (ld.get(i).getId().equals(loginId)) {
				if (ld.get(i).getPw().equals(pw)) {
					System.out.println(loginId + "님이 로그인에 성공하였습니다");
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}
		}
	}

	private String idCheck(ArrayList<LoginData> ld, String sign) {
		System.out.println("아이디를 입력하세요 > ");
		String id = sc.next();

		for (int i = 0; i < ld.size(); i++) {
			if (ld.get(i).getId().equals(id)) {
				if (sign == "join") {
					System.out.println("아이디가 중복됩니다 다른 아이디를 입력하세요");
				}
				return sign == "join" ? null : id;
			}
		}
		return sign == "join" ? id : null;
	}

}
