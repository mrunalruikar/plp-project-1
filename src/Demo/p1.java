/*
 * 
 *Mrunal Ruikar: 
 * */
package Demo;

import java.util.ArrayList;
import java.util.Hashtable;
import java.io.*;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * 
 * @author Mrunal
 */
public class p1 {

    public static int counterForInputArray = 0;
    public static int lengthOfFile = 0;
    public static StringBuffer valueOfToken = new StringBuffer();
    public static char[] inputArray;
    public static String typeOfToken;
    public static String integerToken;
    public static String idToken;
    public static String stringToken;
    public static Hashtable kHash = new Hashtable<String, String>();

    public static String getString(ArrayList aList) {
        StringBuilder buf = new StringBuilder();

        for (int i = 0; i < aList.size(); i++) {
            buf.append(i);
        }

        return buf.toString();
    }

    public static void main(String[] args) throws IOException {
        kHash.put("let", "let");
        kHash.put("in", "in");
        kHash.put("fn", "fn");
        kHash.put("within", "within");
        kHash.put("where", "where");
        kHash.put("rec", "rec");
        kHash.put("and", "and");
        kHash.put("aug", "aug");
        kHash.put("or", "or");
        kHash.put("not", "not");
        kHash.put("gr", "gr");
        kHash.put("ge", "ge");
        kHash.put("ls", "ls");
        kHash.put("le", "le");
        kHash.put("eq", "eq");
        kHash.put("ne", "ne");
        kHash.put("true", "true");
        kHash.put("false", "false");
        kHash.put("dummy", "dummy");
        kHash.put("nil", "nil");

       

       
        //System.out.println("args[1]"+args[0]);
        //System.out.println("args[2]"+args[1]);
        //System.out.println("args[3]"+args[2]);
        Staack s = new Staack();

       if (args.length == 2) {
            
            String str = FileRead.readFile(args[1]);

            inputArray = str.toCharArray();
            lengthOfFile = str.length() - 1;

         
       if ((args[0].equalsIgnoreCase("-ast"))) {
            s.E();

            if (Staack.error == 0) {
                s.dis();
            }

        } 
        else if ((args[0].equalsIgnoreCase("-l"))) {
            System.out.println(inputArray);
        } else {
            System.out.println("Invalid Command");

        }
}
        
        if (args.length == 3) {
            //file.open(argv[3], ios::in);
            String str = FileRead.readFile(args[2]);
            // Get length of file:

            inputArray = str.toCharArray();
            lengthOfFile = str.length() - 1;
       

        

        
            if ((args[0].equalsIgnoreCase("-ast"))) {
                s.E();
                if (Staack.error == 0) {
                    s.dis();
                }
            } 
            else if ((args[1].equalsIgnoreCase("-l"))) {
                System.out.println(inputArray);
            } else 
            if ((args[1].equalsIgnoreCase("-noout"))) {
            } else {
                System.out.println("Invalid Command");
            }
        }

        if (args.length > 4 || args.length<2 ) {
            System.out.println("Wrong number of arguments!");

        }
    }


