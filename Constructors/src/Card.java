import java.util.Scanner;
import java.util.ArrayList;

public class Card
	{
		private	int value;
		private String rank, suit;
			
		public Card (int v, String r, String s)
		{
			value=v;
			rank=r;
			suit=s;
		}

		public int getValue()
			{
				return value;
			}

		public void setValue(int value)
			{
				this.value = value;
			}

		public String getRank()
			{
				return rank;
			}

		public void setRank(String rank)
			{
				this.rank = rank;
			}

		public String getSuit()
			{
				return suit;
			}

		public void setSuit(String suit)
			{
				this.suit = suit;
			}
		
	
	}
