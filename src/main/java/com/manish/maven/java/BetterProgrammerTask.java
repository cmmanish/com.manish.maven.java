package com.manish.maven.java;

import java.util.*;

public class BetterProgrammerTask {

	 public static int getSumOfTwoClosestToZeroElements(int[] a) {
	        /*
	          Please implement this method to
	          return the sum of the two elements closest to zero.
	          If there are two elements equally close to zero like -2 and 2,
	          consider the positive element to be "closer" to zero than the negative one.
	         */
		 int min[] = new int[2];
		 int pMinIndx=Integer.MAX_VALUE,minIndx=0;
		 if(a.length < 2) {System.out.println("array size less than 2"); return -1;};
		 for(int j=0;j<min.length;j++)
		 {
			 min[j]=Integer.MAX_VALUE;
			 for(int i=0; i< a.length;i++)
			 {	
				 if(i != pMinIndx)
				 {
					 if(Math.abs(min[j]) > Math.abs(a[i]))
					 {
						 min[j] = a[i];
						 minIndx=i;
					 }
					 else if(Math.abs(min[j]) == Math.abs(a[i]))
					 {
						 min[j] = (min[j] > a[i])?min[j]:a[i];
						 minIndx=(min[j] > a[i])?minIndx:i;
					 }
				 }
			 }
			 pMinIndx = minIndx;
			 
		 }
		 
		 System.out.println(min[0]+" "+min[1]);
		 
		 return min[0]+min[1]; 
		 
	    }
	 
	    public static int getClosestToZero(int[] a) {
	        /*
	          Please implement this method to
	          return the number in the array that is closest to zero.
	          If there are two equally close to zero elements like 2 and -2
	          - consider the positive element to be "closer" to zero.
	         */
	    	int min=Integer.MAX_VALUE;
	    	for(int i=0; i< a.length;i++)
			 {	
				
					 if(Math.abs(min) > Math.abs(a[i]))
					 {
						 min = a[i];
						
					 }
					 else if(Math.abs(min) == Math.abs(a[i]))
					 {
						 min = (min > a[i])?min:a[i];
						 
					 }
			 }	
	    	
	    	return min;
	    }

    public static Object[] reverseArray(Object[] a) {
		        /*
		          Please implement this method to
		          return a new array where the order of elements has been reversed from the original
		          array.
		         */
    		List<Object> oA = Arrays.asList(a);
    		Collections.reverse(oA);
    		return oA.toArray();
    	
    	
		    }
		
    
    public static String reverseWords(String s) {
        /*
          Assume that the parameter String can only contain spaces and alphanumeric characters.
          Please implement this method to
          reverse each word in the original String while maintaining the word order.
          For example:
          parameter: "Hello world", result: "olleH dlrow"
         */
    	
    	System.out.println("word count "+s.split("[\\s*]").length);
    	
    	String[] sA = s.split("[\\s*]");
    	
    	for(String st: sA)
    	{
    		s = s.replace(st,new StringBuffer(st).reverse().toString());
    	}
    	
    	return s;
    	
    }
    
    // Please do not change this interface
    interface ListNode {
        int getItem();
        ListNode getNext();
        void setNext(ListNode next);
    }

    public static ListNode reverse(ListNode node) {
        /*
          Please implement this method to
          reverse a given linked list.
         */
    	ListNode p=null,n=null;
    	while(node.getNext()!=null)
    	{
    		n = node.getNext();
    		node.setNext(p);
    		p = node;
    		node = n;   		
    	}
    	
    	return node;
    	
    }
    
    
    public static String capitalizeFirstLetters(String s) {
        /*
          Please implement this method to
          capitalize all first letters of the words in the given String.
          All other symbols shall remain intact. If a word starts not with a letter, it shall remain intact too.
          Assume that the parameter String can only contain spaces and alphanumeric characters.

          NOTE: please keep in mind that the words can be divided by single or multiple spaces.
          The spaced also can be found at the beginning or the end of the parameter string,
          and you need to preserve them.
         */
    	
    	String[] sA = s.split("\\s+");
    	
    	for(String st : sA)
    	{
    		if(st.length() > 0)
    		{
    			
    			char c = st.charAt(0);
    		
    			if(false==Character.isDigit(c))
    			{
    			
    				c = Character.toUpperCase(c);
    			}
    		
    			StringBuffer stb = new StringBuffer(st);
    			stb.setCharAt(0, c);
    			s = s.replace(st, stb.toString() );
    		}
    		
    	}
    	
    	return s;
    	
    }
    
    
    private static void reverse(int a[], int length)
    {
    	int t;
    	for(int i=0; i<length;i++)
    	{
    		if(i<length/2)
    		{
    			t = a[i];
    			a[i] = a[length -1 -i];
    			a[length -1 -i] = t;
    		}
    	}
    	
    }
    
