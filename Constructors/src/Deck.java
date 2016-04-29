import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Deck
	{
		static ArrayList<Card> deck = new ArrayList<Card>();
		static ArrayList<Card> playerDeck = new ArrayList<Card>();
		static ArrayList<Card> opponentDeck = new ArrayList<Card>();
		static int counter=0;
		static int opponentCounter=0;
		static boolean tied = false;

		public static void main(String[] args)
		{
			instantiateArrayList();
			shuffleDeck();
			startGame();
			divideDeck();
			printDeck();
			while (deck.size()>0)
				{
					Scanner userInput = new Scanner(System.in);
					userInput.nextLine();
					if (playerDeck.size()==0 && opponentDeck.size()==0)
						{
							stopGame();
						}
					countOffComputer();
					flipCard();
					decideWinner();
					System.out.println();
				}
		}
		public static void instantiateArrayList()
		{
			deck.add(new Card (2, "Two", "Hearts"));
			deck.add(new Card (3, "Three", "Hearts"));
			deck.add(new Card (4, "Four", "Hearts"));
			deck.add(new Card (5, "Five", "Hearts"));
			deck.add(new Card (6, "Six", "Hearts"));
			deck.add(new Card (7, "Seven", "Hearts"));
			deck.add(new Card (8, "Eight", "Hearts"));
			deck.add(new Card (9, "Nine", "Hearts"));
			deck.add(new Card (10, "Ten", "Hearts"));
			deck.add(new Card (11, "Jack", "Hearts"));
			deck.add(new Card (12, "Queen", "Hearts"));
			deck.add(new Card (13, "King", "Hearts"));
			deck.add(new Card (14, "Ace", "Hearts"));
			
			deck.add(new Card (2, "Two", "Diamonds"));
			deck.add(new Card (3, "Three", "Diamonds"));
			deck.add(new Card (4, "Four", "Diamonds"));
			deck.add(new Card (5, "Five", "Diamonds"));
			deck.add(new Card (6, "Six", "Diamonds"));
			deck.add(new Card (7, "Seven", "Diamonds"));
			deck.add(new Card (8, "Eight", "Diamonds"));
			deck.add(new Card (9, "Nine", "Diamonds"));
			deck.add(new Card (10, "Ten", "Diamonds"));
			deck.add(new Card (11, "Jack", "Diamonds"));
			deck.add(new Card (12, "Queen", "Diamonds"));
			deck.add(new Card (13, "King", "Diamonds"));
			deck.add(new Card (14, "Ace", "Diamonds"));
			
			deck.add(new Card (2, "Two", "Clubs"));
			deck.add(new Card (3, "Three", "Clubs"));
			deck.add(new Card (4, "Four", "Clubs"));
			deck.add(new Card (5, "Five", "Clubs"));
			deck.add(new Card (6, "Six", "Clubs"));
			deck.add(new Card (7, "Seven", "Clubs"));
			deck.add(new Card (8, "Eight", "Clubs"));
			deck.add(new Card (9, "Nine", "Clubs"));
			deck.add(new Card (10, "Ten", "Clubs"));
			deck.add(new Card (11, "Jack", "Clubs"));
			deck.add(new Card (12, "Queen", "Clubs"));
			deck.add(new Card (13, "King", "Clubs"));
			deck.add(new Card (14, "Ace", "Clubs"));
			
			deck.add(new Card (2, "Two", "Spades"));
			deck.add(new Card (3, "Three", "Spades"));
			deck.add(new Card (4, "Four", "Spades"));
			deck.add(new Card (5, "Five", "Spades"));
			deck.add(new Card (6, "Six", "Spades"));
			deck.add(new Card (7, "Seven", "Spades"));
			deck.add(new Card (8, "Eight", "Spades"));
			deck.add(new Card (9, "Nine", "Spades"));
			deck.add(new Card (10, "Ten", "Spades"));
			deck.add(new Card (11, "Jack", "Spades"));
			deck.add(new Card (12, "Queen", "Spades"));
			deck.add(new Card (13, "King", "Spades"));
			deck.add(new Card (14, "Ace", "Spades"));
		}
		public static void shuffleDeck()
		{
			Collections.shuffle(deck);
		}
		public static void printDeck()
		{
			System.out.println("Would you like to see the deck?");
			Scanner userInput = new Scanner(System.in);
			String response = userInput.nextLine();			
			if (response.equals("yes"))
				{
					for (Card c: deck)
						{
							System.out.println(c.getRank() + " of " + c.getSuit());
						}
				}
			if (response=="no")
				{
					
				}
		}
		public static void startGame()
		{
			System.out.println("We are going to play War.");
			System.out.println("On the count of 3, we both flip a card.");
			System.out.println("The person with the highest card wins the match.");
			System.out.println("Press the enter key to flip your card.");
			System.out.println("Understand?");
			Scanner userInput = new Scanner(System.in);
			String answer = userInput.nextLine();
			System.out.println("Alright, let's go.");
			System.out.println();
		}
		public static void divideDeck()
		{
			playerDeck.add(deck.get(0));
			playerDeck.add(deck.get(1));
			playerDeck.add(deck.get(5));
			playerDeck.add(deck.get(3));
			playerDeck.add(deck.get(7));
			playerDeck.add(deck.get(11));
			playerDeck.add(deck.get(13));
			playerDeck.add(deck.get(15));
			playerDeck.add(deck.get(17));
			playerDeck.add(deck.get(19));
			playerDeck.add(deck.get(21));
			playerDeck.add(deck.get(2));
			playerDeck.add(deck.get(4));
			playerDeck.add(deck.get(6));
			playerDeck.add(deck.get(8));
			playerDeck.add(deck.get(10));
			playerDeck.add(deck.get(12));
			playerDeck.add(deck.get(14));
			playerDeck.add(deck.get(16));
			playerDeck.add(deck.get(18));
			playerDeck.add(deck.get(20));
			playerDeck.add(deck.get(22));
			playerDeck.add(deck.get(24));
			playerDeck.add(deck.get(9));
			playerDeck.add(deck.get(23));
			playerDeck.add(deck.get(25));
			
			opponentDeck.add(deck.get(27));
			opponentDeck.add(deck.get(28));
			opponentDeck.add(deck.get(29));
			opponentDeck.add(deck.get(30));
			opponentDeck.add(deck.get(31));
			opponentDeck.add(deck.get(32));
			opponentDeck.add(deck.get(33));
			opponentDeck.add(deck.get(34));
			opponentDeck.add(deck.get(35));
			opponentDeck.add(deck.get(36));
			opponentDeck.add(deck.get(37));
			opponentDeck.add(deck.get(38));
			opponentDeck.add(deck.get(40));
			opponentDeck.add(deck.get(42));
			opponentDeck.add(deck.get(43));
			opponentDeck.add(deck.get(44));
			opponentDeck.add(deck.get(45));
			opponentDeck.add(deck.get(46));
			opponentDeck.add(deck.get(47));
			opponentDeck.add(deck.get(48));
			opponentDeck.add(deck.get(49));
			opponentDeck.add(deck.get(50));
			opponentDeck.add(deck.get(51));
			opponentDeck.add(deck.get(26));
			opponentDeck.add(deck.get(39));
			opponentDeck.add(deck.get(41));
			}
		public static void countOffComputer()
		{
			System.out.println("1, 2, 3- FLIP!");
			System.out.println();
		}
		public static void flipCard()
		{
			System.out.println("Your card is ");
			System.out.println(playerDeck.get(0).getRank() + " of " + playerDeck.get(0).getSuit());
			System.out.println();
			System.out.println("My card is ");
			System.out.println(opponentDeck.get(0).getRank() + " of " + opponentDeck.get(0).getSuit());
			System.out.println();
		}
		public static void decideWinner()
		{
			
			if (playerDeck.get(0).getValue() > opponentDeck.get(0).getValue())
				{
					System.out.println("You win this round.");
					System.out.println();
					playerDeck.remove(0);
					opponentDeck.remove(0);
					counter=counter+2;
					System.out.println("Player: " + counter + " points");
					opponentCounter=opponentCounter+0;
					System.out.println("Computer: " + opponentCounter + " points");
					System.out.println();
				}
			else if (playerDeck.get(0).getValue() < opponentDeck.get(0).getValue())
				{
					System.out.println("I win!");
					System.out.println();
					System.out.println();
					playerDeck.remove(0);
					opponentDeck.remove(0);
					counter=counter+0;
					System.out.println("Player: " + counter + " points");
					opponentCounter=opponentCounter+2;
					System.out.println("Computer: " + opponentCounter + " points");
					System.out.println();
				}
			else if (playerDeck.get(0).getValue() == opponentDeck.get(0).getValue())
				{
					System.out.println("TIE!");
					Scanner userInput = new Scanner(System.in);
					String flip = userInput.nextLine();		
					playerDeck.remove(0);
					opponentDeck.remove(0);
					System.out.println("Your card is ");
					System.out.println(playerDeck.get(0).getRank() + " of " + playerDeck.get(0).getSuit());
					System.out.println();
					System.out.println("My card is ");
					System.out.println(opponentDeck.get(0).getRank() + " of " + opponentDeck.get(0).getSuit());
					System.out.println();
					playerDeck.remove(0);
					opponentDeck.remove(0);
					
				while (!tied)
				{			
					if (playerDeck.size()==0 && opponentDeck.size()==0)
						{
							stopGame();
						}
					if (playerDeck.get(0).getValue() > opponentDeck.get(0).getValue())
						{
							System.out.println("You win this round.");
							System.out.println();
							tied=false;
							counter=counter + 4;
							System.out.println("Player: " + counter + " points");
							opponentCounter=opponentCounter+0;
							System.out.println("Computer: " + opponentCounter+ " points");
							System.out.println();
						}
					else if (playerDeck.get(0).getValue() < opponentDeck.get(0).getValue())
						{
							System.out.println("I win!");
							System.out.println();
							tied=false;
							counter=counter+0;
							System.out.println("Player: " + counter + " points");
							opponentCounter=opponentCounter + 4;
							System.out.println("Computer: " + opponentCounter+ " points");
							System.out.println();
						}
					break;
				}}
			
		}
		public static void stopGame()
		{
			System.out.println("Thanks for playing!");
			System.exit(0);
		}
	}
