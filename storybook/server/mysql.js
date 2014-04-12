var mysql      = require('mysql');
var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'story',
  password : 'storypass'
});

exports.testi =  {
	a: 1,
	b: "this",
	c: function(a, b) { return 0; }
};

connection.connect();

connection.query('SELECT 1 + 1 AS solution', function(err, rows, fields) {
  if (err) throw err;

  console.log('The solution is: ', rows[0].solution);
});

connection.end();
