package se.kth.id1201;

public class T9 {
    public class Node{ 
        public Node[] next; 
        public boolean valid; 
        public Node(){ 
            next = new Node[27]; 
            valid = false; 
        } 
    }

    public T9(String filename){

    }

    private static int charToCode(char w){
        switch(w){ 
            case'a':
                return 0;
            case'b':
                return 1;
            case'c':
                return 2;
            case'd':
                return 3;
            case'e':
                return 4;
            case'f':
                return 5;
            case'g':
                return 6;
            case'h':
                return 7;
            case'i':
                return 8;
            case'j':
                return 9;
            case'k':
                return 10;
            case'l':
                return 11;
            case'm':
                return 12;
            case'n':
                return 13;
            case'o':
                return 14;
            case'p':
                return 15;
            case'r':
                return 16;
            case's':
                return 17;
            case't':
                return 18;
            case'u':
                return 19;
            case'v':
                return 20;
            case'x':
                return 21;
            case'y':
                return 22;
            case'z':
                return 23;
            case'å':
                return 24;
            case'ä':
                return 25;
            case'ö':
                return 26;
            default:
                return -1;
        }
    }

    public static class InvalidCharException extends Exception { 
        public InvalidCharException(String errorMessage) {
            super(errorMessage);
        }
    }

    private static char codeToChar(int code) throws InvalidCharException{
        switch(code){
            case 0:
                return 'a';
            case 1:
                return 'b';
            case 2:
                return 'c';
            case 3:
                return 'd';
            case 4:
                return 'e';
            case 5:
                return 'f';
            case 6:
                return 'g';
            case 7:
                return 'h';
            case 8:
                return 'i';
            case 9:
                return 'j';
            case 10:
                return 'k';
            case 11:
                return 'l';
            case 12:
                return 'm';
            case 13:
                return 'n';
            case 14:
                return 'o';
            case 15:
                return 'p';
            case 16:
                return 'r';
            case 17:
                return 's';
            case 18:
                return 't';
            case 19:
                return 'u';
            case 20:
                return 'v';
            case 21:
                return 'x';
            case 22:
                return 'y';
            case 23:
                return 'z';
            case 24:
                return 'å';
            case 25:
                return 'ä';
            case 26:
                return 'ö';
            default:
                throw new InvalidCharException("Invalid code " + Integer.toString(code));
        }
    }

    private static int keyToIndex(char key){
        return Character.getNumericValue(key)-1;
    }

    private static char characterToKey(char character){
        int code = charToCode(character);
        return (char)(code/3 + '1');
    }
}
