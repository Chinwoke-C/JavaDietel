package Chapter4;

public class Tabular_Output {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%s%n","N","N^2","N^3","N^4");
        for (int i = 1; i <= 5; i++) {
            int num2 = i *i;
            int num3 = num2*i;
            int num4 = num3*i;
            System.out.printf("%-10d%-10d%-10d%d%n",i,num2,num3,num4);
        }
    }
}