    static void fileScanner() {


        int secPointerForBackup, tempPointer;
        int state = 0;

        boolean mainConditionForOuterWhile = true;

        while (mainConditionForOuterWhile) {
            if (counterForInputArray >= lengthOfFile) {
                break;
            }
            switch (state) {
                case 0:
                    switch (inputArray[counterForInputArray]) {
                        case ' ':
                        case '\t':
                        case '\n':
                        case '\r':

                            state = 0;

                            mainConditionForOuterWhile = true;


                            counterForInputArray++;

                            break;

                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':

                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'T':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                            valueOfToken.setLength(0);


                            state = 1;
                            secPointerForBackup = 0;


                            valueOfToken.append(inputArray[counterForInputArray]);
                            secPointerForBackup++;

                            counterForInputArray++;


                            if (counterForInputArray == lengthOfFile) {
                                typeOfToken = "id";
                                idToken = valueOfToken.toString();
                                mainConditionForOuterWhile = false;
                            } else {
                                mainConditionForOuterWhile = true;
                            }
                            break;

                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            valueOfToken.setLength(0);


                            state = 2;
                            secPointerForBackup = 0;


                            valueOfToken.append(inputArray[counterForInputArray]);
                            integerToken = valueOfToken.toString();
                            typeOfToken = "integer";
                            secPointerForBackup++;

                            //System.out.println();
                            counterForInputArray++;


                            if (counterForInputArray == lengthOfFile) { //mruikar
                                
                                mainConditionForOuterWhile = false;
                            }
                            break;

                        case '+':
                        case '<':
                        case '>':
                        case '&':
                        case '.':
                        case '@':
                        case '?':
                        case ':':
                        case '=':
                        case '~':
                        case '|':
                        case '$':
                        case '!':
                        case '#':
                        case '%':
                        case '^':
                        case '_':
                        case '[':
                        case ']':
                        case '{':
                        case '}':
                        case '`':

                            valueOfToken.setLength(0);


                            state = 3;
                            secPointerForBackup = 0;


                            valueOfToken.append(inputArray[counterForInputArray]);
                            if (inputArray[counterForInputArray] == '+') {
                                typeOfToken = "+";
                            }
                            if (inputArray[counterForInputArray] == '<') {
                                typeOfToken = "<";
                            }
                            if (inputArray[counterForInputArray] == '>') {
                                typeOfToken = ">";
                            }
                            if (inputArray[counterForInputArray] == '&') {
                                typeOfToken = "&";
                            }
                            if (inputArray[counterForInputArray] == '.') {
                                typeOfToken = ".";
                            }
                            if (inputArray[counterForInputArray] == '@') {
                                typeOfToken = "@";
                            }
                            if (inputArray[counterForInputArray] == '?') {
                                typeOfToken = "?";
                            }
                            if (inputArray[counterForInputArray] == ':') {
                                typeOfToken = ":";
                            }
                            if (inputArray[counterForInputArray] == '=') {
                                typeOfToken = "=";
                            }
                            if (inputArray[counterForInputArray] == '~') {
                                typeOfToken = "~";
                            }
                            if (inputArray[counterForInputArray] == '|') {
                                typeOfToken = "|";
                            }
                            if (inputArray[counterForInputArray] == '$') {
                                typeOfToken = "$";
                            }
                            if (inputArray[counterForInputArray] == '!') {
                                typeOfToken = "!";
                            }
                            if (inputArray[counterForInputArray] == '#') {
                                typeOfToken = "#";
                            }
                            if (inputArray[counterForInputArray] == '%') {
                                typeOfToken = "%";
                            }
                            if (inputArray[counterForInputArray] == '_') {
                                typeOfToken = "_";
                            }
                            if (inputArray[counterForInputArray] == '^') {
                                typeOfToken = "^";
                            }
                            if (inputArray[counterForInputArray] == '[') {
                                typeOfToken = "[";
                            }
                            if (inputArray[counterForInputArray] == ']') {
                                typeOfToken = "]";
                            }
                            if (inputArray[counterForInputArray] == '{') {
                                typeOfToken = "{";
                            }
                            if (inputArray[counterForInputArray] == '}') {
                                typeOfToken = "}";
                            }
                            if (inputArray[counterForInputArray] == '`') {
                                typeOfToken = "`";
                            }

                            secPointerForBackup++;


                            counterForInputArray++;

                            if (inputArray[counterForInputArray - 1] == '<' && inputArray[counterForInputArray] == '=') {
                                typeOfToken = "<=";
                                counterForInputArray++;
                            }
                            if (inputArray[counterForInputArray - 1] == '>' && inputArray[counterForInputArray] == '=') {
                                typeOfToken = ">=";
                                counterForInputArray++;
                            }


                            if (counterForInputArray == lengthOfFile) {
                                mainConditionForOuterWhile = false;
                            } else {
                                mainConditionForOuterWhile = true;
                            }
                            break;

                        case '-':
                            valueOfToken.setLength(0);


                            state = 3;
                            secPointerForBackup = 0;


                            valueOfToken.append(inputArray[counterForInputArray]);

                            typeOfToken = "-";
                            secPointerForBackup++;


                            counterForInputArray++;
                            if (inputArray[counterForInputArray] == '>') {


                                state = 8;


                                valueOfToken.append(inputArray[counterForInputArray]);

                                typeOfToken = "->";


                                counterForInputArray++;
                                secPointerForBackup++;
                            }



                            if (counterForInputArray == lengthOfFile) {
                                if (state == 8) {
                                    mainConditionForOuterWhile = false;
                                } else {
                                    mainConditionForOuterWhile = false;
                                }
                            } else {
                                mainConditionForOuterWhile = true;
                            }
                            break;

                        case '*':
                            valueOfToken.setLength(0);


                            state = 3;
                            secPointerForBackup = 0;


                            valueOfToken.append(inputArray[counterForInputArray]);
                            typeOfToken = "*";
                            secPointerForBackup++;


                            counterForInputArray++;

                            if (inputArray[counterForInputArray] == '*') {


                                state = 7;


                                valueOfToken.append(inputArray[counterForInputArray]);

                                typeOfToken = "**";


                                counterForInputArray++;
                                secPointerForBackup++;
                            }



                            if (counterForInputArray == lengthOfFile) {
                                if (state == 7) {
                                    mainConditionForOuterWhile = false;
                                } else {
                                    mainConditionForOuterWhile = false;
                                }
                            } else {
                                mainConditionForOuterWhile = true;
                            }
                            break;

                        case '\'':
                            valueOfToken.setLength(0);
                            secPointerForBackup = 0;


                            valueOfToken.append(inputArray[counterForInputArray]);
                            secPointerForBackup++;


                            counterForInputArray++;
                            tempPointer = counterForInputArray;
                            while (inputArray[counterForInputArray] != '\'') {
                                if (inputArray[counterForInputArray] == '\t'
                                        || inputArray[counterForInputArray] == '\n'
                                        || inputArray[counterForInputArray] == '\\'
                                        || inputArray[counterForInputArray] == '\"'
                                        || inputArray[counterForInputArray] == '('
                                        || inputArray[counterForInputArray] == ']'
                                        || inputArray[counterForInputArray] == ';'
                                        || inputArray[counterForInputArray] == ','
                                        || (inputArray[counterForInputArray] >= 'a' && inputArray[counterForInputArray] <= 'z')
                                        || (inputArray[counterForInputArray] >= '0' && inputArray[counterForInputArray] <= '9')
                                        || inputArray[counterForInputArray] == '+'
                                        || inputArray[counterForInputArray] == '-'
                                        || inputArray[counterForInputArray] == '*'
                                        || inputArray[counterForInputArray] == '<'
                                        || inputArray[counterForInputArray] == '>'
                                        || inputArray[counterForInputArray] == '&'
                                        || inputArray[counterForInputArray] == '.'
                                        || inputArray[counterForInputArray] == '@'
                                        || inputArray[counterForInputArray] == '?'
                                        || inputArray[counterForInputArray] == ':'
                                        || inputArray[counterForInputArray] == '='
                                        || inputArray[counterForInputArray] == '~'
                                        || inputArray[counterForInputArray] == '|'
                                        || inputArray[counterForInputArray] == '$'
                                        || inputArray[counterForInputArray] == '!'
                                        || inputArray[counterForInputArray] == '#'
                                        || inputArray[counterForInputArray] == '%'
                                        || inputArray[counterForInputArray] == '^'
                                        || inputArray[counterForInputArray] == ' '
                                        || inputArray[counterForInputArray] == '_'
                                        || inputArray[counterForInputArray] == '['
                                        || inputArray[counterForInputArray] == ')'
                                        || inputArray[counterForInputArray] == '{'
                                        || inputArray[counterForInputArray] == '}'
                                        || inputArray[counterForInputArray] == '`'
                                        || (inputArray[counterForInputArray] >= 'A' && inputArray[counterForInputArray] <= 'Z')) {


                                    valueOfToken.append(inputArray[counterForInputArray]);


                                    counterForInputArray++;
                                    secPointerForBackup++;
                                    if (counterForInputArray == lengthOfFile) {
                                        break;

                                    }
                                }

                            }



                            if (counterForInputArray == lengthOfFile) {

                                tempPointer = counterForInputArray;
                                state = 3;
                            } else if (inputArray[counterForInputArray] == '\'') {
                                typeOfToken = "string";

                                valueOfToken.append(inputArray[counterForInputArray]);// token_val[j]=input[pointer];
                                mainConditionForOuterWhile = true;// 1;


                                state = 6;
                            } else {
                                System.out.println("error");
                                counterForInputArray = tempPointer;
                            }
                            break;

                        case '/':
                            valueOfToken.setLength(0);


                            state = 3;
                            secPointerForBackup = 0;


                            valueOfToken.append(inputArray[counterForInputArray]);
                            typeOfToken = "/";
                            secPointerForBackup++;


                            counterForInputArray++;
                            if (inputArray[counterForInputArray] == '/') {
                                do {

                                    state = 4;


                                    valueOfToken.append(inputArray[counterForInputArray]);


                                    counterForInputArray++;
                                    secPointerForBackup++;
                                    if (counterForInputArray == lengthOfFile - 1) {
                                        break;
                                    }
                                } while (inputArray[counterForInputArray] != '\n');
                            }



                            if (counterForInputArray == lengthOfFile) {
                                if (state == 4) {
                                    mainConditionForOuterWhile = false;
                                } else {
                                    mainConditionForOuterWhile = false;
                                }
                            }

                            if (inputArray[counterForInputArray] == '\n') {


                                counterForInputArray++;
                                secPointerForBackup++;
                            }
                            break;

                        case '(':
                        case ')':
                        case ';':
                        case ',':
                            valueOfToken.setLength(0);


                            state = 5;
                            secPointerForBackup = 0;


                            valueOfToken.append(inputArray[counterForInputArray]);
                            if (inputArray[counterForInputArray] == '(') {
                                typeOfToken = "(";
                            }
                            if (inputArray[counterForInputArray] == ')') {
                                typeOfToken = ")";
                            }
                            if (inputArray[counterForInputArray] == ';') {
                                typeOfToken = ";";
                            }
                            if (inputArray[counterForInputArray] == ',') {
                                typeOfToken = ",";
                            }
                            secPointerForBackup++;


                            counterForInputArray++;



                            if (counterForInputArray == lengthOfFile) {
                                mainConditionForOuterWhile = false;
                            } else {
                                mainConditionForOuterWhile = true;
                            }
                            break;

                        default:

                            counterForInputArray++;

                    }
                    break;

                case 1:
                    while ((inputArray[counterForInputArray] >= 'a' && inputArray[counterForInputArray] <= 'z')
                            || (inputArray[counterForInputArray] >= 'A' && inputArray[counterForInputArray] <= 'Z')
                            || (inputArray[counterForInputArray] >= '0' && inputArray[counterForInputArray] <= '9')
                            || (inputArray[counterForInputArray] == '_')) {
                        state = 1;



                        valueOfToken.append(inputArray[counterForInputArray]);

                        counterForInputArray++;
                        if (counterForInputArray == lengthOfFile) {
                            break;
                        }
                    }

                    if (kHash.contains(valueOfToken.toString())) {
                        typeOfToken = valueOfToken.toString();
                        mainConditionForOuterWhile = false;
                        break;

                    }
                    if (!kHash.contains(valueOfToken.toString())) {
                        typeOfToken = "id";
                        idToken = valueOfToken.toString();
                    }

                    state = 0;

                    mainConditionForOuterWhile = false;

                    break;

                case 2:
                    while (inputArray[counterForInputArray] >= '0' && inputArray[counterForInputArray] <= '9') {
                        state = 2;


                        valueOfToken.append(inputArray[counterForInputArray]);



                        counterForInputArray++;
                    }
                    integerToken = valueOfToken.toString();
                    typeOfToken = "integer";


                    mainConditionForOuterWhile = false;


                    state = 0;
                    break;

                case 3:

                    mainConditionForOuterWhile = false;


                    state = 0;
                    break;

                case 4:

                    mainConditionForOuterWhile = true;


                    state = 0;
                    break;

                case 5:

                    mainConditionForOuterWhile = false;


                    state = 0;
                    break;

                case 6:

                    counterForInputArray++;

                    stringToken = valueOfToken.toString();


                    state = 0;


                    mainConditionForOuterWhile = false;
                    break;

                case 7:

                    state = 0;


                    mainConditionForOuterWhile = false;
                    break;

                case 8:

                    state = 0;


                    mainConditionForOuterWhile = false;
                    break;

                default:
                    mainConditionForOuterWhile = false;


                    counterForInputArray++;
            }

        }
    }
}// end of class Demo main

