/**
 * 
 * @since  14/02/2023
 * @apiNote cette classe verifie si un nombre est divisible par un autre
 * 
 */

public class DivNumber{
  /**
   * @param n1
   * @param n2
   * @apiNote affiche si un nombre est divisible ou pas 
   */
  public void isDivisibly(int n1,int n2){
        if(n1%n2==0) {
            System.out.println(n1+ " est divisible par "+n2+"\n");
        }
        else if(n2%n1==0){
            System.out.println(n1+ " n'est pas divisible par "+n2+" par contre "+n2+" est divisible par "+n1+"\n");
        }else{
            System.out.println("Desole!!\nAucun nombre n'est divisible par l'autre\n");
        }
    }

    
}