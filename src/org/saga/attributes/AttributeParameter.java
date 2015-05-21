package org.saga.attributes;

public enum AttributeParameter {

	// Damage:
	@Deprecated
	MELEE_MODIFIER, @Deprecated
	RANGED_MODIFIER, @Deprecated
	MAGIC_MODIFIER,

	MELEE_DAMAGE_MODIFIER, RANGED_DAMAGE_MODIFIER, MAGIC_DAMAGE_MODIFIER,

	@Deprecated
	MELEE_MULTIPLIER, @Deprecated
	RANGED_MULTIPLIER, @Deprecated
	MAGIC_MULTIPLIER,

	MELEE_DAMAGE_MULTIPLIER, RANGED_DAMAGE_MULTIPLIER, MAGIC_DAMAGE_MULTIPLIER,

	@Deprecated
	MELEE_HIT_CHANCE, @Deprecated
	RANGED_HIT_CHANCE, @Deprecated
	MAGIC_HIT_CHANCE,

	MELEE_HIT_CHANCE_MODIFIER, RANGED_HIT_CHANCE_MODIFIER, MAGIC_HIT_CHANCE_MODIFIER,

	MELEE_ARMOUR_PENETRATION, RANGED_ARMOUR_PENETRATION, MAGIC_ARMOUR_PENETRATION,

	MELEE_ENCHANT_PENETRATION, RANGED_ENCHANT_PENETRATION, MAGIC_ENCHANT_PENETRATION,

	@Deprecated
	MELEE_BLOCK_MODIFIER, @Deprecated
	RANGED_BLOCK_MODIFIER, @Deprecated
	MAGIC_BLOCK_MODIFIER,

	// Resistance:
	BURN_RESIST,

	// Passive:
	@Deprecated
	DROP_MODIFIER, EXTRA_DROP_CHANCE_MODIFIER, HEALTH_MODIFIER

}