class Node {

    String data;
    Node lptr;
    Node rptr;
    Node next;
    Node back;
}// end of Node Class

class Staack {

    public static int error = 0;

    public Node createnode(String x) {
        Node n = new Node();
        n.data = x;
        n.lptr = null;
        n.rptr = null;
        n.next = null;
        n.back = null;;
        return n;
    }
    Node head = null;
    Node top = null;

    public Staack() {
        head = new Node();
        head.data = "0";
        head.back = null;
        head.lptr = null;
        head.next = null;
        head.rptr = null;
        top = head;
    }

    void buildtree(String x, int n) {
        // System.out.println("Call to buildtree");
        if (x.equalsIgnoreCase("Let")) {
            // System.out.println("Let in build tree");
        }

        Node n1;
        Node n2;
        Node temp = new Node();
        int u = n;
        int flag = 0;
        temp = top;
        while (u != 1) {
            temp = temp.back;
            if (temp == head) {
                flag = 1;
                break;
            }
            u--;
        }
        if (flag == 1) {
            // Bad treecall
        } else {
            for (int i = 1; i <= n - 1; i++) {
                n1 = pop();
                n2 = pop();
                
                n2.rptr = n1;
                push(n2);
            }
            n2 = createnode(x);
            n1 = pop();
            
            n2.lptr = n1;
            push(n2);
        }

    }

