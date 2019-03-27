package musiclibrary

import grails.converters.JSON

class AlbumController {

    def list(){
        withFormat {
             json{
                 render Album.list() as JSON
             }
        }
    }

    def show(Integer id){
       def album = Album.get(id)
        if(album){
            withFormat {
                json{
                    render Album.list() as JSON
                }
            }
        }
        else{
            render "Album not Found"
        }
    }

    def index() { }
}
