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

function changePage(pageNum) {
	currentPage = pageNum;

	$('#currentPage').html("Page " + (1 + currentPage) + " of " + Math.ceil(tableData.length/itemsPerPage));
	populateTable();

	if (currentPage === 0)
		$('#prevPage').addClass('disabled');
	else
		$('#prevPage').removeClass('disabled');

	if (tableData.length <= (currentPage+1)*itemsPerPage)
		$('#nextPage').addClass('disabled');
	else
		$('#nextPage').removeClass('disabled');
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

	$('#nextPage').click(function() {
		if (tableData.length <= (currentPage+1)*itemsPerPage)
			return;

		changePage(currentPage+1);
	});

	$('#prevPage').click(function() {
		if (currentPage === 0)
			return;

		changePage(currentPage-1);
	});

	/* Set initial page and show table */
	changePage(0);
	$('table').show();

});
