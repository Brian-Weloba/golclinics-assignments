private ReverseArray {
    public static void main(String[] args) {
        int[] numbers= {1,4,5,2,6,7,8,0,9};
        int[] reversedNumbers = reverseArray(numbers); //{9,0,8,7,6,2,5,4,1}
    }

    public int[] reverseArray(int[] num) {
        for(int i=0; i<num.length/2;i++){
            int temp = num[i];
            num[i] = num[num.length-1-i];
            num[num.length-1-i] = temp;
        } 
        return num;
    }
}