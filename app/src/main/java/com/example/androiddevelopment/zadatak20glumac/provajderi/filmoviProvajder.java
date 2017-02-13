package com.example.androiddevelopment.zadatak20glumac.provajderi;

import com.example.androiddevelopment.zadatak20glumac.model.Filmovi;
import com.example.androiddevelopment.zadatak20glumac.model.Glumac;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by androiddevelopment on 13.2.17..
 */

public class filmoviProvajder {

    public static List<String> getFilmoviNaziv(Glumac glumac){

        List<String> nazivi=new ArrayList<>();
          for(Filmovi filmovi:glumac.getFilmovi()
                )  { nazivi.add(filmovi.getNazivFilma());
        }

        return nazivi;
    }


}
