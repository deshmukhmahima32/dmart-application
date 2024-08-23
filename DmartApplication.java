 import java.util.Scanner;
class DmartMain
{
    public static void main(String[] args) {
        double discount=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your total purchas ammount");
        double purchasamount=sc.nextDouble();


        if(purchasamount<0)
         {
            System.out.println("Plz enter vailid numeric value  amount");
         }
           else if(purchasamount>=3000 && purchasamount<=5000)
            {
            System.out.println("you got Flat 500 rs. discount");
            purchasamount=purchasamount-500;
            System.out.println("after discount your total bill is "+purchasamount);
            }
              else if(purchasamount>5000 && purchasamount<=10000)
              {
              discount=purchasamount*30/100;
              System.out.println(" you got Flat 30% discount on you purchas ammount is  "+discount);
              purchasamount=purchasamount-discount;
              System.out.println("after got 30% discount your total bill is "+purchasamount);
              }
                else if(purchasamount>10000 && purchasamount<=15000)
                   {
                     System.out.println(" you got a Free mixture on you purchas amount");
                   }
                     else if(purchasamount>15000)
                     {
                       System.out.println("You got a free Suitcase for purchasing over 15000 ");

                     }
                       else
                       {   
                          System.out.println("you have not get any discount or free gifts");
                          System.out.println(" Thank you for shopping from our Dmart ");
                       }
        
        }
}
