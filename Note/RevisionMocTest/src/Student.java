//Q12
class Student {
	private String name;
	private int testMark;
	private int examMark;
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name, int testMark, int examMark) {
		this.name = name;
		this.testMark = testMark;
		this.examMark = examMark;
	}
	
	public int getTestMark() {
		return this.testMark;
	}
	
	public int getExamMark() {
		return this.examMark;
	}
	
	public void setTestMark(int mark) {
		if (mark >= 0) {
			this.testMark = mark;
		}
		
	}
	
	public void setExamMark(int mark) {
		if (mark >= 0) {
			this.examMark = mark;
		}
		
	}
	
	public String toString() {
		return String.format("%s got %d in the test and %d in the exam", this.name, this.testMark, this.examMark);
	}
	
//	public boolean passedTest() {
//		if (this.testMark > 24) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
	
	public boolean passedTest() {
		return this.testMark > 24 ? true : false;
	}
	
//	public boolean passedExam() {
//		if (this.examMark > 24) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
	
	public boolean passedExam() {
		return this.examMark > 24 ? true : false;
	}
	
	public int getFinalMark() {
		return (this.testMark + this.examMark);
	}
	
	public boolean didBetterThan(Student other) {
		//((this.testMark + this.examMark) > (other.testMark + other.examMark))
		if (this.getFinalMark() > (other.testMark + other.examMark)) {
			return true;
		}
		else {
			return false;
		}
	}

}