    private static int largest(int a[], int sortLength)
    {
    	int largest=a[0];
    	int largestIndx=0;
    	
    	
    	for(int i=0;i<sortLength;i++)
    	{
    		if(largest < a[i])
    		{
    			largest = a[i];
    			largestIndx = i;
    		}
    	}
    	
    	return largestIndx;
    }
    
    public static List<Integer> getReversalsToSort(int[] a) {
        /*
         You need to sort an array of integers by repeatedly reversing
         the order of the first several elements of it.

         For example, to sort [12,13,11,14], you need to  reverse the order of the first two (2)
         elements and get [13,12,11,14] and then reverse the order of the first three (3)
         elements and get [11,12,13,14]

         The method should return the shortest(!) possible list of integers corresponding to the required reversals.
         For the previous example, given an array [12,13,11,14]
         the method should return a list with Integers 2 and 3.
        */
    	List<Integer> lInt = new ArrayList<Integer>();
    	int sortLength = a.length;
    	
    	while(sortLength > 1)
    	{
    		
    	
    		int l = largest(a,sortLength);
    		
    		while(l+1 == sortLength)
    		{
    			l = largest(a,--sortLength);
    		}
    		if(sortLength >1)
    		{
    			if(l > 0)
    			{
    				reverse(a,l+1);
    				lInt.add(l+1);
    				
    			}
    		
    			reverse(a, sortLength);
    			
    			lInt.add(sortLength);
    		
    			sortLength--;
    		}
    		
    	}
    	
    	return lInt;
    	
    }
    
    
    public static int getLargestRootToLeafSum(Node root) {
        /*
          A root-to-leaf path in a tree is a path from a leaf node through all its ancestors
          to the root node inclusively.
          A "root-to-leaf sum" is a sum of the node values in a root-to-leaf path.

          Please implement this method to
          return the largest root-to-leaf sum in the tree.
         */
    	
    	List<Integer> lInt = new ArrayList<Integer>();
    	int sum=0;
    	
    	findSum(lInt, root, sum);
    	
    	Iterator<Integer> itr = lInt.iterator();
    	
    	int max=0;
    	while(itr.hasNext())
    	{
    		int m =  itr.next().intValue();
    		if(max < m)
    		{
    			max = m;
    		}
    	}
    	
    	return max;
    	
    }
    
    public static interface Node {
        int getValue();
        List<Node> getChildren();
    }
    
    private static void findSum(List<Integer> lInt, Node node, int sum)
    {
    	if(node == null)
    	{
    		lInt.add(new Integer(sum));
    		return;
    	}
    	
    	for (Node n: node.getChildren())
    	{
    		findSum(lInt, n, node.getValue() + sum);
    	}
    	
    }
    
    public static int countWaysToProduceGivenAmountOfMoney(int cents) {
        /*
          Please implement this method to
          return the number of different combinations of US coins
          (penny: 1c, nickel: 5c, dime: 10c, quarter: 25c, half-dollar: 50c)
          which may be used to produce a given amount of money.

          For example, 11 cents can be produced with
          one 10-cent coin and one 1-cent coin,
          two 5-cent coins and one 1-cent coin,
          one 5-cent coin and six 1-cent coins,
          or eleven 1-cent coins.
          So there are four unique ways to produce 11 cents.
          Assume that the cents parameter is always positive.
         */
    	
    	int[] denA = new int[]{1,5,10,25,50};
    	
    	int heighestIndex=0;
    	
    	for(int i=0;i<denA.length;i++)
    	{
    		double val = (double)cents/(double)denA[i];
    		
    		if( val >=  1.0)
    		{
    			heighestIndex = i;
    		}
    	}
    	int totalCount=0;
    	
    	System.out.println(" heighestIndex "+heighestIndex);
    	
    	for(int i=0;i<=heighestIndex;i++)
    	{
    		
    		totalCount = denomination(denA, i, cents, totalCount);
    		
    	}
    	
    	return totalCount;
    }
    
