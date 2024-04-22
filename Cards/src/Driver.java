
public class Driver {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		
		Pile p1 = new Pile();
		p1.addDeck(deck.subDeck(0, 25));
		Pile p2 = new Pile();
		p2.addDeck(deck.subDeck(26, 51));
		
		Pile mid = new Pile();
		
		Pile winP1 = new Pile();
		Pile winP2 = new Pile();
		
		while(!p1.isEmpty() && !p2.isEmpty()) {
			Card c1 = p1.popCard();
			Card c2 = p2.popCard();
			
			mid.addCard(c1);
			mid.addCard(c2);			
			
			int diff = c1.compareTo(c2);
			
			if (diff > 0) {
				winP1.addPile(mid);
				
			}
			else if (diff < 0) {
				winP2.addPile(mid);
				
			}
			else {
				// it's a tie
				
			}
		}
		if(p2.isEmpty()) {
			System.out.println("Player 1 wins!");
		} else {
			System.out.println("Player 2 wins!");
		}		
		if(winP1.size() > winP2.size()) {
			System.out.println("Player 1 wins!!!");
		}
		
		else if(winP1.size() < winP2.size() ) {
			System.out.println("Player 2 wins!!");
		}
		else {
			System.out.println("It's a tie");
		}		
	}
//		Card[] cards = new Card[52];
//		
//		Deck deck = new Deck();
//		deck.print();
//		
//		deck.shuffle();
//		deck.print();
//		System.out.println("*******************************");
//		
//		
//		Deck p1SubDeck = deck.subDeck(0,  25);
//		Deck p2SubDeck = deck.subDeck(26, 51);
//		p1SubDeck.print();
//		p2SubDeck.print();
//		
//
//	//	deck.print();
//		//deck.selectionSort();
//	//	Deck.bubbleSort(deck);
//		deck.print();
//		
//		Card target = new Card(9, 2);
//		System.out.println(target);
//		System.out.println(binarySearch(cards, target));
//		System.out.println(cards[binarySearch(cards, target)]);
//		//System.out.println(cards[33]);			
//
//	}
	
	
	
	public static int binarySearch(Card[] cards, Card target) {
		int low = 0;
		int high = cards.length - 1;
		while (low <= high) {
			System.out.println(low + ", " + high);
			int mid = (low + high) / 2;
			int comp = cards[mid].compareTo(target);
			
			if(comp == 0) {
				return mid;
				
			}else if (comp < 0) {
				low = mid + 1;
				
			}else {
				high = mid - 1;
			}
		
		}
		return -1;

	}

}
