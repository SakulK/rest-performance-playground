class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/power/$base/$exp" {
			controller = "power"
			action = "power"
		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
