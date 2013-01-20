package sakulk

import grails.converters.JSON

class PowerController {

	def power() {
		render new Result((int)Math.pow(params.double('base'), params.double('exp'))) as JSON
	}
}