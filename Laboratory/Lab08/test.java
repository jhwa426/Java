
public class test {

	public static void main(String[] args) {
//		Instruction inst1 = new SingleInstruction(1, "Work on Lab01");
//		Instruction inst2 = new SingleInstruction(2, "Work on Lab02");
//		CompositeInstruction inst5 = new CompositeInstruction(5, "Prepare Exam");
//		Instruction inst6 = new SingleInstruction(6, "Study Revision Exercises");
//		Instruction inst7 = new SingleInstruction(7, "Study All Labs Exercises");
//		inst5.add(inst6);
//		inst5.add(inst7);
//		inst5.display("");

		
//		CompositeInstruction inst4 = new CompositeInstruction(4, "Work on A1");
//		CompositeInstruction inst5 = new CompositeInstruction(5, "Prepare Exam");
//		Instruction inst6 = new SingleInstruction(6, "Study Revision Exercises");
//		Instruction inst7 = new SingleInstruction(7, "Study All Labs Exercises");
//		Instruction inst4a = new SingleInstruction(9, "Work on A1.Part1");
//		Instruction inst4b = new SingleInstruction(10, "Work on A1.Part2");
//		inst4.add(inst4a);
//		inst4.add(inst4b);
//		inst5.add(inst6);
//		inst5.add(inst4);
//		inst5.display("");
		
//		CompositeInstruction inst4 = new CompositeInstruction(4, "Work on A1");
//		CompositeInstruction inst5 = new CompositeInstruction(5, "Prepare Exam");
//		Instruction inst6 = new SingleInstruction(6, "Study Revision Exercises");
//		Instruction inst7 = new SingleInstruction(7, "Study All Labs Exercises");
//		Instruction inst4a = new SingleInstruction(9, "Work on A1.Part1");
//		Instruction inst4b = new SingleInstruction(10, "Work on A1.Part2");
//		inst4.add(inst4a);
//		inst4.add(inst4b);
//		inst5.add(inst6);
//		inst5.add(inst4);
//		inst5.remove(inst6);
//		inst5.display("");
		
//		Folder f1 = new Folder("Folder1:");
//		File file1 = new File("File1" ,"Hello World!");
//		File file2 = new File("File2" ,"Life is a long journey.");
//		f1.add(file1);
//		f1.add(file2);
//		System.out.println(f1);
//		System.out.println(file1);
//		System.out.println(file2);
		
		Folder f1 = new Folder("Folder1:");
		Folder f2 = new Folder("Folder2:");
		File file1 = new File("File1" ,"Hello World!");
		File file2 = new File("File2" ,"Life is a long journey.");
		File file3 = new File("File3", "No Man is an island.");
		File file4 = new File("File4", "Of easy wind and downy flake.");
		f1.add(f2);
		f2.add(file1);
		f2.add(file2);
		f2.add(file3);
		System.out.println(file3.getParent());
		System.out.println(f2.getParent());
	}

}
