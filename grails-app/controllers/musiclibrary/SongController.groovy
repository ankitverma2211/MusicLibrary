package musiclibrary

import grails.converters.JSON




class SongController {

    def list(){
        withFormat {
            json{
                render Song.list() as JSON
            }
        }

    }

    def show(Integer id){
        def song = Song.get(id)
        if(song){
            withFormat {
                json{
                    render Song.findById(id) as JSON
                }
            }

        }
        else{
            render 'Song Not Found'
        }
    }
    def index() { }
}
