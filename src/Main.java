public class Main {

    public static void main(String[] args) {

        // Crea instancia de Player
        Player player = new Player();

        // Inicializa manualmente los atributos
        // player.name = "Roa";
        player.health = 20;
        player.weapon = "Warlock Dark Staff";

        // Prueba los métodos
        int damage = 10;
        player.loseHealth(damage);
        System.out.printf("Remaining health = %s%n", player.healthRemaining());

        player.health = 200;

        player.loseHealth(11);
        System.out.printf("Remaining health = %s%n", player.healthRemaining());
    }
}
