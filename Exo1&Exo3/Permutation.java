import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Permutation{

  private String  a, b, c;

  public Permutation(String a, 	String b, String c){
    this.a=a;
    this.b=b;
    this.c=c;
  }

  public void Permute(){
    System.out.println("\nLa permutation est : \n "+this.a+this.b+this.c+"\n"+this.b+this.c+this.a+"\n"+this.c+this.a+this.b+"\n"+this.a+this.c+this.b+"\n"+this.b+this.a+this.c+"\n"+this.c+this.b+""+this.a+"\n");
  }

  public static void main(String[]args) throws Exception {

    System.out.println("-----> EXO3 \n");

    InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

    System.out.println("Saisir vos trois lettres svp");
    String letter1=br.readLine();
    String letter2=br.readLine();
    String letter3=br.readLine();

    Permutation isP=new Permutation(letter1,letter2,letter3);
    isP.Permute();

  }


}
