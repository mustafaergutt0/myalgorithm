package LeetCodeAndAlgorthm;

public class BesTimeStock2 {
    static void main() {

        int data[]={1,2,3,4,5};
        System.out.println(maxProfit(data));

    }


    //  GERÇEKTEN ZEVKLİ BİR ALGORİTMA İDİ
    static public int maxProfit(int[] prices) {
        int profit = 0;
        int TotalProfit=0;
        int FirstEnter=prices[0];
        boolean TransactionOkey=true;

        for (int i = 1; i < prices.length-1; i++) {
            if (prices[i] > FirstEnter) {
                profit=Math.max(profit,prices[i]-FirstEnter);  // profiti sürekli güncel tut
                if(prices[i+1]<prices[i]){ // fiyatın düşeceigin anladığın an
                    TotalProfit=TotalProfit+profit; // profiti total ekle
                    profit=0;  // sıfıla
                    FirstEnter=prices[i];  // giriş poziyonu en yüksek yap ki yarın en düşük olanı tekrar al
                }
            }else{
                FirstEnter=prices[i];
            }


        }

        // son elemanı kontorl ettirmek için
        int lastEnter=prices[prices.length-1];
        if(lastEnter>FirstEnter){
            profit=Math.max(profit,lastEnter-FirstEnter);
        }
        return TotalProfit+profit;
            }
        }


