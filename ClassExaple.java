/**about class and Object*/
class ClassExaple 
{
	//instance varable declaration and intilaization
	int instancevar;//decalration
	int instncevarbleInti=10;//intilization
	//Static varvles
	static int staticVarble;
	static int staticIntilization=100;

    public void instanceMethod(){
         instancevar=20;
		 int sum = instncevarbleInti+instancevar;
		System.out.println("Inside Insatnce mehod  sum is::: "+ sum);
	
	}// instabce method

	
    public static void staticMethod(){
         staticVarble=20;
		 int sum = staticIntilization+staticVarble;
		System.out.println("Inside Static mehod  sum is::: "+ sum);
	
	}// static method
    
    //Blocks
	{//Intnae blcoks
		 System.out.println("Inside Insatnce block");
	}
	 
	static{//Intnae blcoks
		 System.out.println("Inside static  block");

	}
	//Constructors
ClassExaple(){
   System.out.println("Inside default constructor  block");
}

	//parameterized Constructors
ClassExaple(int param){
   System.out.println("Inside oarameterized constructor  block" + param);
}

	public static void main(String args[]){
			  //System.out.println("Inside Main Method");
			  ClassExaple classExaple = new ClassExaple();//object creation
			  classExaple.instanceMethod();//Caling instance mthod by invoking object refernce
			  ClassExaple parameterConstructor = new ClassExaple(100);//parameterized object creation


			  classExaple.staticMethod();//calling static ethod with refrenece
			   ClassExaple.staticMethod();//calling static method with className

	}
}//Class end