    private static int denomination(int[] denA, int i, int cents, int totalCount)
    {
    		
    	if(i<0) return totalCount;
    	
    	if(cents%denA[i] == 0)
		{
			totalCount++;
			//System.out.println(cents/denA[i]+" "+denA[i]+"cents");
		}
		else
		{
			
		  int counts = cents/denA[i];
		  
		  if(counts == 0 && cents%denA[i] > 0)
		  {			  
			  totalCount = denomination(denA,i-1,cents,totalCount);			  
		  }
		  for(int j=0;j<counts;j++)
		  { 
			  cents = cents - (j+1)*denA[i];
			  
			  //System.out.print((j+1)+" "+denA[i]+"cents ");
			  
			  totalCount = denomination(denA,i-1,cents,totalCount);
			  
			  cents = cents + (j+1)*denA[i]; 
		  }					  		  
		}
    	
    	return totalCount;
    }
    
    
    public static class WriteOnceMap<K, V> extends HashMap<K, V> {

        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;


		public V put(K key, V value) {
            /*
             WriteOnceMap is a map that does not allow changing value for a particular key.
             It means that put() method should throw IllegalArgumentException if the key is already
             assosiated with some value in the map.

             Please implement this method to conform to the above description of WriteOnceMap.
            */
        	
        	if(null==get(key))
        	{
        		super.put(key, value);
        	}
        	else
        	{
        		throw new IllegalArgumentException();
        	}
        	
        	return value;
        	
        }


        public void putAll(Map<? extends K, ? extends V> m) {
            /*
             Pleaase implement this method to conform to the description of WriteOnceMap above.
             It should either
             (1) copy all of the mappings from the specified map to this map or
             (2) throw IllegalArgumentException and leave this map intact
             if the parameter already contains some keys from this map.
            */
        	
        	Iterator<? extends K> itr = m.keySet().iterator();
        	
        	while(itr.hasNext())
        	{
        		if(true == this.containsKey(itr.next()))
        		{
        			throw new IllegalArgumentException();
        		}
        	}
        	
        	super.putAll(m);
        	
        }
    }
    
    
    public static void towerOfHanoiMoves(int n, String s, String d, String t)
    {
    	if(n < 1) {
    		System.out.println("ERROR: input less than 1 :"+n);
    	}
    	if(n == 1)
    	{
    		System.out.println(s+"->"+d);
    	}
    	
    	if( n == 2)
    	{
    		System.out.println(s+"->"+t);
    		System.out.println(s+"->"+d);
    		System.out.println(t+"->"+d); 		
    	}
    	else
    	{
    		towerOfHanoiMoves(n-1,s,t,d);
    		System.out.println(s+"->"+d);
    		towerOfHanoiMoves(n-1,t,d,s);
    	}
    }
    
    public static int[] removeDuplicates(int[] a) {
        /*
          Please implement this method to
          remove all duplicates from the original array. Retain the order of the elements and
          always retain the first occurrence of the duplicate elements.
          For example, parameter: {2,1,2,3}, result: {2,1,3}
         */
    	LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
    	
    	for(int A : a)
    	{
    		lhs.add(new Integer(A));
    	}
    	
    	Integer[] b = lhs.toArray(new Integer[0]);
    	
    	int[] x = new int[b.length];
    	
    	for(int i=0;i<b.length;i++)
    	{
    		x[i] = b[i].intValue();
    	}
    	
    	return x;
    }
    
    public static List<Node> traverseTreeInWidth(Node root) {
        /*
          Please implement this method to
          traverse the tree in width and return a list of all passed nodes.

          The list should start with the root node, next
          it should contain all second-level nodes, then third-level nodes etc.

          The method shall work optimally with large trees.
         */
    	
    	List<Node> lNode = new ArrayList<Node>();
    	
    	LinkedList<Node> llNode = new LinkedList<Node>();
    	
    	llNode.add(root);
    	
    	while(llNode.size()!=0)
    	{
    		Node n = llNode.remove();
    		
    		lNode.add(n);
    		
    		List<Node> children =  n.getChildren();
    		
    		llNode.addAll(children);	
    	}
    	
    	return lNode;
    	
    }
    
