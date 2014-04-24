/*
 *
 * Table pagination script
 *
 * Author: Markus Klinga 2014
 * Licence: Public domain
 *
 */


var Table = function(tableId) {

	this.id = tableId;

	this.headers = "";
	this.tableData = [];
	this.currentPage = 2;
	this.itemsPerPage = 5;

	/* Reference to instance to be used below at .each-function */
	var that = this;

	/* Load existing data from table to variable */
	$("#" + that.id + " tr").each(function() {
		if ($(this).find('th').html())
			that.headers = "<tr>" + $(this).html() + "</tr>";
		else
			that.tableData.push("<tr>" + $(this).html() + "</tr>");
	});

// 	$('#nextPage').click(function() {
// 		if (tableData.length > (currentPage+1)*itemsPerPage)
// 			changePage(currentPage+1);
// 	});
//
// 	$('#prevPage').click(function() {
// 		if (currentPage !== 0)
// 			changePage(currentPage-1);
// 	});

	this.populateTable = function() {

		/* empty current table and append headers */
		$(document.getElementById(this.id)).html(this.headers);

		/* Calculate the amount of items visible */
		var amount = Math.min(this.tableData.length - (this.currentPage*this.itemsPerPage), this.itemsPerPage);

		/* Add items to actual table */
		for (var i = 0; i < amount; i++) {
			$(document.getElementById(this.id)).append(this.tableData[(this.currentPage*this.itemsPerPage) + i]);
		}
	};

	this.changePage = function(pageNum) {
		this.currentPage = pageNum;

		$('#currentPage').html("Page " + (1 + this.currentPage) + " of " + Math.ceil(this.tableData.length/this.itemsPerPage));

		if (this.currentPage === 0)
			$('#prevPage').addClass('disabled');
		else
			$('#prevPage').removeClass('disabled');

		if (this.tableData.length <= (this.currentPage+1)*this.itemsPerPage)
			$('#nextPage').addClass('disabled');
		else
			$('#nextPage').removeClass('disabled');

		this.populateTable();
	};

	/* Set initial page and show table */
	this.changePage(this.currentPage);
	$(document.getElementById(this.id)).show();

};

$(window).ready(function() {
	window.myTable1 = new Table('table1');
	window.myTable2 = new Table('table2');
});
