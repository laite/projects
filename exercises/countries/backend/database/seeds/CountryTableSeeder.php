<?php

use Illuminate\Database\Seeder;
use Illuminate\Database\Eloquent\Model;

class CountryTableSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        DB::table('country')->insert([
            'id' => 1,
            'capital' => 'Helsinki',
            'population' => 5100000,
            'latitude' => 64,
            'longitude' => 26
        ]);

        DB::table('country')->insert([
            'id' => 2,
            'capital' => 'Tukholma',
            'population' => 9747355,
            'latitude' => 59.21,
            'longitude' => 18.04
        ]);

    }
}
