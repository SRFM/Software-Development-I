package models;

import poiExtractor.ContentPageExtractor;
import poiExtractor.IPageExtractorToPoi;

import java.util.ArrayList;
import java.util.Date;

public class TextPages extends Pages {

	private Date date;
	private String text;
	private ArrayList<String> keywords;
	
	
	public TextPages(int pageNum, String text, String key_words) {
		super(pageNum);
		this.text = text;
		String[] words = key_words.split(",");
		keywords = new ArrayList<>();
		for(int i = 0; i < words.length; i++)
			keywords.add(words[i]);
	}


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public ContentPageExtractor extractToPptx() {
		return new ContentPageExtractor("malakia1", text);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public ArrayList<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(ArrayList<String> keywords) {
		this.keywords = keywords;
	}


}
