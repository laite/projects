<?php

use Illuminate\Database\Seeder;

class CountryListTableSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        DB::table('countrylist')->insert([
            'id' => 1,
            'code' => 'FI',
            'name' => 'Suomi',
            'country_id' => 1
        ]);

        DB::table('countrylist')->insert([
            'id' => 2,
            'code' => 'SE',
            'name' => 'Ruotsi',
            'country_id' => 2
        ]);

    }
}
