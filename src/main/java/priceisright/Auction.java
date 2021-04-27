package priceisright;

import java.util.ArrayList;
import java.util.List;

public class Auction {

    public int priceIsRight(int[] bids, int price){
        List<Integer> integers = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int searched=0;
        for(int i=0; i< bids.length; i++){
            if( bids[i] < price ){
                integers.add(bids[i]);
            }

        }
        if(integers.size() == 0){
            return -1;
        }
        for(Integer item : integers){
            if(price - item < min){
                min = price - item;
                searched = item;
            }
        }
        return searched;


    }
}
