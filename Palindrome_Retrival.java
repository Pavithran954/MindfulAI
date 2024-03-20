public class Main
{
	public static void main(String[] args) {
		String[] str={"abc","aba","aaaa","cbc"};
		String word =" ";
		for(int i=0;i<str.length;i++){
		    StringBuilder reverse = new StringBuilder(str[i]);
		    StringBuilder reversed = reverse.reverse();
		    if(str[i].equals(reversed.toString())){
		        word =str[i];
		        break;
		    }
		}System.out.println(word);
	}
}