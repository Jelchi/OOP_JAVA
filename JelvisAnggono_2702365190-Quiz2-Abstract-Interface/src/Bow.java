
public class Bow extends Weapon{

	public Bow(double baseDamage, double baseDurability, int value, double weight) {
		super("Bow", baseDamage, baseDurability, value, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void polish() {
		// TODO Auto-generated method stub
		if(this.getDurability() + MODIFIER_CHANGE_RATE <= 1.0) {
			this.setDurabilityModifier(this.getDurabilityModifier() + MODIFIER_CHANGE_RATE);
		}
	}
}
