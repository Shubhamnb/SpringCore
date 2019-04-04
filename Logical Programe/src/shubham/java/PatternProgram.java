package shubham.java;

public class PatternProgram {

	public static void main(String[] args) {
			int num=7;
			int l=1;
			for(int i=0;i<(num/2)+1;i++) {
				for(int j=0;j<(num/2-i);j++) {
					System.out.print(" ");
				}
				
				for(int k=0;k<l;k++) {
					System.out.print("*");
				}
				l=l+2;
				System.out.println();
			}
			//System.out.println(num/2+1);
			//l=(num/2)+1;
			l=l-(num/2+1);
			for(int i=0;i<(num/2);i++) {
				for(int j=0;j<=i;j++) {
					System.out.print(" ");
				}
				for(int k=0;k<l;k++) {
					System.out.print("*");
				}
				l=l-2;
				System.out.println();
			}
		}

}
