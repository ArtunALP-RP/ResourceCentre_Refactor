
public class Item {
	private String assetTag;
	private String description;
	private String dueDate;
	private boolean isAvailable;

	public Item(String assetTag, String description) {
		this.assetTag = assetTag;
		this.description = description;
		this.dueDate = "";
		this.isAvailable = true;
	}

	public String toString() {
		String iteminfo = String.format("%-10s %-30s %-10s %-10s ", assetTag , description, showAvailability(isAvailable), dueDate);

		// Write your codes here
<<<<<<< HEAD
		String itemInfo = String.format("%-10s %-30s %-10s %-10s",
				assetTag,
				description, 
				showAvailability(isAvailable),
				dueDate);
		return itemInfo;
	}
	public String showAvailability(boolean isAvailable) {
		String avail;

		if (isAvailable == true) {
			avail = "Yes";
		} else {
			avail = "No";
		}
		return avail;
=======
		return iteminfo;
>>>>>>> branch 'master' of https://github.com/ArtunALP-RP/ResourceCentre_Refactor.git
	}
	
	public String showAvailability(boolean isAvailable) {
		String avail;

		if (isAvailable == true) {
			avail = "Yes";
		} else {
			avail = "No";
		}
		return avail;
}

	public String getAssetTag() {
		return assetTag;
	}

	public String getDescription() {
		return description;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}
