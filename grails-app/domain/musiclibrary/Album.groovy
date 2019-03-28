package musiclibrary

class Album {
    String name
    String description
    String dor

    static hasMany = [songs:Song]

    static constraints = {
        name blank:false
        description blank:false
        dor blank: false
    }
}
