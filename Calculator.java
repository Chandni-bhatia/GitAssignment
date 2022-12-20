class Calculator{

    public static void main(String[] args) {
     //addition
      Addition a =new Addition();
      int result1=  a.add(12, 12);
      Float result2= a.addFloat(15.2f, 12.9f);
      System.out.println("Result1- "+result1);
      System.out.println("Result2- "+result2);

      //substraction 
      Substraction s=new Substraction();
     result1= s.sub(45, 60);
     Double result3= s.subDouble(45.3, 30.2);
     System.out.println("Result1- "+result1);
     System.out.println("Result2- "+result3);

    }
}