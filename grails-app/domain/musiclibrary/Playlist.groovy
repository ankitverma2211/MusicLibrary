package musiclibrary

class Playlist {
    String name
    String description

    static belongsTo = User
    static hasMany = [songs:Song]

    static constraints = {
        name blank:false
        description blank: false

    }
}
