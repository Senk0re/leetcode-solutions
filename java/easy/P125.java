class P125 {
  public static void main(String[] args) {
    String s = "Was it a car or a cat I saw?";
    System.out.println(isPalindrome(s));
  }

  public static boolean isPalindrome(String s) {
    String ns = "";
    for(int i = 0; i < s.length(); i++) {
     char c = s.charAt(i);
      if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
        ns = ns + Character.toLowerCase(c);
      }
    }

    int left = 0;
    int right = ns.length() - 1;

    while(left < right) {
      if(!(ns.charAt(left) == ns.charAt(right))) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }
}
