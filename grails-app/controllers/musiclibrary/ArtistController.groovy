package musiclibrary

import grails.converters.JSON

class ArtistController{

    def list(){
        withFormat(){
            json{
                render Artist.list() as JSON
            }
        }
    }
    def show(Integer id){
        def artist = Artist.get(id)
        if(artist){
            withFormat(){
                json{
                   render Artist.findById(id) as JSON
                }
            }
        }
        else{
            render "Artist Not found"
        }
    }

    def index() { }
}
