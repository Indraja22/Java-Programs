public class Main {
    public static void main(String[] args) {
      Player player = new Player();
//        player.fullName = "Indru";
//      //  player.health = 20;
//        player.weapon = "AKM";
//
        int damage =10;
        player.loseHealth(damage);
        System.out.println("Remaining health = "+player.healthRemaining());

        damage = 15;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = "+player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Indraja",400,"Kar98K");
        System.out.println("Initial Health = " +enhancedPlayer.getHealth());
    }
}
