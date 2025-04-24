
public class Sword extends Weapon{

	public Sword(double baseDamage, double baseDurability, int value, double weight) {
		super("Sword", baseDamage, baseDurability, value, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void polish() {
		// TODO Auto-generated method stub
		if(getDamageModifier() + Weapon.MODIFIER_CHANGE_RATE <0.25 * getBaseDamage()) {
			this.setDamageModifier(getDamageModifier() + Weapon.MODIFIER_CHANGE_RATE);
		}
	}

}
 