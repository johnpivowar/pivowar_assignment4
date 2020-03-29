

public class Application {
	public static void main(String[] args) {
		Duplicate_Remover duplicateRemover = new Duplicate_Remover();
		duplicateRemover.remove("C:\\Users\\Kyle\\eclipse-workspace\\a3_condren_problem1\\problem1.txt");
		duplicateRemover.write("C:\\Users\\Kyle\\Documents\\Spring 2020\\COP 3330\\a3_condren_p1\\unique_words.txt");
	}
}