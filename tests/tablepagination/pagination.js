/*
 *
 * Table pagination script
 *
 * Author: Markus Klinga 2014
 * Licence: Public domain
 *
 */


/* id of the table to paginate */
var tableIdName = 'table';

var headers = "";
var tableData = [];
var currentPage = 0;
var itemsPerPage = 5;

function populateTable() {

	/* empty current table and append headers */
	$(document.getElementById(tableId)).empty().append(headers);

	/* Calculate the amount of items visible */
	var amount = Math.min(tableData.length - (currentPage*itemsPerPage), itemsPerPage);

	/* Add items to actual table */
	for (var i = 0; i < amount; i++) {
		$(document.getElementById(tableId)).append(tableData[(currentPage*itemsPerPage) + i]);
	}
}

function changePage(pageNum) {
	currentPage = pageNum;

	$('#currentPage').html("Page " + (1 + currentPage) + " of " + Math.ceil(tableData.length/itemsPerPage));

	if (currentPage === 0)
		$('#prevPage').addClass('disabled');
	else
		$('#prevPage').removeClass('disabled');

	if (tableData.length <= (currentPage+1)*itemsPerPage)
		$('#nextPage').addClass('disabled');
	else
		$('#nextPage').removeClass('disabled');

	populateTable();
}

$(document).ready(function() {

	/* Load existing data from table to variable */
	$('tr').each(function() {
		if ($(this).find('th').html())
			headers = "<tr>" + $(this).html() + "</tr>";
		else
			tableData.push("<tr>" + $(this).html() + "</tr>");
	});

	$('#nextPage').click(function() {
		if (tableData.length > (currentPage+1)*itemsPerPage)
			changePage(currentPage+1);
	});

	$('#prevPage').click(function() {
		if (currentPage !== 0)
			changePage(currentPage-1);
	});

	/* Set initial page and show table */
	changePage(currentPage);
	$(document.getElementById(tableId)).show();

});
