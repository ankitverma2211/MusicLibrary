package musiclibrary

import grails.transaction.Transactional

@Transactional
class PlaylistService {

    Playlist create(String name, String description){
        def playlist = new Playlist()

        playlist.name = name
        playlist.description = description

        playlist.save()

    }

    Playlist updatePlaylist(Integer id, Playlist pl){

        def playlist = Playlist.findById(id)

        playlist.name = pl.name
        playlist.description = pl.description

        playlist.save()
    }

    Playlist listAll(){
        def all = Playlist.list()
        return all
    }

    Playlist getPlaylist(Integer id){
        def playlist = Playlist.where {it.id == id}
        return playlist
    }

    Playlist addSongToPlaylist(Integer playlistId,Integer songId){
         def playlist = Playlist.findById(playlistId)
         playlist.addToSongs(songId).save()
         return Playlist.list()
    }

    boolean deletePlaylist(Integer playlistId){
        def playlist = Playlist.get(playlistId);

        playlist.delete()

    }

    Playlist removeSongFromPlaylist (Integer playlistId, Integer songId){
            def playlist = Playlist.findById(playlistId)
            def song = playlist.songs.find{it.id = songId}
            playlist.removeFromSongs(song)
    }

}
