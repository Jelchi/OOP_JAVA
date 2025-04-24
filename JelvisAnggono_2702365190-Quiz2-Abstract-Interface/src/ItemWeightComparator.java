
public class ItemWeightComparator implements ItemComparator {

	@Override
	public int compare(Item a, Item b) {
		// TODO Auto-generated method stub
		if (a.getWeight() > b.getWeight()) {
			return 1;
		} else if (a.getWeight() < b.getWeight()) {
			return -1;
		} else {
			return a.compareTo(b);
		}
	}

}