    void push(Node n) {
        
        n.back = top;
        top.next = n;
        top = n;
    }

    
    boolean isempty() {
        if (top == head) {
            return true;
        }
        return false;
    }

    
    Node pop() {
        if (!isempty()) {
            Node temp = new Node();

            temp.data = top.data;
            temp.lptr = top.lptr;
            temp.rptr = top.rptr;
            temp.next = null;
            temp.back = null;
            top = top.back;
            top.next = null;


            return temp;

        } else {
           
            return null;
        }
    }

    boolean check_token_type() {
        if (p1.counterForInputArray > p1.lengthOfFile) {
            return false;
        }
        if (p1.typeOfToken.equalsIgnoreCase("id")
                || p1.typeOfToken.equalsIgnoreCase("integer")
                || p1.typeOfToken.equalsIgnoreCase("true")
                || p1.typeOfToken.equalsIgnoreCase("false")
                || p1.typeOfToken.equalsIgnoreCase("string")
                || p1.typeOfToken.equalsIgnoreCase("dummy")
                || p1.typeOfToken.equalsIgnoreCase("(")
                || p1.typeOfToken.equalsIgnoreCase("nil")) {
            return true;
        }
        return false;
    }

    void preorder(Node n, String dot) {
        if (n != null) {
            System.out.println(dot + n.data);
            preorder(n.lptr, dot + ".");
            preorder(n.rptr, dot);
        }
    }

