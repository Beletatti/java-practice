package OOP.Record;

public class MainStudent {
    public static void main(String[] args) {

        for (int i = 1; i <=5; i++) {
            Student s = new Student("S92300" + i,
                    switch (i){
                        case 1 -> "Kaique";
                        case 2 -> "Guia";
                        case 3 -> "Beleta";
                        case 4 -> "Punch";
                        case 5 -> "Hunter";
                        default -> "Unknown";
                    },
                    "05/11/1985",
                    "Java King");
            System.out.println(s);
        }
    }
}
