#!/usr/bin/perl

use strict;
use warnings;


my $dir = './';
opendir(DIR, $dir) or die $!;

while (my $file = readdir(DIR)) {
	
	# handle only files
	next unless (-f "$dir/$file");

	# find files with spaces
	next unless ($file =~ m/ /);

	print "Moving file: $file\n";

	(my $newFile = $file) =~ s/ /_/g;
	print "New file: $newFile\n";

	rename $file, $newFile;
}

closedir(DIR);
exit 0;
