class PrecisionError {
    public static void main(String[] args) {
        System.out.println("\n \n Example-1");
        System.out.println(0.1 + 0.2);

        System.out.println("\n \n Example-2");
        double maxValue = 2.55;
        System.out.println("1. Original value = "+maxValue);
        System.out.println("2. Multiply by 100 = "+maxValue*100);
        System.out.println("3. Multiply by 1000 = "+maxValue*1000);
        maxValue = Math.floor(maxValue*100);
        System.out.println("4. Value after flooring "+maxValue+" But the actual value should be 255");

    }
}