
public class ItemWeightComparator implements ItemComparator {
	@Override
	public int compare(Item first, Item second) {
		if (first.getWeight() > second.getWeight()) {
			return 1;
		} else if (first.getWeight() < second.getWeight()) {
			return -1;
		} else {
			return first.compareTo(second);
		}
	}
}
