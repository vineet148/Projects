package objectOrientedDesign.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String args[])
	{
		
		Structure file1=new File("vineet.txt","22-02-2021");
		Structure file2=new File("vineet2.txt","22-02-2021");
		Structure root=new Directory("root","root  directory");
		root.add(file1);
		root.add(file2);
		Structure home=new Directory("home","home directory");
        root.add(home);
        home.add(file1);
		root.displayStructure();
		//home.displayStructure();
	}
}
