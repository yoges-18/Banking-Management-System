import java.util.*;
class user{
    private int acc_number;
    private String username ;
    private String phno;
    private String balance;
    private String address;
     
   public user (String username,String phno,String balance,String address){
       this.username=username;
       this.phno=phno;
       this.balance=balance;
       this.address=address;
   }
   public String toString(){
       return "\nUSERNAME : "+ username+
               "\nphno : "+phno+
               "\nbalance : "+balance+
               "\naddress : "+address;
             
   }
}
class database{
    Map<Integer ,user> users=new HashMap<>();
    public void adduser(int i ,user u){
        users.put(i,u);
    }
    public void viewaccount(int an){
        System.out.println("ACCOUNT NUMBER : "+an);
        user u=users.get(an);
        if(u!=null){
            System.out.println(u);
        }
        else{
            System.out.println("USER NOT FOUND");
        }
        }
        
    }
 

class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        database db=new database();
        int i=1;
        boolean f=true;
        while(f){
            
            System.out.println("|=========================welcome============================|");
            System.out.println("|1.ADD ACCOUNT                                               |");
            System.out.println("|2.VIEW ACCOUNT                                              |");
            System.out.println("|3.EXCIT                                                     |");
            System.out.println("|============================================================|");
            int n=sc.nextInt();
            sc.nextLine();
            switch(n){
                case 1:
                    i=i+1;
                    System.out.println("ENTER YOUR NAME : ");
                    String username =sc.nextLine();
                    System.out.println("ENTER YOUR PH NO : ");
                    String phno=sc.nextLine();
                    System.out.println("ENTER YOUR BALANCE : ");
                    String balance=sc.nextLine();
                    System.out.println("ENTER YOUR ADDRESS");
                    String address =sc.nextLine();
                    user u=new user(username,phno,balance,address);
                    db.adduser(i,u);
                    System.out.println("YOUR ACCOUNT IS ADDED SUCCESSFULLY");
                    System.out.println("YOUR ACCOUNT NUMBER  : "+ i);
                    break;
                case 2:
                    System.out.println("ENTER YOUR acc_number : ");
                    int an=sc.nextInt();
                    db.viewaccount(an);
                    break;
                case 3:
                    System.out.println("thank you");
                    f=false;
            }
        }
        
        
    }
}