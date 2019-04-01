package musiclibrary

import grails.transaction.Transactional

@Transactional
class ArtistService {

    Artist create(String name, String gender, String date){
        def ar = new Artist()
        ar.name = name
        ar.gender = gender
        ar.date = new Date().parser('d/M,YYYY', date)

        ar.save()
    }

    Artist update(Integer id,String name, String gender, String date){
        def ar = Artist.get(id);
        ar.name = name
        ar.gender = gender
        ar.date = new Date().parser('d/M,YYYY', date)

        ar.save()

    }

    //assumption that it returns only one
    Artist searchByName(String name){

        Artist.findByName(name)
    }

    Artist delete(Integer id){
        def ar = Artist.findById(id)
        ar.delete()
    }

    Artist get(Integer id){
        Artist.findById(id)
    }

    Artist getAll(){
        def arList = Artist.list()
        return arList
    }

}
