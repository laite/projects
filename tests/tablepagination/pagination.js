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

	$("#" + this.id + ' .nextPage'). click(function() {
		if (that.tableData.length > (that.currentPage+1)*that.itemsPerPage)
			that.changePage(that.currentPage+1);
	});

	$("#" + this.id + ' .prevPage'). click(function() {
		if (that.currentPage !== 0)
			that.changePage(that.currentPage-1);
	});

	this.populateTable = function() {

		/* empty current table and append headers */
		$("#" + this.id + " table").html(this.headers);

		/* Calculate the amount of items visible */
		var amount = Math.min(this.tableData.length - (this.currentPage*this.itemsPerPage), this.itemsPerPage);

		/* Add items to actual table */
		for (var i = 0; i < amount; i++) {
			$("#" + this.id + " table").append(this.tableData[(this.currentPage*this.itemsPerPage) + i]);
		}
	};

	this.changePage = function(pageNum) {
		this.currentPage = pageNum;

		$("#" + this.id + '.currentPage').html("Page " + (1 + this.currentPage) + " of " + Math.ceil(this.tableData.length/this.itemsPerPage));

		if (this.currentPage === 0)
			$("#" + this.id + ' .prevPage').addClass('disabled');
		else
			$("#" + this.id + ' .prevPage').removeClass('disabled');

		if (this.tableData.length <= (this.currentPage+1)*this.itemsPerPage)
			$("#" + this.id + ' .nextPage').addClass('disabled');
		else
			$("#" + this.id + ' .nextPage').removeClass('disabled');

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
