package labs;

public class TeacherGroup {

	public static void main(String[] args) {

		Teacher.ratingAmongTeachers = 0;
		Teacher firstTeacher = new Teacher();
		Teacher secondTeacher = new Teacher("Ivan Petrovich", 28, "pirate", 67);
		Teacher thirdTeacher = new Teacher("George Wilson", 11, "pyrotechnist", 43, "Elizabeth", 8, "Oxford");
		
		System.out.println(firstTeacher.toString());
		System.out.println(secondTeacher.toString());
		System.out.println(thirdTeacher.toString());
		
		System.out.println(thirdTeacher.printRatingAmongTeachers());
		System.out.println(Teacher.printStaticRatingAmongTeachers());
		
		
		Teacher [] teachers = new Teacher[4];
		int currentTeacherIndex = 0;
		do {
			teachers[currentTeacherIndex] = new Teacher("Ivan Petrovich", 28, "pirate", 67);
			currentTeacherIndex++;
		}while(currentTeacherIndex!=4);
		for(Teacher teacher : teachers) {
			System.out.println(teacher.toString());

		}
		
	}

}
