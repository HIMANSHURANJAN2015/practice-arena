class Bitwise {
    public static void main(String asd[]) {
        int x = 150;
        int count = 0;
        for(int y = x; y > 0; y = (x & (y-1)) ) {
            System.out.println("Updated value of y"+y);
            System.out.println("Hey!");
            count++;
        }
        System.out.println("\n\n count="+count);
    }
}