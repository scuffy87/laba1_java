package labs;

public class Teacher {

	private String nameOfTeacher;
	private int yearsOfTeaching;
	private String nicknameAmongStudents;

	private int yearsOld;
	private String nameOfWife;

	public static int ratingAmongTeachers;

	protected int numberOfGroups;
	protected String nameOfUniversity;
	
	public Teacher(String nameOfTeacher, int yearsOfTeaching, String nicknameAmongStudents, int yearsOld,
			String nameOfWife, int numberOfGroups, String nameOfUniversity) {
		super();
		this.nameOfTeacher = nameOfTeacher;
		this.yearsOfTeaching = yearsOfTeaching;
		this.nicknameAmongStudents = nicknameAmongStudents;
		this.yearsOld = yearsOld;
		this.nameOfWife = nameOfWife;
		this.numberOfGroups = numberOfGroups;
		this.nameOfUniversity = nameOfUniversity;
		ratingAmongTeachers++;
	}

	public Teacher(String nameOfTeacher, int yearsOfTeaching, String nicknameAmongStudents, int yearsOld) {
		this(nameOfTeacher, yearsOfTeaching, nicknameAmongStudents, yearsOld, "0", 0, "0");
	}
	
	public Teacher() {
		this("0", 0, "0", 0, "0", 0, "0");
	}
	
	public void resetValues(String nameOfTeacher, int yearsOfTeaching, String nicknameAmongStudents, int yearsOld,
			String nameOfWife, int numberOfGroups, String nameOfUniversity) {
		this.nameOfTeacher = nameOfTeacher;
		this.yearsOfTeaching = yearsOfTeaching;
		this.nicknameAmongStudents = nicknameAmongStudents;
		this.yearsOld = yearsOld;
		this.nameOfWife = nameOfWife;
		this.numberOfGroups = numberOfGroups;
		this.nameOfUniversity = nameOfUniversity;
	}

	public String getNameOfTeacher() {
		return nameOfTeacher;
	}

	public void setNameOfTeacher(String nameOfTeacher) {
		this.nameOfTeacher = nameOfTeacher;
	}

	public int getYearsOfTeaching() {
		return yearsOfTeaching;
	}

	public void setYearsOfTeaching(int yearsOfTeaching) {
		this.yearsOfTeaching = yearsOfTeaching;
	}

	public String getNicknameAmongStudents() {
		return nicknameAmongStudents;
	}

	public void setNicknameAmongStudents(String nicknameAmongStudents) {
		this.nicknameAmongStudents = nicknameAmongStudents;
	}

	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	public String getNameOfWife() {
		return nameOfWife;
	}

	public void setNameOfWife(String nameOfWife) {
		this.nameOfWife = nameOfWife;
	}

	public static int getRatingAmongTeachers() {
		return ratingAmongTeachers;
	}

	public static void setRatingAmongTeachers(int ratingAmongTeachers) {
		Teacher.ratingAmongTeachers = ratingAmongTeachers;
	}

	public int getNumberOfGroups() {
		return numberOfGroups;
	}

	public void setNumberOfGroups(int numberOfGroups) {
		this.numberOfGroups = numberOfGroups;
	}

	public String getNameOfUniversity() {
		return nameOfUniversity;
	}

	public void setNameOfUniversity(String nameOfUniversity) {
		this.nameOfUniversity = nameOfUniversity;
	}

	

	@Override
	public String toString() {
		return "Teacher [nameOfTeacher=" + nameOfTeacher + ", yearsOfTeaching=" + yearsOfTeaching
				+ ", nicknameAmongStudents=" + nicknameAmongStudents + ", yearsOld=" + yearsOld + ", nameOfWife="
				+ nameOfWife + ", numberOfGroups=" + numberOfGroups + ", nameOfUniversity=" + nameOfUniversity + "]";
	}

	public static String printStaticRatingAmongTeachers() {
		return "static ratingAmongTeachers=" + ratingAmongTeachers;
	}

	public String printRatingAmongTeachers() {
		return "ratingAmongTeachers=" + ratingAmongTeachers;

	}

	

}
