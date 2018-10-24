package java_plus;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
	3.정규식(regular Expression)- Pattern, Match
	
	-텍스트 데이터 중에서 원하는 조건(패턴,pattern)과 일치하는 문자열을 찾아내기 위해
	 사용하는것, 정규식을 이용하면 많은 양의 택스트 파일 중에서 원하는 데이터를 손쉽게 뽑아
	 낼수 있다. 또한 입력된 데이터가 형식에 맞는지 체크도 할 수도 있다.	 
*/
public class Chap12_3_Util_Regex {
	public static void main(String[] args) {
		String[] data ="bat,baby,bonus,cA,ca,co,c.,c0,c#,car,combat,count,date,disc".split(",");
		/*
		=========================================================================================
		정규식 패턴				설명							결과
		=========================================================================================
		c[a-z]*					c로 시작하는 영어단어			c,ca,co,car,combat,count,ca,co
		-----------------------------------------------------------------------------------------
		c[a-z]					c로 시작하는 두자리 영어단어	ca,co
		-----------------------------------------------------------------------------------------		
		c[a-zA-Z]				c로 시작하는 두자리 영어단어	cA,ca,co
								(대소문자 구분안함)
		-----------------------------------------------------------------------------------------		
		c[a-zA-Z0-9]c\w			c로 시작하고 숫자와 영어로		cA,ca,co,c0 
								조합된 두 글자
		-----------------------------------------------------------------------------------------		
		.*						모든 문자열						(all)
		-----------------------------------------------------------------------------------------		
		c.						c로 시작하는 두자리				cA,ca,co,c.,c#
		-----------------------------------------------------------------------------------------		
		c.*						c로 시작하는 모든 문자열(기호+) cA,ca,co,c.,c0,c#,car,combat,count
		-----------------------------------------------------------------------------------------		
		c\.						c.와 일치하는 문자열'.'은 패턴	c.
								작성에 사용되는 문자이므로
								escape문자인 '\'를 사용해야한다
		-----------------------------------------------------------------------------------------		
		c\d	= c[0-9]			c와 숫자로 구성된 두자리문자열	c0
		-----------------------------------------------------------------------------------------		
		c.*t					c로시작하고 t로 끝나는 			combat,count
								모든문자열
		-----------------------------------------------------------------------------------------	
		[b|c].* = [bc].* 		b 또는 c로 시작하는 문자열		bat,baby,bonus,c,cA,ca,co,c.,c0,
				= [b-c].*										c#,car,combat,count
		-----------------------------------------------------------------------------------------		
		[^b|c].* = [^bc].*		b 또는 c로 시작하지않는 문자열  date,disc
				 = [^b-c].*
		-----------------------------------------------------------------------------------------				 
		.*a.*					a를 포함하는 모든 문자열		bat,baby,ca,car,combat,date
								* : 0 또는 그이상의 문자열
		-----------------------------------------------------------------------------------------		
		.*a.+					a를 포함하는 모든 문자열		bat,baby,car,combat,date
								+ : 1 또는 그이상의 문자열
				(반드시 하나 이상의 문자가 존재	하여야 하므로
				a 로 끝나는 단어는 포함되지 않는다.)
		-----------------------------------------------------------------------------------------
		[b|c].{2}				b 또는 c로 시작하는 세자리		bat,car
								문자열(b 또는 c 다음에 두자리
								이므로 총 세자리)
		=========================================================================================
		*/
		String[] str = {"장동건","장서건","장혁","장남건","현빈","원빈","미스터빈","커피빈","장희빈",
				"abc","abc_def","1234","ab_1234","ab1234","aaa@aaa.aaa","AABB","aBCd","1","3","1234abc@aaa.aaa",
				"1a2b","a12"
		};
		
		
		String[] p_type = {"장.*","장.",".빈",".*빈",
				"[0-9]","[0-9]*","[a-zA-Z0-9_]*","[a-zA-Z0-9_@.]*","[a-zA-Z][a-zA-Z0-9_@.]*",
				"[a-zA-Z].{2}","[a-zA-Z0-9_@.]{5,}","[a-zA-Z0-9_@.]{6,11}"
		};
		//a-zA-Z가 앞글자 +2자리만=총3자리, 5글자이상,  6-11자리 
		
		Pattern p = null;
		Matcher match = null;
		for (int i = 0; i < p_type.length; i++) {
			p = Pattern.compile(p_type[i]);
			System.out.print(p_type[i]+"\t\t\t");
			
			for (int j = 0; j < str.length; j++) {
				match = p.matcher(str[j]);
				if(match.matches()) {
					System.out.print(str[j]+", ");
				}
			}
			
			System.out.println();
		}
	}			
}
/*
장.*					장동건, 장서건, 장혁, 장남건, 장희빈, 
장.						장혁, 
.빈						현빈, 원빈, 
.*빈					현빈, 원빈, 미스터빈, 커피빈, 장희빈, 
[0-9]					1, 3, 
[0-9]*					1234, 1, 3, 
[a-zA-Z0-9_]*			abc, abc_def, 1234, ab_1234, ab1234, AABB, aBCd, 1, 3, 1a2b, a12, 
[a-zA-Z0-9_@.]*			abc, abc_def, 1234, ab_1234, ab1234, aaa@aaa.aaa, AABB, aBCd, 1, 3, 1234abc@aaa.aaa, 1a2b, a12, 
[a-zA-Z][a-zA-Z0-9_@.]*	abc, abc_def, ab_1234, ab1234, aaa@aaa.aaa, AABB, aBCd, a12, 
[a-zA-Z].{2}			abc, a12, 
[a-zA-Z0-9_@.]{5,}		abc_def, ab_1234, ab1234, aaa@aaa.aaa, 1234abc@aaa.aaa, 
[a-zA-Z0-9_@.]{6,11}	abc_def, ab_1234, ab1234, aaa@aaa.aaa, 
*/