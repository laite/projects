<?php

use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateCountriesTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('country', function(Blueprint $table) {

            $table->increments('id');
            $table->timestamps();

            $table->string('capital');
            $table->integer('population');

            $table->float('latitude');
            $table->float('longitude');
        });

        Schema::create('countrylist', function (Blueprint $table) {
            $table->increments('id');
            $table->timestamps();

            $table->char('code', 2);
            $table->string('name');

            $table->integer('country_id')->unsigned();
            $table->foreign('country_id')->references('id')->on('country');
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::drop('countries');
    }
}
