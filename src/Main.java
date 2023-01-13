public class Main {
    public static void main(String[] args) {
        Class clas = new Class(1,"First",new int[]  {1,2,3,4});
        System.out.print(clas.getNumber()+","+clas.getString()+",");
        int[] a = clas.getArray();
        for (int i = 0; i < a.length; i++) {
            if(i == a.length-1) {
                System.out.print(a[i] + ".");
            }else {
                System.out.print(a[i] + ",");
            }

        }
    }
}