import java.util.*;
class Student {
    int stdnum;
    public Student(int stdnum) {
        this.stdnum = stdnum;
    }
    public void print() {
        System.out.println(stdnum);
    }
    public int getStdnum() {
        return this.stdnum;
    }
}
public class StdnumArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> st = new ArrayList<Student>(4);
        
        for(int i=0 ; i<4 ; i++) {
            int num = sc.nextInt();
            st.add(new Student(num));
        }
        int findMax = 0;
        for(int i=0 ; i<4 ; i++) {
            st.get(i).print();
            if(findMax < st.get(i).getStdnum()) {
                findMax = st.get(i).getStdnum();
            }
        }
        System.out.println(findMax);
    }
}
