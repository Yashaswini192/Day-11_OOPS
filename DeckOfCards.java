package bl.oops;

public class DeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] suit = {"Club", "Diamond","heart","Spade"};
		String[] rank = {"2","3","4","5","6","7","8","9","jack","Queen","King","Ace"};
		
		String[] deck = new String[52];
		for(int i = 0; i < deck.length;i++) {
			for(int j = 0; j < deck.length; j++) {
			deck[i] = rank[i % 11] + suit[i % 3];
			//System.out.println(deck[i]);
		}
		}
		//Shuffle cards
		for(int i = 0; i < deck.length;i++) {
				int index = (int)(Math.random() * (deck.length)-1);

				String temp = deck[i];
				deck[i] = deck[index];
				deck[index] = temp;
				//System.out.println(deck[i]+" ");
			}
			
			
			for(int k = 0; k < 4; k++) {
				System.out.println();
				System.out.println("** person " + (k + 1) + " ** ");
			
				for(int l = 0;l < 9; l++) {
					System.out.println(deck[k + l * 4]);
					}
				}
			}
		}	
	


