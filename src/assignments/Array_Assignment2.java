package assignments;

public class Array_Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][][] s ={ {//1 layer
				{//2 layer
					"Mathematics I","Physics","Chemistry","Computer Programming","Engineering Drawing","Basic Electrical Eng."
				},
				{//3 layer
			"Pass(78)","Pass(85)","Fail(21)","Pass(74)","Pass(88)","Pass(79)"
			}
		},
				{//1 layer
			{//2 layer
				"Mathematics II","Mechanics","Environmental Sci.","Basic Electronics","Engineering Physics","Engineering Graphics"
			},
			{//3 layer
		"Pass(82)","Pass(77)","Pass(93)","Fail(19)","Fail(24)","Pass(90)"
		}
	},
				{//1 layer
		{//2 layer
			"Data Structures","Discrete Mathematics","Digital Electronics","Operating Systems","Signals and Systems","Object-Oriented Prog."
		},
		{//3 layer
	"Pass(88)","Pass(81)","Pass(76)","Fail(32)","Pass(85)","Pass(78)"
	}
},
				{//1 layer
	{//2 layer
		"Algorithms","Computer Networks","Database Systems","Microprocessors","Communication Eng.","Software Engineering"
	},
	{//3 layer
"Pass(91)","Pass(73)","Fail(19)","Pass(80)","Pass(76)","Pass(87)"
}
},
				{//1 layer
	{//2 layer
		"Probability & Stats","Machine Learning","Compiler Design","Theory of Computation","Embedded Systems","Computer Graphics"
	},
	{//3 layer
"Pass(86)","Pass(88)","Pass(84)","Pass(95)","Pass(73)","Pass(90)"
}
},};
		System.out.println("Solution 1");
//		System.out.println("Length of string  "+s[0][0].length);
		System.out.println("NAme of Semester 2 and Subject 4\t"+s[1][0][3]);
		System.out.println("NAme of Semester 2 and Subject 5\t"+s[1][0][4]);	
		System.out.println("Marks of Semester 4 and Subject 3\t"+s[3][1][2]);
		System.out.println("Marks of Semester 4 and Subject 6\t"+s[3][1][5]);
		String[][][] S = new String [5][2][6];
		for(int i=0;i<s.length;i++) {
			for(int j=0; j<s[0].length;j++) {
				for(int k=0;k<s[0][0].length;k++) {
					S[i][j][k]=s[i][j][k];
				}
			}
		}
		
		System.out.println("Solution 2");

		System.out.println("NAme of Semester 2 and Subject 4\t"+S[1][0][3]);
		System.out.println("NAme of Semester 2 and Subject 5\t"+S[1][0][4]);	
		System.out.println("Marks of Semester 4 and Subject 3\t"+S[3][1][2]);
		System.out.println("Marks of Semester 4 and Subject 6\t"+S[3][1][5]);

	}
}
