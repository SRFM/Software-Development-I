package models;

import java.util.Scanner;

public class BasicAlbum extends Album {
    Scanner scanner = new Scanner(System.in);

    public BasicAlbum(String albumName) {
        super(albumName);
    }


    public void addAlbumPage() {
        System.out.println("Τι είδους σελίδα θέλετε να προσθέσετε?");
        String type = scanner.nextLine();
        getAlbumPages().add(pageType(type));
    }

    public Pages pageType(String type) {
        setNumOfPages(getNumOfPages() + 1);
        String text;
        String keywords;
        switch (type) {
            case "photo":
                System.out.println("Βάλτε το path για τη φωτογραφία σας:");
                text = scanner.nextLine();
                System.out.println("Εισάγεται κάποιες λέξεις-κλειδία(με ',' ενδιάμεσα):");
                keywords = scanner.nextLine();

                return new PhotoPages(getNumOfPages(), text, keywords);
            case "text":
                System.out.println("Βάλτε κάποιο κείμενο στη σελίδα σας:");
                text = scanner.nextLine();
                System.out.println("Εισάγεται κάποιες λέξεις-κλειδία(με ',' ενδιάμεσα):");
                keywords = scanner.nextLine();
                return new TextPages(getNumOfPages(), text, keywords);
            case "title":
                System.out.println("Εισάγεται ένα τίτλο για τη σελίδα σας");
                String title = scanner.nextLine();
                return new TitlePages(title, getNumOfPages());
        }

        return new EmptyPages(getNumOfPages() + 1);
    }

    public void editPage(Pages page) {

    }

}
