package javaSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MySerialization {

	public static void main(String[] args) throws Exception {
		
		String fileString = "D:\\tmpjavafiles\\file1.txt";
		
		try {
			
			Course course = new Course(12, "Java");
			Student student = new Student(1423, "Majid Zanjani", "A Grade", course);
			
			FileOutputStream fOut = new FileOutputStream(fileString);
			ObjectOutputStream objOut = new ObjectOutputStream(fOut);
			objOut.writeObject(student);
			objOut.flush();
			objOut.close();
			fOut.close();
			System.out.println("Persist job...\nWriting object has been succeeded.\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("Depersist job...\nReading object from file...\n");
			FileInputStream fileInputStream = new FileInputStream(fileString);
			ObjectInputStream objIn = new ObjectInputStream(fileInputStream);
			
			Student myStudent = (Student) objIn.readObject();
			
			System.out.println(myStudent.toString());
			
			objIn.close();
			fileInputStream.close();
						
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
