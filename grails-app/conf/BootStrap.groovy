import musiclibrary.Album
import musiclibrary.Artist
import musiclibrary.Song

class BootStrap {

    def init = { servletContext ->

        def artist1 = new Artist(name:"Shaan",gender:"Male",dob:"22 Nov 1990").addToSongs(new Song(title:"gallow" , duration:"10")).save()
        def artist2 = new Artist(name:"Dance",gender:"Male",dob:"22 Nov 1989").addToSongs(new Song(title:"tutta" , duration:"20")).save()

        def album1 = new Album(name:"Tanha Dil",description:"Collection of songs",dor:"24 Nov 2006").save()
        def album2 = new Album(name:"Cool Hits",description:"Awesome songs",dor:"22 Nov 1990").save()

     }
    def destroy = {
    }
}
