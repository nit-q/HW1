public class Assignment01Q01 {
    public static void main(String[] args) {
        for (int i=0; i < args.length; i++)
        {String curr = args[i];
            char first = curr.charAt(0);
            if (first%5==0) {System.out.println(first);}

        }
    }
}
