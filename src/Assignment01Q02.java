public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        double temp = 0;
        int deno=1;
        boolean flag = true;
        for (int i=0; i<Integer.parseInt(args[0]); i++) {
            if (flag){
                temp += 1.0/deno;
                flag=false;
            }
            else {
                temp-=1.0/deno;
                flag=true;
            }
            deno+=2;
        }
        approxPi=4*temp;

        
        System.out.println(approxPi + " " + actualPi);
    }
}
