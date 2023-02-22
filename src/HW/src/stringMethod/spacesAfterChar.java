package HW.src.stringMethod;

public class spacesAfterChar {
        String spaceOut (String s) {
            StringBuilder temp = new StringBuilder();
            for ( int i = 0; i < s.length(); i++){
                temp =temp.append(s.charAt(i));
                temp.append(" ");
            }
            return(temp.toString());
        }

        public static void main(String[] args) {
            spacesAfterChar obj = new spacesAfterChar();
            System.out.println(obj.spaceOut("hello"));
        }
    }
