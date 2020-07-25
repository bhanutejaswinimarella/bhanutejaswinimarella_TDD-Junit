package com.bhanu.junit;

public class RemoveA {

	public String remove(String str) {
		
		String res=str;
		if(str.length()==1&&str.charAt(0)=='A'||str.length()==0)
			res=" ";
		else
		{
		if(str.charAt(0)=='A')
        {
            res=str.substring(1);
            if(str.charAt(1)=='A')
            {
                res=res.substring(1);
            }
        }
		else if(str.charAt(1)=='A')
			res=str.substring(0,1)+str.substring(2);
		
		}
		return res;
	}

}
