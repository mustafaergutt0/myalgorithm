package LeetCodeAndAlgorthm;

import java.util.ArrayList;
import java.util.Date;

public class BestTimeToBuyAndSellStock {
    static void main() {

        int data []={7,6,4,3,1};
        System.out.println(MaxProfit(data));

    }


    static public int MaxProfit(int[] prices) {


        int Alıs=prices[0];
        int Profit=0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]<Alıs){
                Alıs=prices[i];
            }

            Profit=Math.max(Profit,prices[i]-Alıs);
        }
        return Profit;
    }
}

