package musiclibrary


class Song {
    String title
    int duration

    static constraints = {
        title blank: false , size : 5..150
        duration blank:false

    }
}
