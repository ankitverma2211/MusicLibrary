package musiclibrary

import grails.converters.JSON

class UserController {

    def list(){
        withFormat{
            render User.list() as JSON
        }
    }

    def show(Integer id){
        def user = User.get(id)
        if(user){
            withFormat {
                render User.findById(id) as JSON
            }
        }
        else{
            render "user not found"
        }
    }

    def index() { }
}
