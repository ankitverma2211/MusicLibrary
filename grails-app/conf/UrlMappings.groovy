

class UrlMappings {

	static mappings = {
        "/$controller"(parseRequest: true){
           action=[GET: "list", POST:"save"]
        }
        "/$controller/$id"(parseRequest: true){
            action=[GET: "show",PUT:"update", POST:"update"]
            constraints{
                id matches:/\d+/
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
