package Day5_AlgorithimComplexity;

public class StringConcatComparison {

    public static void main(String[] args) {
        int count = 100_000;

      
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < count; i++) {
            str += "a";
        }
        long time1 = System.currentTimeMillis() - start;
        System.out.println("String Time: " + time1 + " ms");

        
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("a");
        }
        long time2 = System.currentTimeMillis() - start;
        System.out.println("StringBuilder Time: " + time2 + " ms");

       
        start = System.currentTimeMillis();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sf.append("a");
        }
        long time3 = System.currentTimeMillis() - start;
        System.out.println("StringBuffer Time: " + time3 + " ms");
    }
}
