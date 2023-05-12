package coding;

import java.util.*;
import java.util.stream.Stream;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
    	int fail = 0;
    	int corr = 0;
    	int fail2 = 0;
    	int corr2 = 0;
    	for ( int i = 0; i < db.length; i++ ) {
    		if ( !id_pw[0].equals(db[i][0]) ){
    			fail++;
    		} else {
    			corr++;
    		} if ( !id_pw[1].equals(db[i][1]) ) {
    			fail2++;
    		} else {
    			corr2++;
    		}
    	}
    	if ( corr >=1 ) {
    		if ( corr2 >= 1 ) {
    			return "login";
    		} else {
    			return "wrong pw";
    		}
    	} else {
    		return "fail";
    	}
}
}