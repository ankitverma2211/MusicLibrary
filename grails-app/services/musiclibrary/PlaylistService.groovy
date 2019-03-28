package musiclibrary

import grails.transaction.Transactional

@Transactional
class PlaylistService {

    Playlist create(String name, String description){
        def playlist = new Playlist()

        playlist.name = name
        playlist.description = description

        playlist.save()

        return playlist

    }

    Playlist updatePlaylist(Integer id, Playlist pl){

        def playlist = Playlist.findById(id)

        playlist.name = pl.name
        playlist.description = pl.description

        return playlist
    }

    Playlist listAll(){
        def all = Playlist.list()
        return all
    }

    Playlist addSongToPlaylist(Integer playlistId,Integer songId){
         def playlist = Playlist.findById(id)
         playlist.addToSongs(songId).save()
         return playlist
    }

    Playlist removeSongFromPlaylist (Integer playlistId, Integer songId){

    }

}
