public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("----- LIST OF ACTIVITIES -----");
    System.out.println("1. Activity 1");
    System.out.println("------------------------------");
    System.out.print("Enter selection: ");
    int select = sc.nextInt();

    System.out.println("-------------------------------");

    if(select == 1){
        Activity1 act1 = new Activity1();
        act1.greeting();
    }else{

        System.out.println("Invalid Selection");
    }



}