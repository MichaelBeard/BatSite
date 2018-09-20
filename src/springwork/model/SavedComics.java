package springwork.model;

public class SavedComics {

	private Integer comicIssue;
	private Double comicPrice;
	private String comicName;
	private boolean savedComic = true;
	
	public SavedComics() {
		
	}

	public SavedComics(Integer comicIssue, Double comicPrice, String comicName, boolean savedComic) {
		super();
		this.comicIssue = comicIssue;
		this.comicPrice = comicPrice;
		this.comicName = comicName;
		this.savedComic = savedComic;
	}

	public Integer getComicIssue() {
		return comicIssue;
	}

	public void setComicIssue(Integer issueNum) {
		this.comicIssue = issueNum;
	}

	public String getComicName() {
		return comicName;
	}

	public void setComicName(String comicName) {
		this.comicName = comicName;
	}

	public Double getComicPrice() {
		return comicPrice;
	}

	public void setComicPrice(Double comicPrice) {
		this.comicPrice = comicPrice;
	}

	public boolean isSavedComic() {
		return savedComic;
	}

	public void setSavedComic(boolean savedComic) {
		this.savedComic = savedComic;
	}

}
