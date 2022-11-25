package multiDimensionalArray;

public class StudentAndSubjectDriver {
    public static void main(String[] args) {
        StudentAndSubject myStudent = new StudentAndSubject();
        myStudent.enteringDisplay();
        for (int i = 0; i < myStudent.getNumOfStudent(); i++) {
            for (int j = 0; j < myStudent.getNumOfSubject() ; j++) {
                myStudent.secondDisplay(i+1, j+1);
            }
            System.out.println();
        }
        myStudent.displayTableHeader();
        myStudent.displayTableBody();
        myStudent.displayBottomLine();
    }
}