    void dis() {
        this.preorder(this.top, "");
    }

    void A() {
        String temp;

        if (p1.typeOfToken.equalsIgnoreCase("+")) {

            if (p1.counterForInputArray < p1.lengthOfFile) {
                p1.fileScanner();
            }
            if (check_token_type()) {
                this.At(p1.typeOfToken);
            } else {
                System.out.println("Identifier || Integer || string || true || false || nil || ( || dummy  wanted but "
                        + p1.valueOfToken + "found");

                error = 1;
            }

        } else if (p1.typeOfToken.equalsIgnoreCase("-")) {
            if (p1.counterForInputArray < p1.lengthOfFile) {
                p1.fileScanner();
            }
            if (check_token_type()) {
                this.At(p1.typeOfToken);
                buildtree("neg", 1);
            } else {
                System.out.println("Identifier || Integer || string || true || false || nil || ( || dummy  wanted but "
                        + p1.valueOfToken + "found");
                error = 1;
            }

        } else {
            this.At(p1.typeOfToken);
        }

        while ((p1.typeOfToken.equalsIgnoreCase("+") || p1.typeOfToken.equalsIgnoreCase("-")) && (p1.counterForInputArray <= p1.lengthOfFile)) {
            temp = p1.typeOfToken;
            if (p1.counterForInputArray < p1.lengthOfFile) {
                p1.fileScanner();
            }
            if (check_token_type()) {
                this.At(p1.typeOfToken);
                buildtree(temp, 2);
            } else {
                System.out.println("Identifier || Integer || string || true || false || nil || ( || dummy  wanted but "
                        + p1.valueOfToken + " found");
                error = 1;
            }
        }

    }

    void At(String l) {
        String temp;
        this.Af(l);

        while ((p1.typeOfToken.equalsIgnoreCase("*") || p1.typeOfToken.equalsIgnoreCase("/")) && (p1.counterForInputArray <= p1.lengthOfFile)) {
            temp = p1.typeOfToken;
            if (p1.counterForInputArray < p1.lengthOfFile) {
                p1.fileScanner();
            }
            if (check_token_type()) {
                this.Af(p1.typeOfToken);
                buildtree(temp, 2);
            } else {
                System.out.println("Identifier || Integer || string || true || false || nil || ( || dummy  wanted but "
                        + p1.valueOfToken + "found");
                error = 1;
            }
        }
    }

