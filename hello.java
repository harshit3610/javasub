class Operations{
    static int factorial(int n){
        if(n==0)
            return 1;
        if(n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
}

class hello{
    public static void main(String[] args) {
        System.out.println("Hello World!");  
        System.out.println("Clash incoming! CONFLICT DEMO!");  
        System.out.println("Hello World!");   
        System.out.println(Operations.factorial(5)); 
        System.out.println("THIS IS A DEMO MY BOY!");
    }
}