package abstracts;

import java.util.Scanner;

public class PlayGame extends CharacterChange{
	private Character character;
	private int menu;
	private boolean flag;
	
	public PlayGame(Character character) {
		this.character = character;
	}
	
	public void printMenu(Scanner sc) {
		System.out.println("1. EAT 2. SLEEP 3. PLAY 4. TRAIN 5. CHARACTER CHANGE 0. EXIT");
		menu = sc.nextInt();
		
		playCharacter();
	}

	private void playCharacter() {
		switch (menu) {
		case 1:
			character.eat();
			break;
		case 2:
			character.sleep();
			break;
		case 3:
			character.play();
			break;
		case 4:
			character.train();
			break;
		case 5:
			saveCharacter(character);
			changeCharacter();
			break;
		default:
			flag = true;
			break;
		}
		character.printStatus();
	}
	public void changeCharacter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 캐릭터를 선택하세요 > ");
		System.out.println("1. 피카츄 2. 꼬북이 3. 이상해씨 4. 파이리");
		int chNum = sc.nextInt();
		
		switch (chNum) {
		case 1:
			if (pica == null) {
				character = new Picachu();
			} else {
				System.out.println("피카츄 불러오기 성공!");
				character = pica;
			}
			break;
		case 2:
			if (ggobuk == null) {
				character = new Ggobukee();
			} else {
				System.out.println("꼬부기 불러오기 성공!");
				character = ggobuk;
			}
			break;
		case 3:
			if (isang == null) {
				character = new Isanghaessee();
			} else {
				System.out.println("이상해씨 불러오기 성공!");
				character = isang;
			}
			break;
		case 4:
			if (fai == null) {
				character = new Fairy();
			} else {
				System.out.println("파이리 불러오기 성공!");
				character = fai;
			}
			break;

		default:
			break;
		}
	}

	

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public int getMenu() {
		return menu;
	}

	public void setMenu(int menu) {
		this.menu = menu;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
}
