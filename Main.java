public class Main {
	public static void main(String[] args) {
		testPaper testPaper1 = new testPaper();
		testPaper1.add(new Question("Q1"));
		testPaper1.add(new Question("Q2"));
		testPaper testPaper2 = new testPaper();
		testPaper2.add(new Question("Q3"));
		testPaper2.add(new Question("Q4"));
		testPaper testPaper3 = new testPaper();
		testPaper3.add(new Question("Q5"));
		testPaper3.add(new Question("Q6"));
		testPaper finalTest = new testPaper();
		finalTest.add(testPaper1);
		finalTest.add(testPaper2);
		finalTest.add(testPaper3);
		finalTest.print();

	}

}
