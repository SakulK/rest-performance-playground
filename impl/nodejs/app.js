var http = require('http');

http.createServer(function (req, res) {
	var urlTokens = req.url.substr(1).split("/");
	rest[req.method](req, res, urlTokens);
}).listen(8080);

var rest = {
	GET: function (req, res, urlTokens) {
		urlTokens[0] == "power" ? power(req, res, urlTokens[1], urlTokens[2]) : '';
	}
}

function power(req, res, base, exp, params, next) {
	res.writeHead(201, "", {'Content-Type': 'application/json'});
	res.end(JSON.stringify({result: Math.pow(base, exp)}));
};