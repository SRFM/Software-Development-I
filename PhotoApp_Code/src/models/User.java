package models;

import controllers.UserUtilities;
import poiExtractor.*;

import java.util.ArrayList;
import java.util.Scanner;

public class User implements UserUtilities{
    private ArrayList<Album> albums;

    public User() {
        albums = new ArrayList<>();
    }

    public void viewAlbumList() {
        System.out.println("Η λίστα των άλμπουμ σας:");
        for(int i = 0; i < albums.size(); i ++)
            System.out.println((i + 1) + ". " + albums.get(i));
    }

    public void viewAsPPTX() {
        System.out.println("Επιλέξτε ένα άλμπουμ (π.χ 1 ή 2)");
        viewAlbumList();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(albums.size() > num) {
            System.out.println("Δεν υπάρχει αυτό το άλμπουμ στη λίστα");
        }
        else {
            AlbumExtractor albumExtractor = new AlbumExtractor(albums.get(num - 1).getAlbumName());
            TitlePageExtractor tp = new TitlePageExtractor("This is a title");
            ContentPageExtractor cp = new ContentPageExtractor("a title", "a text");
            BlankPageExtractor bp = new BlankPageExtractor();

            albumExtractor.addSlideExtractor(tp);
            albumExtractor.addSlideExtractor(cp);
            albumExtractor.addSlideExtractor(bp);
            albumExtractor.exportPOISlideShow();
            for(int i = 0; i < albums.get(num - 1).getAlbumPages().size(); i++) {
                albumExtractor.addSlideExtractor(albums.get(num - 1).getAlbumPages().get(i).extractToPptx());
            }
            albumExtractor.exportPOISlideShow();
            System.out.println("Showed as pptx");
        }

    }

    public void viewAsPPTXSorted() {

    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void createAlbum() {
        System.out.println("Δώστε έναν τίτλό για το άλμπουμ σας:");
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        Album album = new BasicAlbum(title);
        albums.add(album);
        System.out.println("Δημιουργήθηκε επιτυχώς το Άλμπουμ " + album);
    }

    @Override
    public void selectAlbum() {
        System.out.println("Επιλέξτε ένα άλμπουμ (π.χ 1 ή 2)");
        viewAlbumList();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(albums.size() > num) {
            System.out.println("Δεν υπάρχει αυτό το άλμπουμ στη λίστα");
        } else {
            albums.get(num - 1).addAlbumPage();
        }
    }
    private ArrayList<Pages> pages = new ArrayList<>();

    @Override
    public void searchKeyword() {
        System.out.println("Δώσε λέξεις-κλειδιά, χωρισμένες με ',':");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] temp = input.split(",");
        for(int i =0; i< temp.length;i++) {
            for(int j = 0; j < albums.size(); j++) {
                for(int k = 0; k< albums.get(j).getAlbumPages().size(); k++) {
                    if(albums.get(j).getAlbumPages().get(k).getKeywords().contains(temp[i])) {
                        pages.add(albums.get(j).getAlbumPages().get(k));
                    }
                }
            }
        }

        System.out.println("Δώστε έναν τίτλό για το άλμπουμ σας:");
        String name = scanner.nextLine();
        Album album = new GeneratedAlbum(name);
        album.setAlbumPages(pages);
        albums.add(album);

        System.out.println("Δημιουργήθηκε επιτυχώς το Άλμπουμ " + album);
    }
}
