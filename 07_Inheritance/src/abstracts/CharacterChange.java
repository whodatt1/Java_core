package abstracts;

public abstract class CharacterChange {
	
	protected Character pica;
	protected Character ggobuk;
	protected Character isang;
	protected Character fai;
	
	public void saveCharacter(Character character) {
		System.out.println(character.getNum());
		if (character.getNum() == 1) {
			this.pica = character;
		} else if (character.getNum() == 2) {
			this.ggobuk = character;
		} else if (character.getNum() == 3) {
			this.isang = character;
		} else {
			this.fai = character;
		}
	}
	
}
