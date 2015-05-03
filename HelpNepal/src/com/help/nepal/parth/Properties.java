package com.help.nepal.parth;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;

/**
 * 
 * @author pvaishnav
 *
 */
public class Properties {

	String id;
	String name;
	String link;
	String[] category;
	String color;
	String icon;
	String thumb;
	String timestamp;
	String count;
	String clasz;
	String title;
	String feature_id;
	String description;
	String strokecolor;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String[] getCategory() {
		return category;
	}

	public void setCategory(String[] category) {
		this.category = category;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getClasz() {
		return clasz;
	}

	public void setClasz(String clasz) {
		this.clasz = clasz;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFeature_id() {
		return feature_id;
	}

	public void setFeature_id(String feature_id) {
		this.feature_id = feature_id;
	}

	public String getStrokecolor() {
		return strokecolor;
	}

	public void setStrokecolor(String strokecolor) {
		this.strokecolor = strokecolor;
	}

	@Override
	public String toString() {
		String categoryString = "-";
		if (getCategory() != null) {
			categoryString = Joiner.on(':').join(category);
		}
		return Joiner.on(',').join(
				Strings.nullToEmpty(getId()).replace(",", ";"),
				Strings.nullToEmpty(getName()).replace(",", ";"),
				Strings.nullToEmpty(getLink()).replace(",", ";"),
				Strings.nullToEmpty(categoryString).replace(",", ";"),
				Strings.nullToEmpty(getColor()).replace(",", ";"),
				Strings.nullToEmpty(getIcon()).replace(",", ";"),
				Strings.nullToEmpty(getThumb()).replace(",", ";"),
				Strings.nullToEmpty(getTimestamp()).replace(",", ";"),
				Strings.nullToEmpty(getCount()).replace(",", ";"),
				Strings.nullToEmpty(getClasz()).replace(",", ";"),
				Strings.nullToEmpty(getTitle()).replace(",", ";"),
				Strings.nullToEmpty(getFeature_id()).replace(",", ";"),
				Strings.nullToEmpty(getDescription()).replace(",", ";"),
				Strings.nullToEmpty(getStrokecolor()).replace(",", ";"));
	}
}
