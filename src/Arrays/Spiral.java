package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Spiral {
	public class Solution {
		// DO NOT MODIFY THE LIST
		public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
			 ArrayList<Integer> result = new ArrayList<Integer>();
			 //int rows=a.size();
			// int column=a.get(0).size();
			 int t=0;
			 int b=a.size();
			 int l=0;
			 int r=a.get(0).size();
			 int dir=0;
			 while(t<b && l<r)
			 {
			     if(dir==0)
			     {
	                for(int i=l;i<r;i++)
	                {
	                    result.add(a.get(t).get(i));
	                    t++;
	                    dir=1;
	                }
			     }
			     if(dir==1)
			     {
			         for(int i=t;i<b;i++)
	                {
	                    result.add(a.get(i).get(r));
	                    r--;
	                    dir=2;
	                }
			     }
			     if(dir==2)
			     {
			         for(int i=r;i>l;i--)
	                {
	                    result.add(a.get(b).get(i));
	                    b--;
	                    dir=3;
	                }
			     }
			     if(dir==3)
			     {
			         for(int i=b;i>t;i--)
	                {
	                    result.add(a.get(i).get(l));
	                    l++;
	                    dir=0;
	                }
			     }
			 }
			 
			 return result;
		}
	}
}