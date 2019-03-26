package musiclibrary

class PlaylistOfUser {

    static belongsTo = [Playlist, User]

    static constraints = {
    }
}
