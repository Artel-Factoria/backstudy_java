public class Calculator {
    public static void main(String arg[]){
        String action = "sub";
        double pointNumber = 2;
         switch (action) {
             case "sub":
                    System.out.println("yays");
             break;

             case "sum":
                 System.out.println("little summary");
             break;

             case "mult":
                 System.out.println("multiply smt");
                 break;

             case "div":
                 System.out.println("division");
                 break;

             case "AC":
                 System.out.println("delete evr");
                 break;

             case "summing":
                 System.out.println("sum");
                 break;

             default:
                 System.out.println("cnan");
             break;

            }
    }
}

