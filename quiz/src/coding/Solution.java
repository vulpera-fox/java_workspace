package coding;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;


class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int min = 0;
        int max = 0;
        
        for ( int i = 1; i <= n; i++ ) {
        	if(n%i==0 && m%i==0) {
        		min = i;
        	}
        }
        for ( int i = m; i <= n*m; i++) {
        	if ( m > n && m % n == 0 ) {
        		max = m;
        		break;
        	} else if ( n > m && n % m == 0 ) {
        		max = n;
        		break;
        	} else if ( n == m ) {
        		max = n;
        		break;
        	}
        	if ( i % n == 0 && i % m == 0 ) {
        		max = i;
        	}
        	
        }
        answer[0] = min;
        answer[1] = max;
        
        return answer;
    }
}