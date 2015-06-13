<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

use App\Http\Requests;
use App\Http\Controllers\Controller;

class CountryListController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return Response
     */
    public function index()
    {
        return response()->json([
            [
                'id' => 0,
                'code' => 'FI',
                'name' => 'Suomi',
                'country_id' => 0
            ], [
                'id' => 1,
                'code' => 'SE',
                'name' => 'Ruotsi',
                'country_id' => 1
            ], [
                'id' => 2,
                'code' => 'NO',
                'name' => 'Norja',
                'country_id' => 2
            ]
        ]);
    }

    /**
     * Show the form for creating a new resource.
     *
     * @return Response
     */
    public function create()
    {
        //
    }

    /**
     * Store a newly created resource in storage.
     *
     * @return Response
     */
    public function store()
    {
        //
    }

    /**
     * Display the specified resource.
     *
     * @param  int  $id
     * @return Response
     */
    public function show($id)
    {
        $countries = [
            [
                'id' => 0,
                'capital' => 'Helsinki',
                'population' => 5100000,
                'latitude' => 64,
                'longitude' => 26
            ], [
                'id' => 1,
                'capital' => 'Tukholma',
                'population' => 9747355,
                'latitude' => 59.21,
                'longitude' => 18.04
            ], [
                'id' => 2,
                'capital' => 'Oslo',
                'population' => 5084000,
                'latitude' => 59.91,
                'longitude' => 10.73
            ]
        ];

        return response()->json($countries[$id]);
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  int  $id
     * @return Response
     */
    public function edit($id)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  int  $id
     * @return Response
     */
    public function update($id)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  int  $id
     * @return Response
     */
    public function destroy($id)
    {
        //
    }
}
