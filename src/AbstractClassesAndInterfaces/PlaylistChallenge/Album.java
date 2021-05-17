package AbstractClassesAndInterfaces.PlaylistChallenge;

import java.util.ArrayList;

public class Album {
    private SongList songList;

    public Album() {
        this.songList = new SongList();
    }

    public ArrayList<Song> getAlbumSongs() {
        return songList.getSongs();
    }

    public boolean addSongToAlbum(Song song) {
        return songList.addSong(song);
    }

    public boolean addSongToAlbum(String name, int duration) {
        return addSongToAlbum(new Song(name,duration));
    }

    public Song getSong(String name) {
        return songList.findSong(name);
    }

    public Song getSong(int trackNumber) {
        return songList.findSong(trackNumber);
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList(ArrayList<Song> songs) {
            this.songs = songs;
        }

        public SongList() {
            this(new ArrayList<Song>());
        }

        public ArrayList<Song> getSongs() {
            return songs;
        }

        public void setSongs(ArrayList<Song> songs) {
            this.songs = songs;
        }

        public boolean addSong(Song song) {
            if (songs != null && !songs.contains(song)) {
                this.songs.add(song);
                return true;
            }
            return false;
        }

        private int findSongIndex(String name) {
            for (int i = 0; i < this.songs.size(); i++) {
                if (this.songs.get(i).getName().equals(name)) {
                    return i;
                }
            }
            return -1;
        }

        public Song findSong(String name) {
            return this.songs.get(findSongIndex(name));
        }

        public Song findSong(int trackNumber ) {
            if (trackNumber <= this.songs.size() && trackNumber >= 0) {
                return this.songs.get(trackNumber -1);
            } else {
                return null;
            }
        }

        public Song addToPlaylist(int trackNumber) {
            return findSong(trackNumber);
        }

        public Song addToPlayList(String name) {
            return findSong(name);
        }
    }

}
