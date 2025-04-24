
public class Sword extends Weapon {
	public Sword (double baseDamage, double baseDurability, int value, double weight) {
		super("Sword", baseDamage, baseDurability, value, weight); 
	}
	
	@Override
	public void polish() {
		if (this.getDamageModifier() + Weapon.MODIFIER_CHANGE_RATE * this.getBaseDamage()  <= 0.25 * this.getBaseDamage()) {
			this.setDamageModifier(this.getDamageModifier() + Weapon.MODIFIER_CHANGE_RATE * this.getBaseDamage());
		}
	}
}
