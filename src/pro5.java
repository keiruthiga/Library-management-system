public class pro5 {
    public static void main(String[] args) {
        int mathMarks = 90;
        int scienceMarks = 95;
        int englishMarks = 80;

        int totalMarks = mathMarks + scienceMarks + englishMarks;
        int averagemarks = totalMarks / 3;


        System.out.println("TotalMarks: " + totalMarks);
        System.out.println("Averagemarks. " + averagemarks );


        if ( averagemarks >= 90) {
            System.out.println("Grade A");
        } else if (averagemarks >= 80) {
            System.out.println("Grade B");
        } else if (averagemarks >= 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
    }
    }
}
