var restify = require('restify');

function power(req, res) {
    res.json({result: Math.pow(req.params.base, req.params.exp)});
}

var server = restify.createServer();
server.get('/power/:base/:exp', power);

server.listen(8080, function() {
    console.log('%s listening at %s', server.name, server.url);
});