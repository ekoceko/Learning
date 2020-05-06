package LogicTests.CrackingTheInterview;

public class URLify {
    public static void main(String args[]){

        //Write a method to replace all spaces in a string with '%20: You may assume that the string
        //has sufficient space at the end to hold the additional characters, and that you are given the "true"
        //length of the string. (Note: If implementing in Java, please use a character array so that you can
        //perform this operation in place.)

        /*
            
        void replaceSpaces(char[] str, int trueLength) {
            int spaceCount = e, index, i = ej
            for (i = ej i < trueLengthj i++) {
                if (str[i] == ' ') {

                    spacecount++;
                }
            }
            index = trueLength + spaceCount * 2j
            if (trueLength < str.length) str[trueLength]
            for (i = trueLength - Ij i )= ej i --) {
            }
            if (str[i] == ' ') {
                str[index - 1] '6';
                str[index - 2] = ' 2';
                str[index - 3] = '%';
                i ndex = index - 3;
            } else {
            }
            str[index - 1] = str[i];
            index--;

         */




        //look for spaces
        //when found, look for space size.
        //move every item to right from the position+1. +2 size for each space
        //add %20 for those empty spaces


    }

    public static String urlify(String string){
        char[] chars = string.toCharArray();

        for (int i = 0; i<=chars.length-1;i++){
            if (chars[i] == ' '){
                int spaceCount = checkSpaceSize(chars,i);
                moveElements(chars,i+1,spaceCount);
                add20(i);
            }


        }



        return "ekrem";
    }

    private static void add20(int i) {
    }

    private static void moveElements(char[] chars, int i, int spaceCount) {
    }

    private static int checkSpaceSize(char[] chars, int i) {
        int spaceCount = 1;
        for (int k = chars[i+1]; k< chars.length-1;k++){
            if (chars[k] == ' '){
                spaceCount++;
                if (k==chars.length-1){
                    return -1;
                }
            }
        }


        return spaceCount;
    }
}
