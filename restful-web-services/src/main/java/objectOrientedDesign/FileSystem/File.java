package objectOrientedDesign.FileSystem;

public class File extends Structure {

	String name;
	String creationDate;

	public File(String name, String date) {
		super();
		this.name = name;
		this.creationDate = date;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public void displayStructure() {
		System.out.println(this.getName() + " " + this.getCreationDate());
	}

}
