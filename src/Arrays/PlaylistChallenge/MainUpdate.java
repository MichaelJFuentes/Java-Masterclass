package Arrays.PlaylistChallenge;

import java.util.*;

public class MainUpdate {
    public static Scanner keyboard = new Scanner(System.in);
    public static LinkedList<Song> playlist = new LinkedList<>();
    public static void main(String[] args) {
        // add songs to album
        ArrayList<Song> albumOne = new ArrayList<>();
        albumOne.add(Song.songBuilder("senorita", 399));
        albumOne.add(Song.songBuilder("yee", 233));
        albumOne.add(Song.songBuilder("feel good", 236  ));
        ArrayList<Song> albumTwo = new ArrayList<>();
        albumTwo.add(Song.songBuilder("take me to church",346));
        albumTwo.add(Song.songBuilder("work", 324));
        albumTwo.add(Song.songBuilder("to die for", 890));

        ArrayList<Song> albumJoin = albumOne;
        albumJoin.addAll(albumTwo);

        // add songs to playlist
        albumJoin.addAll(albumTwo);

        Album album3 = new Album();
        album3.addSongToAlbum(Song.songBuilder("Scared to Live", 342));
        album3.addSongToAlbum(Song.songBuilder("SAD", 234));
        addSongToPlaylist(playlist, album3,1    );
        addSongToPlaylist(playlist,album3,"SAD");

        printPlaylistSongs(playlist);

        ListIterator<Song> songIterator = playlist.listIterator();
        boolean quit = false;
        boolean goingForward = true;
        System.out.println("Now playing " + songIterator.next().toString());
        while (!quit) {
            //System.out.println("Now playing " + songIterator.next().toString());
            System.out.print("Enter action: ");
            int action = keyboard.nextInt();
            switch (action) {
                case 0:
                    // quit
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (songIterator.hasNext()) {
                            songIterator.next();
                        }
                        goingForward = true;
                    }
                    // next song
                    if (songIterator.hasNext()) {
                        System.out.println("Now playing " + songIterator.next());
                    } else {
                        System.out.println("End of playlist reached");
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (songIterator.hasPrevious()) {
                            songIterator.previous();
                        }
                        goingForward = false;

                    }
                    if (songIterator.hasPrevious()) {
                        System.out.println("Now playing " + songIterator.previous());
                    } else {
                        System.out.println("Start of playlist reached");
                    }
                    // previous song
                    break;
                case 3:
                    // replay song
                    if (goingForward) {
                        if (songIterator.hasPrevious()) {
                            System.out.println("Now playing " + songIterator.previous());
                        }
                        goingForward = false;
                    } else {
                        if (songIterator.hasNext()) {
                            System.out.println("Now playing " + songIterator.next());
                        }
                        goingForward = true;
                    }
                    break;
                case 4:
                    // remove song
                    if (playlist.size() > 0 ) {
                        songIterator.remove();
                        if (goingForward) {
                            if (songIterator.hasNext()) {
                                songIterator.next();
                            }
                        } else {
                            if (songIterator.hasPrevious()) {
                                songIterator.previous();
                            }
                        }
                    }
                    break;
                case 5:
                    // display playlist songs
                    printPlaylistSongs(playlist);
                    break;
                case 6:
                    // display menu
                    printMenu();
                    break;
            }
        }
        //printPlaylistSongs(playlist);
    }

    // method to add song to playlist via track number
    public static boolean addSongToPlaylist(LinkedList<Song> playlist, Album album, int trackNumber) {
        Song song = album.getSong(trackNumber);
        if (isSong(song)) {
            playlist.add(song);
            return true;
        } else {
            return false;
        }
    }
    // method to add song to playlist via name
    public static boolean addSongToPlaylist(LinkedList<Song> playlist, Album album, String name) {
        Song song = album.getSong(name);
        if (isSong(song)) {
            playlist.add(song);
            return true;
        } else {
            return false;
        }
    }

    //private method to validate if return song is vaild
    public static boolean isSong(Song song) {
        if (song == null) {
            return false;
        } else {
            return true;
        }
    }
    // method to display menu
    public static void printMenu() {
        System.out.println("0 - quit\n" +
                "1 - next song\n" +
                "2 - previous song\n" +
                "3 - replay song\n" +
                "4 - remove song\n" +
                "5 - List playlist songs");
    }

    // method to remove song

    // method to display playlist songs
    public static void printPlaylistSongs(List<Song> playlist) {
        for (Song song : playlist) {
            System.out.println(song);
        }
    }

}
