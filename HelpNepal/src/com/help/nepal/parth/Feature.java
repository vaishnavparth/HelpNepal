package com.help.nepal.parth;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;

/**
 * 
 * @author pvaishnav
 *
 */
public class Feature {
	String type;
	Properties properties;
	Geometry geometry;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Geometry getGeometry() {
		return geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return Joiner.on(',').join(
				Strings.nullToEmpty(getType()).replace(",", ";"),
				properties.toString(), geometry.toString());
	}

}
