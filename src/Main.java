import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Toplam();





    }


    public static  void Kontrol(){

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen atacagınzı beton griin ");
         /// atılacak beton

        String tip="C60";

        for(int i=0;i<10;i++){
            System.out.println("lütfen atacagınzı beton griin ");
            String betontipi =scan.nextLine();
            if(betontipi.equals(tip)){
                System.out.println("usta beton atılıyor devam edebilri");
                break;
            }if(i==3){
                System.out.println("yönetici çagır ");
                break;
            }
            else{
                System.out.println("usta yanlışın var tekrar dene ");

            }



        }



    }

    public static  void Toplam (){
        int toplam=0;
        for(int i=0;i<50;i++){
            if(i%3==0){

            }else{
                toplam+=1;
            }

        }

        System.out.println(toplam);
    }
}