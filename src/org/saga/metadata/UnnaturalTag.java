package org.saga.metadata;

import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.saga.Saga;

public class UnnaturalTag implements MetadataValue {

	/**
	 * Key for unnatural tag.
	 */
	public static String METADATA_KEY = "unnatural";

	/**
	 * Value for unnatural tag.
	 */
	public static UnnaturalTag METADATA_VALUE = new UnnaturalTag();

	@Override
	public boolean asBoolean() {
		return true;
	}

	@Override
	public byte asByte() {
		return 0;
	}

	@Override
	public double asDouble() {
		return 0;
	}

	@Override
	public float asFloat() {
		return 0;
	}

	@Override
	public int asInt() {
		return 0;
	}

	@Override
	public long asLong() {
		return 0;
	}

	@Override
	public short asShort() {
		return 0;
	}

	@Override
	public String asString() {
		return "unnatural";
	}

	@Override
	public Plugin getOwningPlugin() {
		return Saga.plugin();
	}

	@Override
	public void invalidate() {
	}

	@Override
	public Object value() {
		return asString();
	}

}
