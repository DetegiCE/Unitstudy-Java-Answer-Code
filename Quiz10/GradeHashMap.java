import java.util.*;

public class GradeHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> h = new HashMap<>();

        for(int i=0 ; i<4 ; i++) {
            String name = sc.next();
            int grade = sc.nextInt();
            h.put(name, grade);
        }

        System.out.print("Input Search > ");
        String search = sc.next();

        Integer ans = h.get(search);
        if(ans == null) {
            System.out.println("Not Found");
        }
        else {
            System.out.println(ans);
        }

    }
}
