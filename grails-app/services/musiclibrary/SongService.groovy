package musiclibrary

import grails.transaction.Transactional

@Transactional
class SongService {

    def artistService = new ArtistService()

    Song addSong(String title,Integer duration, String artistName){
        def song = new Song()
        song.title = title
        song.duration = duration


        def ar = artistService.searchByName(artistName)
        ar.addToSongs(song)
        ar.save()
    }

    Song updateSong(Integer id, String title, Integer duration, String artistName){
        def song = Song.get(id)
        song.title = titlesong.title = title
        song.duration = duration


        def ar = artistService.searchByName(artistName)
        ar.addToSongs(song)
        ar.save()
    }

    Song get(Integer id){
        Song.where{it.id = id}
    }

    Song getAllSongs(){
        Song.list()
    }

    Song deleteSong(Integer id){
        def song = Song.findById(id)
        song.delete()
    }


}
