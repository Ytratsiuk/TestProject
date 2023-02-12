package Replits;

public class Replit138 {
    class AnotherClass {
        private String surround(String a, String b) {
            return a.replaceAll("c", "(" + 'c' + ")");
        }

        String surround2(String a, String b) {
            return a.replaceAll("a", "(" + 'a' + ")");
        }

        protected String surround3(String a, String b) {
            return a.replaceAll("b", "(" + 'b' + ")");
        }

        public String surround4(String a, String b) {
            return a.replaceAll("d", "(" + 'd' + ")");
        }
    }
}
