package abstract_hw;

public class LeeSangHaeSee extends Character {
	
	public LeeSangHaeSee() {
		cno = 3;
		hp = 120;
		mp = 60;
		System.out.println("이상해씨 생성~ 이상해 이상해");
		printStatus(); // 생성 후 꼬북이 상태정보를 출력
	}

	@Override
	public void eat() {
		mp += 25;
	}

	@Override
	public void sleep() {
		mp += 25;
	}

	@Override
	public void play() {
		mp -= 25;
		hp += 20;
	}

	@Override
	public boolean train() {
		mp -= 25;
		hp += 10;
		levelUp();
		return checkMp(); // Character의 public boolean checkMp()과 연결하기 위함
	}

	@Override
	public void levelUp() {
		if (hp >= 55) {
			hp -= 55;
			level++;
		}
	}
}
