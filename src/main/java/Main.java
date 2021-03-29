public class Main {
    public static void main(String[] args) {
        int cost = 1300;
        int totalBonus;
        if (cost >= 1000) {
            totalBonus = cost / 100;

        } else {
            totalBonus = 0;
        }
        int balance = totalBonus + cost;
        System.out.println(balance);
    }
}