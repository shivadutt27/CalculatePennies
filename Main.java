import java.util.HashMap;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    HashMap<String,Integer> result1 = fewestCoinChange(99);
     HashMap<String,Integer> result2 = fewestCoinChange(50);
    System.out.println(result1);
    System.out.println(result2);
    
  }

  public static HashMap<String,Integer> fewestCoinChange(int cents)
  {

    HashMap<String,Integer> coins = new HashMap<>();

    int quarter = 0;
    int dime = 0;
    int nickle = 0;
    int penny = 0;

    while(cents >= 25)
      {
        quarter = cents/25;
        cents = cents%25;
        System.out.println(cents);
      }
    
    while(cents >= 10)
      {
        dime = cents/10;
        cents = cents%10;
        System.out.println(cents);
      }
    while(nickle >= 5)
      {
        nickle = cents/5;
        cents = cents%5;
        System.out.println(cents);
      }

    penny = cents/1;

    coins.put("quarter", quarter);
    coins.put("dime", dime);
    coins.put("nickle",nickle);
    coins.put("penny",penny);

    return coins;
  }
}