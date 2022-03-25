package banking;

import java.util.Scanner;

// 추상화
// 은행계좌정보 > BankAccount (계좌는 소유자 정보를 갖고 있지 않음, 잔액)
// 사람은 은행계좌를 갖을 수 있습니다 (이름, 현금보유액, 은행계좌)
// 사람은 은행서비스를 통해서 은행계좌를 활용한다 (입금, 출금 ...)
class BankAccount {

	private int balance;
	
	public BankAccount() {}

	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public boolean deposit(int money, User owner) {
		if (money > owner.getCashAmount()) {
			System.out.println("입금 실패!");
			System.out.println("잔고 : "+ balance);
			System.out.println("현금보유 : " + owner.getCashAmount());
			return false;			
		}else {
			balance += money;
			owner.setCashAmount(owner.getCashAmount()-money);
			System.out.println(money + "입금~");
			System.out.println("잔고 : "+ balance);
			System.out.println("현금보유 : " + owner.getCashAmount());
			return true;
		}
	}
	
	public boolean withdraw(int money, User owner) {
		if (money > balance) {
			System.out.println("출금 실패!");
			System.out.println("잔고 : " + balance);
			System.out.println("출금액 : " + money);
			return false;			
		} else {
			balance -= money;
			owner.setCashAmount(owner.getCashAmount()+money);
			System.out.println(money + "출금~");
			System.out.println("잔고 : "+ balance);
			System.out.println("현금보유 : " + owner.getCashAmount());
			return true;
		}
	}
	public boolean transfer(int money, User from, User to) { // 파라미터 셋팅필요
		if (money > from.getAccount().getBalance()) { // 실패조건? 잔액보다 더 많은 금액을 이체할 때
			System.out.println("잔액보다 이체할 금액이 크므로 이체에 실패하였습니다");
			System.out.println("이체할 금액 : " + money + " 현재 잔액 : " + from.getAccount().getBalance());
			return false;
		} else {
			from.getAccount().setBalance(from.getAccount().getBalance()-money);
			to.getAccount().setBalance(to.getAccount().getBalance()+money);
			printResult(money, from, to); // 파라미터를 셋팅하여 from: ?, to: ?, $$$ 이체완료
			return true;
		}
	}
	private void printResult(int money, User from, User to) {
		System.out.println("from : " + from.getName() + " to : " + to.getName() + " " + money + " 이체완료");
		System.out.println("현재 잔액 : " + from.getAccount().getBalance());
	}
}

class User {
	private String name;
	private int cashAmount;
	private BankAccount account;

	public User() {}

	public User(String name, int cashAmount) {
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

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}
}

public class BankingService6 {
// 은행 시스템
	// 메뉴 > 1.계좌개설 2.입금 3.출금 4.이체 0.종료
	// 계좌개설 > 이름, 현금보유, 계좌객체(초기 잔액) > 초기잔액은 현금보유액과 관계 필터링
	// 입금, 출금 > 현금보유액과 잔액의 관계 필터링
	// 이체 > from, to 계좌의 잔액과 이체금액의 관계 필터링
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int money;
		User me = null;
		User you = null;
		BankAccount myBa = null;
		BankAccount urBa = null;
		
		while(flag) {
			System.out.println("1. 계좌개설 2. 입금 3. 출금 4. 이체 0. 종료");
			int chooseNum = sc.nextInt();
			switch (chooseNum) {
			case 1:
				me = new User("Kim", 100000);
				you = new User("Park", 100000);
				myBa = new BankAccount();
				urBa = new BankAccount();
				me.setAccount(myBa);
				you.setAccount(urBa);
				System.out.println("계좌 개설이 완료되었습니다");
				break;
			case 2:
				System.out.println("입금하실 금액을 입력하세요");
				money = sc.nextInt();
				me.getAccount().deposit(money, me);
				break;
			case 3:
				System.out.println("입금하실 금액을 입력하세요");
				money = sc.nextInt();
				me.getAccount().withdraw(money, me);
				break;
			case 4:
				System.out.println("이체하실 금액을 입력하세요");
				money = sc.nextInt();
				me.getAccount().transfer(money, me, you);
				break;
			case 0:
				System.out.println("은행시스템이 종료되었습니다");
				flag = false;
				break;
				
			default:
				break;
			}
		}

	}
}








