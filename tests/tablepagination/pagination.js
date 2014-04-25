/*
 *
 * Table pagination script
 *
 * Author: Markus Klinga 2014
 * Licence: Public domain
 *
 * Table - function expects id for <div> in which there is a <table>
 *
 * It also looks for the following in the same div:
 *
 * .currentPage - to hold information about position
 * .prevPage	- link to previous page
 * .nextPage	- link to next page
 *
 */

var Defaults = {
	/* When next/prev link can't go further this classname is added to that element */
	disabledClass: 'disabled',

	/* Page number to show at first (starts from zero) */
	startPage: 0,

	/* How many <tr> items are shown at once */
	itemsPerPage: 8,
};

/* Actual Table - object */
var Table = function(tableId) {

	this.id = tableId;

	this.headers = "";
	this.tableData = [];
	this.currentPage = Defaults.startPage;
	this.itemsPerPage = Defaults.itemsPerPage;

	/* Reference to instance to be used below at .each-function */
	var that = this;

	/* Load existing data from table to variable */
	jQuery("#" + that.id + " tr").each(function() {
		if (jQuery(this).find('th').html())
			that.headers = "<tr>" + jQuery(this).html() + "</tr>";
		else
			that.tableData.push("<tr>" + jQuery(this).html() + "</tr>");
	});

	jQuery("#" + this.id + ' .nextPage'). click(function(e) {
		if (that.tableData.length > (that.currentPage+1)*that.itemsPerPage)
			that.changePage(that.currentPage+1);
		
		e.preventDefault();
	});

	jQuery("#" + this.id + ' .prevPage'). click(function(e) {
		if (that.currentPage !== 0)
			that.changePage(that.currentPage-1);
		
		e.preventDefault();
	});

	this.populateTable = function() {

		/* empty current table and append headers */
		jQuery("#" + this.id + " table").html(this.headers);

		/* Calculate the amount of items visible */
		var amount = Math.min(this.tableData.length - (this.currentPage*this.itemsPerPage), this.itemsPerPage);

		/* Add items to actual table */
		for (var i = 0; i < amount; i++) {
			jQuery("#" + this.id + " table").append(this.tableData[(this.currentPage*this.itemsPerPage) + i]);
		}
	};

	this.changePage = function(pageNum) {
		this.currentPage = pageNum;

		jQuery("#" + this.id + ' .currentPage').html("Page " + (1 + this.currentPage) + " of " + Math.ceil(this.tableData.length/this.itemsPerPage));

		if (this.currentPage === 0)
			jQuery("#" + this.id + ' .prevPage').addClass(Defaults.disabledClass);
		else
			jQuery("#" + this.id + ' .prevPage').removeClass(Defaults.disabledClass);

		if (this.tableData.length <= (this.currentPage+1)*this.itemsPerPage)
			jQuery("#" + this.id + ' .nextPage').addClass(Defaults.disabledClass);
		else
			jQuery("#" + this.id + ' .nextPage').removeClass(Defaults.disabledClass);

		this.populateTable();
	};

	/* Set initial page and show table */
	this.changePage(this.currentPage);
	jQuery(document.getElementById(this.id)).show();

};

jQuery(window).ready(function() {

	/* init tables */
	window.tables = window.tables || [];
	
	jQuery(".paginate-table").each(function(index, value) {
		window.tables.push(new Table(jQuery(this).attr('id')));
	});
});
