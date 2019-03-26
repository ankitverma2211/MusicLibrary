package musiclibrary

class Playlist {
    String name
    String description

    static constraints = {
        name blank:false
        description blank: false

    }
}
