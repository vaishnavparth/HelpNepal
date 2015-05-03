package com.help.nepal.parth;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;

/**
 * 
 * @author pvaishnav
 *
 */
public class Geometry {
	String type;
	String[] coordinates;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String[] getCoordinates() {
		return coordinates;
	}

	public void setCoordinate(String[] coordinates) {
		this.coordinates = coordinates;
	}

	@Override
	public String toString() {
		String coordinatesString = "-";
		if (coordinates != null) {
			coordinatesString = Joiner.on(':').useForNull("").join(coordinates);
		}
		return Joiner
				.on(',')
				.join(Strings.nullToEmpty(getType()).replace(",", ";"),
						Strings.nullToEmpty(coordinatesString.replace(",", ";")));
	}
}
