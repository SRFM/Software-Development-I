package models;

import poiExtractor.BlankPageExtractor;
import poiExtractor.IPageExtractorToPoi;

import java.util.ArrayList;
import java.util.Date;

abstract public class Pages  {

	private Date date;
	private ArrayList<String> keywords;
	private int pageNumber;

	public Pages(int pageNumber) {
		this.pageNumber = pageNumber;
		keywords = new ArrayList<>();
		date = new Date();
	}


	public ArrayList<String> getKeywords() {
		return keywords;
	}

	public void addKeyword(String keyword) {
		keywords.add(keyword);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	public abstract IPageExtractorToPoi extractToPptx();
}
