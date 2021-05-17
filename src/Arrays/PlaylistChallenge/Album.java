package Arrays.PlaylistChallenge;

import java.util.ArrayList;

public class Album {
    private ArrayList<Song> albumSongs;

    public Album(ArrayList<Song> albumSongs) {
        this.albumSongs = albumSongs;
    }

    public Album() {
        this(new ArrayList<Song>());
    }

    public ArrayList<Song> getAlbumSongs() {
        return albumSongs;
    }

    public boolean addSongToAlbum(Song song) {
        if (song.getName().isEmpty()) {
            return false;
        } else if (song.getDuration() < 0) {
            // invaild duration, song must be a positive integer
            return false;
        } else {
            this.albumSongs.add(song);
            return true;
        }
    }

    // if song in album
    private int getSongIndex(String songName) {
        for (int i = 0; i < this.albumSongs.size(); i++) {
            if (this.albumSongs.get(i).getName().equals(songName)) {
                return i;
            }
        }
        return -1;
    }
    // return song
    public Song getSong(String songName) {
        int index = getSongIndex(songName);
        if (index == -1) {
            return null;
        }
        return this.albumSongs.get(index);
    }

    public Song getSong(int trackNumber) {
        return albumSongs.get(trackNumber - 1);
    }



}
