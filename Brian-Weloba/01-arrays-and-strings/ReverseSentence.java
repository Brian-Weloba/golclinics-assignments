import java.util.Arrays;

class ReverseSentence {
    public static void main(String[] args) {
        char[] A = { 't', 'h', 'i', 's', ' ', 'i', 's', ' ', 'g', 'o', 'o', 'd' };
        System.out.println(Arrays.toString(reverseSentence(A))); //['g','o','o','d',' ','i','s',' ','t','h','i','s']
    }

    public static char[] reverseSentence(char[] a) {
        //change input to string
        String sentence = String.valueOf(a);
        //split string at spaces and make string array
        String[] words = sentence.split(" ");
        //reverse the words in the string array
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }
        //join string[] to one string
        String joined = String.join(" ", words);
        //split back to chararray
        return joined.toCharArray();
    }
}