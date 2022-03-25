package banking;

import java.util.Scanner;

// 추상화
// 은행계좌정보 > BankAccount2 (계좌는 소유자 정보를 갖고 있지 않음, 잔액)
// 사람은 은행계좌를 갖을 수 있습니다 (이름, 현금보유액, 은행계좌)
// 사람은 은행서비스를 통해서 은행계좌를 활용한다 (입금, 출금 ...)
class BankAccount2 {
//	private User2 owner;
	private int balance;

	public BankAccount2() {
	}

//	public BankAccount2(User2 owner) {
//		this.owner = owner;
//	}
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

//	public User2 getOwner() {
//		return owner;
//	}
	public boolean deposit(int money, User2 owner) {
		if (money > owner.getCashAmount()) {
			System.out.println("입금 실패!");
			System.out.println("잔고 : " + balance);
			System.out.println("현금보유 : " + owner.getCashAmount());
			return false;
		} else {
			balance += money;
			owner.setCashAmount(owner.getCashAmount() - money);
			System.out.println(money + "입금~");
			System.out.println("잔고 : " + balance);
			System.out.println("현금보유 : " + owner.getCashAmount());
			return true;
		}
	}

	public boolean withdraw(int money, User2 owner) {
		if (money > balance) {
			System.out.println("출금 실패!");
			System.out.println("잔고 : " + balance);
			System.out.println("출금액 : " + money);
			return false;
		} else {
			balance -= money;
			owner.setCashAmount(owner.getCashAmount() + money);
			System.out.println(money + "출금~");
			System.out.println("잔고 : " + balance);
			System.out.println("현금보유 : " + owner.getCashAmount());
			return true;
		}
	}

	public boolean transfer(int money, User2 from, User2 to) { // 파라미터 셋팅필요
		if (money > from.getAccount().getBalance()) { // 실패조건? 잔액보다 더 많은 금액을 이체할 때
			System.out.println("잔액보다 이체할 금액이 크므로 이체에 실패하였습니다");
			System.out.println("이체할 금액 : " + money + " 현재 잔액 : " + from.getAccount().getBalance());
			return false;
		} else {
			from.getAccount().setBalance(from.getAccount().getBalance() - money);
			to.getAccount().setBalance(to.getAccount().getBalance() + money);
			printResult(money, from, to); // 파라미터를 셋팅하여 from: ?, to: ?, $$$ 이체완료
			return true;
		}
	}

	private void printResult(int money, User2 from, User2 to) {
		System.out.println("from : " + from.getName() + " to : " + to.getName() + " " + money + " 이체완료");
	}
}

class User2 {
	private String name;
	private int cashAmount;
	private BankAccount2 account;

	public User2() {
	}

	public User2(String name, int cashAmount) {
		this.name = name;
		this.cashAmount = cashAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(int cashAmount) {
		this.cashAmount = cashAmount;
	}

	public BankAccount2 getAccount() {
		return account;
	}

	public void setAccount(BankAccount2 account) {
		this.account = account;
	}
}

public class BankingService5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		User2 me = null;
		User2 you = null;
		BankAccount2 myBa = null;
		BankAccount2 urBa = null;
		int menu = 0;
		boolean isOk;
		boolean flag = true;

		while (flag) {

			System.out.println("\n-------------뱅킹 시스템 -------------");
			System.out.println("1. 계좌개설 2. 입금 3. 출금 4. 이체 0. 종료");
			menu = sc.nextInt();
			System.out.println("---------------------------------------\n");

			switch (menu) {
			case 1:
				String[] userInfo = getUserInfo(sc);
				me = new User2(userInfo[0], Integer.parseInt(userInfo[1]));

				String[] userInfo2 = getUserInfo(sc);
				you = new User2(userInfo2[0], Integer.parseInt(userInfo[1]));

				myBa = new BankAccount2();
				urBa = new BankAccount2();
				me.setAccount(myBa);
				you.setAccount(urBa);
				break;
			case 2:
				System.out.println("입금할 금액 > ");
				int saving = sc.nextInt();
				isOk = me.getAccount().deposit(saving, me);
				if (isOk) { // 구글 메세지 서버에 연결하는 부분이라고 가정하자
					System.out.print("메세지 알림 : ");
					System.out.print(me.getName() + "님의 계좌로 ");
					System.out.print(saving + "이 입금되었습니다.");
				}
				break;
			case 3:
				System.out.println("출금할 금액 > ");
				int withdrawl = sc.nextInt();
				isOk = me.getAccount().withdraw(withdrawl, me);
				if (isOk) { // 구글 메세지 서버에 연결하는 부분이라고 가정하자
					System.out.print("메세지 알림 : ");
					System.out.print(me.getName() + "님의 계좌에서 ");
					System.out.print(withdrawl + "이 출금되었습니다.");
				}
				break;
			case 4:
				System.out.println("이체할 금액 > ");
				int transfer = sc.nextInt();
				isOk = me.getAccount().transfer(transfer, me, you);
				if (isOk) {
					System.out.print("메세지 알림 : ");
					System.out.print(me.getName() + "님이 " + you.getName() + "에게");
					System.out.print(transfer + "를 송금하였습니다.");
				}
				break;

			default:
				flag = false;
				System.out.println("----------------뱅킹 시스템 종료------------------");
				break;
			}
		}
		System.out.println("이용해주셔서 감사합니다");
	}

	private static String[] getUserInfo(Scanner sc) {
		System.out.println("예금주 명 > ");
		String name = sc.next();
		System.out.println("현금보유액 > ");
		String money = sc.next();
		String[] infos = { name, money };

		return infos;
	}
}