    void Af(String l) {
        this.Ap(l);
        if (p1.typeOfToken.equalsIgnoreCase("**")) {
            if (p1.counterForInputArray < p1.lengthOfFile) {
                p1.fileScanner();
            }
            if (check_token_type()) {
                Af(p1.typeOfToken);
                buildtree("**", 2);
            } else {
                System.out.println("Identifier || Integer || string || true || false || nil || ( || dummy  wanted but "
                        + p1.valueOfToken + "found");

                error = 1;
            }
        }
    }

    void Ap(String l) {
        Node w;
        this.R(l);
        while (p1.typeOfToken.equalsIgnoreCase("@")
                && (p1.counterForInputArray <= p1.lengthOfFile)) {
            if (p1.counterForInputArray < p1.lengthOfFile) {
                p1.fileScanner();
            }

            if (!p1.typeOfToken.equalsIgnoreCase("id")) {
                System.out.println("identifier expected after @ but"
                        + p1.valueOfToken + "was found");

                error = 1;
            }
            w = this.createnode("<ID:" + p1.idToken + ">");
            // this.push(w);
            this.push(w);
            if (p1.counterForInputArray < p1.lengthOfFile) {
                p1.fileScanner();
            }
            if (check_token_type()) {
                this.R(p1.typeOfToken);
                buildtree("@", 3);
            } else {
                System.out.println("Identifier || Integer || string || true || false || nil || ( || dummy  wanted but "
                        + p1.valueOfToken + "found");

                error = 1;
            }
        }
    }

    void R(String l) {
        this.Rn(l);
        if (p1.counterForInputArray < p1.lengthOfFile) {
            p1.fileScanner();
            while (check_token_type() && (p1.counterForInputArray <= p1.lengthOfFile)) {
                // System.out.println("In While");
                // System.out.println("check_token_type() " + check_token_type());
                // System.out.println("(DemoMain.pointer <= DemoMain.length) "
                //  + (DemoMain.pointer <= DemoMain.length));
                Rn(p1.typeOfToken);
                // System.out.println("Gamma build tree called 983");
                buildtree("gamma", 2);
                if (p1.counterForInputArray == p1.lengthOfFile) {
                    p1.counterForInputArray = p1.counterForInputArray + 1;
                    //DemoMain.token_val.setLength(0);
                }
                if (p1.counterForInputArray < p1.lengthOfFile) {
                    p1.fileScanner();
                }
            }
        }

    }

    void Rn(String l) {
        // Node w;
        Node w;//= new Node();
        if (p1.typeOfToken.equalsIgnoreCase("id")) {
            w = this.createnode("<ID:" + p1.idToken + ">");
            // this.push(w);
            this.push(w);
        } else if (p1.typeOfToken.equalsIgnoreCase("integer")) {
            w = this.createnode("<INT:" + p1.integerToken + ">");
            // this.push(w);
            this.push(w);
        } else if (p1.typeOfToken.equalsIgnoreCase("string")) {
            w = this.createnode("<STR:" + p1.stringToken + ">");
            // this.push(w);
            this.push(w);
        } else if (p1.typeOfToken.equalsIgnoreCase("(")
                && (p1.counterForInputArray < p1.lengthOfFile)) {
            E();
        } else if (p1.typeOfToken.equalsIgnoreCase("true")) {

            w = this.createnode("<true>");
            // this.push(w);
            this.push(w);
        } else if (p1.typeOfToken.equalsIgnoreCase("false")) {
            w = this.createnode("<false>");
            // this.push(w);
            this.push(w);
        } else if (p1.typeOfToken.equalsIgnoreCase("nil")) {
            w = this.createnode("<nil>");
            // this.push(w);
            this.push(w);
        } else if (p1.typeOfToken.equalsIgnoreCase("dummy")) {
            w = this.createnode("<dummy>");
            // this.push(w);
            this.push(w);
        } else {
            // System.out.print("");
        }

    }

