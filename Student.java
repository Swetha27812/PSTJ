package Tasks;
import java.util.*;
import java.util.stream.*;

		public class Student{
		    String name;
		    int marks;

		    Student(String name, int marks) {
		        this.name = name;
		        this.marks = marks;
		    }
		
		

			public static void main(String[] args) {
			
		
		        Scanner sc = new Scanner(System.in);

		        int N = sc.nextInt();
		        List<Student> students = new ArrayList<>();

		        for (int i = 0; i < N; i++) {
		            String name = sc.next();
		            int marks = sc.nextInt();
		            students.add(new Student(name, marks));
		        }

		        int K = sc.nextInt();

		        List<String> topStudents = students.stream()
		                .sorted((s1, s2) -> {
		                    if (s1.marks != s2.marks) {
		                        return s2.marks - s1.marks; // descending marks
		                    }
		                    return s1.name.compareTo(s2.name); // alphabetical name
		                })
		                .limit(K)
		                .map(s -> s.name)
		                .collect(Collectors.toList());

		        for (String name : topStudents) {
		            System.out.print(name + " ");
		        }
			}
		}
		