package StringBuilderPractices;

public class Build {
    public static void main(String[] args) {
     StringBuilder sb = new StringBuilder();
     sb.append("Welcome");
     sb.append(' ');
     sb.append("to");
     sb.append(' ');
     sb.append("java");
        System.out.println(sb);

//        System.out.println(sb.reverse());
        String replace = String.valueOf(sb.replace(11, 15, "CSS"));
        System.out.println(replace);

    }
}
