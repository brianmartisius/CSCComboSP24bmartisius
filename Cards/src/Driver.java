
public class Driver {

	public static void main(String[] args) {
		Card[] cards = new Card[52];
		
		Deck deck = new Deck();
		deck.print();
		
		deck.shuffle();
	//	deck.print();
		//deck.selectionSort();
		Deck.bubbleSort(deck);
		deck.print();
		
		Card target = new Card(9, 2);
		System.out.println(target);
		System.out.println(binarySearch(cards, target));
		System.out.println(cards[binarySearch(cards, target)]);
		//System.out.println(cards[33]);			

	}
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
