package Arrays.PlaylistChallenge;

import java.util.*;

public class Main {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<Song> myPlaylist = new LinkedList<>();

        // add songs to album
        Album myAlbum = new Album();
        myAlbum.addSongToAlbum(new Song("Last Dance", 100));
        myAlbum.addSongToAlbum(Song.songBuilder("Devil in a new dress", 213));
        myAlbum.addSongToAlbum(Song.songBuilder("Dancing in the dark", 323));
        myAlbum.addSongToAlbum(Song.songBuilder("Hurricane", 32));

        Album albumTwo = new Album();
        albumTwo.addSongToAlbum(Song.songBuilder("yee", 328));
        albumTwo.addSongToAlbum(Song.songBuilder("kind", 34));

        // add songs to playlist
        myPlaylist.add(myAlbum.getAlbumSongs().get(getSongIndex(myAlbum,"Hurricane")));
        myPlaylist.add(myAlbum.getSong("Dancing in the dark"));
        myPlaylist.add(albumTwo.getSong("yee"));

        // print playlist
        printPlaylist(myPlaylist);

        // create a playlist iterator
        ListIterator iterator = myPlaylist.listIterator();

        // swtich statement to check actions
        printMenu();
        play(myPlaylist);

    }

    private static void play(LinkedList<Song> playList) {
        ListIterator<Song> listIterator = playList.listIterator();
        boolean quit = false;
        boolean goingForward = true;

        if (playList.isEmpty()) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        while (!quit) {
            int action = keyboard.nextInt();
            keyboard.nextLine();
            switch (action) {
                case 0:
                    // quit
                    System.out.println("Playlist Complete");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("You are at the start of playlist");
                        goingForward = true;
                    }
                    break;
                case 3:
                    // replay
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("now playing " + listIterator.previous());
                            goingForward = false;
                        } else {
                            System.out.println("We are at the start of list ");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            goingForward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printPlaylist(playList);
                    break;
                case 5:
                    // print menu
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (goingForward) {
                            listIterator.next();
                        } else {
                            listIterator.previous();
                        }
                    }
                    break;
            }
        }
    }

    // add to playlist
    public static boolean addSongToPlaylist(LinkedList<Song> playlist, Album album, Song song) {
        if (isSongInAlbum(album, song)) {
            playlist.add(song);
            return true;
        }
        return false;
    }

    public static boolean addSongToPlaylist(LinkedList<Song> playlist, Album album, String songName) {
        int index = getSongIndex(album, songName);
        if (index > 0) {
            playlist.add(album.getAlbumSongs().get(index));
            return true;
        }
        return false;
    }

    // add song to album
    public static boolean addSongToAlbum(Album album, Song song) {
        if (isSongInAlbum(album,song) == false) {
            album.addSongToAlbum(song);
            return true;
        } else {
            return false;
        }
    }

    // check if song is located in album
    private static boolean isSongInAlbum(Album album, Song song) {
        ArrayList<Song> albumArrayList = album.getAlbumSongs();
        for (int i = 0; i < albumArrayList.size(); i++) {
            if (albumArrayList.get(i).equals(song)) {
                return true;
            }
        }
        return false;
    }

    // check if song is located in album


    // get song index
    private static int getSongIndex(Album album, String name) {
        ArrayList<Song> albumArrayList = album.getAlbumSongs();
        for (int i = 0; i < albumArrayList.size(); i++) {
            if (albumArrayList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    // get song

    // menu print
    public static void printMenu() {
        System.out.println("0 - quit\n" +
                "1 - skip Song\n" +
                "2 - previous Song\n" +
                "3 - replay\n" +
                "4 - remove song\n");
    }

    // get user input to create song
    private static String getSongName() {
        System.out.println("Enter song name: ");
        return keyboard.nextLine();
    }

    // get song duration
    private static int getSongInt() {
        System.out.println("Enter song Duration: ");
        int my = keyboard.nextInt();
        keyboard.next();
        return my;
    }

    // print playlist
    public static void printPlaylist(LinkedList<Song> myPlaylist) {
        for (int i = 0; i < myPlaylist.size(); i++) {
            System.out.println(myPlaylist.get(i).getName());
        }
    }

}
