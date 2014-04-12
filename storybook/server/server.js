// Include http module, 
var http = require('http'); 
var restify = require('restify');
require('./mysql.js');

function respond(req, res, next) {
	res.send('hello ' + req.params.name);
}

// Create the http server. 
var server = restify.createServer();
server.get('/hello/:name', respond);
server.head('/hello/:name', respond);

server.listen(8080);

// see http://mcavage.me/node-restify/ for restify-info
