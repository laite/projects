module.exports = function(grunt) {

	grunt.initConfig({
		pkg: grunt.file.readJSON('package.json'),

		sass: {
			dist: {
				options: {
					style: 'compressed'
				},
				files: {
					'css/main.css': 'scss/main.scss',
				}
			}
		},

		watch: {
			css: {
				files: 'scss/*.scss',
				tasks: ['sass'],
			}
		},

		
	});

	grunt.loadNpmTasks('grunt-contrib-sass');
	grunt.loadNpmTasks('grunt-contrib-watch');

	grunt.registerTask('default', ['sass', 'watch'] );
};