    public static int getSumOfNumbers(String s) {
        /*
          Please implement this method to
          return the sum of all integers found in the parameter String. You can assume that
          integers are separated from other parts with one or more spaces (' ' symbol).
          For example, s="12 some text 3  7", result: 22 (12+3+7=22)
         */
    	
    	String[] sA = s.split("\\s+");
    	
    	int sum=0;
    	
    	boolean flag=false;
    	
    	for(String S : sA)
    	{
    		if(S.matches("-?\\d+"))
    		{
    			sum = sum + Integer.parseInt(S);
    			flag=true;
    		}
    	}
    	
    	if(s==null | !flag)
    	{
    		throw new IllegalArgumentException();
    	}
    	
    	return sum;
    	
    	
    }
    
    public static boolean isPalindrome(String s) {
        /*
          Definition: A palindrome is a string that reads the same forward and backward.
          For example, "abcba" is a palindrome, "abab" is not.
          Please implement this method to
          return true if the parameter is a palindrome and false otherwise.
         */
    	
    	if(null==s || s.matches("\\s+"))
    	{
    		throw new IllegalArgumentException();
    	}
    	
    	StringBuffer stb = new StringBuffer(s);
    	stb.reverse();
    	String sRev = stb.toString();
    	
    	if(0==sRev.compareTo(s))
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}	
    }
    
    
    public static int getRequiredNumberOfBits(int N) {
        /*
          Please implement this method to
          return the number of bits which is just enough to store any integer from 0 to N-1 inclusively
          for any int N > 0
          Example: to store 5 integers from 0 to 4 you need 3 bits: 000, 001, 010, 011, 100 and 101
        */
    	
    	double nD = N;
    	
    	int count=0;
    	
        while(nD >= 1)
        {
        	nD = nD  / (double) 2;
        	
            count++;	
        }
    	
    	return count;
    	
    }
    
    public static List<Node> traverseTreeInDepth(Node root) {
        /*
          Please implement this method to
          traverse the tree in depth and return a list of all passed nodes.

          The method shall work optimally with large trees.
         */
    	
    	List<Node> n = new ArrayList<Node>();
    	
    	depthFirstTreeTraversal(n,root);
    	
    	return n;
    	
    }
    
    
    private static void depthFirstTreeTraversal(List<Node> n, Node node)
    {
    	if(node !=null)
    	{
    		for(Node nd: node.getChildren())
    		{
    			n.add(nd);
    		
    			depthFirstTreeTraversal(n,nd);
    		}
    	}
    }
    
    
    public static double getProbability(int Y, int X) {
        /*
          If you roll Y standard six-sided dice, what�s the probability that you get at least X 4s?
          To calculate that you should divide the number of comibnations with X or more 4s
          by the total number of possible combinations.
         */
    	
    	if(Y < 1 || X < 1 || Y < X)
    	{
    	  throw new IllegalArgumentException();
    	}
    	
    	int sum=0;
    	
    	for(int i=X;i<=Y;i++)
    	{	
    		sum = sum + (factorial(Y)/(factorial(Y-i)*factorial(i))) * ((int) Math.pow((double) 5.0,(double)(Y-i)));
    		
    	}
    	
    	double p = (double) sum / Math.pow(6.0, (double) Y); 
    	
    	return p;
    }
    
    
    
    private static int factorial(int x)
    {
    	int f=1;
    	for(int i=2;i<=x;i++)
    	{
    		f = f*i;
    	}
    	
    	return f;
    }
    
    public static String getBinaryRepresentation(int n) {
        /*
         Please implement this method to
         return a String with the binary representation of any number n, where n >= 0.
         Example: "101" is a binary representation of 5
        */
    	
    	StringBuffer stb = new StringBuffer();
    	
    	
    	while(n >=1)
    	{
    	    if(n%2 == 0)
    	    {
    	    	stb.append('0');
    	    }
    	    else
    	    {
    	       stb.append('1');	
    	    }
    		
    	    n = n / 2;
    	        
    	}
    	
    	return stb.reverse().toString();
    	
    }
    
    public static Change getCorrectChange(int cents) {
        /*
          Please implement this method to
          take cents as a parameter
          and return an equal amount in dollars and coins using the minimum number of
          coins possible.
          For example: 164 cents = 1 dollar, 2 quarters, 1 dime and 4 cents.
          Return null if the parameter is negative.
         */
    	
    	int[] den = new int[]{100,25,10,5,1};
    	
    	int[] curr = new int[]{0,0,0,0,0,0};
    	
    	
    	while(cents>0)
    		{
    			for(int i=0;i<den.length;i++)
    	    	{
    			if(cents >= den[i])
    			{
    				curr[i] = cents/den[i];
    				
    				cents = cents - (curr[i])*den[i];
    				
    				System.out.println(" cents "+cents);
    			}
    			
    			System.out.println(" cents "+cents);
    		}
    	}
    	
    	Change c = new Change(curr[0],curr[1],curr[2],curr[3],curr[4]);
    	
    	return c;
    	
    }


    // Please do not change this class
    static class Change {
        private final int _dollars;
        private final int _quarters; //25 cents
        private final int _dimes; // 10 cents
        private final int _nickels; // 5 cents
        private final int _cents; // 1 cent


        public Change(int dollars, int quarters, int dimes, int nickels, int cents) {
            _dollars = dollars;
            _quarters = quarters;
            _dimes = dimes;
            _nickels = nickels;
            _cents = cents;
        }


        public int getDollars() {
            return _dollars;
        }


        public int getQuarters() {
            return _quarters;
        }


        public int getDimes() {
            return _dimes;
        }


        public int getNickels() {
            return _nickels;
        }


        public int getCents() {
            return _cents;
        }
    }
    
    public static int countAlmostPrimeNumbers(int from, int to) {
        /*
          A prime number is a natural number that has exactly two distinct natural number divisors,
          which are 1 and the prime number itself.
          The first prime numbers are: 2, 3, 5, 7, 11, 13.

          Almost prime numbers are the non-prime numbers
          which are divisible by only a single prime number.

          Please implement this method to
          return the number of almost prime numbers within the given range (inclusively).
         */
    	
    	 int count=0;
    	 for(int i=from;i<=to;i++)
    	 {
    		 if(Math.sqrt(i) == (int)Math.sqrt(i))
    		 {
    		 if(isPrime((int)Math.sqrt(i)))
    			{
    			   count++;
    			   
    			   //System.out.println(" almost prime " +i);
    			}
    		 }
    	 }
    	
    	return count;
    }
    
    private static boolean isPrime(int x)
    {
    	int y = (int) Math.sqrt((double)x);
    	for(int i=2;i<=y;i++)
    	{
    		if(x%i==0)
    		{
    			return false;
    		}
    	}
    	
    	return true;
    }
    
    
    
    public static Set<Object> getIntersection(Set<Object> a, Set<Object> b) {
        /*
          Please implement this method to
          return a Set equal to the intersection of the parameter Sets
          The method should not chage the content of the parameters.
         */
    	
    	Iterator<Object> it = a.iterator();
    	
    	Set<Object> so = new HashSet<Object>();
    	
        while(it.hasNext())
        {
        	Object o = it.next();
           if(!b.add(o))
           {
        	   so.add(o);
           }
        }
    	
        return so;
    	
    }
    
    public static List<Integer> getPerfectNumbers(int from, int to) {
        /*
          Please implement this method to
          return a list of all perect numbers in the given range inclusively.
          A perfect number is defined as a positive integer which is the sum of its positive divisors not including the number itself.
          For example: 6 is a perfect number because 6 = 1 + 2 + 3 (1, 2, 3 are divisors of 6)
          28 is also a perfect number: 28 = 1 + 2 + 4 + 7 + 14
         */
    	
    	if(from < 1 || to < 1 || from > to )
    	{
    		throw new IllegalArgumentException();
    	}
    	
    	List<Integer> lInt = new ArrayList<Integer>();
    	
    	for(int i=from;i<to;i++)
    	{
    		
    		int sum = 0;
    		
    		for(int j=1;j<i;j++)
    		{
    			if(i%j==0)
    			{
    				sum = sum + j;
    			}
    		}
    		
    		if(sum == i)
    		{
    			lInt.add(new Integer(i));
    		}
    		
    		
    	}
    	
    	return lInt;
    	
    }
    
    
    public static List<Integer> getPrimeNumbers(int from, int to) {
        /*
          Please implement this method to
          return a list of all prime numbers in the given range (inclusively).
          A prime number is a natural number that has exactly two distinct natural number divisors, which are 1 and the prime number itself.
          The first prime numbers are: 2, 3, 5, 7, 11, 13
         */
    

    List<Integer> lInt = new ArrayList<Integer>();

    for(int i=from;i<=to;i++)
        {
            if(isPrime(i))
               {
                     lInt.add(i);
               }

        }

       return lInt;
    }
    
    
    public static List<String> getAllPermutations(String s)
    {
    	
    	List<String> lS = new ArrayList<String>();
    	
    	StringBuilder stb = new StringBuilder(s);
    	
    	permutation(lS, s, new StringBuilder(""), stb, 0);
    	
    	return lS;
    	
    }
    
    
    private static void permutation(List<String> lS, String o,  StringBuilder t, StringBuilder r, int index)
    {
    	
    	for(int i=index;i<o.length();i++)
    	{
    		
    		t.append(o.charAt(i));
    		
    		
    		
    		if(r.length()>0)
    			r.deleteCharAt(0);
    		
    		System.out.println(" t "+t.toString()+" r "+r.toString());
    		if(i+1<o.length())
    		 permutation(lS,o,t,r,i+1);
    		
    		if(t.length() == o.length())
    		{
    			System.out.println(t.toString());
    		}
    		else
    		{
    			System.out.println(" t "+t.toString()+" r "+r.toString());
    			char chr1 = t.charAt(t.length()-1);
    			char chr2 = r.charAt(0);
    			t.deleteCharAt(t.length()-1);
    			t.insert(t.length(), chr2);
    			r.deleteCharAt(0);
    			r.insert(0, chr1);
    			
    		}		
    	}
    }
    
    
    
    public static void main(String args[])
    {
    	for(Object o: reverseArray(new String[]{"one"}))
    			{
    				System.out.println(o.toString());
    			}
    	System.out.println(getSumOfTwoClosestToZeroElements(new int[]{0,-1,1}));
    	
    	System.out.println(reverseWords("one two"));
    	
    	System.out.println(getReversalsToSort(new int[]{12,13,11,14}));
    	
    	System.out.println(getClosestToZero(new int[]{5,-1,1}));
    	
    	System.out.println("!"+capitalizeFirstLetters(" 1dfkb ding dong  stupid ")+"!");
    	
    	System.out.println(countWaysToProduceGivenAmountOfMoney(1));
    	
    	towerOfHanoiMoves(4,"A","C","B");
    	
    	//removeDuplicates(new int[]{2,1,2,3});
    	
    	for(int o: removeDuplicates(new int[]{2,1,2,3,3,3,5,6,2,1,8}))
		{
			System.out.print(" "+o);
		}
    	
    	System.out.println();
    	
    	System.out.println(getSumOfNumbers(" -1 "));
    	
    	System.out.println(isPalindrome("ababa"));
    	
    	System.out.println(getRequiredNumberOfBits(16));
    	
    	System.out.println(getProbability(2,1));
    	
    	//System.out.println(getBinaryRepresentation(11));
    	
    	Change c = getCorrectChange(101);
    	System.out.println(c.getDollars()+" dollars "+c.getQuarters()+" quaters "+c.getDimes()+" dimes "+c.getNickels()+ " nickles "+ c.getCents() +" cents ");

    	
    	System.out.println(countAlmostPrimeNumbers(4,100));
    	
    	for(Integer i : getPerfectNumbers(4,50))
    	{
    		System.out.println(" i "+i.intValue());
    	}
    	
    	for(Integer x: getPrimeNumbers(2,33))
    	{
    		System.out.println(" x "+x.intValue());
    	}
    	
    	getAllPermutations("abcd");
    	
    }
}

	 

