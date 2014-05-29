#!/bin/bash
# Replace spaces in filenames with underscore (_)

find . -name "* *" -exec sh -c ' \
	echo "Moving file: {}"; \
	newFile=$(echo "{}" | sed "s/ /_/g") ; \
	mv "{}" "$newFile" ; \
	' \;
