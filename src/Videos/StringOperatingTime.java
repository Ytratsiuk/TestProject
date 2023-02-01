package Videos;

public class StringOperatingTime {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();

        StringBuffer stb = new StringBuffer("It is something new!");

        for (int i = 0; i<100000; i++) {
            stb.append("Not new at all");
        }

        System.out.println("Time taken by a string buffer: " +(System.currentTimeMillis()-startTime));

         startTime=System.currentTimeMillis();
        StringBuilder sbu = new StringBuilder("It is something new!");

        for (int i = 0; i<1000000; i++) {
            sbu.append("Not new at all"); //class method used to append a value to the current sequence
        }
        System.out.println("Time taken by a string builder: "+(System.currentTimeMillis()-startTime));
    }
}
