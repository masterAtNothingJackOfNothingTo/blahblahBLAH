import java.util.Scanner;

void main() {
Scanner sc = new Scanner(System.in);

    System.out.println("this is the armor dmg calculaion simulation, pick where you want to get hit");
        String hitArea = sc.nextLine();
        hit(hitArea);

}
public void hit(String partHit){
    stats vlu = new stats();

        if (partHit.equalsIgnoreCase("head")) {
            double remainingArmor = vlu.armorHead - vlu.pen;
            double TrueDmg = vlu.dmg - remainingArmor;
            double remainingHP = vlu.health - TrueDmg * vlu.headMultiplyer;
            System.out.println(remainingHP + " is your hp " + TrueDmg * vlu.headMultiplyer + " is the damage done");
        }
        if (partHit.equalsIgnoreCase("body")) {
            double remainingArmor = vlu.armor - vlu.pen;
            double TrueDmg = vlu.dmg - remainingArmor;
            double remainingHP = vlu.health - TrueDmg;
            System.out.println(remainingHP + " is your hp " + TrueDmg + " is the damage done");
        }

}
