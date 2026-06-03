class Solution {
    public String reverseVowels(String s) {
        char [] arr=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end){
        while(start <end && !isvowel(arr[start])){
            start++;
        }
        while(start<end && !isvowel(arr[end])){
            end--;
        }
        char temp=arr[end];
        arr[end]=arr[start];
        arr[start]=temp;
        start++;
        end--;
        
    }
    return new String(arr);
    }
static boolean isvowel(char c){
     c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
}
}