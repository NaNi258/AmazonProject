package office;

public class UniqueChar {

	public void samechar() {

		char[] ch= {'n','a','l','i','n','i'};
		
//		for(int i=0;i<ch.length;i++) {
//			for(int j=i+1;j<ch.length;j++) {
//				if(ch[i]==ch[j]) {
//					System.out.println("duplicate char is: "+ch[j]);
//					break;
//				}
//			}
//		}
		
//		int result = Character.compare(ch[0], ch[4]);
//		if(result==0) {
//			System.out.println("same:"+ch[0]);
//		}else {
//			System.out.println("not same: ");
//		}
		
		
		
		for(int j=0;j<ch.length;j++) {
			int count=1;
			for(int i=j+1;i<ch.length;i++) {
				if(ch[j]==(ch[i])) {
					count++;
					break;
				}
			}
			
			
			if(count>1) {
				
				System.out.println("same:"+ch[j]+"times"+count);
			}
		}
	}

	public static void main(String[] args) {
		//	char[] c= {'n','a','l','i','n','i'};
		//	for(int i=0;i<=c.length-1;i++) {
		//		if(c[i]==c[i+1]) {
		//			System.out.println("same"+c[i]);
		//		}else
		//			System.out.println("not same");
		//	}

		UniqueChar u=new UniqueChar();
		u.samechar();
	}
}
