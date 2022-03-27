package abstracts;

public class Ggobukee extends Character {
	
	public Ggobukee() {
		num = 2;
		hp = 95;
		mp = 50;
		System.out.println("꼬부기 생성~ 꼬북 꼬북");
	}
	
	@Override
	public void eat() {
		mp += 10;
	}

	@Override
	public void sleep() {
		mp += 20;
	}

	@Override
	public void play() {
		mp -= 20;
		hp += 5;
	}

	@Override
	public boolean train() {
		mp -= 10;
		hp += 10;
		levelUp();
		return checkMp(); // Character의 public boolean checkMp()과 연결하기 위함
	}
	
	@Override
	public void levelUp() {
		if (hp >= 40) {
			hp -= 40;
			level++;
		}
	}
}
