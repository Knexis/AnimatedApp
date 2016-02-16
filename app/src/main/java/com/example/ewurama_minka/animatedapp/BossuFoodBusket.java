package com.example.ewurama_minka.animatedapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Ewurama_Minka on 2/11/2016.
 */
public class BossuFoodBusket {

    private static ArrayList<Integer> Food = new ArrayList<>(Arrays.asList(R.drawable.beans,
            R.drawable.spring_onions, R.drawable.bbeerglass,R.drawable.bbluecocktail, R.drawable.bcupoftea,
            R.drawable.btransparentcocktailmojito, R.drawable.fbanana, R.drawable.fdunkno,
            R.drawable.fdunkno2, R.drawable.fdunkno3, R.drawable.fdunkno4, R.drawable.fdunkno5,
            R.drawable.fdunkno6, R.drawable.fdunkno7, R.drawable.fgrape, R.drawable.flemon,
            R.drawable.fpeach, R.drawable.fpineapple, R.drawable.fstrawberry, R.drawable.fstrawberry2,
            R.drawable.fwhitegrape, R.drawable.jhotdog, R.drawable.jhotdogketchup, R.drawable.jhotdogwithsalad,
            R.drawable.msteaksmeat, R.drawable.nalmondnut, R.drawable.ncashewnut,
            R.drawable.nchestnut, R.drawable.npeanuts, R.drawable.nwalnuts, R.drawable.pboardmeat,
            R.drawable.pboiledsausage, R.drawable.pgoldfish, R.drawable.predfish, R.drawable.predseafish, R.drawable.psausage,
            R.drawable.pshark, R.drawable.schilli, R.drawable.sredpepper, R.drawable.vpeapod, R.drawable.vtomato));


//    ArrayList<Integer> Bad = new ArrayList<>(Arrays.asList(R.drawable.beans,R.drawable.red_beets,R.drawable.red_pepper));


    public static ArrayList<Integer> hitusWiththeFood(){

        Random random = new Random();

        ArrayList<Integer> selected = new ArrayList<>();

        for(int i=0;i<40;i++){

            int index = random.nextInt(Food.size() - 0 + 1) + 0;
            try{//on a crash// likly to be an outofbounds error just submit the next least by index - 1
            selected.add(Food.get(index));}catch (Exception e){selected.add(Food.get(index - 1));}

        }

        return selected;
    }



}
