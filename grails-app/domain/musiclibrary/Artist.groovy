package musiclibrary

import java.sql.Date

class Artist {
    String name
    String gender
    Date dob

    static hasMany = [songs: Song]

    static constraints = {
        name blank:false
        gender blank:false
        dob blank: false
    }
}
