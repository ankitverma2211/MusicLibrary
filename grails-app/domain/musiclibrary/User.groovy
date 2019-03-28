package musiclibrary

class User {
    String name
    String gender
    String dob
    String address

    static hasMany = [playlists: Playlist]

    static mapping = {
        table 'users'
    }

    static constraints = {
        name blank:false , size:5..50
        gender blank:false
        dob blank:false
        address nullable: true
    }
}

