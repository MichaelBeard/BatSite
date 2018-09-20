package springwork.model;

public class Comics {

	private Integer comicIssue;
	private Double comicPrice;
	private String comicName;
	private boolean savedComic = false;

	public Comics() {

	}

	public Comics(Double comicPrice, String comicName, boolean savedComics) {
		super();
		this.comicPrice = comicPrice;
		this.comicName = comicName;
	}

	public Double getComicPrice() {
		return comicPrice;
	}

	public void setComicPrice(Double comicPrice) {
		this.comicPrice = comicPrice;
	}

	public String getComicName() {
		return comicName;
	}

	public void setComicName(String comicName) {
		this.comicName = comicName;
	}

	public boolean isSavedComic() {
		return savedComic;
	}

	public void setSavedComic(boolean savedComic) {
		this.savedComic = savedComic;
	}

	public Integer getComicIssue() {
		return comicIssue;
	}

	public void setComicIssue(Integer comicIssue) {
		this.comicIssue = comicIssue;
	}

}