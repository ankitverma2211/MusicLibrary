package musiclibrary

import grails.transaction.Transactional

@Transactional
class AlbumService {

    Album createAlbum(String name, String description, String dor){
        def newAlbum = new Album()

        newAlbum.name = name
        newAlbum.description = description
        newAlbum.dor = dor

        newAlbum.save()

        return newAlbum
    }

    Album updateAlbum(Integer id, Album al){
        def updatedAlbum = Album.findById(id);

        updatedAlbum.name = al.name;
        updatedAlbum.description= al.description;
        updatedAlbum.dor = al.dor;

        updatedAlbum.save()

        return updatedAlbum;
    }

    //TODO pagination

    Album albumsList(){
        def listofAlbums = Album.list()
        return listofAlbums
    }
}
