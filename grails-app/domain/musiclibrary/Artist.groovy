package musiclibrary

class Artist {
    String name
    String gender
    String dob

    static constraints = {
        name blank:false
        gender blank:false
        dob blank: false
    }
}
