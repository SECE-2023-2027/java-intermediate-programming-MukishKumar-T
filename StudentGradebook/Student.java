package StudentGradebook;

class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks){
        this.name = name;
        this.marks = marks;
    }

    public double calculateAverage(){
        int total = 0;
        for(int m : marks){
            total += m;
        }

        return total / (double) marks.length;
    }
}
