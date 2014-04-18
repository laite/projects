var headers = "";
var tableData = [];
var currentPage = 0;
var itemsPerPage = 5;

function populateTable() {

	/* empty current table and append headers */
	$('table').empty().append(headers);

	/* Load max items to table */
	var amount = Math.min(tableData.length - (currentPage*itemsPerPage), itemsPerPage);

	for (var i = 0; i < amount; i++) {
		$('table').append(tableData[(currentPage*itemsPerPage) + i]);
	}

}

$(document).ready(function() {

	/* Load existing data from table to variable */
	$('tr').each(function() {
		if ($(this).find('th').html()) {
			headers = "<tr>" + $(this).html() + "</tr>";
		}
		else {
			tableData.push("<tr>" + $(this).html() + "</tr>");
		}
	});

	populateTable();

	/* on first load, full table is hidden */
	$('table').show();

	$('#nextPage').click(function() {

	});
});
