package OOPs;

class variableArguments33
{
    //why we are creating so many methods:
//    static int sum(int a, int b)
//    {
//        return a+b;
//    }
//    static int sum(int a,int b,int c)
//    {
//        return a+b+c;
//    }
//    static int sum(int a,int b,int c,int d)
//    {
//        return a+b+c+d;
//    }
//    if we have this technique:
//    ...arr means the no of arguments we are giving to sum function will be store as in array
//    it means we can give as many arguments as we want we doesn't need to create different methods for different no
//    of arguments:
    static int sum(int ...arr)
    {
        int result=0;
    for (int a: arr)
    {
        result+=a;
    }
    return result;
    }
    public static void main(String[] args)
    {
        System.out.println("welcome to vararg tutorial");
        System.out.println("The sum of 5 and 6 is "+sum(5,6));
        System.out.println("The sum of 4,7 and 8 is "+sum(4,7,8));
        System.out.println("The sum of 4,7 ,8 and 9 is "+sum(4,7,8,9));
    }
}