    void E() {
        // System.out.println("_____________________ Start of E");
        int p = 0;

        if (p1.counterForInputArray < p1.lengthOfFile) {
            p1.fileScanner();

            if (p1.typeOfToken.equalsIgnoreCase("let")) {
                D();
                if (p1.typeOfToken.equalsIgnoreCase("in")) {
                    //     System.out.println("First recurssive E call");
                    E();
                    //    System.out.println("First recurssive E call returned");
                    buildtree("let", 2);
                } else {
                    System.out.println("Keyword 'in' is expected but "
                            + p1.valueOfToken + " found ");
                    error = 1;
                }

            } // Function Definition
            else if (p1.typeOfToken.equalsIgnoreCase("fn")) {
                if (p1.counterForInputArray < p1.lengthOfFile) {
                    p1.fileScanner();
                }
                while (!p1.typeOfToken.equalsIgnoreCase(".")) {
                    Vb();
                    p++;
                    if (p1.counterForInputArray < p1.lengthOfFile) {
                        p1.fileScanner();
                    }
                    if (p1.counterForInputArray > p1.lengthOfFile) {
                        break;
                    }
                }

                E();

                buildtree("lambda", p + 1);

            } else {
                ///    System.out.println("Danger 3 " + DemoMain.pointer);
                Ew();
            }

        }
        // System.out.println("_____________________ End of E()" + DemoMain.pointer);
    }

    void Ew() {
        T();

        if (p1.typeOfToken.equalsIgnoreCase("where")) {
            Dr();
            buildtree("where", 2);
        }
    }

    void T() {
        int p = 1;
        Ta();

        while (p1.typeOfToken.equalsIgnoreCase(",")) {

            if (p1.counterForInputArray < p1.lengthOfFile) {
                p1.fileScanner();
            }
            Ta();
            p++;
        }
        if (p > 1) {
            buildtree("tau", p);
        }

    }

    void Ta() {
        Tc();
        while (p1.typeOfToken.equalsIgnoreCase("aug")) {
            if (p1.counterForInputArray < p1.lengthOfFile) {
                p1.fileScanner();
            }
            Tc();
            buildtree("aug", 2);
        }
    }

    void Tc() {
        B();
        if (p1.typeOfToken.equalsIgnoreCase("->")) {
            p1.fileScanner();
            Tc();
            if (p1.typeOfToken.equalsIgnoreCase("|")) {
                p1.fileScanner();
                Tc();
                buildtree("->", 3);
            } else {
                System.out.println("'|'  Expected but '" + p1.valueOfToken
                        + "was found");

                error = 1;
            }
        }
    }

    void B() {
        Bt();
        while (p1.typeOfToken.equalsIgnoreCase("or")) {
            if (p1.counterForInputArray < p1.lengthOfFile) {
                p1.fileScanner();
            }
            Bt();
            buildtree("or", 2);
        }

    }

    void Bt() {
        Bs();
        while (p1.typeOfToken.equalsIgnoreCase("&")) {
            if (p1.counterForInputArray < p1.lengthOfFile) {
                p1.fileScanner();
            }
            Bs();
            buildtree("&", 2);
        }

    }

    void Bs() {

        if (p1.typeOfToken.equalsIgnoreCase("not")) {
            if (p1.counterForInputArray < p1.lengthOfFile) {
                p1.fileScanner();
            }
            Bp();
            buildtree("not", 1);
        } else {
            Bp();
        }

    }

    void Bp() {

        String temp;
        A();
        if (p1.typeOfToken.equalsIgnoreCase("eq")
                || p1.typeOfToken.equalsIgnoreCase("gr")
                || p1.typeOfToken.equalsIgnoreCase("ls")
                || p1.typeOfToken.equalsIgnoreCase("le")
                || p1.typeOfToken.equalsIgnoreCase("ge")
                || p1.typeOfToken.equalsIgnoreCase("ne")
                || p1.typeOfToken.equalsIgnoreCase("<=")
                || p1.typeOfToken.equalsIgnoreCase(">=")
                || p1.typeOfToken.equalsIgnoreCase("<")
                || p1.typeOfToken.equalsIgnoreCase(">")) {
            temp = p1.typeOfToken;
            if (p1.counterForInputArray < p1.lengthOfFile) {
                p1.fileScanner();
            }
            A();
            buildtree(temp, 2);
        }

    }

    void D() {
        Da();

        if (p1.typeOfToken.equalsIgnoreCase("within")) {
            D();
            buildtree("within", 2);
        }
    }

