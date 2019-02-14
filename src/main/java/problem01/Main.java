package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			/*
			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				
			        System.out.print( "짝" );
			    
			}
			
			System.out.println( "" );
			*/
		}
	}
	
	public static int countClap(int number) {
		
		    String strCnt = String.valueOf(number); // 문자열 변환
		    
		    for (int i = 0; i < strCnt.length(); i++) {
		        char chk = strCnt.charAt(i);
		        // 해당 수의 앞에서부터 i번째 숫자부터 검사
		        if (chk == '3' || chk == '6' || chk == '9') {
		            // 3 6 9 해당되면 짝 출력
		        	System.out.print(strCnt + " ");
		        }
		        
		        if (chk == '3' || chk == '6' || chk == '9') {
		            // 3 6 9 해당되면 짝 출력
		            System.out.println("짝");
		        }
		    }
		return 0;
	
}
}