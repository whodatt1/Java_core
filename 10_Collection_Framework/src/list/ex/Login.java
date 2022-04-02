package list.ex;

import java.util.ArrayList;

public class Login {
	public static void main(String[] args) {
		ArrayList<LoginData> ld = new ArrayList<>();
		LoginMenu lm = new LoginMenu();
		lm.menu(ld);
	}
}