    void Da() {
        int daCounter = 1;

        Dr();

        while (p1.typeOfToken.equalsIgnoreCase("and")) {
            Dr();
            daCounter++;
        }

        if (daCounter > 1) {
            buildtree("and", daCounter);
        }
    }

    void Dr() {

        Db();
        if (p1.typeOfToken.equalsIgnoreCase("rec")) {
            Db();
            buildtree("rec", 1);
        }

    }

    void Db() {
        Node x;
        int p = 0;
        if (p1.counterForInputArray < p1.lengthOfFile) {
            p1.fileScanner();
        }

        if (p1.typeOfToken.equalsIgnoreCase("id")) {
            x = this.createnode("<ID:" + p1.idToken + ">");
            this.push(x);
            if (p1.counterForInputArray < p1.lengthOfFile) {
                p1.fileScanner();
            }
            if (p1.typeOfToken.equalsIgnoreCase(",")) {
                Vl();
                E();
                buildtree("=", 2);
            } else {
                while (!p1.typeOfToken.equalsIgnoreCase("=")) {
                    Vb();
                    p++;
                    if (p1.counterForInputArray < p1.lengthOfFile) {
                        p1.fileScanner();
                    }
                }
                E();
                if (p > 0) {
                    buildtree("function_form", p + 2);
                } else {
                    buildtree("=", 2);
                }
            }
        }

        if (p1.typeOfToken.equalsIgnoreCase("(")) {
            D();
            if (p1.counterForInputArray < p1.lengthOfFile) {
                p1.fileScanner();
            }
        }
    }

    void Vl() {
        int vlCounter = 1;
        Node w;
        while (p1.typeOfToken.equalsIgnoreCase(",")) {
            if (p1.counterForInputArray < p1.lengthOfFile) {
                p1.fileScanner();
            }
            if (p1.typeOfToken.equalsIgnoreCase("id")) {
                w = this.createnode("<ID:" + p1.idToken + ">");
                this.push(w);
                vlCounter++;
            } else {
                System.out.println("Identifier expected but "
                        + p1.valueOfToken + " was found");

                error = 1;
            }
            if (p1.counterForInputArray < p1.lengthOfFile) {
                p1.fileScanner();
            }
            if (p1.counterForInputArray > p1.lengthOfFile) {
                break;
            }
        }
        if (vlCounter > 1) {
            buildtree(",", vlCounter);
        }
    }

    void Vb() {
        Node w;

        if (p1.typeOfToken.equalsIgnoreCase("id")) {
            w = this.createnode("<ID:" + p1.idToken + ">");
            this.push(w);
        } else if (p1.typeOfToken.equalsIgnoreCase("(")) {
            if (p1.counterForInputArray < p1.lengthOfFile) {
                p1.fileScanner();
            }
            if (p1.typeOfToken.equalsIgnoreCase("id")) {
                w = this.createnode("<ID:" + p1.idToken + ">");
                this.push(w);

                if (p1.counterForInputArray < p1.lengthOfFile) {
                    p1.fileScanner();
                }
                if (p1.typeOfToken.equalsIgnoreCase(",")) {
                    Vl();
                }
            } else if (p1.typeOfToken.equalsIgnoreCase(")")) {
                w = this.createnode("()");
                this.push(w);
            } else {
                System.out.println("Identifier ')' Expected but "
                        + p1.valueOfToken + " was found");

                error = 1;
            }

        } else {
            System.out.println("Identifier '(' Expected but "
                    + p1.valueOfToken + " was found");

            error = 1;
        }

    }
}// End of Stack Class

class FileRead {
//
//    public void fileReader() {
//        File file = new File("C:/filemru.txt");
//        int ch;
//        StringBuilder strContent = new StringBuilder("");
//        FileInputStream fin = null;
//        try {
//            fin = new FileInputStream(file);
//            while ((ch = fin.read()) != -1) {
//                strContent.append((char) ch);
//            }
//            fin.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        System.out.println(strContent.toString());
//    }

    public static String readFile(String path) throws IOException {
        FileInputStream stream = new FileInputStream(new File(path));
        try {
            FileChannel fc = stream.getChannel();
            MappedByteBuffer bb = fc.map(FileChannel.MapMode.READ_ONLY, 0,
                    fc.size());
            /* Instead of using default, pass in a decoder. */
            return Charset.defaultCharset().decode(bb).toString();
        } finally {
            stream.close();
        }
    }
}