package musiclibrary

class User {
    String name
    String gender
    String dob
    String address

    static constraints = {
        name blank:false , size:5..50
        gender blank:false
        dob blank:false
        address nullable: true
    }
}

