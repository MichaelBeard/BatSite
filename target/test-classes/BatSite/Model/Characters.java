package springwork.model;

public class Characters {
	private String characterDescription;
	private String characterName;
	
	public Characters() {
		
	}

	public Characters(String characterDescription, String characterName) {
		super();
		this.characterDescription = characterDescription;
		this.characterName = characterName;
	}

	public String getCharacterDescription() {
		return characterDescription;
	}

	public void setCharacterDescription(String characterDescription) {
		this.characterDescription = characterDescription;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
}

	