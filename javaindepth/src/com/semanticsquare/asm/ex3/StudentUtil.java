public class StudentUtil {

    public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
        // your code
        double[] gpaList = new double[studentIdList.length];
        int index = 0;

        for (char[] studentsGrade: studentsGrades) {
            double sumOfGrades = 0.0;

            for (char grade : studentsGrade) {
                switch (grade) {
                    case 'A': sumOfGrades += 4.0;
                        break;
                    case 'B': sumOfGrades += 3.0;
                        break;
                    case 'C': sumOfGrades += 2.0;
                        break;
                }
            }

            gpaList[index++] = sumOfGrades / studentsGrade.length;

        }

        return gpaList;

    }
    
    public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
        // perform parameter validation. Return null if passed parameters are not valid
        if (lower < 0 || higher < 0 || lower > higher) return null;
        // invoke calculateGPA
        double[] gpaList =  calculateGPA(studentIdList, studentsGrades);
        // construct the result array and return it. You would need an extra for loop to compute the size of the resulting array
        int count = 0;

        for (double gpa : gpaList) {
            if (gpa >= lower && gpa <= higher) count++;
        }

        int[] result = new int[count];

        for (int i = 0, index = 0; i < gpaList.length; i++) {
            if (gpaList[i] >= lower && gpaList[i] <= higher) 
                result[index++] = studentIdList[i] ;
        }

        return result;

    }

    static public void main(String[] args) {
        int[] studentIdList = {1001, 1002, 1003};
        char[][] studentsGrades = {
            {'A', 'A', 'A', 'B'},
            {'B', 'B', 'B', 'A'},
            {'A', 'A', 'B'}
        };
        double lower = 3.5, higher = 4.0;

        double[] gpaList = calculateGPA(studentIdList, studentsGrades);
        for (double gpa: gpaList) {
            System.out.println("gpa: " + gpa);
        }
        int[] idList = getStudentsByGPA(lower, higher, studentIdList, studentsGrades);

        for (int id: idList) {
            System.out.println("id: " + id);
        }
    }
    
} 