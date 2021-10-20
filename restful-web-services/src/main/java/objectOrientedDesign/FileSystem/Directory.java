package objectOrientedDesign.FileSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Directory extends Structure {

	String name;
	String description;

	List<Structure> listofStructures = new ArrayList<Structure>();

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Directory(String name, String description) {
		super();

		this.name = name;
		this.description = description;
	}

	public void add(Structure s) {
		listofStructures.add(s);
	}

	public void remove(Structure s) {
		listofStructures.remove(s);
	}

	public Structure getStructure(int index) {
		return listofStructures.get(index);
	}

	public void displayStructure() {
		System.out.println(this.getName()+" "+this.getDescription());
        Iterator structureIterator = listofStructures.iterator();
        
        while(structureIterator.hasNext())
        {
        	Structure s = (Structure) structureIterator.next();
            s.displayStructure();        
        }
        
	}

	/*
	 * public void addResources(Structure src, Structure file) {
	 * 
	 * if (mapStructures.size() <= 0) { List<Structure> l = new ArrayList<>();
	 * l.add(file); mapStructures.put(src, l); } else if
	 * (mapStructures.containsKey(src)) { List<Structure> l =
	 * mapStructures.get(src); l.add(file); mapStructures.put(src, l); } else if
	 * (!mapStructures.containsKey(src)) { List<Structure> l2 = new ArrayList<>();
	 * l2.add(file); mapStructures.put(src, l2); } else {
	 * System.out.println("some error occured"); }
	 * 
	 * }
	 * 
	 */

}
