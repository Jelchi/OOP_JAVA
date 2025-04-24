
public class Bow extends Weapon{

	public Bow(double baseDamage, double baseDurability, int value, double weight) {
		super("Bow", baseDamage, baseDurability, value, weight);
	}

	@Override
	public void polish() {
		if (this.getDurability() + MODIFIER_CHANGE_RATE <= 1.0) {
			this.setDurabilityModifier(this.getDurabilityModifier() + MODIFIER_CHANGE_RATE);
		}
	}
}
