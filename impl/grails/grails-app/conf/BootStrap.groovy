import grails.converters.JSON
import sakulk.Result

class BootStrap {

    def init = { servletContext ->

    	JSON.registerObjectMarshaller(Result) {
                def returnArray = [:]
                returnArray.result = it.result
                returnArray
        }
    }
    def destroy = {
    }
}
