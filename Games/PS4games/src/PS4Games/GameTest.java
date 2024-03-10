package PS4Games;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class GameTest {

	public static void main(String[] args) {
		
		//Game creation
		GameInterface game1 = new GameImpl("eldenRing",80,500000);
		GameInterface game2 = new GameImpl("darkSouls",30,300000);
		GameInterface game3 = new GameImpl("Sekiro",45,100000);
		GameInterface game4 = new GameImpl("forhonor",3,800000);
		GameInterface game5 = new GameImpl("overwatch",20,300000);
		GameInterface game6 = new GameImpl("ittakestwo",85,100000);
		GameInterface game7 = new GameImpl("fortnite",0,10000000);
		
		
		//Pair game-rating
		Pair<GameInterface,Double> ratedGame1 = new Pair<>(game1,5.0);
		Pair<GameInterface,Double> ratedGame2 = new Pair<>(game2,4.8);
		Pair<GameInterface,Double> ratedGame3 = new Pair<>(game3,4.5);
		Pair<GameInterface,Double> ratedGame4 = new Pair<>(game4,4.5);
		Pair<GameInterface,Double> ratedGame5 = new Pair<>(game5,3.0);
		Pair<GameInterface,Double> ratedGame6 = new Pair<>(game6,4.0);
		Pair<GameInterface,Double> ratedGame7 = new Pair<>(game7,2.0);
		
		//Print
		System.out.println("Games list:");
		System.out.println(ratedGame1.toString());
		System.out.println(ratedGame2.toString());
		System.out.println(ratedGame3.toString());
		System.out.println(ratedGame4.toString());
		System.out.println(ratedGame5.toString());
		System.out.println(ratedGame6.toString());
		System.out.println(ratedGame7.toString()+ '\n');
		
		//Creating a list
		List<Pair> games = new ArrayList<Pair>();
		games.addAll(Arrays.asList(ratedGame1,ratedGame2,ratedGame3,ratedGame4,ratedGame5,ratedGame6,ratedGame7));
		
		//Looking for games under 80$
		System.out.println("Games under 80 dollars: ");
		Iterator<Pair> iter = games.iterator();
		while(iter.hasNext()) {
			Pair game = iter.next();
			if(((GameImpl)(game.getFirst())).getPrice() < 80)
			  System.out.println(game);
			else
		      System.err.println(game);
		}
		
		//check of equals() implementation
		if (ratedGame1.equals(ratedGame7))
			System.out.println("\nSono lo stesso gioco!!!");
		else
			System.err.println("\nNon sono lo stesso gioco!!!");
		
		if (ratedGame1.equals(ratedGame1))
			System.out.println("\nSono lo stesso gioco!!!\n");
		else
			System.err.println("\nNon sono lo stesso gioco!!!\n");
		
		//testing a stream command
		final List<Pair> expensiveGames = games.stream()
											   .filter(i -> ((GameImpl)(i.getFirst())).getPrice() > 30)
											   .toList();
		
		//print of filtered values
		System.out.println("i giochi piu costosi sono(>30$):");
		expensiveGames.stream().forEach(i->System.out.println(i));
		
		expensiveGames.stream().fl
	
		
		
		
	}

}
