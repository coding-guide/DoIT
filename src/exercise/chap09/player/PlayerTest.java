package exercise.chap09.player;

public class PlayerTest {

	public static void main(String[] args) {
		Player player = new Player();
		player.gameStart();
		System.out.println("----------------");
		player.setLevel(new Level02());
		player.gameStart();
		System.out.println("----------------");
		player.setLevel(new Level03());
		player.gameStart();
	}

}
