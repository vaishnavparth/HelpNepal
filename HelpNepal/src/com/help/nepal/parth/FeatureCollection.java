package com.help.nepal.parth;

/**
 * 
 * @author pvaishnav
 *
 */
public class FeatureCollection {
	String type;
	Feature[] features;

	public Feature[] getFeatures() {
		return features;
	}

	public void setFeatures(Feature[] features) {
		this.features = features;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuffer br = new StringBuffer();
		for (Feature f : features) {
			br.append(f.toString()).append("\n");
		}
		return br.toString();

	}

}
