import musiclibrary.Artist
import musiclibrary.Song

class BootStrap {

    def init = { servletContext ->
        def song1 = new Song(title:"shallow" , duration:"2").save()
        def song2 =  new Song(title:"hello" , duration:"3").save()


        def artist1 = new Artist(name:"Shaan",gender:"Male",dob:"22 Nov 1990").save();
        def artist2 = new Artist(name:"Shaan",gender:"Male",dob:"22 Nov 1990").save();

     }
    def destroy = {
    }
}
