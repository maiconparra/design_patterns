import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      String user = scan.nextLine();

      Site site = null;

      if(user.indexOf("Admin") >= 0)
      {
        site = new Admin();
      }else if(user.indexOf("Comprador") >= 0){
        site = new Comprador();
      }else {
        System.out.println("Erro");
      }

      site.carrega();

  }
}