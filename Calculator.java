class Calculator{

    public static void main(String[] args) {
        Addition a =new Addition();
      int result1=  a.add(12, 12);
      float result2= a.addFloat(15.2f, 12.9f);
      System.out.println("Result1- "+result1);
      System.out.println("Result2- "+result2);
    }
}