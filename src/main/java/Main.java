import java.util.Scanner;

public class Main {
    public static void main(String args[]){

    Atm atm = new Atm("Mike Taylor", 500.50, "Miket@mike.com");
        System.out.println("Deposit completed! Balance is now: " + atm.getBalance());
        atm.withdraw(20);
        System.out.println("After Withdraw the balance is " + atm.getBalance());
        atm.deposit(500.00);
        System.out.println("After deposit the new balance is: " + atm.getBalance());

        atm.getSummary();

        boolean isDangerous = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the cats name? ");
        String name = scanner.nextLine();
        System.out.println("What is the cats fur color? ");
        String furColor = scanner.nextLine();

        Cat annoyingCat = new Cat(name, furColor);
        Cat funCat = new Cat(name, furColor, 2, 9, 1);

        annoyingCat.greeting();

        annoyingCat.loseLives();
        System.out.println("Lives lost! " + annoyingCat.getName() + " Has " + annoyingCat.getLives() + " lives left");

        funCat.greeting();

//        while(isDangerous){
//            int dangerLevel = 6;
//            if(dangerLevel > 5){
//                annoyingCat.loseLives();
//                System.out.println("Lives lost! " + annoyingCat.getName() + " Has " + annoyingCat.getLives() + " lives left");
//                isDangerous = false;
//            } else {
//                System.out.println(annoyingCat.getName() + " did not lose any lives!");
//                isDangerous = false;
//            }
//        }

    }
}
