class Fchain{ // method chaining

int a,b;
Fchain setValue(int x,int y){

a=x;
b=y;
return this;

}
Fchain disp(){

System.out.println("a value is:"+a);
System.out.println("b value is:"+b);
return this;

}

}
class FchainDemo{

public static void main(String args[]){
Fchain f1=new Fchain();
f1.setValue(10,20).disp().setValue(11,22).disp();
}

}
