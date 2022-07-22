
public class Camcorder extends Item{
	private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
		String output = super.toString();
		output += String.format("%-20d\n", opticalZoom);
>>>>>>> branch 'master' of https://github.com/ArtunALP-RP/ResourceCentre_Refactor.git
>>>>>>> branch 'master' of https://github.com/ArtunALP-RP/ResourceCentre_Refactor.git
		// Write your codes here
		String output = super.toString();
<<<<<<< HEAD
		output = String.format("%-63s %-20d", output, opticalZoom);
=======
		output += String.format("%-63s %-20d", output, opticalZoom);
>>>>>>> branch 'master' of https://github.com/ArtunALP-RP/ResourceCentre_Refactor.git
		return output;
	}
}

