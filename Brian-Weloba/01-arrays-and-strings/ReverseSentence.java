class ReverseSentence {
    public static void main(String[] args) {
        char[] A = { 't', 'h', 'i', 's', ' ', 'i', 's', ' ', 'g', 'o', 'o', 'd' };
        reverseSentence(A);// ['g','o','o','d',' ','i','s',' ','t','h','i','s']
    }

    public static String[] reverseSentence(char[] a) {
        String sentence = String.valueOf(a);
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }

    }
}