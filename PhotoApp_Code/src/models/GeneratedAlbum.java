package models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class GeneratedAlbum extends Album{
	private ArrayList<Pages> pages;

	public GeneratedAlbum(String albumName) {
		super(albumName);
		pages = new ArrayList<>();
	}

	@Override
	public void addAlbumPage() {

	}

	public ArrayList<Pages> getPages() {
		return pages;
	}

	public void setPages(ArrayList<Pages> pages) {
		this.pages = pages;
	}


//	public void createFromSearch(ArrayList<Album> albums) {
//		System.out.println("\nΔώσε λέξεις-κλειδιά, χωρισμένες με ',':");
//		Scanner scanner = new Scanner(System.in);
//
//		String input = scanner.nextLine();
//		String[] temp = input.split(",");
//		for(int i =0; i< temp.length;i++) {
//			for(int j = 0; j < albums.size(); j++) {
//				for(int k = 0; k< albums.get(j).getAlbumPages().size(); k++) {
//					if(albums.get(j).getAlbumPages().get(k).getKeywords().contains(temp[i])) {
//						pages.add(albums.get(j).getAlbumPages().get(k));
//					}
//				}
//			}
//		}
//		System.out.println(pages.size());
//	}
}
