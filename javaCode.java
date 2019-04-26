//day01

class Hello2 {									//这是一个类的声明,类名是Hello2	//单行注释是可以嵌套																						
	public static void main(String[] args) {	//这是主方法,是程序的入口
		System.out.println("Hello World!");		//这是输出语句,会在控制台输出一句话
		System.out.println("Hello World!");
	}

	/*
	故人西辞富士康
	为学技术去蓝翔
	蓝翔毕业包分配
	尼玛还是富士康

	多行注释不能嵌套
	*/

	/*
	包(其实就是文件夹,用于解决相同类名问题)
	举例
	包名要求全部小写,一般是公司的域名倒着写
	www.heima.com
	com.heima.包的作用
	类或者接口
	一个单词和和多个单词分别举例
	如果是一个单词,要求首字母大写,如果是多个单词要求每个单词首字母大写(驼峰命名)
	方法和变量
	一个单词和和多个单词分别举例
	如果是一个单词,每个字母都小写,如果是多个单词,从第二个单词开始首字母大写
	
	常量
	一个单词和和多个单词分别举例
	如果是一个单词,所有字母大写,如果是多个单词也是所有字母大写,但是用_分开
	MAX
	MAX_VALUE
	*/
}

//day02

//day03
	//1逻辑运算符
class Demo1_Operator {
	public static void main(String[] args) {
		//&,|,^,!
		//int x = 10;
		//5 < x < 15
		//x > 5 & x < 15
		//逻辑与 & 并且and 遇false则false
		int a = 10;
		int b = 20;
		int c = 30;
		/*System.out.println(a < b & b < c);			//true & true = true
		System.out.println(a < b & b > c);				//true & false = false
		System.out.println(a > b & b < c);				//false & true = false
		System.out.println(a > b & b > c);				//false & false = false*/

		//逻辑或 或or 遇true则true
		/*System.out.println(a < b | b < c);				//true | true = true
		System.out.println(a < b | b > c);				//true | false = true
		System.out.println(a > b | b < c);				//false | true = true
		System.out.println(a > b | b > c);				//false | flase = false*/

		//逻辑异或 ^ 两边相同为false,两边不同为true
		/*System.out.println(a < b ^ b < c);				//true | true = false
		System.out.println(a < b ^ b > c);				//true | false = true
		System.out.println(a > b ^ b < c);				//false | true = true
		System.out.println(a > b ^ b > c);				//false | flase = false*/

		//逻辑非!
		System.out.println(!true);
		System.out.println(!!true);
	}
}

class Demo2_Operator {
	/*
	&&与&的区别
	* a:最终结果一样。
	* b:&&具有短路效果。左边是false，右边不执行。

	||与|的区别
	a:最终的结果是一样
	b:||具有短路效果,左边为true,右边不执行
	*/
	public static void main(String[] args) {
		/*int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(a < b && b < c);				//true && true = true
		System.out.println(a < b && b > c);				//true && false = false
		System.out.println(a > b && b < c);				//false && true = false
		System.out.println(a > b && b > c);				//false && false = false*/

		int x = 3;
		int y = 4;
		//System.out.println((++x == 3) & (++y == 4));	//false & false = false
		//System.out.println("x = " + x);					//x = 4
		//System.out.println("y = " + y);					//y = 5
		System.out.println("---------------------------");
		System.out.println((++x == 3) && (++y == 4));	//false & false = false
		System.out.println("x = " + x);					//x = 4
		System.out.println("y = " + y);					//y = 4
	}
}
	//位运算符
class Demo1_Operator {
	public static void main(String[] args) {
		/*
		* &,|,^,~ 的用法
		* &:有0则0
		* |:有1则1
		* ^:相同则0，不同则1
		* ~:按位取反
		*/

		System.out.println(6 & 3);				//2
		System.out.println(6 | 3);				//7
		System.out.println(6 ^ 3);				//5	
		System.out.println(~6);					//-7?					
	}
}
/*
	110
&	011
-----------
    010

	110
|	011
-----------
    111

	110
^	011
-----------
    101

	00000000 00000000 00000000 00000110		6的原码反码补码都是本身
	11111111 11111111 11111111 11111001		对6取反
-	00000000 00000000 00000000 00000001
---------------------------------------
	11111111 11111111 11111111 11111000		反码
	10000000 00000000 00000000 00000111		原码(-7)
*/

class Demo2_Operator {
	public static void main(String[] args) {
		/*
		* 位异或运算符的特点

		* ^的特点：一个数据对另一个数据位异或两次，该数本身不变。
		*/

		//System.out.println(5 ^ 10 ^ 10);
		//System.out.println(5 ^ 10 ^ 5);

		/*
		* 请自己实现两个整数变量的交换(不需要定义第三方变量)
		* 注意：以后讲课的过程中，我没有明确指定数据的类型，默认int类型。
		*/

		int x = 10;
		int y = 5;

		//需要第三方变量,开发推荐用这种
		/*int temp;
		temp = x;
		x = y;
		y = temp;*/

		//不需要定义第三方变量,有弊端,有可能会超出int的取值范围
		/*x = x + y;				//10 + 5 = 15
		y = x - y;				//15 - 5 = 10
		x = x - y;				//15 - 10 = 5*/

		//不需要第三方变量,通过^来做
		x = x ^ y;				// 10 ^ 5 
		y = x ^ y;				// 10 ^ 5 ^ 5	y = 10
		x = x ^ y;				// 10 ^ 5 ^ 10  x = 5

		System.out.println("x = " + x + ",y = " + y);
	}
}

class Demo3_Operator {
	public static void main(String[] args) {
		/*
		*  <<:左移	左边最高位丢弃，右边补齐0
		*  >>:右移	最高位是0，左边补齐0;最高为是1，左边补齐1
		*  >>>:无符号右移 无论最高位是0还是1，左边补齐0
		*  最有效率的算出2 * 8的结果
		*/

		//左移,向左移动几位就是乘以2的几次幂
		//System.out.println(12 << 1);		//24
		//System.out.println(12 << 2);		//48

		/*
		00000000 00000000 00000000 00001100		12的补码
	 (0)0000000 00000000 00000000 000011000		24的补码
	(00)000000 00000000 00000000 0000110000		48的补码
		*/

		//右移,向右移动几位就是除以2的几次幂
		//System.out.println(12 >> 1);
		//System.out.println(12 >> 2);

		/*
		00000000 00000000 00000000 00001100		12的补码
		000000000 00000000 00000000 0000110(0)	6
		0000000000 00000000 00000000 000011(00) 3
		*/

		//最有效率的算出2 * 8的结果
		System.out.println(2 << 3);
	}
}
	//三元运算符
class Demo1_Operator {
	public static void main(String[] args) {
		//(关系表达式) ? 表达式1 : 表达式2;
		int x = 10;
		int y = 5;
		int z;
		z = (x > y) ? x : y;

		System.out.println("z = " + z);
	}
}

/*
* a:导包
		* 格式：
			* import java.util.Scanner; 
		* 位置：
			* 在class上面。
	* b:创建键盘录入对象
		* 格式：
			* Scanner sc = new Scanner(System.in);
	* c:通过对象获取数据	
		* 格式：
			* int x = sc.nextInt();
*/
import java.util.Scanner;
class Demo2_Scanner {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);			//创建键盘录入对象
		System.out.println("请输入一个整数:");
		int x = sc.nextInt();							//将键盘录入的数据存储在x中
		System.out.println(x);*/

		//录入两个整数
		Scanner sc = new Scanner(System.in);			//创建键盘录入对象
		System.out.println("请输入第一个整数:");
		int x = sc.nextInt();							//将键盘录入的数据存储在x中
		System.out.println(x);

		System.out.println("请输入第二个整数:");
		int y = sc.nextInt();							//将键盘录入的数据存储在y中
		System.out.println(y);
	}
}

class Test1_Operator {
	public static void main(String[] args) {
		/*
		* A:案例演示
			* 比较两个整数是否相同
		* B:案例演示
			* 获取三个整数中的最大值
		*/

		//比较两个整数是否相同

		/*int x = 10;
		int y = 10;

		//boolean b = (x == y) ? true : false;
		boolean b = (x == y);
		System.out.println("b = " +  b);*/

		//获取三个整数中的最大值
		int a = 10;
		int b = 20;
		int c = 30;

		//先比较任意两个数的值,找出这两个数中的最大值
		int temp = (a > b) ? a : b;
		//用前两个数的最大值与第三个数比较,获取最大值
		int max = (temp > c) ? temp : c;
		System.out.println("max =" + max);
	}
}

import java.util.Scanner;						//导入包中的类Scanner
class Test2_Scanner {
	/*
	* A:案例演示
		* 键盘录入练习：键盘录入两个数据，并对这两个数据求和，输出其结果
	* B:案例演示
		* 键盘录入练习：键盘录入两个数据，获取这两个数据中的最大值

	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//创建键盘录入对象
		
		//键盘录入练习：键盘录入两个数据，并对这两个数据求和，输出其结果
		/*System.out.println("请输入第一个整数:");
		int x = sc.nextInt();					//将键盘录入的数据存储在x中
		System.out.println("请输入第二个整数:");
		int y = sc.nextInt();					//将键盘录入的数据存储在y中
		int sum = x + y;
		System.out.println(sum);*/

		//键盘录入练习：键盘录入两个数据，获取这两个数据中的最大值
		System.out.println("请输入第一个整数:");
		int x = sc.nextInt();					//将键盘录入的数据存储在x中
		System.out.println("请输入第二个整数:");
		int y = sc.nextInt();					//将键盘录入的数据存储在y中

		int max = (x > y) ? x : y;				//获取x和y中的最大值
		System.out.println("max = " + max);
	}
}

/*
* A:案例演示
	* 键盘录入练习：键盘录入两个数据，比较这两个数据是否相等
* B:案例演示
	* 键盘录入练习：键盘录入三个数据，获取这三个数据中的最大值
*/
import java.util.Scanner;							//导包
class Test3_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//创建键盘录入对象

		//键盘录入练习：键盘录入两个数据，比较这两个数据是否相等
		/*System.out.println("请输入第一个整数:");
		int x = sc.nextInt();						//将键盘录入的数据存储在x中
		System.out.println("请输入第二个整数:");
		int y = sc.nextInt();						//将键盘录入的数据存储在y中

		//boolean b = (x == y)? true : false;
		boolean b = (x == y);
		System.out.println(b);*/

		//键盘录入练习：键盘录入三个数据，获取这三个数据中的最大值
		System.out.println("请输入第一个整数:");
		int x = sc.nextInt();						//将键盘录入的数据存储在x中
		System.out.println("请输入第二个整数:");
		int y = sc.nextInt();						//将键盘录入的数据存储在y中
		System.out.println("请输入第三个整数:");
		int z = sc.nextInt();						//将键盘录入的数据存储在y中

		//定义临时变量记录住比较出前两个变量中的最大值
		int temp = (x > y) ? x : y;
		//将比较后的结果与第三个变量中的值比较,比较出三个数中的最大值
		int max = (temp > z) ? temp : z;
		System.out.println(max);
	}
}
//5_选择结构if
/*
* C:if语句的格式1
* 
		if(比较表达式) {
			语句体;
		}
* D:执行流程：
	* 先计算比较表达式的值，看其返回值是true还是false。
	* 如果是true，就执行语句体；
	* 如果是false，就不执行语句体；
*/
/*
*	a:比较表达式无论简单还是复杂，结果必须是boolean类型
	* b:if语句控制的语句体如果是一条语句，大括号可以省略；
	  * 如果是多条语句，就不能省略。建议永远不要省略。
	* c:一般来说：有左大括号就没有分号，有分号就没有左大括号

*/
/*
* A:if语句的格式2
* 
		if(比较表达式) {
			语句体1;
		}else {
			语句体2;
		}
* B:执行流程：
	* 首先计算比较表达式的值，看其返回值是true还是false。
	* 如果是true，就执行语句体1；
	* 如果是false，就执行语句体2；
* C:案例演示
	* a:获取两个数据中较大的值
	* b:判断一个数据是奇数还是偶数,并输出是奇数还是偶数

	* 注意事项：else后面是没有比较表达式的，只有if后面有。
*/
/*
* A:案例演示
	* if语句和三元运算符完成同一个效果
* B:案例演示
	* if语句和三元运算符的区别
	
	* 三元运算符实现的，都可以采用if语句实现。反之不成立。
	
	* 什么时候if语句实现不能用三元改进呢?
		* 当if语句控制的操作是一个输出语句的时候就不能。
		* 为什么呢?因为三元运算符是一个运算符，运算符操作完毕就应该有一个结果，而不是一个输出。

*/
class Demo4_If {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z;

		if (x > y) {
			//z = x;
			System.out.println(x + "是最大值");
		}else {
			//z = y;
			System.out.println(y + "是最大值");
		}

		//System.out.println(z);

		int a = 20;
		int b = 30;

		int c = (a > b)? a : b;
	}
}
/*
* A:if语句的格式3：
* 
		if(比较表达式1) {
			语句体1;
		}else if(比较表达式2) {
			语句体2;
		}else if(比较表达式3) {
			语句体3;
		}
		...
		else {
			语句体n+1;
		}
* B:执行流程：
	* 首先计算比较表达式1看其返回值是true还是false，
	* 如果是true，就执行语句体1，if语句结束。
	* 如果是false，接着计算比较表达式2看其返回值是true还是false，
	
	* 如果是true，就执行语句体2，if语句结束。
	* 如果是false，接着计算比较表达式3看其返回值是true还是false，
	
	* 如果都是false，就执行语句体n+1。
* C:注意事项:最后一个else可以省略,但是建议不要省略,可以对范围外的错误值提示 
*/
/*
* A:案例演示
	* 需求：获取三个数据中的最大值
	* if语句的嵌套使用。
*/
class Demo6_IfIf {
	public static void main(String[] args) {
		int a = 40;
		int b = 50;
		int c = 30;
		
		if (a > b) {
			if (a > c) {
				System.out.println(a + "是最大值");
			}else {
				System.out.println(c + "是最大值");
			}

		}else {	//b >= a
			if (b > c) {
				System.out.println(b + "是最大值");
			}else {
				System.out.println(c + "是最大值");
			}
		}
	}
}

import java.util.Scanner;
class Test1_If {
	public static void main(String[] args) {
		/*
		* A:练习1
		* 
				需求：键盘录入一个成绩，判断并输出成绩的等级。
				90-100 优
				80-89  良
				70-79  中
				60-69  及
				0-59   差
				
		* B:练习2
			* 需求：
				* 键盘录入x的值，计算出y的并输出。
				
				* x>=3	y = 2 * x + 1;
				* -1<x<3	y = 2 * x;
				* x<=-1	y = 2 * x - 1;
		*/
		Scanner sc = new Scanner(System.in);

		//需求：键盘录入一个成绩，判断并输出成绩的等级。
		/*System.out.println("请输入学生成绩范围在1到100之间");
		int x = sc.nextInt();

		if (x >= 90 && x <= 100) {
			System.out.println("优");
		}else if (x >= 80 && x <= 89 ) {
			System.out.println("良");
		}else if (x >= 70 && x <= 79 ) {
			System.out.println("中");
		}else if (x >= 60 && x <= 69 ) {
			System.out.println("及");
		}else if (x >= 0 && x <= 59 ) {
			System.out.println("差");
		}else {
			System.out.println("成绩录入错误");
		}*/

		//需求： 键盘录入x的值，计算出y的并输出
		System.out.println("请输入一个整数:");
		int x = sc.nextInt();
		int y = 0;
		if (x >= 3) {
			y = 2 * x + 1;
		}else if (x > -1 && x < 3) {
			y = 2 * x;
		}else if (x <= -1) {
			y = 2 * x - 1;
		}

		System.out.println(y);
	}
}
//6_选择结构switch
/*
		* A:switch语句的格式
		*		int x = 10;
				switch(表达式) {		//基本数据类型可以接收byte,short,char,int
				case 值1：		//引用数据类型可以接收枚举(JDK1.5)String字符串(JDK1.7)
				语句体1;
				break;
				case 值2：
				语句体2;
				break;
				…
				default：	
				语句体n+1;
				break;
				}
		 
		* B:switch语句的格式解释
		* C:面试题
			* byte可以作为switch的表达式吗?
			* long可以作为switch的表达式吗?
			* String可以作为switch的表达式吗?
		* C:执行流程
			* 先计算表达式的值
			* 然后和case后面的匹配，如果有就执行对应的语句，否则执行default控制的语句
		*/
class Test1_Switch {
	public static void main(String[] args) {
		//* A:整数(给定一个值,输出对应星期几)
		int week = 1;
		switch (week) {
		case 1:
			System.out.println("星期一");
		break;
		case 2:
			System.out.println("星期二");
		break;
		case 3:
			System.out.println("星期三");
		break;
		case 4:
			System.out.println("星期四");
		break;
		case 5:
			System.out.println("星期五");
		break;
		case 6:
			System.out.println("星期六");
		break;
		case 7:
			System.out.println("星期日");
		break;
		default:
			System.out.println("对不起没有对应的星期");
		break;
		}
	}
}

import java.util.Scanner;
class Test3_SwitchIf {
	public static void main(String[] args) {
		/*

		* 键盘录入月份，输出对应的季节
		一年有四季
		3,4,5春季
		6,7,8夏季
		9,10,11秋季
		12,1,2冬季
		*/
		Scanner sc = new Scanner(System.in);	//创建键盘录入对象
		System.out.println("请输入月份");
		int month = sc.nextInt();				//将键盘录入的结果存储在month
		/*switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println(month + "月是春季");
		break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "月是夏季");
		break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "月是秋季");
		break;
		case 12:
		case 1:
		case 2:
			System.out.println(month + "月是冬季");
		break;
		default:
			System.out.println("对不起没有对应的季节");
		break;
		}*/

		//用if语句来完成月份对应季节
		if (month > 12 || month < 1) {
			System.out.println("对不起没有对应的季节");
		}else if (month >= 3 && month <= 5) {
			System.out.println(month + "月是春季");
		}else if (month >= 6 && month <= 8) {
			System.out.println(month + "月是夏季");
		}else if (month >= 9 && month <= 11) {
			System.out.println(month + "月是秋季");
		}else {
			System.out.println(month + "月是冬季");
		}
	}
}

				
//day04
	//1_循环语句for语句
/*
* A:案例演示
	* 需求：求出1-10之间数据之和
* B:学生练习
	* 需求：求出1-100之间偶数和
	* 需求：求出1-100之间奇数和

	分析:1-10数据的和
	0 + 1
		1 + 2
			3 + 3
				6
				...
*/
class Test2_For {
	public static void main(String[] args) {
		//1-10的和
		/*int sum = 0; //1 + 2
		for (int i = 1;i <= 10 ;i++ ) {
			sum = sum + i;
		}

		System.out.println("sum = " + sum);*/

		//1-100的偶数和
		/*int sum = 0;
		for (int i = 1;i <= 100 ;i++ ) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}

		System.out.println("sum = " + sum);*/

		//1-100的奇数和
		int sum = 0;
		for (int i = 1;i <= 100 ;i+=2 ) {
			/*if (i % 2 != 0) {
				sum = sum + i;
			}*/
			sum = sum + i;
			//循环体里面,你循环多少次,就执行多少次
		}
		System.out.println(sum);
		//System.out.println("sum = " + sum);
	}
}

/*
* A:案例演示
	* 需求：在控制台输出所有的”水仙花数”

	* 所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
	* 举例：153就是一个水仙花数。
	* 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153

	分析:
	1,100 - 999
	2,获取每一个位数的值,百位,十位,个位
	3,判断各个位上的立方和是否等于这个数,如果等于打印
*/
class Test3_Flower {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 100;i <= 999 ;i++ ) {					//获取100到999之间的数
			int ge = i % 10;								//123 % 10 = 3 
			int shi = i / 10 % 10;							//123/10 = 12    % 10;
			int bai = i / 10 / 10 ;						//123 / 10 = 12  12/10 = 1 % 10 
			//其各位数字的立方和等于==该数本身
			if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
				//System.out.println(i); //输出符合条件水仙花
				count ++;
			}
		}
	}
}

/*
* A:案例演示
	* 需求：统计”水仙花数”共有多少个
	分析:
	1,需要有一个变量记录住水仙花数的个数
	2,获取到所有的3位数
	3,判断是否满足水仙花数
	4,如果满足条件,计数器就自增
*/
class Test4_FlowerCount {
	public static void main(String[] args) {
		int count = 0;

		for (int i = 100;i <= 999 ;i++ ) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 10 / 10;

			if (i == ge * ge * ge + shi * shi * shi + bai * bai * bai) {
				count ++;													//满足条件就自增,计数器思想
			}
		}

		System.out.println(count);
	}
}
	//2_循环语句while语句
/*
* A:循环结构while语句的格式：
* 		
		while循环的基本格式：
		while(判断条件语句) {
			循环体语句;
		}
		
		完整格式：
		
		初始化语句;
	    while(判断条件语句) {
			 循环体语句;
			 控制条件语句;
		}
* B:执行流程：
	* a:执行初始化语句
	* b:执行判断条件语句,看其返回值是true还是false
		* 如果是true，就继续执行
		* 如果是false，就结束循环
	* c:执行循环体语句;
	* d:执行控制条件语句
	* e:回到B继续。
* C:案例演示
	* 需求：请在控制台输出数据1-10
*/
class Demo1_While {
	public static void main(String[] args) {
		int x = 1;
		while (x <= 10) {
			System.out.println("x = " +  x);
			x++;
		}
	}
}

class Test1_While {
	public static void main(String[] args) {
		/*
		* A:求和思想
			* 求1-100之和
		* B:统计思想
			* 统计”水仙花数”共有多少个
		*/
		
		//求1-100之和
		/*int sum = 0;
		int i = 1;
		while (i <= 100) {
			sum += i;					//sum = sum + i;
			i++;						//让变量i自增
		}

		System.out.println("sum = " + sum);*/

		//统计”水仙花数”共有多少个
		int count = 0;					//计数器
		int i = 100;
		while (i <= 999) {
			//153
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 100;
			//i++; --> i = i+1; i =154
			if (i == ge * ge * ge + shi * shi * shi + bai * bai * bai) {
				count ++;
			}
			i++;	
		}

		System.out.println("count =" + count);
		//某屌丝为了追求女神,写了一段代码示爱,但是女神也会java,改动一下把屌丝拒绝
		int j = 1;
		while (j <= 10000);
		{
			System.out.println("I Love You!!!");
			j++;
		}
	}
}
	//3_循环语句dowhile语句
/*
* A:循环结构do...while语句的格式：
* 
		do {
			循环体语句;
		}while(判断条件语句);
		
		完整格式；
		初始化语句;
		do {
			循环体语句;
			控制条件语句;
		}while(判断条件语句);
* B:执行流程：
	* a:执行初始化语句
	* b:执行循环体语句;
	* c:执行控制条件语句
	* d:执行判断条件语句,看其返回值是true还是false
		* 如果是true，就继续执行
		* 如果是false，就结束循环
	* e:回到b继续。
* C:案例演示
	* 需求：请在控制台输出数据1-10
*/
class Demo1_DoWhile {
	public static void main(String[] args) {
		//while 和do while的区别
		/*int i = 11;
		do {
			System.out.println("i = " + i);
			i++;
		}
		while (i <= 10); //细节 ;
		while(i<= 10){
		
		}
		
		System.out.println("---------------------");

		int j = 11;
		while (j <= 10) {
			System.out.println("j = " + j);
			j++;
		}*/


		/*
		int i = 1;
		for (;i <= 10 ;i++ ) {
			System.out.println("i = " + i);
		}
		//i在这里没有作用,已经消失




		//System.out.println("i = " + i);			for语句执行后变量会被释放,不能再使用
		System.out.println("-------------------");
		int i = 1;
		while (i <= 10) {
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("-------------------");
		System.out.println("i = " + i);				//while语句执行后,初始化变量还可以继续使用*/

		//while语句的无限循环
		/*while (true) {
			System.out.println("hello world");
		}*/

		//System.out.println("hello world");
		//for语句的无限循环
		for (; ; ) {
			System.out.println("hello world");
		}
	}
}
	//4_循环嵌套
/*
* A:案例演示
	* 需求：在控制台输出九九乘法表。

1 * 1 = 1
1 * 2 = 2 2 * 2 = 4
1 * 3 = 3 2 * 3 = 6 3 * 3 = 9
...

*
**
***
*/
class Demo3_For99 {
	public static void main(String[] args) {
		for (int i = 9;i >= 1 ;i-- ) {					//行数

			for (int j = 1;j <= i ;j++ ) {				//列数
				System.out.print(j + "*" + i + "=" + (i * j) + "\t" );
			}
			System.out.println();

		}

		//System.out.println("\"");				转义双引号
		//System.out.println('\'');				//转义单引号
	}
}
	//5_控制语句
/*
* A:break的使用场景
	* 只能在switch和循环中 
*/
class Demo1_Break {
	public static void main(String[] args) {
		for (int x = 1;x <= 10 ;x++ ) {
			//1 2 3 4 
			if (x == 4) {
				break;							//跳出循环
			}

			System.out.println("x = " + x); // 1 2 3
		}
	}
}

/*
* A:continue的使用场景
	* 只能在循环中 
*/
class Demo2_Continue {
	public static void main(String[] args) {
		for (int x = 1;x <= 10 ;x++ ) {
			if (x == 4) {
				//break;
				continue;							//终止本次循环,继续下次循环
			}

			System.out.println("x = " + x);
		}
		System.out.println("----");
	}
}

class Demo3_Mark {										//mark 标记
	public static void main(String[] args) {
		/*outer: for (int i = 1;i <= 10 ;i++ ) {		//a就是标号,只要是合法的标识符即可
			System.out.println("i = " + i);
			inner: for (int j = 1;j <= 10 ;j++ ) {
				System.out.println("j = " + j);
				break outer;
			}
		}*/

		System.out.println("大家好");
		http://www.heima.com
		System.out.println("才是真的好");
	}
}

class Demo4_Return {
	public static void main(String[] args) {
		for (int i = 1;i <= 10 ;i++ ) {
			if (i == 4) {				
				//break;						//停止循环
				return;							//返回的意思,用来返回方法
			}
		}

		System.out.println("循环结束了");
	}
}

/*
		for(int x=1; x<=10; x++) {
			if(x%3==0) {
				//在此处填写代码
			}
			System.out.println(“Java基础班”);
		}
		
		我想在控制台输出2次:“Java基础班“
		我想在控制台输出7次:“Java基础班“
		我想在控制台输出13次:“Java基础班“	
*/
class Test1 {
	public static void main(String[] args) {
		for(int x=1; x<=10; x++) {
			if(x%3==0) {
				//break;						//我想在控制台输出2次:“Java基础班“
				//continue;						//我想在控制台输出7次:“Java基础班“
				System.out.println("Java基础班");//我想在控制台输出13次:“Java基础班“	
			}
			System.out.println("Java基础班");
		}
	}
}
	//6_方法
/*
	* C:方法的格式
	* 
			修饰符 返回值类型 方法名(参数类型 参数名1,参数类型 参数名2...) {
				方法体语句;
				return 返回值; 
			} 
	* D:方法的格式说明
		* 修饰符：目前就用 public static。后面我们再详细的讲解其他的修饰符。
		* 返回值类型：就是功能结果的数据类型。
		* 方法名：符合命名规则即可。方便我们的调用。
		* 参数：
			* 实际参数：就是实际参与运算的。
			* 形式参数；就是方法定义上的，用于接收实际参数的。
		* 参数类型：就是参数的数据类型
		* 参数名：就是变量名
		* 方法体语句：就是完成功能的代码。
		* return：结束方法的。
		* 返回值：就是功能的结果，由return带给调用者。 
	*/
/*
* A:如何写一个方法
	* 1,明确返回值类型
	* 2,明确参数列表 
* B:案例演示
	* 需求：求两个数据之和的案例
* C:方法调用图解
*/
class Demo2_Sum {
	public static void main(String[] args) {
		/*int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);

		int c = 30;
		int d = 40;
		int sum2 = c + d;
		System.out.println(sum2);*/

		int sum = add(10,20);
		System.out.println(sum);

		//add(30,40);						//有返回值方法的单独调用,没有意义
		System.out.println(add(30,40));		//这样调用是可以,but如果需要用这个结果不推荐这样调用

		//盘子 = 炒菜(地沟油,苏丹红,镉大米,烂白菜);
	}

	/*
	求两个整数的和
	1,整数的和结果应该还是整数
	2,有两个未知内容参与运算

	如何写方法
	1,明确返回值类型
	2,明确参数列表

	* 修饰符：目前就用 public static。后面我们再详细的讲解其他的修饰符。
		* 返回值类型：就是功能结果的数据类型。
		* 方法名：符合命名规则即可。方便我们的调用。
		* 参数：
			* 实际参数：就是实际参与运算的。
			* 形式参数；就是方法定义上的，用于接收实际参数的。
		* 参数类型：就是参数的数据类型
		* 参数名：就是变量名
		* 方法体语句：就是完成功能的代码。
		* return：结束方法的。
		* 返回值：就是功能的结果，由return带给调用者。
	*/
	public static int add(int a,int b) {			//int a = 10,int b = 20
		int sum = a + b;
		return sum;									//如果有返回值必须用return语句带回
	}

	/*
	盘子 炒菜(油,调料,米,菜) {
		炒菜的动作
		return 一盘菜;
	}
	*/

}

/*
* A:案例演示
	* 需求：根据键盘录入的行数和列数，在控制台输出星形
* B:方法调用：
	* 单独调用
	* 输出调用(错误)
	* 赋值调用(错误)
*/
import java.util.Scanner;
class Demo3_Method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//创建键盘录入对象
		System.out.println("请输入行数:");
		int row = sc.nextInt();							//将键盘录入的行数存储在row中
		System.out.println("请输入列数:");
		int column = sc.nextInt();						//将键盘录入的列数存储在column中
		
		//System.out.println(print(row,column));		//错误: 此处不允许使用 '空' 类型,返回值是void的方法不能输出调用
		//返回值是void的方法只能单独调用
		print(row,column);
	}

	/*
	在控制台输出矩形星形
	1,明确返回值类型,经分析没有具体的返回值类型,void
	2,明确参数列表int a,int b
	*/

	public static void print(int a,int b) {
		for (int i = 1;i <= a ;i++ ) {					//行数
			for (int j = 1;j <= b ;j++ ) {				//列数
				System.out.print("*");
			}
			System.out.println();
		}

		//return ;										//如果返回值类型是void,return可以省略,即使省略系统也会默认给加上,形式是return;
	}
}

/*
重载:方法名相同,参数列表不同,与返回值类型无关
重载的分类
1,参数个数不同
2,参数类型不同
	顺序不同
*/
class Demo4_Overload {						//overload重载
	public static void main(String[] args) {
		double sum1 = add(10,20.1);
		System.out.println(sum1);

		int sum2 = add(10,20,30);
		System.out.println(sum2);

		double sum3 = add(12.3,13);
		System.out.println(sum3);
	}

	/*
	求两个整数的和
	1,返回值类型int
	2,参数列表 int a,int b
	*/

	public static double add(int a,double b) {
		return a + b;
	}

	/*
	求三个整数的和
	1,返回值类型int
	2,参数列表 int a,int b,int c
	*/

	public static int add(int a,int b,int c) {
		return a + b + c;
	}

	/*
	求两个小数的和
	1,返回值类型double
	2,参数列表 double a,double b
	*/

	public static double add(double a,int b) {
		return a + b;
	}
}

class MethodDemo {
	public static void main(String [] args){
    //千万不要在这里面写方法
	   int  he =  add(10,20,30);
	   System.out.println("he = " + he);
	}
//要在大括号下面去书写
//如果不需要返回任何值,就写void
// 如果要返回具体的数据,看这个数据是什么类型的返回值就写什么类型的

	public static int add(int a,int b,int c){
		int sum = a + b + c;
		return sum;
	} 

//写好方法后 怎么调用?
//在主方法里面,直接写方法名(传入相应参数)
}

/*
* A:案例演示
	* 需求：键盘录入两个数据，返回两个数中的较大值
* B:案例演示
	* 需求：键盘录入两个数据，比较两个数是否相等     
*/
import java.util.Scanner;
class Test1_Method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				//创建键盘录入对象
		System.out.println("请输入第一个整数:");
		int x = sc.nextInt();								//将键盘录入的整数存储在x中
		System.out.println("请输入第二个整数:");
		int y = sc.nextInt();								//将键盘录入的整数存储在y中

		//int max = getMax(x,y);
		//System.out.println(max);

		boolean b = isEquals(x,y);
		System.out.println(b);
	}

	/*
	返回连个整数的较大值
	1,明确返回值类型 int
	2,明确参数列表 int a,int b
	*/
	public static int getMax(int a,int b) {
		return a > b ? a : b;
	}

	/*
	判断两个整数是否相等
	1,明确返回值类型 boolean
	2,明确参数列表 int a,int b
	*/
	public static boolean isEquals(int a,int b) {		//isEquals 是否相等
		return a == b;
	}
}

/*
* A:案例演示
	* 需求：根据键盘录入的数据输出对应的乘法表
*/
import java.util.Scanner;
class Test2_Method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//创建键盘录入对象
		System.out.println("请录入一个整数,范围在1-9之间");
		int num = sc.nextInt();						//将键盘录入的整数存储在num中
		print99(num);
	}

	/*
	打印99乘法表
	1,返回值类型void
	2,参数列表,int a
	*/

	public static void print99(int a) {
		for (int i = 1;i <= a ;i++ ) {					//行数
			for (int j = 1;j <= i ;j++ ) {				//列数
				System.out.print(j + "*" + i + "=" + (i * j) + "\t" );
			}
			System.out.println();
		}
	}
}

/*
* A:案例演示
	* 需求：比较两个数据是否相等。
	* 参数类型分别为两个int类型，两个double类型，并在main方法中进行测试

*/
class Test3_Overload {
	public static void main(String[] args) {
		boolean b1 = isEquals(10,10);
		System.out.println(b1);

		boolean b2 = isEquals(10.5,10.5);
		System.out.println(b2);
	}

	/*
	比较两个数据是否相等
	1,返回值类型boolean
	2,参数列表int a,int b
	*/

	public static boolean isEquals(int a,int b) {
		return a == b;
	}

	/*
	比较两个数据是否相等
	1,返回值类型boolean
	2,参数列表double a,double b
	*/

	public static boolean isEquals(double a,double b) {
		return a == b;
	}
}

//day05
	//1_一维数组
class ArrayDemo01 {
	public static void main(String[] args) {
		//定义一个数组,静态初始化
		int[] arr = {10,20,13,15,25,10,15};
		//数组遍历: 遍历是什么意思? 把数组中的每个元素一个个拿出来看一下
		//System.out.println(arr[0]);
		//arr.length 属性:数组名.length
		for (int i = 0;i < arr.length ;i++ ){  //数组中有多少个元素,我就帮你一个个打印出来 //细节 别写=号
			System.out.println(arr[i]); //
		}

	}
}

class ArrayReverseDemo {
	public static void main(String[] args) {
		//第一步 创建一个数组
		int [] arr = {11,22,33,44,55};
		//第二步: reverseArr
		int[] newArr = reverseArr(arr);
		for (int j = 0;j < newArr.length ;j++ )
		{
			System.out.print(newArr[j] + " ");
		}
	}

	public static int[] reverseArr(int[] oldArr){
		//思想 
		//第一步 创建一个新的数组,然后长度和你传进来的数组长度一样
		//第二步 把旧的数组元素 从后面开始 往前一个个 存到新的数组里面
		int [] newArr = new int[oldArr.length];
		//第三步 遍历
		for (int i = 0;i < oldArr.length ;i++ )
		{
			newArr[i] = oldArr[oldArr.length - 1 - i]; 
		}
		return newArr;
		/*
		for (int j = 0;j < newArr.length ;j++ )
		{
			System.out.print(newArr[j] + " ");
		}*/

	}
}

/*
* A:为什么要有数组(容器)
	* 为了存储同种数据类型的多个值
* B:数组概念
	* 数组是存储同一种数据类型多个元素的集合。也可以看成是一个容器。
	* 数组既可以存储基本数据类型，也可以存储引用数据类型。

* C:数组定义格式
	数据类型[] 数组名 = new 数据类型[数组的长度];
*/
class Demo1_Array {
	public static void main(String[] args) {
		int x = 10;
		x = 20;

		System.out.println("x = " + x);

		//数据类型[] 数组名 = new 数据类型[数组的长度];
		int[] arr = new int[5];				//可以存储五个int类型的数据

		/*
		左边:
		int:数据类型
		[]:代表的数组,几个中括号就代表几维数组
		arr:合法的标识符

		右边:
		new:创建新的实体或对象
		int:数据类型
		[]:代表的数组
		5:代表数组的长度
		*/

	}
}

/*
* A:什么是数组的初始化
	* 就是为数组开辟连续的内存空间，并为每个数组元素赋予值 
* B:如何对数组进行初始化
	* a:动态初始化 只指定长度，由系统给出初始化值
		* int[] arr = new int[5]; 	
	* b:静态初始化 给出初始化值，由系统决定长度	
* C:动态初始化的格式：
	* 数据类型[] 数组名 = new 数据类型[数组长度];
* D:案例演示
	* 输出数组名称和数组元素

	整数类型:byte,short,int,long默认初始化值都是0
	浮点类型:float,double默认初始化值都是0.0
	布尔类型:boolean默认初始化值false
	字符类型:char默认初始化值'\u0000'
	char在内存中占的两个字节,是16个二进制位
	\u0000,每一个0其实代表的是16进制的0,那么四个0就是代表16个二进制位

	[I@19bb25a

	[代表是数组,几个就代表几维
	I代表是int类型
	@是固定的
	19bb25a代表的是数组的地址值
*/
class Demo2_Array {
	public static void main(String[] args) {
		//数据类型[] 数组名 = new 数据类型[数组长度];
		int[] arr = new int[5];				//动态初始化,在内存中开辟连续的5块空间

		System.out.println(arr[0]);			//系统给出默认初始化值,整数类型的都是0
											
		arr[0] = 10;

		System.out.println(arr[0]);	

		System.out.println(arr);			//[I@19bb25a
	}
}

/*
* A:栈(掌握)
	* 存储局部变量 
	局部变量:定义在方法声明上和方法中的变量
* B:堆(掌握)
	* 存储new出来的数组或对象 
* C:方法区
	* 面向对象部分讲解 
* D:本地方法区
	* 和系统相关 
* E:寄存器
	* 给CPU使用
*/
class Demo3_Array {
	public static void main(String[] args) {
		int[] arr = new int[3];						//动态初始化,创建3块连续的空间
		System.out.println(arr);
		arr[0] = 10;
		arr[1] = 20;

		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}
}

class Demo4_Array {
	public static void main(String[] args) {
		int[] arr1 = new int[3];				//创建数组,长度为3
		int[] arr2 = new int[3];				//创建数组,长度为3

		System.out.println(arr1);				//打印数组的地址值
		System.out.println(arr2);

		arr1[0] = 10;							//给第一个数组中第一个元素赋值
		arr2[1] = 20;							//给第二个数组中第二个元素赋值

		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);

		System.out.println("--------------------------------------");

		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
	}
}

//三个引用两个数组
class Demo5_Array {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		int[] arr2 = new int[5];
		int[] arr3 = arr2;

		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);

		arr1[0] = 10;
		arr1[1] = 20;

		arr2[1] = 30;
		arr3[1] = 40;
		arr3[2] = 50;

		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println("-------------------------------");
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
		System.out.println("-------------------------------");
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
		System.out.println(arr3[4]);
	}
}

/*
* A:静态初始化的格式：
	* 格式：数据类型[] 数组名 = new 数据类型[]{元素1,元素2,…};
	* 简化格式：
		* 数据类型[] 数组名 = {元素1,元素2,…};
* B:案例演示
	* 对数组的解释
	* 输出数组名称和数组元素
* C:画图演示
	* 一个数组
*/
class Demo6_Array {
	public static void main(String[] args) {
		//数据类型[] 数组名 = new 数据类型[]{元素1,元素2,…};
		//int[] arr = new int[5]{11,22,33,44,55};	//不允许动静结合
		int[] arr2 = {11,22,33,44,55};			//静态初始化的简写形式

		//int[] arr;								//声明数组引用
		//arr = new int[]{11,22,33,44,55};

		//int[] arr2;
		//arr2 = {11,22,33,44,55};				//简写形式声明和赋值在同一行

		System.out.println(arr2);
		System.out.println(arr2[4]);
	}
}

/*
* A:案例演示
	* a:ArrayIndexOutOfBoundsException:数组索引越界异常
		* 原因：你访问了不存在的索引。
	* b:NullPointerException:空指针异常
		* 原因：数组已经不在指向堆内存了。而你还用数组名去访问元素。
		* int[] arr = {1,2,3};
		* arr = null;
		* System.out.println(arr[0]);
*/
class Demo7_Exception {
	public static void main(String[] args) {
		int[] arr = new int[5];						//0x0011
		//System.out.println(arr[-1]);				//当访问数组中不存在的索引,会出现索引越界异常

		arr = null;
		System.out.println(arr[0]);					//当数组引用赋值为null,再去调用数组中的元素就会出现空指针异常
	}
}

/*
* A:案例演示
	* 数组遍历：就是依次输出数组中的每一个元素。
	* 数组的属性:arr.length数组的长度
	* 数组的最大索引:arr.length - 1;
*/
class Demo8_Array {
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};

		/*System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);*/
		
		for (int i = 0;i < 5 ;i++ ) {
			System.out.println(arr[i]);
		}
		System.out.println("---------------");
		//arr.length 代表的是数组的长度
		System.out.println(arr.length);
		for (int i = 0;i < arr.length ;i++ ) {
			System.out.println(arr[i]);
		}

		int[] arr2 = {3,4,5};
		print(arr2);
	}

	/*
	数组的遍历
	1,返回值类型void
	2,参数列表int[] arr
	*/

	public static void print(int[] arr) {
		for (int i = 0;i < arr.length ;i++ ) {
			System.out.print(arr[i] + " ");
		}
	}
}

/*
* A:案例演示
	* 数组获取最值(获取数组中的最大值最小值)
*/
class Demo9_Array {
	public static void main(String[] args) {
		int[] arr = {33,77,22,44,55};
		int max = getMax(arr);
		System.out.println(max);
	}

	/*
	获取数组中最大值
	1,返回值类型int
	2,参数列表int[] arr
	*/

	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1;i < arr.length ;i++ ) {			//从数组的第二个元素开始遍历
			if (max < arr[i]) {							//如果max记录的值小于的数组中的元素
				max = arr[i];							//max记录住较大的
			}
		}

		return max;
	}
}

/*
* A:案例演示
	* 数组元素反转(就是把元素对调)
*/
class Demo10_Array {
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};
		reverseArray(arr);
		print(arr);
	}

	/*
	数组元素反转
	1,明确返回值类型void
	2,明确参数列表int[] arr
	*/

	public static void reverseArray(int[] arr) {
		for (int i = 0;i < arr.length / 2 ; i++) {
			//arr[0]和arr[arr.length-1-0]交换
			//arr[1]和arr[arr.length-1-1]交换
			//arr[2]和arr[arr.lentth-1-2]
			//...

			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}

	/*
	数组遍历
	1,明确返回值类型void
	2,明确参数列表int[] arr
	*/

	public static void print(int[] arr) {
		for (int i = 0;i < arr.length ;i++ ) {				//遍历数组中的每一个元素
			System.out.print(arr[i] + " ");					//打印在控制台
		}
	}
}

/*
* A:案例演示
	* 数组查表法(根据键盘录入索引,查找对应星期)
*/
import java.util.Scanner;
class Demo11_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入对应的星期范围在1-7");
		int week = sc.nextInt();

		System.out.println("星期" + getWeek(week));
	}

	/*
	根据索引返回对应的星期
	1,返回值类型char
	2,参数列表int week
	*/

	public static char getWeek(int week) {
		char[] arr = {' ','一','二','三','四','五','六','日'};		//定义了一张星期表
		return arr[week];											//通过索引获取表中的元素
	}
}

/*
* A:案例演示
	* 数组元素查找(查找指定元素第一次在数组中出现的索引)
*/
class Demo12_Array {
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55,66,77};
		int index = getIndex(arr,88);
		System.out.println(index);
	}

	/*
	查找元素索引
	1,返回值类型int
	2,明确参数列表,int[] arr,int value
	*/

	public static int getIndex(int[] arr,int value) {
		for (int i = 0;i < arr.length ;i++ ) {				//数组的遍历
			if (arr[i] == value) {							//如果数组中的元素与查找的元素匹配
				return i;
			}

		}
		return -1;
		
	}
}

	//2_二维数组
/*
* A:二维数组概述
* B:二维数组格式1
	* int[][] arr = new int[3][2]; 
* C:二维数组格式1的解释
* D:注意事项
	* a:以下格式也可以表示二维数组
		* 1:数据类型 数组名[][] = new 数据类型[m][n];
		* 2:数据类型[] 数组名[] = new 数据类型[m][n];
	* B:注意下面定义的区别
	* 
			int x;
			int y;
			int x,y;
			
			int[] x;
			int[] y[];
			
			int[] x,y[];	x是一维数组,y是二维数组
* E:案例演示
	* 定义二维数组，输出二维数组名称，一维数组名称，一个元素
*/
class Demo1_Array {
	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		/*
		这是一个二维数组
		这个二维数组中有3个一维数组
		每个一维数组中有2个元素

		[[I@19bb25a									//二维数组的地址值
		[I@da6bf4									//一维数组的地址值
		0											//元素值
		*/
		System.out.println(arr);					//二维数组
		System.out.println(arr[0]);					//二维数组中的第一个一维数组
		System.out.println(arr[0][0]);				//二维数组中的第一个一维数组的第一个元素
	}
}

/*
* A:二维数组格式2
	* int[][] arr = new int[3][]; 
* B:二维数组格式2的解释
* C:案例演示
	* 讲解格式，输出数据，并画内存图
*/
class Demo3_Array {
	public static void main(String[] args) {
		int[][] arr = new int[3][];				//这是一个二维数组,这个二维数组中有三个一维数组,三个一维数组都没有被赋值
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		arr[0] = new int[3];					//第一个一维数组中可以存储三个int值
		arr[1] = new int[5];					//第二个一维数组中可以存储五个int值
		System.out.println("------------------");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}

/*
* A:二维数组格式3
	* int[][] arr = {{1,2,3},{4,5},{6,7,8,9}}; 
* B:二维数组格式3的解释
* C:案例演示
	* 讲解格式，输出数据，并画内存图
*/
class Demo4_Array {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5},{6,7,8,9}}; //这是一个二维数组,这个二维数组中每个大括号都代表一个一维数组
		System.out.println(arr);				//[[I@19bb25a,二维数组的地址值
		System.out.println(arr[0]);				//[I@da6bf4,一维数组的地址值
		System.out.println(arr[0][0]);			//1,一维数组中的元素值
	}
}

/*
* A:案例演示
	* 需求：二维数组遍历

	* 外循环控制的是二维数组的长度，其实就是一维数组的个数。
	* 内循环控制的是一维数组的长度。

*/
class Test1_Array {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5},{6,7,8,9}};

		for (int i = 0;i < arr.length ;i++ ) {			//获取到每个二维数组中的一维数组
			for (int j = 0;j < arr[i].length ;j++ ) {	//获取每个一维数组中的元素
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}
	}
}

/*
* A:案例演示
* 
		需求：公司年销售额求和
		某公司按照季度和月份统计的数据如下：单位(万元)
		第一季度：22,66,44
		第二季度：77,33,88
		第三季度：25,45,65
		第四季度：11,66,99
*/
class Test2_Array {
	public static void main(String[] args) {
		int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};

		int sum = 0;									//定义变量,记录每次相加的结果
		for (int i = 0;i < arr.length ;i++ ) {			//获取每一个一维数组
			for (int j = 0;j < arr[i].length ;j++ ) {	//获取每一个一维数组中的元素
				sum = sum + arr[i][j];					//累加
			}
		}

		System.out.println(sum);
	}
}

/*
基本数据类型的值传递,不改变原值,因为调用后就会弹栈,局部变量随之消失
引用数据类型的值传递,改变原值,因为即使方法弹栈,但是堆内存数组对象还在,可以通过地址继续访问

Java中到底是传值还是传址
1,既是传值,也是传地址,基本数据类型传递的值,引用数据类型传递的地址
2,java中只有传值,因为地址值也是值(出去面试都说这种,支持者是高司令(java之父))
*/
class Test3_Array {
	public static void main(String[] args) {
		/*int a = 10;
		int b = 20;
		System.out.println("a:"+a+",b:"+b);			//a = 10,b = 20
		change(a,b);
		System.out.println("a:"+a+",b:"+b);			//?*/

		int[] arr = {1,2,3,4,5};
		change(arr);
		System.out.println(arr[1]);
	}

	public static void change(int a,int b) {		//a = 10, b= 20
		System.out.println("a:"+a+",b:"+b);			//a = 10,b = 20
		a = b;										//a = 20
		b = a + b;									//b = 40
		System.out.println("a:"+a+",b:"+b);			//a = 20, b = 40
	}

	public static void change(int[] arr) {			//1,4,3,8,5
		for(int x=0; x<arr.length; x++) {
			if(arr[x]%2==0) {
				arr[x]*=2;
			}
		}
	}
}
	
//day06
	//1_类的定义及使用
//第四步:写个测试类,包含主方法
class CarDemo {
	//第五步:注意:要在主方法里面创建对象
	public static void main(String[] args) {
		//第六步:创建对象  格式: 类名 对象名 = new 类名();
		Car c = new Car();
		//第七步:赋值 格式 : 对象名.成员变量名
		c.color = "红色";
		c.num = 4;
		//第八步:调用成员方法 格式: 对象名.成员方法名
		c.run();
	}
}

/*
汽车类（Car）
      属性：车的颜色（color），车的轮胎个数（num）
      行为：车会跑（run）
	  */
//第一步:写class + 类名
class Car {
	//第二步:写属性,成员变量
	String color;
	int num;
	//第三步:写行为,成员方法
	//怎么写方法?
	public void run() {
		System.out.println(color + "的"+num+"个轮胎的汽车跑起来");
	}
}

class Demo2_Phone {
	public static void main(String[] args) {
		//创建对象
		Phone p = new Phone();
		//调用对象中的属性并赋值
		p.brand = "锤子";
		p.price = 998;

		System.out.println(p.brand + "..."  + p.price);

		//调用成员方法
		p.call();
		p.sendMessage();
		p.playGame();
	}
}

/*
* 模仿学生类，让学生自己完成
	* 属性:品牌(brand)价格(price)
	* 行为:打电话(call),发信息(sendMessage)玩游戏(playGame)

*/
class Phone {
	String brand;					//品牌
	int price;						//价格

	public void call() {			//打电话
		System.out.println("打电话");
	}

	public void sendMessage() {		//发信息
		System.out.println("发信息");
	}

	public void playGame() {		//玩游戏
		System.out.println("玩游戏");
	}
}

class Demo1_Student {
	public static void main(String[] args) {
		//创建对象的格式:类名 对象名 = new 类名();
		//对象名:其实就是合法的标识符,如果是一个单词所有字母小写,如果是多个单词,从第二个单词开始首字母大写
		Student s = new Student();
		//* D:如何使用成员变量呢?
		//* 对象名.变量名
		s.name = "张三";
		s.age = 23;

		System.out.println(s.name + "..." + s.age);
		//* E:如何使用成员方法呢?
		//* 对象名.方法名(...)
		s.study();
		s.sleep();
	}
}


/*
* A:案例演示
	* 属性:姓名,年龄,性别
	* 行为:学习,睡觉

* B:我们如何描述现实世界事物
	* 属性	就是该事物的描述信息(事物身上的名词)
	* 行为	就是该事物能够做什么(事物身上的动词)
* C:Java中最基本的单位是类,Java中用class描述事物也是如此
	* 成员变量	就是事物的属性
	* 成员方法	就是事物的行为
* D:定义类其实就是定义类的成员(成员变量和成员方法)
	* a:成员变量	和以前定义变量是一样的，只不过位置发生了改变。在类中，方法外。
	* b:成员方法	和以前定义方法是一样的，只不过把static去掉，后面在详细讲解static的作用。
*/

class Student {
	String name;						//姓名
	int age;							//年龄
	String gender;						//性别

	public void study() {				//定义学习的方法
		System.out.println("学生学习");
	}

	public void sleep() {				//定义睡觉的方法
		System.out.println("学生睡觉");
	}
}

	//2_面向对象内存图
class Demo1_Car {
	public static void main(String[] args) {
		Car c1 = new Car();				//创建对象

		//调用属性并赋值
		c1.color = "red";				//为车的颜色赋值
		c1.num = 8;						//为车的轮胎数赋值

		//调用行为
		c1.run();

		Car c2 = new Car();				//创建对象
		c2.color = "black";				//为车的颜色赋值
		c2.num = 4;						//为车的轮胎数赋值
		c2.run();

		//c2 = null;						//用null把原来的地址值覆盖掉了

		//c2.run();						//c2里面记录的是null,所以报出空指针异常

		Car c3 = c2;
		c3.run();
		
	}
}
/*
车的属性
	车的颜色
	车的轮胎数
车的行为
	车运行
*/

class Car {
	//成员变量
	String color;						//车的颜色
	int num;							//车的轮胎数

	public void run() {					//车运行
		System.out.println(color + "..." + num);
	}
}

class Demo2_Person {
	public static void main(String[] args) {
		Person p = new Person();
		p.speak();
	}
}
/*
* A:在类中的位置不同
	* 成员变量：在类中方法外
	* 局部变量：在方法定义中或者方法声明上
* B:在内存中的位置不同
	* 成员变量：在堆内存(成员变量属于对象,对象进堆内存)
	* 局部变量：在栈内存(局部变量属于方法,方法进栈内存)
* C:生命周期不同
	* 成员变量：随着对象的创建而存在，随着对象的消失而消失
	* 局部变量：随着方法的调用而存在，随着方法的调用完毕而消失
* D:初始化值不同
	* 成员变量：有默认初始化值
	* 局部变量：没有默认初始化值，必须定义，赋值，然后才能使用。
	
* 注意事项：
	* 局部变量名称可以和成员变量名称一样，在方法中使用的时候，采用的是就近原则。
	* 基本数据类型变量包括哪些:byte,short,int,long,float,double,boolean,char
	* 引用数据类型变量包括哪些:数组,类,接口,枚举
*/
class Person {
	String name;						//成员变量
	int num;

	public void speak(int x) {
		int num = 10;						//x和num都是局部变量
		System.out.println(name);
	
		System.out.println(num);
	}
}

	//3_匿名对象
class Demo1_Student {
	public static void main(String[] args) {
		print(10);
		//对象的引用 对象名
		Student s = new Student();					//创建对象,并将对象的地址值赋值给s

		print(s);
	}

	public static void print(int x) {				//基本数据类型当作形式参数
		System.out.println(x);
	}

	public static void print(Student stu) {			//引用数据类型当作形式参数
		stu.name = "张三";
		stu.age = 23;
		stu.speak();
	}
}

/*
* A:方法的参数是类名public void print(Student s){}//print(new Student());
	* 如果你看到了一个方法的形式参数是一个类类型(引用类型)，这里其实需要的是该类的对象。
*/
class Student {
	String name;					//姓名
	int age;						//年龄

	public void speak() {
		System.out.println(name + "..." + age);
	}
}

/*
* A:什么是匿名对象
	* 没有名字的对象 
* B:匿名对象应用场景
	* a:调用方法，仅仅只调用一次的时候。
		* 那么，这种匿名调用有什么好处吗?
			* 节省代码 
		* 注意：调用多次的时候，不适合。匿名对象调用完毕就是垃圾。可以被垃圾回收器回收。
	* b:匿名对象可以作为实际参数传递
* C:案例演示
	* 匿名对象应用场景
*/
class Demo2_Car {
	public static void main(String[] args) {
		/*Car c1 = new Car();			//创建有名字的对象
		c1.run();
		c1.run();

		new Car().run();			//匿名对象调用方法
		new Car().run();	*/		//匿名对象只适合对方法的一次调用,因为调用多次就会产生多个对象,不如用有名字的对象	
	
		//匿名对象是否可以调用属性并赋值?有什么意义?
		/*
		匿名对象可以调用属性,但是没有意义,因为调用后就变成垃圾
		如果需要赋值还是用有名字对象
		*/
		new Car().color = "red";
		new Car().num = 8;
		new Car().run();
	}
}

class Car {
	String color;			//颜色
	int num;				//轮胎数

	public void run() {
		System.out.println(color + "..." + num);
	}
}

class Demo3_Car {
	public static void main(String[] args) {
		//Car c1 = new Car();//地址值
		/*c1.color = "red";
		c1.num = 8;
		c1.run();*/
		//method(c1);

		method(c1);

		//Car c2 = new Car();
		//method(c2);
		method(new Car());				//匿名对象可以当作参数传递
	}

	//抽取方法提高代码的复用性
	public static void method(Car cc) {	//Car cc = new Car();  我这个方法 声明的是 我要的是Car对象
		cc.color = "red";
		cc.num = 8;
		cc.run();
	}
}

class Car {
	String color;			//颜色
	int num;				//轮胎数

	public void run() {
		System.out.println(color + "..." + num);
	}
}

	//4_封装
/*
* A:人类赋值年龄的问题
* B:private关键字特点
	* a:是一个权限修饰符
	* b:可以修饰成员变量和成员方法
	* c:被其修饰的成员只能在本类中被访问
* C:案例演示
	* 封装和private的应用：
	* A:把成员变量用private修饰
	* B:提供对应的getXxx()和setXxx()方法
	* private仅仅是封装的一种体现形式,不能说封装就是私有
*/
class Demo1_Person {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "张三";			//调用姓名属性并赋值

		//为什么要封装? 年龄 如果你赋值为负数,不合常理
		//p1.age = -17;				//调用年龄属性并赋值
		//p1.speak();					//调用行为

		p1.setAge(-17);

		System.out.println(p1.getAge());
	}
}

class Person {
	String name;					//姓名
	//特点:只能在本类中访问
	private int age;				//年龄
	
	//set方法 是否要传参数? set方法是需要你传入数据
	//为什么要用this关键字? 原则 见名知意
	public void setAge(int age) {		//设置年龄  校验数据
		if (a > 0 && a < 200) {
			//启动就近原则 ,引入关键字this
			this.age = age;
		}else {
			System.out.println("请回火星吧,地球不适合你");
		}
		
	}
	//获取方法 需不需要传参数? 不需要
	//顺序 : 应该先设置 再获取
	public int getAge() {			//获取年龄
		return age;
	}

	public void speak() {
		System.out.println(name + "..." + age);
	}
}

	//5_this
/*
* A:this关键字特点
	* 代表当前对象的引用 
* B:案例演示
	* this的应用场景
	* 用来区分成员变量和局部变量重名
*/
class Demo1_This {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("张三");
		p1.setAge(23);
		System.out.println(p1.getName() + "..." + p1.getAge());

		Person p2 = new Person();
		p2.setName("李四");
		p2.setAge(24);
		System.out.println(p2.getName() + "..." + p2.getAge());
	}
}

class Person {
	private String name;			//姓名
	private int age;				//年龄
	
	public void setAge(int age) {		//设置年龄
		if (age > 0 && age < 200) {
			this.age = age;
			//System.out.println(age);
		}else {
			System.out.println("请回火星吧,地球不适合你");
		}
		
	}

	public int getAge() {			//获取年龄
		return age;
	}

	public void setName(String name) {	//设置姓名
		this.name = name;
		//System.out.println(name);
	}

	public String getName() {
		return name;
	}
}

//第五步:书写一个测试类,带有main方法
class Demo2_Phone {
	//第六步:书写main方法,然后在main方法里面书写代码
	public static void main(String[] args) {
		//第七步:创建对象  格式: 类型 对象名 = new 类名();
		Phone p1 = new Phone();
		//第八步:调用成员set方法,设置成员属性  格式 对象名.方法名();
		p1.setBrand("三星");
		p1.setPrice(5288);
		//第九步:调用成员get方法 获取值
		System.out.println(p1.getBrand() + "..." + p1.getPrice());
		//第十步: 调用普通成员方法 对象名.方法名();
		p1.call();
		p1.sendMessage();
		p1.playGame();
	}
}

/*
手机类
	属性:品牌brand,价格price
	行为:打电话call,发短信sendMessage,玩游戏,playGame
*/
//第一步: 要做什么?描述一个手机类,需要写一个关键字 class + 类名
class Phone {								//java bean
	//第二步: 开始写成员变量,写成员变量要加关键字 private 私有化
	private String brand;					//品牌
	private int price;						//价格
	
	//第三步:提供对外公开访问方式 set/get方法
	public void setBrand(String brand) {	//设置品牌
		this.brand = brand;
	}

	public String getBrand() {				//获取品牌
		return this.brand;					//this.可以省略,你不加系统会默认给你加
	}

	public void setPrice(int price) {		//设置价格
		this.price = price;
	}

	public int getPrice() {					//获取价格
		return price;
	}
	//第四步:书写普通的成员方法
	public void call() {					//打电话
		System.out.println("打电话");
	}

	public void sendMessage() {				//发短信
		System.out.println("发短信");
	}

	public void playGame() {				//玩游戏
		System.out.println("玩游戏");
	}
}

//day07
	//1_构造方法
class Demo1_Constructor {						//Constructor构造
	public static void main(String[] args) {
		Person p = new Person();				//在一创建对象的时候,系统就帮我调用了构造方法
		//p.Person();							//构造方法不能用对象调用
		p.show();

		Person p2 = new Person();				//再次创建对象
	
		p2.show();
	}
}

/*
* A:构造方法概述和作用
	* 给对象的数据(属性)进行初始化
* B:构造方法格式特点
	* a:方法名与类名相同(大小也要与类名一致)
	* b:没有返回值类型，连void都没有
	* c:没有具体的返回值return;
*/

class Person {
	private String name;
	private int age;

	//构造方法
	public Person() {
		//System.out.println("Hello World!");
		//return;								//构造方法也是有return语句的,格式是return;
		name = "张三";
		age = 23;
	}

	public void show() {
		System.out.println(name + "..." + age);
	}
}

class Demo2_Person {
	public static void main(String[] args) {

		//对象名.方法名();
		//构造方法 不能单独调用 ,只能在创建对象的时候调用
		//我怎么区分我调用的是有参的构造方法,还是无参的构造方法?
		//你传了对应的参数,就调用了对应的构造方法,如果你不传任何参数,那会无参的构造方法!!
		//Person();

		Person p1 = new Person();
		p1.show();

		System.out.println("---------------------");

		Person p2 = new Person("张三",23);
		p2.show();

		System.out.println("---------------------");

		Person p3 = new Person("李四",24);
		p3.show();
	}
}
/*
* A:案例演示
	* 构造方法的重载
	* 重载:方法名相同,与返回值类型无关(构造方法没有返回值),只看参数列表
* B:构造方法注意事项
	* a:如果我们没有给出构造方法，系统将自动提供一个无参构造方法。
	* b:如果我们给出了构造方法，系统将不再提供默认的无参构造方法。
		* 注意：这个时候，如果我们还想使用无参构造方法，就必须自己给出。建议永远自己给出无参构造方法
		
*/
class Person {
	private String name;			//姓名
	private int age;				//年龄

	public Person() {				//空参构造
		System.out.println("空参的构造");
	}

	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("有参的构造");
	}
	
	public void show() {
		System.out.println(name + "..." + age);
	}
}

class Demo3_Person {
	public static void main(String[] args) {
		Person p1 = new Person("张三",23);
		//p1 = new Person("张天一",23);	//这种方式看运行结果貌似是改名了,其实是将原对象变成垃圾
		System.out.println(p1.getName() + "..." + p1.getAge());

		System.out.println("--------------------");
		Person p2 = new Person();		//空参构造创建对象
		p2.setName("李四");
		p2.setAge(24);

		p2.setName("李鬼");
		System.out.println(p2.getName() + "..." + p2.getAge());
	}
}
/*
构造方法
	给属性进行初始化
setXxx方法
	修改属性值
	这两种方式,在开发中用setXxx更多一些,因为比较灵活
*/
class Person {
	private String name;				//姓名
	private int age;					//年龄

	public Person() {					//空参构造
	}

	public Person(String name,int age) {//有参构造
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {	//设置姓名
		this.name = name;
	}

	public String getName() {			//获取姓名
		return name;
	}

	public void setAge(int age) {		//设置年龄
		this.age = age;
	}

	public int getAge() {				//获取年龄
		return age;
	}
}

class Demo4_Student {
	public static void main(String[] args) {
		Student s1 = new Student();					//使用空参构造
		s1.setName("张三");							//设置姓名
		s1.setAge(23);								//设置年龄

		System.out.println("我的姓名是:" + s1.getName() + ",我的年龄是:" + s1.getAge());
		//getXxx()获取属性值,可以打印,也可以赋值给其他的变量,做其他的操作
		Student s2 = new Student("李四",24);
		s2.show();									//只是为了显示属性值
	}
}
/*
* A:案例演示
	* 学生类：
		* 成员变量：
			* name，age
		* 构造方法：
			* 无参，带两个参
		* 成员方法：
			* getXxx()/setXxx()
			* show()：输出该类的所有成员变量值
* B:给成员变量赋值：
	* a:setXxx()方法
	* b:构造方法
	
* C:输出成员变量值的方式：
	* a:通过getXxx()分别获取然后拼接
	* b:通过调用show()方法搞定
*/

class Student {
	private String name;							//姓名
	private int age;								//年龄

	public Student(){}								//空参构造

	public Student(String name,int age) {			//有参构造
		//赋值
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {				//设置姓名
		this.name = name;
	}

	public String getName() {						//获取姓名
		return name;
	}

	public void setAge(int age) {					//设置年龄
		this.age = age;
	}

	public int getAge() {							//获取年龄
		return age;
	}

	public void show() {
		System.out.println("我的姓名是:" + name +  ",我的年龄是:" +  age);
	}
}

class Demo5_Phone {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.setBrand("苹果");
		p1.setPrice(1500);
		System.out.println(p1.getBrand() + "..." + p1.getPrice());

		Phone p2 = new Phone("小米",98);
		p2.show();
	}
}
/*
手机类:
	成员变量:
		品牌brand,价格price
	构造方法
		无参,有参
	成员方法
		setXxx和getXxx
		show
*/
class Phone {
	private String brand;						//品牌
	private int price;							//价格

	public Phone(){}							//空参构造

	public Phone(String brand,int price) {		//有参构造
		this.brand = brand;
		this.price = price;
	}

	public void setBrand(String brand) {		//设置品牌
		this.brand = brand;
	}

	public String getBrand() {					//获取品牌
		return brand;
	}

	public void setPrice(int price) {			//设置价格
		this.price = price;
	}

	public int getPrice() {						//获取价格
		return price;
	}

	public void show() {
		System.out.println(brand + "..." + price);
	}
}

	//2_创建对象的步骤
class Demo1_Student {
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
	}
}

class Student {
	private String name = "张三";
	private int age = 23;

	public Student() {
		name = "李四";
		age = 24;
	}

	public void show() {
		System.out.println(name + "..." + age);
	}
}
	
	//3_练习
	class Test1_Rectangle {							//Rectangle矩形
	public static void main(String[] args) {
		//第一种方式:使用构造方法赋值
		Rectangle r = new Rectangle(10,20);
		System.out.println(r.getLength());		//周长
		System.out.println(r.getArea());		//面积
		//第二种方式:使用set方法赋值
		Rectangle r2 = new Rectangle();
		r2.setWidth(10);
		r2.setHigh(20);
		System.out.println(r2.getLength());		//周长
		System.out.println(r2.getArea());		//面积
	}
}
/*
* A:案例演示
	* 需求：
		* 定义一个长方形类,定义 求周长和面积的方法，
		* 然后定义一个测试类进行测试。
	分析:
		成员变量:
			宽width,高high
		空参有参构造
		成员方法:
			setXxx和getXxx
			求周长:getLength()
			求面积:getArea()
*/
class Rectangle {
	private int width;				//宽
	private int high;				//高

	public Rectangle(){}			//空参构造

	public Rectangle(int width,int high) {
		this.width = width;			//有参构造
		this.high = high;
	}

	public void setWidth(int width) {//设置宽
		this.width = width;
	}

	public int getWidth() {			//获取宽
		return width;
	}

	public void setHigh(int high) {	//设置高
		this.high = high;
	}

	public int getHigh() {			//获取高
		return high;
	}

	public int getLength() {		//获取周长
		return 2 * (width + high);
	}

	public int getArea() {			//获取面积
		return width * high;
	}
}

class Test2_Employee {						//employee员工
	public static void main(String[] args) {
		Employee e = new Employee("令狐冲","9527",20000);
		e.work();
	}
}
/*
* A:案例演示
	* 需求：定义一个员工类Employee
	* 自己分析出几个成员，然后给出成员变量
		* 姓名name,工号id,工资salary 
	* 构造方法，
		* 空参和有参的
	* getXxx()setXxx()方法，
	* 以及一个显示所有成员信息的方法。并测试。
		* work 
*/
class Employee {
	private String name;					//姓名
	private String id;						//工号
	private double salary;					//工资

	public Employee() {}					//空参构造

	public Employee(String name, String id, double salary) {//有参构造
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void setName(String name) {		//设置姓名
		this.name = name;
	}

	public String getName() {				//获取姓名
		return name;
	}

	public void setId(String id) {			//设置id
		this.id = id;
	}

	public String getId() {					//获取id
		return id;
	}

	public void setSalary(double salary) {	//设置工资
		this.salary = salary;
	}
	
	public double getSalary() {				//获取工资
		return salary;
	}

	public void work() {
		System.out.println("我的姓名是:" + name + ",我的工号是:" + id + ",我的工资是:" + salary 
			+ ",我的工作内容是敲代码");
	}
}
	
	//4_static
class Demo1_Static {
	public static void main(String[] args) {
		Person p3 = new Person();
		p3.name = "福原爱老师";		//调用姓名属性并赋值
	    p3.country = "台湾";		//调用国籍属性并赋值
		p3.speak();

		Person p1 = new Person();	//创建对象
		p1.name = "苍老师";			//调用姓名属性并赋值
		p1.country = "日本";		//调用国籍属性并赋值
		p1.speak();

		Person p2 = new Person();
		p2.name = "小泽老师";		//调用姓名属性并赋值
	   // p2.country = "日本";		//调用国籍属性并赋值
		p2.speak();

		Person p4 = new Person();
		p4.name = "黄老师";		//调用姓名属性并赋值
	   // p2.country = "日本";		//调用国籍属性并赋值
		p4.speak();
		

		
		
	

		//Person.country = "日本";	//静态多了一种调用方式,可以通过类名.
		//System.out.println(Person.country);
	}
}

class Person {
	String name;					//姓名
	static String country;					//国籍

	public void speak() {			//说话的方法
		System.out.println(name + "..." + country);
	}
}

class Demo2_Static {
	public static void main(String[] args) {
		//Demo d = new Demo();
		//d.print1();
		//Demo d = new Demo();
		//System.out.println(d.num1);
		System.out.println(Demo.num1);
		//Demo.print2();
	}
}
/*
* A:static的注意事项
	* a:在静态方法中是没有this关键字的
		* 如何理解呢?
			* 静态是随着类的加载而加载，this是随着对象的创建而存在。
			* 静态比对象先存在。
	* b:静态方法只能访问静态的成员变量和静态的成员方法
		* 静态方法：
			* 成员变量：只能访问静态变量
			* 成员方法：只能访问静态成员方法
		* 非静态方法：
			* 成员变量：可以是静态的，也可以是非静态的
			* 成员方法：可是是静态的成员方法，也可以是非静态的成员方法。
		* 简单记：
			* 静态只能访问静态。
*/
class Demo {
	int num1 = 10;						//非静态的成员变量
	static int num2 = 20;				//静态的成员变量

	/*public void print1() {				//非静态的成员方法,既可以访问静态的成员也可以访问非静态的
		System.out.println(num1);
		System.out.println(num2);
	}*/

	public static void print2() {		//静态的成员方法
		//System.out.println(this.num1);//静态的成员方法不能访问非静态的,错误: 无法从静态上下文中引用非静态 变量 num1
		System.out.println(num2);
	}
}

class Demo3_Main {
	public static void main(String[] args) {			
		/*
		public : 被jvm调用,所以权限要足够大
		static : 被jvm调用,不需要创建对象,直接类名.调用即可
		void   : 被jvm调用,不需要有任何的返回值
		main   : 只有这样写才能被jvm识别,main不是关键字
		String[] args : 以前是用来接收键盘录入的
		*/

		System.out.println(args.length);
		for (int i = 0;i < args.length ;i++ ) {
			System.out.println(args[i]);
		}
	}
}
	
	//5_文档说明书的制作和使用
/**
这是一个数组工具类,里面封装了查找数组最大值,打印数组,数组反转的方法
@author fengjia
@version v1.0
*/
public class ArrayTool {
	//如果一个类中所有的方法都是静态的,需要再多做一步,私有构造方法,目的是不让其他类创建本类对象
	//直接用类名.调用即可
	/**
	私有构造方法
	*/
	private ArrayTool(){} //设计模式:单例模式

	//1,获取最大值

	/**
	这是获取数组中最大值的方法
	@param arr 接收一个int类型数组
	@return 返回数组中最大值
	*/
	public static int getMax(int[] arr) {
		int max = arr[0];						//记录第一个元素
		for (int i = 1;i < arr.length ;i++ ) {	//从第二个元素开始遍历
			if (max < arr[i]) {					//max与数组中其他的元素比较
				max = arr[i];					//记录住较大的
			}
		}

		return max;								//将最大值返回
	}
	//2,数组的遍历
	/**
	这是遍历数组的方法
	@param arr 接收一个int类型数组
	*/
	public static void print(int[] arr) {
		for (int i = 0;i < arr.length ;i++ ) {	//遍历数组
			System.out.print(arr[i] + " ");
		}
	}
	//3,数组的反转
	/**
	这是数组反转的方法
	@param arr 接收一个int类型数组
	*/
	public static void revArray(int[] arr) {
		for (int i = 0;i < arr.length / 2 ;i++ ) {	//循环次数是元素个数的一半
			/*
			arr[0]与arr[arr.length-1-0]	交换
			arr[1]与arr[arr.length-1-1]	交换
			arr[2]与arr[arr.length-1-2] 交换
			*/
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}
}

class Demo1_ArrayTool {
	public static void main(String[] args) {
		int[] arr = {33,11,22,66,55,44};
		/*ArrayTool at = new ArrayTool();
		int max = at.getMax(arr);				//获取最值
		System.out.println(max);
		
		System.out.println("---------------");
		at.print(arr);							//打印
		System.out.println();
		System.out.println("---------------");
		System.out.println("反转后:");
		at.revArray(arr);						//反转
		at.print(arr);	*/

		ArrayTool.print(arr);
	}
}

class Demo2_Math {
	public static void main(String[] args) {
		//double d = Math.random();
		//System.out.println(d);
		
		//Math.random()会生成大于等于0.0并且小于1.0的伪随机数
		for (int i = 0;i < 10 ;i++ ) {
			System.out.println(Math.random());
		}

		//生成1-100的随机数
		//Math.random()0.0000000 - 0.999999999
		//Math.random() * 100 ====> 0.00000 - 99.999999999
		//(int)(Math.random() * 100) ====> 0 - 99
		//(int)(Math.random() * 100) + 1

		for (int i = 0;i < 10 ;i++ ) {
			System.out.println((int)(Math.random() * 100) + 1);
		}
	}
}

	class Demo3_Static {
	public static void main(String[] args) {
		//method();								//错误: 无法从静态上下文中引用非静态 方法 method()
		Demo3_Static.print();					//在主方法中调用本类的静态方法,可以省略类名.,系统会默认加上
		Demo3_Static d = new Demo3_Static();	//非静态方法在调用的时候必须创建对象调用
		d.method();
	}

	public void method() {					
		System.out.println("Hello World!");		
	}

	public static void print() {
		System.out.println("Hello World!");
	}
}

/*
* A:案例演示
	* 需求：猜数字小游戏(数据在1-100之间)
*/
import java.util.Scanner;
class Test1_GuessNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				//创建键盘录入对象
		System.out.println("请输入一个整数,范围在1-100之间");
		int guessNum = (int)(Math.random() * 100) + 1;		//心里想的随机数
		while (true) {										//因为需要猜很多次,所以用无限循环
			int result = sc.nextInt();						//大家猜的数
			if (result > guessNum) {						//如果你们猜的数大于了我心里想的数
				System.out.println("大了");					//提示大了
			} else if (result < guessNum) {					//如果你们猜的数小于了我心里想的数
				System.out.println("小了");					//提示小了
			} else {										//如果既不大也不小
				System.out.println("中了");					//中了
				break;
			}
		}
	}
}
	
//day08
	//1_代码块
class Demo1_Code {
	public static void main(String[] args) {
		{
			int x = 10;						//限定变量的声明周期
			System.out.println(x);
		}
		
		Student s1 = new Student();
		System.out.println("---------------");
		Student s2 = new Student("张三",23);
	
	}

	static {
		System.out.println("我是在主方法类中的静态代码块");
	}
}

class Student {
	private String name;
	private int age;

	public Student(){
		//study();
		System.out.println("空参构造");
	}					//空参构造

	public Student(String name,int age) {//有参构造
		//study();
		this.name = name;
		this.age = age;
		System.out.println("有参构造");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	{											//构造代码块:每创建一次对象就会执行一次,优先于构造函数执行
		//System.out.println("构造代码块");
		study();
	}

	public void study() {
		System.out.println("学生学习");
	}

	static {									//随着类加载而加载,且只执行一次
		System.out.println("我是静态代码块");	//作用:用来给类进行初始化,一般用来加载驱动
	}											//静态代码块是优先于主方法执行
}

class Student {
	static {
		System.out.println("Student 静态代码块");
	}
	
	{
		System.out.println("Student 构造代码块");
	}
	
	public Student() {
		System.out.println("Student 构造方法");
	}
}

class Demo2_Student {
	static {
		System.out.println("Demo2_Student静态代码块");
	}
	
	public static void main(String[] args) {
		System.out.println("我是main方法");
		
		Student s1 = new Student();
		Student s2 = new Student();
	}
}
	//2_继承
class Demo1_Extends {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.color = "花";
		c.leg = 4;
		c.eat();
		c.sleep();

		System.out.println(c.leg  + "..." + c.color);
	}
}
/*
* A:继承(extends)
	* 让类与类之间产生关系,子父类关系 
* B:继承案例演示：
	* 动物类,猫类,狗类
	* 定义两个属性(颜色,腿的个数)两个功能(吃饭，睡觉)
* C:案例演示
	* 使用继承前
* D:案例演示
	* 使用继承后
*/
class Animal {
	String color;					//动物的颜色
	int leg;						//动物腿的个数

	public void eat() {				//吃饭的功能
		System.out.println("吃饭");
	}

	public void sleep() {			//睡觉的功能
		System.out.println("睡觉");
	}
}

class Cat extends Animal {
	
}

class Dog extends Animal {
	
}

/*
extends是继承的意思
Animal是父类
Cat和Dog都是子类
*/

class Demo2_Extends {
	public static void main(String[] args) {
		DemoC d = new DemoC();
		d.show();
	}
}
/*
* A:Java中类的继承特点
	* a:Java只支持单继承，不支持多继承。(一个儿子只能有一个爹)
		* 有些语言是支持多继承，格式：extends 类1,类2,...
	* b:Java支持多层继承(继承体系)
* B:案例演示
	* Java中类的继承特点
		* 如果想用这个体系的所有功能用最底层的类创建对象
		* 如果想看这个体系的共性功能,看最顶层的类 
*/
class DemoA {
	public void show() {
		System.out.println("DemoA");
	}
}

class DemoB extends DemoA {
	public void method() {
		System.out.println("DemoB");
	}
}

class DemoC extends DemoB {
	public void print() {
		System.out.println("DemoC");
	}
}

class Demo3_Extends {
	public static void main(String[] args) {
		Son s = new Son();
		s.show();
	}
}
/*
* A:继承的注意事项
	* a:子类只能继承父类所有非私有的成员(成员方法和成员变量)
	* b:子类不能继承父类的构造方法，但是可以通过super(马上讲)关键字去访问父类构造方法。
	* c:不要为了部分功能而去继承
	* 项目经理 姓名 工号 工资 奖金
	* 程序员	姓名 工号 工资
*/

class Father {
	private String name;
	private void show() {
		System.out.println("Hello World!");
	}
}

class Son extends Father {
}

class Demo4_Extends {
	public static void main(String[] args) {
		Son s = new Son();
		s.print();
	}
}
/*
* A:案例演示
	* a:不同名的变量
	* b:同名的变量
		子父类出现同名的变量只是在讲课中举例子有,在开发中是不会出现这种情况的
		子类继承父类就是为了使用父类的成员,那么如果定义了同名的成员变量没有意义了
*/

class Father {
	int num1 = 10;
	int num2 = 30;
}

class Son extends Father {
	int num2 = 20;

	public void print() {
		System.out.println(this.num1);				//this既可以调用本类的,也可以调用父类的(本类没有的情况下)
		System.out.println(this.num2);				//就近原则,子类有就不用父类的了
		System.out.println(super.num2);
	}
}

class Demo5_Extends {
	public static void main(String[] args) {
		Son s = new Son();
	}
}
/*
* A:案例演示
	* 子类中所有的构造方法默认都会访问父类中空参数的构造方法
* B:为什么呢?
	* 因为子类会继承父类中的数据，可能还会使用父类的数据。
	* 所以，子类初始化之前，一定要先完成父类数据的初始化。
	
	* 其实：
		* 每一个构造方法的第一条语句默认都是：super() Object类最顶层的父类。
*/

class Father extends Object {
	public Father() {
		super();
		System.out.println("Father 的构造方法");
	}
}

class Son extends Father {
	public Son() {
		super();							//这是一条语句,如果不写,系统会默认加上,用来访问父类中的空参构造
		System.out.println("Son 的构造方法");
	}
}

class Demo6_Extends {
	public static void main(String[] args) {
		Son s1 = new Son();
		System.out.println(s1.getName() + "..." + s1.getAge());
		System.out.println("--------------------");
		Son s2 = new Son("张三",23);
		System.out.println(s2.getName() + "..." + s2.getAge());
	}
}
/*
* A:案例演示
	* 父类没有无参构造方法,子类怎么办?
	* super解决
	* this解决
* B:注意事项
	* super(…)或者this(….)必须出现在构造方法的第一条语句上
*/
class Father {
	private String name;			//姓名
	private int age;				//年龄

	public Father() {				//空参构造
		System.out.println("Father 空参构造");
	}

	public Father(String name,int age) {	//有参构造
		this.name = name;
		this.age = age;
		System.out.println("Father 有参构造");
	}

	public void setName(String name) {	//设置姓名
		this.name = name;
	}

	public String getName() {			//获取姓名
		return name;
	}

	public void setAge(int age) {		//设置年龄
		this.age = age;
	}

	public int getAge() {				//获取年龄
		return age;
	}
}

class Son extends Father {
	public Son() {						//空参构造
		this("王五",25);				//本类中的构造方法
		//super("李四",24);				//调用父类中的构造方法
		
		System.out.println("Son 空参构造");
	}

	public Son(String name,int age) {	//有参构造
		super(name,age);
		System.out.println("Son 有参构造");
	}
}

class Demo7_Extends {
	public static void main(String[] args) {
		Son s = new Son();
		s.print();
		s.method();
	}
}
/*
* a:不同名的方法
* b:同名的方法
*/

class Father {
	public void print() {
		System.out.println("Fu print");
	}
}

class Son extends Father {
	public void method() {
		System.out.println("Zi Method");
	}

	public void print() {
		super.print();							//super可以调用父类的成员方法
		System.out.println("Zi print");
	}
}

class Demo7_Phone {
	public static void main(String[] args) {
		Ios8 i = new Ios8();
		i.siri();
		i.call();
	}
}

/*
B:方法重写的应用：
	* 当子类需要父类的功能，而功能主体子类有自己特有内容时，可以重写父类中的方法。这样，即沿袭了父类的功能，又定义了子类特有的内容。
	ios7系统 siri speak English
	ios8系统 siri 说中文
*/

class Ios7 {
	public void call() {
		System.out.println("打电话");
	}

	public void siri() {
		System.out.println("speak English");
	}
}

class Ios8 extends Ios7 {
	public void siri() {
		
		System.out.println("说中文");
		super.siri();
	}
}

class Demo8_双桨 {
	public static void main(String[] args) {
		DayOne d = new DayOne();
		d.泡妞();
		d.print();
	}
}
/*
	* a:父类中私有方法不能被重写
		* 因为父类私有方法子类根本就无法继承
	* b:子类重写父类方法时，访问权限不能更低
		* 最好就一致
	* c:父类静态方法，子类也必须通过静态方法进行重写
		* 其实这个算不上方法重写，但是现象确实如此，至于为什么算不上方法重写，多态中我会讲解(静态只能覆盖静态)
		
	* 子类重写父类方法的时候，最好声明一模一样。
*/
class 双桨 {
	public void sing() {
		System.out.println("唱红歌");
	}

	public void 泡妞() {
		System.out.println("唱红歌搞定林夕合鸟女士");
	}

	public static void print() {
		System.out.println("Fu print");
	}
}

class DayOne extends 双桨 {
	public void 泡妞() {
		System.out.println("霸王硬上弓");
	}

	public static void print() {				//静态只能覆盖静态,其实不算重写,多态时候详细讲解
		System.out.println("Zi print");
	}
}

class Fu{
	public int num = 10;
	public Fu(){
		System.out.println("fu");
	}
}
class Zi extends Fu{
	public int num = 20;
	public Zi(){
		//super();
		System.out.println("zi");
	}
	public void show(){
		int num = 30;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}
class Test1_Extends {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();
	}
}

class Test2_Extends {
	public static void main(String[] args) {
		Zi z = new Zi();
	}
	/*
	1,jvm调用了main方法,main进栈
	2,遇到Zi z = new Zi();会先将Fu.class和Zi.class分别加载进内存,再创建对象,当Fu.class加载进内存
	父类的静态代码块会随着Fu.class一起加载,当Zi.class加载进内存,子类的静态代码块会随着Zi.class一起加载
	第一个输出,静态代码块Fu,第二个输出静态代码块Zi
	3,走Zi类的构造方法,因为java中是分层初始化的,先初始化父类,再初始化子类,所以先走的父类构造,但是在执行
	父类构造时,发现父类有构造代码块,构造代码块是优先于构造方法执行的所以
	第三个输出构造代码块Fu,第四个输出构造方法Fu
	4,Fu类初始化结束,子类初始化,第五个输出的是构造代码块Zi,构造方法Zi
	*/
}
class Fu {
	static {
		System.out.println("静态代码块Fu");
	}

	{
		System.out.println("构造代码块Fu");
	}

	public Fu() {
		System.out.println("构造方法Fu");
	}
}

class Zi extends Fu {
	static {
		System.out.println("静态代码块Zi");
	}

	{
		System.out.println("构造代码块Zi");
	}

	public Zi() {
		System.out.println("构造方法Zi");
	}
}

class Test3_Person {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
/*
* 使用继承前的学生和老师案例
	* 属性:姓名,年龄
	* 行为:吃饭
	* 老师有特有的方法:讲课
	* 学生有特有的方法:学习
*/

class Student {
	private String name;					//姓名
	private int age;						//年龄

	public Student() {}						//空参构造

	public Student(String name,int age) {	//有参构造
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {		//设置姓名
		this.name = name;
	}

	public String getName() {				//获取姓名
		return name;
	}

	public void setAge(int age) {			//设置年龄
		this.age = age;
	}

	public int getAge() {					//获取年龄
		return age;
	}

	public void eat() {						//吃饭
		System.out.println("学生吃饭");
	}

	public void study() {					//学习
		System.out.println("学生学习");
	}
}

class Teacher {
	private String name;					//姓名
	private int age;						//年龄

	public Teacher() {}						//空参构造

	public Teacher(String name,int age) {	//有参构造
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {		//设置姓名
		this.name = name;
	}

	public String getName() {				//获取姓名
		return name;
	}

	public void setAge(int age) {			//设置年龄
		this.age = age;
	}

	public int getAge() {					//获取年龄
		return age;
	}

	public void eat() {						//吃饭
		System.out.println("老师吃饭");
	}

	public void teach() {					//学习
		System.out.println("老师讲课");
	}
}

class Test4_Person {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("张三");
		s1.setAge(23);
		System.out.println(s1.getName() + "..." + s1.getAge());
		s1.eat();
		s1.study();

		System.out.println("------------------");
		Student s2 = new Student("李四",24);
		System.out.println(s2.getName() + "..." + s2.getAge());
		s2.eat();
		s2.study();
	}
}
/*
* 使用继承后的学生和老师案例
*/

class Person {
	private String name;					//姓名
	private int age;						//年龄

	public Person() {}						//空参构造

	public Person(String name,int age) {	//有参构造
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {		//设置姓名
		this.name = name;
	}

	public String getName() {				//获取姓名
		return name;
	}

	public void setAge(int age) {			//设置年龄
		this.age = age;
	}

	public int getAge() {					//获取年龄
		return age;
	}

	public void eat() {						//吃饭
		System.out.println(name  + "吃饭");
	}
}

class Student extends Person {
	public Student() {}						//空参构造

	public Student(String name,int age) {
		super(name,age);
	}

	public void study() {
		System.out.println(this.getName() + "学习");
	}
}

class Teacher extends Person {
	public Teacher() {}						//空参构造

	public Teacher(String name,int age) {
		super(name,age);
	}

	public void teach() {
		System.out.println(this.getName() + "讲课");
	}
}

class Test5_Animal {
	public static void main(String[] args) {
		Cat c1 = new Cat("花",4);
		System.out.println(c1.getColor() + "..." + c1.getLeg());
		c1.eat();
		c1.catchMouse();

		Dog d1 = new Dog("黑",2);
		System.out.println(d1.getColor() + "..." + d1.getLeg());
		d1.eat();
		d1.lookHome();
	}
}
/*
* A:猫狗案例分析
* B:案例演示
	* 猫狗案例继承版
	* 属性:毛的颜色,腿的个数
	* 行为:吃饭
	* 猫特有行为:抓老鼠catchMouse
	* 狗特有行为:看家lookHome
*/

class Animal {
	private String color;					//毛的颜色
	private int leg;						//腿的个数

	public Animal(){}

	public Animal(String color,int leg) {
		this.color = color;
		this.leg = leg;
	}

	public void setColor(String color) {	//设置颜色
		this.color = color;
	}

	public String getColor() {				//获取颜色
		return color;
	}

	public void setLeg(int leg) {			//设置腿的个数
		this.leg = leg;
	}

	public int getLeg() {					//获取腿的个数
		return leg;
	}

	public void eat() {						//吃饭
		System.out.println("吃饭");
	}
}

class Cat extends Animal {
	public Cat() {}							//空参构造

	public Cat(String color,int leg) {		//有参构造
		super(color,leg);
	}

	public void eat() {						//吃鱼
		System.out.println("猫吃鱼");
	}

	public void catchMouse() {				//抓老鼠
		System.out.println("抓老鼠");
	}
}

class Dog extends Animal {
	public Dog() {}							//空参构造

	public Dog(String color,int leg) {		//有参构造
		super(color,leg);
	}

	public void eat() {						//吃肉
		System.out.println("狗吃肉");
	}

	public void lookHome() {				//看家
		System.out.println("看家");
	}
}

	//3_final
class Demo1_Final {
	public static void main(String[] args) {
		Son s = new Son();
		s.print();
	}
}
/*
* A:final概述
	final是最终的
* B:final修饰特点
	* 修饰类，类不能被继承
	* 修饰变量，变量就变成了常量，只能被赋值一次
	* 修饰方法，方法不能被重写
* C:案例演示
	* final修饰特点
*/

/*final class Father {
	public void print() {
		System.out.println("访问底层数据资源");
	}
}*/

class Son /*extends Father*/ {
	final int NUM = 10;						//常量命名规范,如果是一个单词,所有字母大写,如果是多个单词,每个单词都大写,中间用下划线隔开
	public static final double PI = 3.14;	//final修饰变量叫做常量,一般会与public static共用
	public void print() {
		//NUM = 20;
		System.out.println(NUM);
	}
}

class Demo2_Final {
	public static void main(String[] args) {
		final int num = 10;
		//num = 20;
		System.out.println(num);

		final Person p = new Person("张三",23);
		//p = new Person("李四",24);
		p.setName("李四");
		p.setAge(24);

		System.out.println(p.getName() + "..." + p.getAge());

		method(10);
		method(20);
	}

	public static void method(final int x) {
		System.out.println(x);
	}
}
/*
* A:案例演示
	* 方法内部或者方法声明上都演示一下(了解)

	* 基本类型，是值不能被改变
	* 引用类型，是地址值不能被改变,对象中的属性可以改变
*/

class Person {
	private String name;			//姓名
	private int age;				//年龄

	public Person(){}				//空参构造

	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {	//设置姓名
		this.name = name;
	}

	public String getName() {		//获取姓名
		return name;
	}

	public void setAge(int age) {	//设置年龄
		this.age = age;
	}

	public int getAge() {			//获取年龄
		return age;
	}
}

class Demo3_Final {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.print();
	}
}
/*
* A:final修饰变量的初始化时机
	* 显示初始化 
	* 在对象构造完毕前即可
*/

class Demo {
	final int num;						//成员变量的默认初始化值是无效值
	
	public Demo() {
		num = 10;
	}
	public void print() {
		System.out.println(num);
	}
}



//day09
	//1_多态
class Demo1_Polymorphic {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();

		Animal a = new Cat();				//父类引用指向子类对象
		a.eat();
	}
}
/*
* A:多态(polymorphic)概述
	* 事物存在的多种形态 
* B:多态前提
	* a:要有继承关系。
	* b:要有方法重写。
	* c:要有父类引用指向子类对象。
* C:案例演示
	* 代码体现多态
*/
class Animal {
	public void eat() {
		System.out.println("动物吃饭");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}
}

class Demo2_Polymorphic {
	public static void main(String[] args) {
		/*Father f = new Son();					//父类引用指向子类对象
		System.out.println(f.num);

		Son s = new Son();
		System.out.println(s.num);*/

		Father f = new Son();
		//f.print();
		f.method();							//相当于是Father.method()
	}
}
/*
成员变量
编译看左边(父类),运行看左边(父类)
成员方法
编译看左边(父类)，运行看右边(子类)。动态绑定
静态方法
编译看左边(父类)，运行看左边(父类)。
(静态和类相关，算不上重写，所以，访问还是左边的)
只有非静态的成员方法,编译看左边,运行看右边 
*/
class Father {
	int num = 10;
	public void print() {
		System.out.println("father");
	}

	public static void method() {
		System.out.println("father static method");
	}
}

class Son extends Father {
	int num = 20;

	public void print() {
		System.out.println("son");
	}

	public static void method() {
		System.out.println("son static method");
	}
}

class Demo3_SuperMan {
	public static void main(String[] args) {
		Person p = new SuperMan();			//父类引用指向子类对象,超人提升为了人
											//父类引用指向子类对象就是向上转型
		System.out.println(p.name);
		p.谈生意();
		SuperMan sm = (SuperMan)p;			//向下转型
		sm.fly();

		/*
		基本数据类型自动类型提升和强制类型转换
		*/
		int i = 10;
		byte b = 20;
		//i = b;						//自动类型提升
		//b = (byte)i;					//强制类型转换
	}
}

class Person {
	String name = "John";
	public void 谈生意() {
		System.out.println("谈生意");
	}
}

class SuperMan extends Person {
	String name = "superMan";

	public void 谈生意() {
		System.out.println("谈几个亿的大单子");
	}

	public void fly() {
		System.out.println("飞出去救人");
	}
}

class Demo4_Animal {
	public static void main(String[] args) {
		//Cat c1 = new Cat();
		//c1.eat();
		method(new Cat());
		method(new Dog());

		//Animal a = new Cat();			开发的是很少在创建对象的时候用父类引用指向子类对象,直接创建子类对象更方便,可以使用子类中的特有属性和行为
	}
	
	//Cat c = new Dog();狗是一只猫,这是错误的
	/*public static void method(Cat c) {			
		c.eat();
	}

	public static void method(Dog d) {
		d.eat();
	}*/
	
	//如果把狗强转成猫就会出现类型转换异常,ClassCastException
	public static void method(Animal a) {	//当作参数的时候用多态最好,因为扩展性强
		//关键字 instanceof 判断前边的引用是否是后边的数据类型
		if (a instanceof Cat) {
			Cat c = (Cat)a;
			c.eat();
			c.catchMouse();
		}else if (a instanceof Dog) {
			Dog d = (Dog)a;
			d.eat();
			d.lookHome();
		}else {
			a.eat();
		}
	}
}
/*
* A:多态的好处
	* a:提高了代码的维护性(继承保证)
	* b:提高了代码的扩展性(由多态保证)
* B:案例演示
	* 多态的好处
	* 可以当作形式参数,可以接收任意子类对象
* C:多态的弊端
	* 不能使用子类的特有属性和行为。
*/

class Animal {
	public void eat() {
		System.out.println("动物吃饭");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}

	public void catchMouse() {
		System.out.println("抓老鼠");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("狗吃肉");
	}

	public void lookHome() {
		System.out.println("看家");
	}
}

class Test1_Polymorphic {
	public static void main(String[] args) {
		Fu f = new Zi();
		//f.method();
		f.show();
	}
}
class Fu {
	public void show() {
		System.out.println("fu show");
	}
}

class Zi extends Fu {
	public void show() {
		System.out.println("zi show");
	}

	public void method() {
		System.out.println("zi method");
	}
}

class Test2_Polymorphic {
	public static void main(String[] args) {
		/*A a = new B();
		a.show();*/
		
		B b = new C();
		b.show();
	}
}
class A {
	public void show() {
		show2();
	}
	public void show2() {
		System.out.println("我");
	}
}
class B extends A {
	public void show() {
		show2();
	}
	public void show2() {
		System.out.println("爱");
	}
}
class C extends B {
	public void show() {
		super.show();
	}
	public void show2() {
		System.out.println("你");
	}
}
	
	//2_抽象类
class Demo1_Abstract {
	public static void main(String[] args) {
		//Animal a = new Animal();			//错误: Animal是抽象的; 无法实例化
		Animal a = new Cat();				//父类引用指向子类对象
		a.eat();
	}
}
/*
* B:抽象类特点
	* a:抽象类和抽象方法必须用abstract关键字修饰
		* abstract class 类名 {}
		* public abstract void eat();
	* b:抽象类不一定有抽象方法，有抽象方法的类一定是抽象类或者是接口
	* c:抽象类不能实例化那么，抽象类如何实例化呢?
		* 按照多态的方式，由具体的子类实例化。其实这也是多态的一种，抽象类多态。
	* d:抽象类的子类
		* 要么是抽象类
		* 要么重写抽象类中的所有抽象方法
*/
abstract class Animal {						//抽象类
	public abstract void eat();				//抽象方法

	public Animal() {
		System.out.println("父类空参构造");
	}
}

class Cat extends Animal {
	public Cat() {
		super();
	}
	public void eat() {
		System.out.println("猫吃鱼");
	}
}

class Demo2_Abstract {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}

/*
* A:抽象类的成员特点
	* a:成员变量：既可以是变量，也可以是常量。abstract是否可以修饰成员变量?不能修饰成员变量
	* b:构造方法：有。
		* 用于子类访问父类数据的初始化。
	* c:成员方法：既可以是抽象的，也可以是非抽象的。
* B:案例演示
	* 抽象类的成员特点
* C:抽象类的成员方法特性：
	* a:抽象方法 强制要求子类做的事情。
	* b:非抽象方法 子类继承的事情，提高代码复用性。
*/

abstract class Demo {
	int num1 = 10;
	final int num2 = 20;

	public Demo(){}

	public void print() {
		System.out.println("111");
	}

	public abstract void method();
}

class Test extends Demo {
	public void method() {
		System.out.println("111");
	}
}

class Demo3_葵花宝典 {
	public static void main(String[] args) {
		岳不群 小岳子 = new 岳不群();
		小岳子.自宫();
	}
}

abstract class 葵花宝典 {
	public abstract void 自宫();
}

class 岳不群 extends 葵花宝典 {
	public void 自宫() {
		System.out.println("用牙签");
	}
}

class 林平之 extends 葵花宝典 {
	public void 自宫() {
		System.out.println("用指甲刀");
	}
}

class 东方不败 extends 葵花宝典 {
	public void 自宫() {
		System.out.println("用锤子,不忍直视");
	}
}

class Demo4_Abstract {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
/*
* A:面试题1
	* 一个抽象类如果没有抽象方法，可不可以定义为抽象类?如果可以，有什么意义?
	* 可以
	* 这么做目的只有一个,就是不让其他类创建本类对象,交给子类完成
* B:面试题2
	* abstract不能和哪些关键字共存
	abstract和static
	被abstract修饰的方法没有方法体
	被static修饰的可以用类名.调用,但是类名.调用抽象方法是没有意义的
	abstract和final
	被abstract修饰的方法强制子类重写
	被final修饰的不让子类重写,所以他俩是矛盾
	abstract和private
	被abstract修饰的是为了让子类看到并强制重写
	被private修饰不让子类访问,所以他俩是矛盾的
*/

abstract class Demo {
	//public static abstract void print();		//错误: 非法的修饰符组合: abstract和static
	//public final abstract void print();		//错误: 非法的修饰符组合: abstract和final
	private abstract void print();				//错误: 非法的修饰符组合: abstract和private
}

class Test1_Animal {
	public static void main(String[] args) {
		Cat c = new Cat("加菲",8);
		System.out.println(c.getName() + "..." + c.getAge());
		c.eat();
		c.catchMouse();

		Dog d = new Dog("八公",30);
		System.out.println(d.getName() + "..." + d.getAge());
		d.eat();
		d.lookHome();
	}
}
/*
* A:案例演示
	* 具体事物：猫，狗
	* 共性：姓名，年龄，吃饭
	* 猫的特性:抓老鼠
	* 狗的特性:看家
*/
abstract class Animal {
	private String name;				//姓名
	private int age;					//年龄

	public Animal(){}					//空参

	public Animal(String name,int age) {//有参
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {	//设置姓名
		this.name = name;
	}

	public String getName() {			//获取姓名
		return name;
	}

	public void setAge(int age) {		//设置年龄
		this.age = age;
	}

	public int getAge() {				//获取年龄
		return age;
	}

	public abstract void eat();			//吃饭
}

class Cat extends Animal {
	public Cat(){}					//空参

	public Cat(String name,int age) {//有参
		super(name,age);
	}

	public void eat() {
		System.out.println("猫吃鱼");
	}

	public void catchMouse() {
		System.out.println("抓老鼠");
	}
}

class Dog extends Animal {
	public Dog(){}					//空参

	public Dog(String name,int age) {//有参
		super(name,age);
	}

	public void eat() {
		System.out.println("狗吃肉");
	}

	public void lookHome() {
		System.out.println("看家");
	}
}

class Test2_Teacher {
	public static void main(String[] args) {
		BaseTeacher bt = new BaseTeacher("冯佳",18);
		bt.teach();
	}
}
/*
* 具体事物：基础班老师，就业班老师
	* 共性：姓名，年龄，讲课。
*/
abstract class Teacher {
	private String name;				//姓名
	private int age;					//年龄

	public Teacher(){}					//空参

	public Teacher(String name,int age) {//有参
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {	//设置姓名
		this.name = name;
	}

	public String getName() {			//获取姓名
		return name;
	}

	public void setAge(int age) {		//设置年龄
		this.age = age;
	}

	public int getAge() {				//获取年龄
		return age;
	}

	public abstract void teach();
}

class BaseTeacher extends Teacher {
	public BaseTeacher(){}					//空参

	public BaseTeacher(String name,int age) {//有参
		super(name,age);
	}

	public void teach() {
		System.out.println("我的姓名是:" + this.getName() + ",我的年龄是:" + this.getAge() + ",讲的内容是java基础");
	}
}

class Test3_Employee {
	public static void main(String[] args) {
		Coder c = new Coder("德玛西亚","007",8000);
		c.work();

		Manager m = new Manager("苍老师","9527",3000,20000);
		m.work();
	}
}
/*
* 假如我们在开发一个系统时需要对程序员类进行设计，程序员包含3个属性：姓名、工号以及工资。
	* 经理，除了含有程序员的属性外，另为还有一个奖金属性。
	* 请使用继承的思想设计出程序员类和经理类。要求类中提供必要的方法进行属性访问。
*/
abstract class Employee {
	private String name;					//姓名
	private String id;						//工号
	private double salary;					//工资

	public Employee() {}					//空参构造

	public Employee(String name,String id,double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void setName(String name) {		//设置姓名
		this.name = name;
	}

	public String getName() {				//获取姓名
		return name;
	}

	public void setId(String id) {			//设置id
		this.id = id;
	}

	public String getId() {					//获取id
		return id;
	}

	public void setSalary(double salary) {	//设置工资
		this.salary = salary;
	}

	public double getSalary() {				//获取工资
		return salary;
	}

	public abstract void work();
}

//程序员
class Coder extends Employee {
	public Coder() {}					//空参构造

	public Coder(String name,String id,double salary) {
		super(name,id,salary);
	}

	public void work() {
		System.out.println("我的姓名是:" + this.getName() + ",我的工号是:" + this.getId() + ",我的工资是:" 
			+ this.getSalary() + ",我的工作内容是敲代码");
	}
}

//项目经理
class Manager extends Employee {
	private int bonus;					//奖金
	public Manager() {}					//空参构造

	public Manager(String name,String id,double salary,int bonus) {
		super(name,id,salary);
		this.bonus = bonus;
	}

	public void work() {
		System.out.println("我的姓名是:" + this.getName() + ",我的工号是:" + this.getId() + ",我的工资是:" 
			+ this.getSalary() + ",我的奖金是:" + bonus + ",我的工作内容是管理");
	}
}
	
	//3_接口
class Demo1_Interface {
	public static void main(String[] args) {
		//Inter i = new Inter();		//接口不能被实例化,因为调用抽象方法没有意义
		Inter i = new Demo();			//父类引用指向子类对象
		i.print();
	}
}
/*
* A:接口概述
	* 从狭义的角度讲就是指java中的interface
	* 从广义的角度讲对外提供规则的都是接口 
* B:接口特点
	* a:接口用关键字interface表示	
		* interface 接口名 {}
	* b:类实现接口用implements表示
		* class 类名 implements 接口名 {}
	* c:接口不能实例化
		* 那么，接口如何实例化呢?
		* 按照多态的方式来实例化。
	* d:接口的子类
		* a:可以是抽象类。但是意义不大。
		* b:可以是具体类。要重写接口中的所有抽象方法。(推荐方案)
* C:案例演示
	* 接口特点
*/

interface Inter {
	public abstract void print();					//接口中的方法都是抽象的
}

class Demo implements Inter {
	public void print() {
		System.out.println("print");
	}
}

class Demo2_Interface {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.print();
		System.out.println(Inter.num);
	}
}
/*
* 成员变量；只能是常量，并且是静态的并公共的。
			* 默认修饰符：public static final	三个关键字可以互相交换位置
			* 建议：自己手动给出。
	* 构造方法：接口没有构造方法。
	* 成员方法：只能是抽象方法。
			* 默认修饰符：public abstract
			* 建议：自己手动给出。
*/
interface Inter {
	public static final int num = 10;
	//public Inter(){}					接口中没有构造方法

	/*public void print() {				接口中不能定义非抽象方法
	
	}*/

	public abstract void print();
}

class Demo /*extends Object*/ implements Inter {	//一个类不写继承任何类,默认继承Object类
	public void print() {
		//num = 20;
		System.out.println(num);
	}

	public Demo() {
		super();
	}

}

class Demo3_Interface {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}

/*
* A:类与类,类与接口,接口与接口的关系
	* a:类与类：
		* 继承关系,只能单继承,可以多层继承。
	* b:类与接口：
		* 实现关系,可以单实现,也可以多实现。
		* 并且还可以在继承一个类的同时实现多个接口。
	* c:接口与接口：
		* 继承关系,可以单继承,也可以多继承。
*/

interface InterA {
	public abstract void printA();
}

interface InterB {
	public abstract void printB();
}

interface InterC extends InterB,InterA {
}
//class Demo implements InterA,implements InterB {		//这么做不允许是非法的
class Demo extends Object implements InterA,InterB {
	public void printA() {
		System.out.println("printA");
	}

	public void printB() {
		System.out.println("printB");
	}
}

class Test1_Animal {
	public static void main(String[] args) {
		Cat c = new Cat("加菲",8);
		c.eat();
		c.sleep();

		JumpCat jc = new JumpCat("跳高猫",3);
		jc.eat();
		jc.sleep();
		jc.jump();
	}
}

/*
* A:案例演示
	* 动物类：姓名，年龄，吃饭，睡觉。
	* 猫和狗
	* 动物培训接口：跳高
*/

abstract class Animal {
	private String name;				//姓名
	private int age;					//年龄

	public Animal() {}					//空参构造

	public Animal(String name,int age) {//有参构造
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {	//设置姓名
		this.name = name;
	}

	public String getName() {			//获取姓名
		return name;
	}

	public void setAge(int age) {		//设置年龄
		this.age = age;
	}

	public int getAge() {				//获取年龄
		return age;
	}

	public abstract void eat();			//吃饭

	public abstract void sleep();		//睡觉
}

interface Jumping {						//跳高的接口
	public void jump();
}

class Cat extends Animal {
	public Cat() {}					//空参构造

	public Cat(String name,int age) {//有参构造
		super(name,age);
	}

	public void eat() {
		System.out.println("猫吃鱼");
	}

	public void sleep() {
		System.out.println("侧着睡");
	}
}

class JumpCat extends Cat implements Jumping {
	public JumpCat() {}					//空参构造

	public JumpCat(String name,int age) {//有参构造
		super(name,age);
	}
	
	public void jump() {
		System.out.println("猫跳高");
	}
}

//day10
	//1_包
/*
* A:定义包的格式
	* package 包名;
	* 多级包用.分开即可
* B:定义包的注意事项
	* A:package语句必须是程序的第一条可执行的代码
	* B:package语句在一个java文件中只能有一个
	* C:如果没有package，默认表示无包名
*/
package com.heima;
import com.baidu.Person;
import com.xxx.Student;
//import java.util.Scanner;		//在开发中我们用的都是导入具体的类
import java.util.*;				//*代表通配符,他会到该包下挨个匹配,匹配上就导入
class Demo1_Package {
	public static void main(String[] args) {
		Person p = new Person("张三",23);
		System.out.println(p.getName() + "..." + p.getAge());
		//p.print();			//在不同包下的无关类,不允许访问,因为是protected修饰的

		/*Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(x);*/
		
		Student s = new Student("李四",24);
		System.out.println(s.getName() + "..." + s.getAge());
		s.method();
	}
}

package com.baidu;
public class Person {
	private String name;
	private int age;

	public Person(){}

	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	protected void print() {
		System.out.println("print");
	}
}

package com.xxx;
import com.baidu.Person;
public class Student extends Person {
	public Student(){}

	public Student(String name,int age) {
		super(name,age);
	}

	public void method() {
		print();
	}
}

	//2_内部类
1_成员内部类
class Demo1_InnerClass {
	public static void main(String[] args) {
		//Inner i = new Inner();
		//i.method();
		//外部类名.内部类名 = 外部类对象.内部类对象
		Outer.Inner oi = new Outer().new Inner();			//创建内部类对象
		oi.method();

	}
}

/*
* A:内部类概述
* B:内部类访问特点
	* a:内部类可以直接访问外部类的成员，包括私有。
	* b:外部类要访问内部类的成员，必须创建对象。
	* 外部类名.内部类名 对象名 = 外部类对象.内部类对象;
* C:案例演示
	* 内部类极其访问特点
*/

class Outer {
	private int num = 10;
	private class Inner {
		public void method() {
			System.out.println(num);
		}
	}
}

class Demo2_InnerClass {
	public static void main(String[] args) {
		//Outer.Inner oi = new Outer().new Inner();
		//oi.method();

		Outer o = new Outer();
		o.print();
	}
}

class Outer {
	static  int num = 10;
	static class Inner {
		public void method() {
			System.out.println(num);
		}
	}

	public void print() {
		Inner i = new Inner();
		i.method();
	}
}
2_静态内部类
class Demo1_InnerClass {
	public static void main(String[] args) {
		//外部类名.内部类名 对象名 = 外部类名.内部类对象;
		Outer.Inner oi = new Outer.Inner();
		oi.method();
		//内部类里面静态方法的访问特点:外部类.内部类.静态方法名();
		Outer.Inner2.print();
	}
}

class Outer {
	static class Inner {
		public void method() {
			System.out.println("method");
		}
	}

	static class Inner2 {
		public static void print() {
			System.out.println("print");
		}
	}
}

class Test1_InnerClass {
	public static void main(String[] args) {
		Outer.Inner oi = new Outer().new Inner();
		oi.show();
	}
}
//要求：使用已知的变量，在控制台输出30，20，10。
//内部类之所以能获取到外部类的成员,是因为他能获取到外部类的引用外部类名.this
class Outer {
	public int num = 10;
	class Inner {
		public int num = 20;
		public void show() {
			int num = 30;
			System.out.println(num);
			System.out.println(this.num);
			//System.out.println(new Outer().num); //使用对象来访问成员变量
			System.out.println(Outer.this.num);
		}
	}
}

3_局部内部类
class Demo1_InnerClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}
//局部内部类
class Outer {
	public void method() {
		int num = 10; //Demo1_InnerClass.java:13: 错误: 从内部类中访问本地变量num; 需要被声明为最终类型
		class Inner {
			public void print() {
				System.out.println(num);
			}
		}

		Inner i = new Inner();
		i.print();
	}

	/*public void run() {
		Inner i = new Inner();				//局部内部类,只能在其所在的方法中访问
		i.print();
	}*/
}

class NoNameDemo {
	public static void main(String[] args) {
		//需求:请用代码实现调用 method方法?
		/*方案一做法:
		Test t = new Test();
		//通过分析,这个method需要我们传入一个Inter接口的子实现类对象
		t.method(new InterImpl()); //把这个子实现类对象传进去
		*/

		//这是方案二: 通过方案二和方案一的对比,我们可以看出来,匿名内部类可以简化我们的代码书写,我们只需要在传参数的时候传入一个匿名内部类对象就可以实现方法的调用
		//节省代码
		Test t = new Test();
		t.method(new Inter(){
			public void add(){
				System.out.println("这是匿名内部类的add方法");
			}
		});

	}
}

interface Inter
{
	public abstract void add();
}

class Test
{
	public void method(Inter i){ //Inter i = new InterImpl();   子实现类对象;
		//编译看父类,运行看子类
		i.add();
	}
}

//方案一:写一个子实现类
class InterImpl implements Inter
{
	public void add(){
		System.out.println("添加方法");
	}
}

4_匿名内部类
class Demo1_NoNameInnerClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}
/*
* A:匿名内部类
	* 就是内部类的简化写法。
* B:前提：存在一个类或者接口
	* 这里的类可以是具体类也可以是抽象类。
* C:格式：
* 
		new 类名或者接口名(){
			重写方法;
		}
* D:本质是什么呢?
	* 是一个继承了该类或者实现了该接口的子类匿名对象。
* E:案例演示
	* 按照要求来一个匿名内部类
*/

interface Inter {
	public void print();
}

class Outer {
	class Inner implements Inter {
		public void print() {
			System.out.println("print");
		}
	}

	public void method(){
		//Inner i = new Inner();
		//i.print();
		//new Inner().print();
		//Inter i = new Inner();			//父类引用指向子类对象
		
		new Inter() {						//实现Inter接口
			public void print() {			//重写抽象方法
				System.out.println("print");
			}
		}.print();
	}
}

class Demo2_NoNameInnerClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}

interface Inter {
	public void show1();
	public void show2();
}
//匿名内部类只针对重写一个方法时候使用
class Outer {
	public void method() {
		/*new Inter(){
			public void show1() {
				System.out.println("show1");
			}

			public void show2() {
				System.out.println("show2");
			}
		}.show1();

		new Inter(){
			public void show1() {
				System.out.println("show1");
			}

			public void show2() {
				System.out.println("show2");
			}
		}.show2();*/

		Inter i = new Inter(){
			public void show1() {
				System.out.println("show1");
			}

			public void show2() {
				System.out.println("show2");
			}

			/*public void show3() {
				System.out.println("show3");
			}*/
		};

		i.show1();
		i.show2();
		//i.show3();						//匿名内部类是不能向下转型的,因为没有子类类名
	}
}

class Demo3_Con {
	public static void main(String[] args) {
		Person p = new Person();
		//p.Person();
	}
}

class Person {
	//public void Person() {						//不是构造方法,是一个普通方法
	public Person() {
		System.out.println("Hello World!");
	}
}

class Demo4_Override {
	public static void main(String[] args) {
		
	}
}

class Person {
	public void print() {
		System.out.println("Person");
	}
}

class Student extends Person {
	public void print() {
		System.out.println("Student");
	}
}

class Father { 
	public Person method() {
		return new Person();
	}
}

class Son extends Father {
	public Student method() {
		return new Student();
	}
}

class Test1_NoNameInnerClass {
	public static void main(String[] args) {
		//如何调用PersonDemo中的method方法呢?
		/*PersonDemo pd = new PersonDemo ();
		//pd.method(new Student());
		pd.method(new Person() {
			public void show() {
				System.out.println("show");
			}
		});*/

		PersonDemo pd = new PersonDemo();
		//第二种方案 : 匿名内部类的用法:作为参数传递
		pd.method(new MyInter(){
			public void show() {
				System.out.println("这是匿名内部类的show方法...");
			}
		});
		//pd.method(new MyInterImpl());  //Test1_NoNameInnerClass.java:13: 错误: Person是抽象的; 无法实例化
	}
}
//这里写抽象类，接口都行
abstract class Person {
	public abstract void show();
}

class PersonDemo {
	
	//public void method(Person p) {		//Person p = new Student();		//父类引用指向子类对象
	/*
	Person p = new Person(){
		public void show() {
			System.out.println("show");
		}
	};
	*/
	//当你看到一个方法的形式参数是一个类名的时候,这里其实需要的该类的对象
	//补充: 当你看到一个方法的形式参数是一个抽象类类名或者是接口名的时候,这里其实需要的是该抽象类的子类对象或者该接口的实现类对象
	public void method(MyInter p) {
		p.show();
	}
}

class Student extends Person {
	public void show() {
		System.out.println("show");
	}
}

interface MyInter
{
	public abstract void show();
}
//第一种方案
class MyInterImpl implements MyInter
{
	public void show() {
		System.out.println("这是实现类的show方法...");
	}
}

/*
	要求在测试类Test中创建A的对象a并调用成员方法methodA(),要求用两种方式实现 
*/
public class Test2 {
		public static void main(String[] args) {
			/*
			方案一
			A a = new A();
			a.methodA(new InterAImpl());*/
			
			//方案二
			/*
			A a = new A();
			a.methodA(new InterA(){
				public void showA(){
					System.out.println("这是匿名内部类的实现方式");
				}
			});*/
			//方案三:这种是局部内部类的写法
			class InnerImpl implements InterA
			{
				public void showA(){
					System.out.println("这是局部内部类的写法");
				}
			}
			A a = new A();
			a.methodA(new InnerImpl());
		}
	}
	//定义接口
interface InterA {
	void showA();	
}
class A {
	public void methodA(InterA a) {
		a.showA();		
	}	
}
//方案一
class InterAImpl implements InterA
{
	public void showA(){
		System.out.println("这是子实现类的showA方法");
	}
}

	
//day11
	//1,bean
package com.heima.bean;

public class Student {

	private String name;
	private int age;

	public Student() {   					
		super();
	}

	public Student(String name, int age) {  	
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {				
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*@Override
	public String toString() {
		
		return "我的姓名是：" + name + ",我的年龄是："+ age;
	}*/
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	//重写equals方法
	public boolean equals(Object obj) {
		Student  s = (Student)obj;
		return this.name.equals(s.name) &&this.age == s.age;
	}	
}

package com.heima.bean;

public class Person extends Object{

	private String name;
	private int age;

	public Person() {   					//alt + shift + s 再 + c 生成空参构造
		super();
	}

	public Person(String name, int age) {  	//alt + shift + s 再 + o 根据本地字段(成员变量)生成有参构造
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {				//alt + shift + s 再 + r 生成get和set方法
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

	//2,debug
package com.heima.debug;

public class Demo1 {

  /**
	* 
	* 如何查看程序执行流程		
	* 什么是断点：
		* 就是一个标记，从哪里开始。
	* 如何设置断点：
		* 你想看哪里的程序，你就在那个有效程序的左边双击即可。
	* 在哪里设置断点：
		* 哪里不会点哪里。
		* 目前：我们就在每个方法的第一条有效语句上都加。
	* 如何运行设置断点后的程序：
		* 右键 -- Debug as -- Java Application
	* 看哪些地方：
		* Debug：断点测试的地方
		* 在这个地方，记住F6，或者点击也可以。一次看一行的执行过程。
		* Variables：查看程序的变量变化
		* ForDemo：被查看的源文件
		* Console：控制台
	* 如何去断点：
		* a:再次双击即可
		* b:找到Debug视图，Variables界面，找到Breakpoints，并点击，然后看到所有的断点，最后点击那个双叉
    */
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);

	}

}

package com.heima.debug;

public class Demo2 {

	public static void main(String[] args) {
		/*
		 * int a = 10; int b = 20; System.out.println("a:" + a + ",b:" + b);
		 * change(a, b); System.out.println("a:" + a + ",b:" + b);
		 */

		int[] arr = { 1, 2, 3, 4, 5 };
		change(arr);
		System.out.println(arr[1]);

	}

	public static void change(int a, int b) {
		System.out.println("a:" + a + ",b:" + b);
		a = b;
		b = a + b;
		System.out.println("a:" + a + ",b:" + b);
	}

	public static void change(int[] arr) {
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] % 2 == 0) {
				arr[x] += 2;
			}

		}

	}

}

	//3,eclipse
package com.heima.eclipse;

import com.heima.animal.Cat;


public class Demo11 {
	/*  
	    * A:新建 ctrl + n
		* B:格式化  ctrl+shift+f
		* C:导入包  ctrl+shift+o 
		* D:注释  ctrl+/,ctrl+shift+/,ctrl+shift+\
		* E:代码上下移动 选中代码alt+上/下箭头
		* F:查看源码  选中类名(F3或者Ctrl+鼠标点击)
		* G:查找具体的类 ctrl + shift + t
		* H:查找具体类的具体方法 ctrl + o
		* I:给建议 ctrl+1,根据右边生成左边的数据类型,生成方法
		* J:删除代码 ctrl + d
		* K:抽取方法alt + shift + m 
		* L:改名alt + shift + r 
	*/

	public static void main(String[] args) {
		//demo2();
		//Student student = new Student("张三", 23);
		//System.out.println(student.getName() +"..."+ student.getAge());
		Cat cat = new Cat();
		cat.eat();
		cat.sleep();
	
	
	}

	private static void demo2() {
		int[] arr1 = { 11, 22, 33, 44, 55 };

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		// Scanner scanner = new Scanner(System.in);

		int a = 10;
		int b = 20;
		int sum = add(a, b);
	}

	public static int add(int a, int b) {
		return a + b;
	}
}

package com.heima.eclipse;

public class HelloWorld {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("HelloWorld!!");
		int num = 10;
		System.out.println(num);
	}

	private int num1 = 10;
	
	int nu2 = 20;
	
	protected int num3 = 30;
	
	public int num4 = 40;
	
	private void method1() {
		System.out.println(num1);
	}
	
	void method2(){
		System.out.println(num1);
	}
	
	protected void method3() {
		System.out.println(num1);
	}
	
	public static void method4(){
		
	}

	public static final void method5(){
		
	}	
}

	//4,object
package com.heima.object;

import com.heima.bean.Student;

public class Demo1_HashCode {

	public static void main(String[] args) {
		Object object = new Object();
		int hashCode = object.hashCode();
		System.out.println(hashCode);

		Student s1 = new Student("张三", 23);
		Student s2 = new Student("李四", 24);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}

package com.heima.object;

import com.heima.bean.Student;

public class Demo2_GetClass {

	public static void main(String[] args) {
		Student s = new Student("张三", 23);
		// Class clazz = new Class();

		Class clazz = s.getClass();
		String name = clazz.getName();
		System.out.println(name);
	}
}

package com.heima.object;

import com.heima.bean.Student;

public class Demo3_ToString {

	/**
	 * @param args
	 * com.heima.bean.Student@bcda2d
	 * public Stirng toString() {
			return  getClass().getName() + "@" + Integer.toHexString(hashCode()) 
		}
		左边 ：类名
		中间：@
		右边：hashCode的十六进制表现形式
		这么写没有什么实际意义。
		toString方法的作用:可以更方便的显示属性值。
		getXxx方法是为了获取值，可以显示也可以赋值，或者其他操作。
	 */
	public static void main(String[] args) {
		Student s = new Student("张三", 23);
//		String str = s.toString();
//		System.out.println(str);
		System.out.println(s.toString());
		System.out.println(s);
		System.out.println("我的姓名是：" + s.getName() + ",我的年龄是："+ s.getAge());
	}

}

package com.heima.object;

import com.heima.bean.Student;

public class Demo4_Equals {

	/**
	 * @param args
	 * equals方法，比较两个对象是否相等
	 * public boolean equals(Object obj){
	 *    return (this == obj);
	 * }
	 * 
	 * Object中的equals方法是比较对象的地址值，没有什么意义，我们 需要重写它。
	 * 因为在开发中我们通常比较的是对象中的属性值，我们认为 相同属性是同一个对象，这样我们就需要重写equals方法。
	
	==和equals方法的区别
	共同点：都可以做比较，返回值都是boolean
	区别：1，==是比较运算符号,既可以比较基本数据类型,也可以比较引用数据类型,基本数据类型比较的是值,引用数据类型比较的是地址值
	2，equals方法只能比较引用数据类型,equals方法在没有重写之前,比较的是地址值，底层依赖的是==号，但是比较地址值是没有意义的，我们需要重写equals方法比较对象中的属性值。 	    
	 */
	public static void main(String[] args) {

		Student s1 =  new Student("张三", 23);
		Student s2 =  new Student("张三", 23);
		boolean b = s1.equals(s2);   			//比较2个对象是否相等
		System.out.println(s1 == s2);
		System.out.println(b);					//重写之后比较的是对象中的属性值
	}
}


//day12
	//bean
package com.heima.bean;

public class Person {
	private String name;
	private int age;
	public Person() {
		super();
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}	
}

	//scanner
package com.heima.scanner;

import java.util.Scanner;

public class Demo1_Scanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				//键盘录入
		//int i = sc.nextInt();								//键盘录入整数存储在i中
		//System.out.println(i);
		if(sc.hasNextInt()) {								//判断键盘录入的是否是int类型的数据
			int i = sc.nextInt();							//键盘录入的数据存储在i中
			System.out.println(i);
		}else {
			System.out.println("输入的类型错误");
		}
		
	}

}

package com.heima.scanner;

import java.util.Scanner;

public class Demo2_Scanner {

	/**
	 	* A:两个常用的方法：
			* public int nextInt():获取一个int类型的值
			* public String nextLine():获取一个String类型的值
		* B:案例演示
			* a:先演示获取多个int值，多个String值的情况
			* b:再演示先获取int值，然后获取String值出现问题
			* c:问题解决方案
				* 第一种：先获取一个数值后，在创建一个新的键盘录入对象获取字符串。
				* 第二种：把所有的数据都先按照字符串获取，然后要什么，你就对应的转换为什么。(后面讲)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("请输入第一个整数:");
		int i = sc.nextInt();
		System.out.println("请输入第二个整数:");
		int j = sc.nextInt();
		System.out.println("i = " + i + ", j = " + j);*/
		
		/*System.out.println("请输入第一个字符串:");
		String line1 = sc.nextLine();
		System.out.println("请输入第二个字符串:");
		String line2 = sc.nextLine();
		System.out.println("line1 = " + line1 + ", line2 = " + line2 );*/
		
		/*
		 * nextInt()是键盘录入整数的方法,当我们录入10的时候
		 * 其实在键盘上录入的是10和\r\n,nextInt()方法只获取10就结束了
		 * nextLine()是键盘录入字符串的方法,可以接收任意类型,但是他凭什么能获取一行呢?
		 * 通过\r\n,只要遇到\r\n就证明一行结束
		 */
		/*System.out.println("请输入第一个整数:");
		int i = sc.nextInt();
		System.out.println("请输入第二个字符串:");
		String line2 = sc.nextLine();
		//System.out.println("i = " + i + ", line2 = " + line2);
		System.out.println(i);
		System.out.print("11111111111");
		System.out.print(line2);
		System.out.println("2222222222222");*/
		
		/*
		 * 解决方案
		 * 1,创建两次对象,但是浪费空间
		 * 2,键盘录入的都是字符串,都用nextLine方法,后面我们会学习讲整数字符串转换成整数的方法
		 */
		int i = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		String line = sc2.nextLine();
		System.out.println(i);
		System.out.println(line);
	}

}

	//string
package com.heima.string;

public class Demo1_String {

	/**
	 * a:字符串字面值"abc"也可以看成是一个字符串对象。
	 * b:字符串是常量，一旦被赋值，就不能被改变。
	 */
	public static void main(String[] args) {
		//Person p = new Person();
		String str = "abc";					//"abc"可以看成一个字符串对象
		str = "def";						//当把"def"赋值给str,原来的"abc"就变成了垃圾
		System.out.println(str);			//String类重写了toString方法返回的是该对象本身
		
	}

}

package com.heima.string;

public class Demo2_StringCon {

	/**
	 	* public String():空构造
		* public String(byte[] bytes):把字节数组转成字符串
		* public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串
		* public String(char[] value):把字符数组转成字符串
		* public String(char[] value,int index,int count):把字符数组的一部分转成字符串
		* public String(String original):把字符串常量值转成字符串
	 */
	public static void main(String[] args) {
		String s1 = new String();
		System.out.println(s1);
		
		byte[] arr1 = {97,98,99};		
		String s2 = new String(arr1);			//解码,将计算机读的懂的转换成我们读的懂
		System.out.println(s2);
		
		byte[] arr2 = {97,98,99,100,101,102};
		String s3 = new String(arr2,2,3);		//将arr2字节数组从2索引开始转换3个
		System.out.println(s3);
		
		char[] arr3 = {'a','b','c','d','e'};	//将字符数组转换成字符串
		String s4 = new String(arr3);
		System.out.println(s4);
		
		String s5 = new String(arr3,1,3);		//将arr3字符数组,从1索引开始转换3个
		System.out.println(s5);
		
		String s6 = new String("heima");
		System.out.println(s6);
	}

}

package com.heima.string;

public class Demo3_String {

	/**
	 * * 1.判断定义为String类型的s1和s2是否相等
			* String s1 = "abc";
			* String s2 = "abc";
			* System.out.println(s1 == s2); 					
			* System.out.println(s1.equals(s2)); 		
		* 2.下面这句话在内存中创建了几个对象?
			* String s1 = new String("abc");			
		* 3.判断定义为String类型的s1和s2是否相等
			* String s1 = new String("abc");			
			* String s2 = "abc";
			* System.out.println(s1 == s2); ?			
			* System.out.println(s1.equals(s2)); ?	
		* 4.判断定义为String类型的s1和s2是否相等
			* String s1 = "a" + "b" + "c";
			* String s2 = "abc";
			* System.out.println(s1 == s2); ?			
			* System.out.println(s1.equals(s2)); ?	
		* 5.判断定义为String类型的s1和s2是否相等
			* String s1 = "ab";
			* String s2 = "abc";
			* String s3 = s1 + "c";
			* System.out.println(s3 == s2);
			* System.out.println(s3.equals(s2)); ?	
			 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		String s1 = "ab";
		String s2 = "abc";
		String s3 = s1 + "c";
		System.out.println(s3 == s2);
		System.out.println(s3.equals(s2)); 		//true
	}

	private static void demo4() {
		//byte b = 3 + 4;						//在编译时就变成7,把7赋值给b,常量优化机制
		String s1 = "a" + "b" + "c";
		String s2 = "abc";
		System.out.println(s1 == s2); 			//true,java中有常量优化机制	
		System.out.println(s1.equals(s2)); 		//true
	}

	private static void demo3() {
		String s1 = new String("abc");			//记录的是堆内存对象的地址值		
		String s2 = "abc";						//记录的是常量池中的地址值
		System.out.println(s1 == s2); 			//false
		System.out.println(s1.equals(s2)); 		//true
	}

	private static void demo2() {
		//创建几个对象
		//创建两个对象,一个在常量池中,一个在堆内存中
		String s1 = new String("abc");		
		System.out.println(s1);
	}

	private static void demo1() {				//常量池中没有这个字符串对象,就创建一个,如果有直接用即可
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2); 			//true	
		System.out.println(s1.equals(s2)); 		//true
	}

}

package com.heima.string;

public class Demo4_StringMethod {

	/**
	 	* boolean equals(Object obj):比较字符串的内容是否相同,区分大小写
		* boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
		* boolean contains(String str):判断大字符串中是否包含小字符串
		* boolean startsWith(String str):判断字符串是否以某个指定的字符串开头
		* boolean endsWith(String str):判断字符串是否以某个指定的字符串结尾
		* boolean isEmpty():判断字符串是否为空。
		* 
		* ""和null的区别
		* ""是字符串常量,同时也是一个String类的对象,既然是对象当然可以调用String类中的方法
		* null是空常量,不能调用任何的方法,否则会出现空指针异常,null常量可以给任意的引用数据类型赋值
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		String s1 = "heima";
		String s2 = "";
		String s3 = null;
		
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());	//java.lang.NullPointerException
	}

	private static void demo2() {
		String s1 = "我爱heima,哈哈";
		String s2 = "heima";
		String s3 = "baima";
		String s4 = "我爱";
		String s5 = "哈哈";
		
		System.out.println(s1.contains(s2));		//判断是否包含传入的字符串
		System.out.println(s1.contains(s3));
		
		System.out.println("------------------");
		System.out.println(s1.startsWith(s4));		//判断是否以传入的字符串开头
		System.out.println(s1.startsWith(s5));
		
		System.out.println("------------------");
		System.out.println(s1.endsWith(s4));		//判断是否以传入的字符串结尾
		System.out.println(s1.endsWith(s5));
	}

	private static void demo1() {
		String s1 = "heima";
		String s2 = "heima";
		String s3 = "HeiMa";
		
		System.out.println(s1.equals(s2));		//true
		System.out.println(s2.equals(s3));		//false
		
		System.out.println("---------------");
		
		System.out.println(s1.equalsIgnoreCase(s2));	
		System.out.println(s1.equalsIgnoreCase(s3)); 	//不区分大小写
	}

}

package com.heima.string;

public class Demo5_StringMethod {

	/**
	 * * int length():获取字符串的长度。
	* char charAt(int index):获取指定索引位置的字符
	* int indexOf(int ch):返回指定字符在此字符串中第一次出现处的索引。
	* int indexOf(String str):返回指定字符串在此字符串中第一次出现处的索引。
	* int indexOf(int ch,int fromIndex):返回指定字符在此字符串中从指定位置后第一次出现处的索引。
	* int indexOf(String str,int fromIndex):返回指定字符串在此字符串中从指定位置后第一次出现处的索引。
	* lastIndexOf
	* String substring(int start):从指定位置开始截取字符串,默认到末尾。
	* String substring(int start,int end):从指定位置开始到指定位置结束截取字符串。
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		String s = "woaiheima";
		s.substring(4);									//subString会产生一个新额字符串,需要将新的字符串记录
		System.out.println(s);
	}

	private static void demo4() {
		String s1 = "heimawudi";
		String s2 = s1.substring(5);
		System.out.println(s2);
		
		String s3 = s1.substring(0, 5);					//包含头,不包含尾,左闭右开
		System.out.println(s3);
	}

	private static void demo3() {
		String s1 = "woaiheima";
		int index1 = s1.indexOf('a', 3);					//从指定位置开始向后找
		System.out.println(index1);
		
		int index2 = s1.lastIndexOf('a');					//从后向前找,第一次出现的字符
		System.out.println(index2);
		
		int index3 = s1.lastIndexOf('a', 7);				//从指定位置向前找
		System.out.println(index3);
	}

	private static void demo2() {
		String s1 = "heima";
		int index = s1.indexOf('e');						//参数接收的是int类型的,传递char类型的会自动提升
		System.out.println(index);
		
		int index2 = s1.indexOf('z');						//如果不存在返回就是-1
		System.out.println(index2);
		
		int index3 = s1.indexOf("ma");						//获取字符串中第一个字符出现的位置
		System.out.println(index3);
		
		int index4 = s1.indexOf("ia");
		System.out.println(index4);
	}

	private static void demo1() {
		//int[] arr = {11,22,33};
		//System.out.println(arr.length);					//数组中的length是属性
		String s1 = "heima";
		System.out.println(s1.length());					//length()是一个方法,获取的是每一个字符的个数
		String s2 = "你要减肥,造吗?";
		System.out.println(s2.length());
		
		char c = s2.charAt(5);								//根据索引获取对应位置的字符
		System.out.println(c);
		char c2 = s2.charAt(10);							//StringIndexOutOfBoundsException字符串索引越界异常
		System.out.println(c2);
	}

}

package com.heima.string;

import com.heima.bean.Person;

public class Demo6_StringMethod {

	/**
	 * * byte[] getBytes():把字符串转换为字节数组。
		* char[] toCharArray():把字符串转换为字符数组。
		* static String valueOf(char[] chs):把字符数组转成字符串。
		* static String valueOf(int i):把int类型的数据转成字符串。
			* 注意：String类的valueOf方法可以把任意类型的数据转成字符串。
	
	
		* String toLowerCase():把字符串转成小写。(了解)
		* String toUpperCase():把字符串转成大写。
		* String concat(String str):把字符串拼接。
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		String s1 = "heiMA";
		String s2 = "chengxuYUAN";
		String s3 = s1.toLowerCase();
		String s4 = s2.toUpperCase();
		
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println(s3 + s4);				//用+拼接字符串更强大,可以用字符串与任意类型相加
		System.out.println(s3.concat(s4));			//concat方法调用的和传入的都必须是字符串
	}

	private static void demo3() {
		char[] arr = {'a','b','c'};
		String s = String.valueOf(arr);			//底层是由String类的构造方法完成的
		System.out.println(s);
		
		String s2 = String.valueOf(100);		//将100转换为字符串
		System.out.println(s2 + 100);
		
		Person p1 = new Person("张三", 23);
		System.out.println(p1);
		String s3 = String.valueOf(p1);			//调用的是对象的toString方法
		System.out.println(s3);
	}

	private static void demo2() {
		String s = "heima";
		char[] arr = s.toCharArray();			//将字符串转换为字符数组
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void demo1() {
		String s1 = "abc";
		byte[] arr = s1.getBytes();
		for (int i = 0; i < arr.length; i++) {
			//System.out.print(arr[i] + " ");
		}
		
		String s2 = "你好你好";
		byte[] arr2 = s2.getBytes();				//通过gbk码表将字符串转换成字节数组
		for (int i = 0; i < arr2.length; i++) {		//编码:把我们看的懂转换为计算机看的懂得
			//System.out.print(arr2[i] + " ");		//gbk码表一个中文代表两个字节
		}											//gbk码表特点,中文的第一个字节肯定是负数
		
		String s3 = "琲";
		byte[] arr3 = s3.getBytes();
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}

}

package com.heima.string;

public class Demo7_StringMethod {

	/**
	 * * A:String的替换功能及案例演示
			* String replace(char old,char new)
			* String replace(String old,String new)
		* B:String的去除字符串两空格及案例演示
			* String trim()
		* C:String的按字典顺序比较两个字符串及案例演示
			* int compareTo(String str)(暂时不用掌握)
			* int compareToIgnoreCase(String str)(了解)
			 
			* 
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		
		String s1 = "a";
		String s2 = "aaaa";
		
		int num = s1.compareTo(s2);				//按照码表值比较
		System.out.println(num);
		
		String s3 = "黑";
		String s4 = "马";
		int num2 = s3.compareTo(s4);
		System.out.println('黑' + 0);			//查找的是unicode码表值
		System.out.println('马' + 0);
		System.out.println(num2);
		
		String s5 = "heima";
		String s6 = "HEIMA";
		int num3 = s5.compareTo(s6);
		System.out.println(num3);
		
		int num4 = s5.compareToIgnoreCase(s6);
		System.out.println(num4);
		
		/*
		 * public int compare(String s1, String s2) {
            int n1 = s1.length();
            int n2 = s2.length();
            int min = Math.min(n1, n2);
            for (int i = 0; i < min; i++) {
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(i);
                if (c1 != c2) {
                    c1 = Character.toUpperCase(c1);						//将c1字符转换成大写
                    c2 = Character.toUpperCase(c2);						//将c2字符转换成大写
                    if (c1 != c2) {
                        c1 = Character.toLowerCase(c1);					//将c1字符转换成小写
                        c2 = Character.toLowerCase(c2);					//将c2字符转换成小写
                        if (c1 != c2) {
                            // No overflow because of numeric promotion
                            return c1 - c2;
                        }
                    }
                }
            }
            return n1 - n2;
		 */
	}

	private static void demo2() {
		String s = "   hei   ma   ";
		String s2 = s.trim();
		System.out.println(s2);
	}

	private static void demo1() {
		String s = "heima";
		String s2 = s.replace('i', 'o');			//用o替换i
		System.out.println(s2);
		
		String s3 = s.replace('z', 'o');			//z不存在,保留原字符不改变
		System.out.println(s3);
		
		String s4 = s.replace("ei", "ao");
		System.out.println(s4);
	}

}

	//test
package com.heima.test;

import java.util.Scanner;

public class Test1 {

	/**
	 * * A:案例演示
		* 需求：模拟登录,给三次机会,并提示还有几次。
		* 用户名和密码都是admin
		* 分析:
		* 1,模拟登录,需要键盘录入,Scanner
		* 2,给三次机会,需要循环,for
		* 3,并提示有几次,需要判断,if
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//创建键盘录入对象
		
		for(int i = 0; i < 3; i++) {
			System.out.println("请输入用户名:");
			String userName = sc.nextLine();			//将键盘录入的用户名存储在userName中
			System.out.println("请输入密码:");
			String password = sc.nextLine();			//将键盘录入的密码存储在password中
			
			//如果是字符串常量和字符串变量比较,通常都是字符串常量调用方法,将变量当作参数传递,防止空指针异常
			if("admin".equals(userName) && "admin".equals(password)) {
				System.out.println("欢迎" + userName + "登录");
				break;									//跳出循环
			}else {
				if(i == 2) {
					System.out.println("您的错误次数已到,请明天再来吧");
				}else {
					System.out.println("录入错误,您还有" + (2-i) + "次机会");
				}
			}
		
		}
	}

}

package com.heima.test;

public class Test2 {

	/**
	 * * A:案例演示
	 * 需求：遍历字符串
	 */
	public static void main(String[] args) {
		String s = "heima";
		
		for(int i = 0; i < s.length(); i++) {			//通过for循环获取到字符串中每个字符的索引
			/*char c = s.charAt(i);
			System.out.println(c);*/
			System.out.println(s.charAt(i));			//通过索引获取每一个字符	
		}
	}

}

package com.heima.test;

public class Test3 {

	/**
	 * A:案例演示
		* 需求：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数,其他字符出现的次数。
		* ABCDEabcd123456!@#$%^
		* 分析:字符串是有字符组成的,而字符的值都是有范围的,通过范围来判断是否包含该字符
		* 如果包含就让计数器变量自增
	 */
	public static void main(String[] args) {
		String s = "ABCDEabcd123456!@#$%^";
		int big = 0;
		int small = 0;
		int num = 0;
		int other = 0;
		//1,获取每一个字符,通过for循环遍历
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);						//通过索引获取每一个字符
			//2,判断字符是否在这个范围内
			if(c >= 'A' && c <= 'Z') {
				big++;									//如果满足是大写字母,就让其对应的变量自增
			}else if(c >= 'a' && c <= 'z') {
				small++;
			}else if(c >= '0' && c <= '9') {
				num++;
			}else {
				other++;
			}
		}
		
		//3,打印每一个计数器的结果
		System.out.println(s + "中大写字母有:" + big + "个,小写字母有:" + small + "个,数字字符:" 
		+ num + "个,其他字符:" + other + "个");
	}

}

package com.heima.test;

public class Test4 {

	/**
	 * * A:案例演示
	 * 需求：把一个字符串的首字母转成大写，其余为小写。(只考虑英文大小写字母字符)
	 * 链式编程:只要保证每次调用完方法返回的是对象,就可以继续调用
	 */
	public static void main(String[] args) {
		String s = "woaiHEImaniaima";
		String s2 = s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase());
		System.out.println(s2);
	}

}

package com.heima.test;

public class Test5 {

	/**
	 * * A:案例演示
		* 需求：把数组中的数据按照指定个格式拼接成一个字符串
			* 举例：
				* int[] arr = {1,2,3};	
			* 输出结果：
				* "[1, 2, 3]"
				* 
		分析:
		1,需要定义一个字符串"["
		2,遍历数组获取每一个元素
		3,用字符串与数组中的元素进行拼接
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		String s = "[";							//定义一个字符串用来与数组中元素拼接
		
		for (int i = 0; i < arr.length; i++) {	//{1,2,3}
			if(i == arr.length - 1) {
				s = s + arr[i] + "]";			//[1, 2, 3]
			}else {
				s = s + arr[i] + ", ";			//[1, 2, 
			}
		}
		
		System.out.println(s);
	}

}

package com.heima.test;

import java.util.Scanner;

public class Test6 {

	/**
	 * * A:案例演示
		* 需求：把字符串反转
			* 举例：键盘录入"abc"		
			* 输出结果："cba"
		*分析:
		*1,通过键盘录入获取字符串Scanner
		*2,将字符串转换成字符数组
		*3,倒着遍历字符数组,并再次拼接成字符串
		*4,打印 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				//创建键盘录入对象
		System.out.println("请输入一个字符串:");
		String line = sc.nextLine();						//将键盘录入的字符串存储在line中
		
		char[] arr = line.toCharArray();					//将字符串转换为字符数组
		
		String s = "";
		for(int i = arr.length-1; i >= 0; i--) {			//倒着遍历字符数组
			s = s + arr[i];									//拼接成字符串
		}
		
		System.out.println(s);
	}

}

package com.heima.test;

public class Test7 {

	/**
	 * * A:画图演示
	 * 需求：统计大串中小串出现的次数
	 * 这里的大串和小串可以自己根据情况给出
	 * 
	 */
	public static void main(String[] args) {
		//定义大串
		String max = "woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma";
		//定义小串
		String min = "heima";
		
		//定义计数器变量
		int count = 0;
		//定义索引
		int index = 0;
		//定义循环,判断小串是否在大串中出现
		while((index = max.indexOf(min)) != -1) {
			count++;									//计数器自增
			max = max.substring(index + min.length());
		}
		System.out.println(count);
	}
}


//day13
	//array
package com.heima.array;

public class Demo1_Array {

	/**
	 * * A:案例演示
	* 数组高级冒泡排序代码
	 */
	public static void main(String[] args) {
		int[] arr = {24, 69, 80, 57, 13};
		bubbleSort(arr);
		//selectSort(arr);
		print(arr);
	}
	
	/*
	 * 冒泡排序
	 * 1,返回值类型,void
	 * 2,参数列表,int[] arr
	 * 
	 * 	第一次:arr[0]与arr[1],arr[1]与arr[2],arr[2]与arr[3],arr[3]与arr[4]比较4次
		第二次:arr[0]与arr[1],arr[1]与arr[2],arr[2]与arr[3]比较3次
		第三次:arr[0]与arr[1],arr[1]与arr[2]比较2次
		第四次:arr[0]与arr[1]比较1次
	 */
	
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {				//外循环只需要比较arr.length-1次就可以了
			for (int j = 0; j < arr.length - 1 - i; j++) {		//-1为了防止索引越界,-i为了提高效率
				if(arr[j] > arr[j+1]) {
					/*int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j+1] = temp;*/
					swap(arr,j,j+1);
				}
			}
		}
	}
	
	/*
	 * 打印数组
	 * 1,返回值类型void
	 * 2,参数列表int[]arr
	 */
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	/*
	 * 选择排序
	 * 1,返回值类型void
	 * 2,参数列表int[] arr
	 * 
	 * 	第一次:arr[0]分别与arr[1-4]比较,比较4次
		第二次:arr[1]分别与arr[2-4]比较,比较3次
		第三次:arr[2]分别与arr[3-4]比较,比较2次
		第四次:arr[3]与arr[4]比较,比较1次
	 */
	
	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {				//只需要比较arr.length-1次
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					/*int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;*/
					swap(arr,i,j);
				}
			}
		}
	}
	
	/*
	 * 换位操作
	 * 1,返回值类型,void
	 * 2,参数列表int[] arr.int i,int j
	 * 
	 * 如果某个方法,只针对本类使用,不想让其他类使用就可以定义成私有的
	 */
	
	private static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}

package com.heima.array;

public class Demo2_Array {

	/**
	 * * A:案例演示
			* 数组高级二分查找代码
		* B:注意事项
			* 如果数组无序，就不能使用二分查找。
				* 因为如果你排序了，但是你排序的时候已经改变了我最原始的元素索引。

	 */
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55,66,77};
		System.out.println(getIndex(arr, 22));
		System.out.println(getIndex(arr, 66));
		System.out.println(getIndex(arr, 88));
	}
	
	/*
	 * 二分查找
	 * 1,返回值类型,int
	 * 2,参数列表int[] arr,int value
	 */
	
	public static int getIndex(int[] arr, int value) {
		int min = 0;
		int max = arr.length - 1;
		int mid = (min + max) / 2;
		
		while(arr[mid] != value) {					//当中间值不等于要找的值,就开始循环查找
			if(arr[mid] < value) {					//当中间值小于了要找的值
				min = mid + 1;						//最小的索引改变
			}else if (arr[mid] > value){			//当中间值大于了要找的值
				max = mid - 1;						//最大的索引改变
			}
			
			mid = (min + max) / 2;					//无论最大还是最小改变,中间索引都会随之改变
			
			if(min > max) {							//如果最小索引大于了最大索引,就没有查找的可能性了
				return -1;							//返回-1
			}
		}
		return mid;
	}
}

package com.heima.array;

import java.util.Arrays;

public class Demo3_Arrays {

	/**
* public static String toString(int[] a)
* public static void sort(int[] a)
* public static int binarySearch(int[] a,int key)
* 
*  public static String toString(int[] a) {
		if (a == null)								//如果传入的数组是null
			return "null";							//返回null
		int iMax = a.length - 1;					//iMax最大索引
		if (iMax == -1)								//如果数组中没有元素
			return "[]";							//返回[]

		StringBuilder b = new StringBuilder();		//线程不安全,效率高
		b.append('[');								//将[添加到字符串缓冲区中
		for (int i = 0; ; i++) {					//遍历数组,判断语句没有写默认是true
			b.append(a[i]);							//把第一个元素添加进字符串缓冲区
			if (i == iMax)							//如果索引等于了最大索引值
				return b.append(']').toString();	//将]添加到字符串缓冲区,在转换成字符串并返回
			b.append(", ");							//如果不等于最大索引就将, 添加到缓冲区
		}
	}
	
 private static int binarySearch0(int[] a, int fromIndex, int toIndex,
							 int key) {
		int low = fromIndex;				//最小索引0
		int high = toIndex - 1;				//最大索引数组长度-1

		while (low <= high) {				//最小索引小于等于最大索引可以循环判断
			int mid = (low + high) >>> 1;	//求出中间索引值,(最小+最大)/2
			int midVal = a[mid];			//通过中间索引获取中间值

			if (midVal < key)				//中间索引对应的值小于查找的值
				low = mid + 1;				//最小索引变化
			else if (midVal > key)			//中间索引对应的值大于查找的值
				high = mid - 1;				//最大索引变化
			else
				return mid; // key found	//找到了
		}
		return -(low + 1);  // key not found.//-插入点 - 1
	}
	 */
	public static void main(String[] args) {
		int[] arr = {33,22,11,44,66,55};
		System.out.println(Arrays.toString(arr));			//数组转字符串
		
		Arrays.sort(arr);									//排序
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = {11,22,33,44,55,66};
		System.out.println(Arrays.binarySearch(arr2, 22));
		System.out.println(Arrays.binarySearch(arr2, 66));
		System.out.println(Arrays.binarySearch(arr2, 9));	//-插入点-1
	}

}

	//stringbuffer
package com.heima.stringbuffer;

public class Demo1_StringBuffer {

	/**
	 * * A:StringBuffer的构造方法：
			* public StringBuffer():无参构造方法
			* public StringBuffer(int capacity):指定容量的字符串缓冲区对象
			* public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
		* B:StringBuffer的方法：
			* public int capacity()：返回当前容量。	理论值(不掌握)
			* public int length():返回长度（字符数）。 实际值
		* C:案例演示
			* 构造方法和长度方法的使用
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());			//容器中的字符个数,实际值
		System.out.println(sb.capacity());			//容器的初始容量,理论值
		
		StringBuffer sb2 = new StringBuffer(10);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		StringBuffer sb3 = new StringBuffer("heima");
		System.out.println(sb3.length());			//实际字符的个数
		System.out.println(sb3.capacity());			//字符串的length + 初始容量
		
	}

}

package com.heima.stringbuffer;

public class Demo2_StringBuffer {

	/**
	 * * A:StringBuffer的添加功能
		* public StringBuffer append(String str):
			* 可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身
		* public StringBuffer insert(int offset,String str):
			* 在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
		StringBuffer是字符串缓冲区,当new的时候是在堆内存创建了一个对象,底层是一个长度为16的字符数组
		当调用添加的方法时,不会再重新创建对象,在不断向原缓冲区添加字符
	 */
	public static void main(String[] args) {
		//demo1();
		StringBuffer sb = new StringBuffer("1234");
		sb.insert(3, "heima");						//在指定位置添加元素,如果没有指定位置的索引就会报索引越界异常
		
		System.out.println(sb);
	}

	private static void demo1() {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = sb.append(true);
		StringBuffer sb3 = sb.append("heima");
		StringBuffer sb4 = sb.append(100);
		
		
		System.out.println(sb.toString());			//StringBuffer类中重写了toString方法,显示的是对象中的属性值
		System.out.println(sb2.toString());
		System.out.println(sb3.toString());
		System.out.println(sb4.toString());
	}

}

package com.heima.stringbuffer;

public class Demo3_StringBuffer {

	/**
	 * * A:StringBuffer的删除功能
		* public StringBuffer deleteCharAt(int index):
			* 删除指定位置的字符，并返回本身
		* public StringBuffer delete(int start,int end):
			* 删除从指定位置开始指定位置结束的内容，并返回本身
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		//sb.deleteCharAt(5);					//当缓冲区中这个索引上没有元素的时候就会报StringIndexOutOfBoundsException
		sb.append("heima");
		//sb.deleteCharAt(4);					//根据索引删除掉索引位置上对应的字符
		//sb.delete(0, 2);						//删除的时候是包含头,不包含尾
		//System.out.println(sb);
		//sb.delete(0, sb.length());				//清空缓冲区
		//System.out.println(sb);
		
		sb = new StringBuffer();				//不要用这种方式清空缓冲区,原来的会变成垃圾,浪费内存
		System.out.println(sb);
	}

}

package com.heima.stringbuffer;

public class Demo4_StringBufferMethod {

	/**
	 * * A:StringBuffer的替换功能
			* public StringBuffer replace(int start,int end,String str):
				* 从start开始到end用str替换
		* B:StringBuffer的反转功能
			* public StringBuffer reverse():
				* 字符串反转
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("我爱总复习");
		//sb.replace(0, 3, "bai");					//替换
		//System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}

}

package com.heima.stringbuffer;

public class Demo5_StringBufferMethod {

	/**
	 * * A:StringBuffer的截取功能
		* public String substring(int start):
			* 从指定位置截取到末尾
		* public String substring(int start,int end):
			* 截取从指定位置开始到结束位置，包括开始位置，不包括结束位置
	* B:注意事项
		* 注意:返回值类型不再是StringBuffer本身
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("woaiheima");
		//String str = sb.substring(4);
		//System.out.println(str);
		
		//System.out.println(sb);
		
		String str3 = sb.substring(4, 7);
		System.out.println(str3);
	}

}

package com.heima.stringbuffer;

public class Demo6_StringBuffer {

	/**
	 * * A:String -- StringBuffer
		* a:通过构造方法
		* b:通过append()方法
	* B:StringBuffer -- String
		* a:通过构造方法
		* b:通过toString()方法
		* c:通过subString(0,length);

	 */
	public static void main(String[] args) {
		//demo1();
		StringBuffer sb = new StringBuffer("heima");
		
		String s1 = new String(sb);						//通过构造将StringBuffer转换为String
		System.out.println(s1);
		
		String s2 = sb.toString();						//通过toString方法将StringBuffer转换为String
		System.out.println(s2);
		
		String s3 = sb.substring(0, sb.length());		//通过截取子字符串将StringBuffer转换为String
		System.out.println(s3);
	}

	private static void demo1() {
		StringBuffer sb1 = new StringBuffer("heima");			//通过构造方法将字符串转换为StringBuffer对象
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("heima");									//通过append方法将字符串转换为StringBuffer对象
		System.out.println(sb2);
	}

}

package com.heima.stringbuffer;

public class Demo7_StringBuffer {

	/**
	 * * A:形式参数问题
			* String作为参数传递
			* StringBuffer作为参数传递 
		* B:案例演示
			* String和StringBuffer分别作为参数传递问题
			* 
	基本数据类型的值传递,不改变其值
	引用数据类型的值传递,改变其值
	
	String类虽然是引用数据类型,但是他当作参数传递时和基本数据类型是一样的
	 */
	public static void main(String[] args) {
		String s = "heima";
		System.out.println(s);
		change(s);
		System.out.println(s);
		
		
		System.out.println("---------------------");
		StringBuffer sb = new StringBuffer();
		sb.append("heima");
		System.out.println(sb);
		change(sb);
		System.out.println(sb);
	}

	public static void change(StringBuffer sb) {
		sb.append("itcast");
	}

	public static void change(String s) {
		s += "itcast";
	}

}

	//test
package com.heima.test;

public class Test1 {

	/**
	 * * 需求：把数组中的数据按照指定个格式拼接成一个字符串
	* 
			举例：
				int[] arr = {1,2,3};	
			输出结果：
				"[1, 2, 3]"
				
			用StringBuffer的功能实现
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println(arrayToString(arr));
	}

	/*
	 * 将数组转换为字符串
	 * 1,返回值类型String
	 * 2,参数列表int[]
	 * 
	 * arrayToString 将数组转换为字符串
	 * array2String		2与to的发音一样就用2替换了to,后来演变成了一种书写习惯
	 * dom4j  domForJ
	 */
	
	public static String arrayToString(int[] arr) {
		StringBuffer sb = new StringBuffer();				//创建字符串缓冲区对象
		sb.append("[");										//将[添加到缓冲区
		
		
		//{1,2,3}
		for (int i = 0; i < arr.length; i++) {				//遍历数组
			//sb.append(arr[i] + ", ");						//这样做没有]
			if(i == arr.length - 1) {
				sb.append(arr[i]).append("]");				//[1, 2, 3]
			}else {
				sb.append(arr[i]).append(", ");				//[1, 2,
			}
		}
		return sb.toString();
	}
}

package com.heima.test;

import java.util.Scanner;

public class Test2 {

	/**
	 * * A:案例演示
	* 
			需求：把字符串反转
				举例：键盘录入"abc"		
				输出结果："cba"
				
			用StringBuffer的功能实现	
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				//创建键盘录入对象
		String line = sc.nextLine();						//将键盘录入的字符串存储在line中
		
		/*StringBuffer sb = new StringBuffer(line);			//将字符串转换为StringBuffer对象
		sb.reverse();										//将缓冲区的内容反转
		
		System.out.println(sb.toString());*/
		
		System.out.println(revString(line));
	}

	/*
	 * 将字符串反转
	 * 1,返回值类型String
	 * 2,参数列表String line
	 */
	
	public static String revString(String line) {
		StringBuffer sb = new StringBuffer(line);			//将字符串转换为StringBuffer对象
		sb.reverse();										//将缓冲区的内容反转
		
		return sb.toString();
	}
}

	//wrapclass
package com.heima.wrapclass;

public class Demo1_Integer {

	/**
	 * * A:为什么会有基本类型包装类
			* 将基本数据类型封装成对象的好处在于可以在对象中定义更多的功能方法操作该数据。
		* B:常用操作
			* 常用的操作之一：用于基本数据类型与字符串之间的转换。
		* C:基本类型和包装类的对应
		* 
				byte 			Byte
				short			Short
				int				Integer
				long			Long
				float			Float
				double			Double
				char			Character
				boolean			Boolean
	 */
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(60));
		System.out.println(Integer.toOctalString(60));
		System.out.println(Integer.toHexString(60));
	}

}

package com.heima.wrapclass;

public class Demo2_Integer {

	/**
	 * * A:Integer类概述
			* 通过JDK提供的API，查看Integer类的说明
		
			* Integer 类在对象中包装了一个基本类型 int 的值,
			* 该类提供了多个方法，能在 int 类型和 String 类型之间互相转换，
			* 还提供了处理 int 类型时非常有用的其他一些常量和方法
		* B:构造方法
			* public Integer(int value)
			* public Integer(String s)
		* C:案例演示
			* 使用构造方法创建对象
	 */
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		Integer i1 = new Integer(100);
		System.out.println(i1);
		
		//Integer i2 = new Integer("abc");			//java.lang.NumberFormatException数字格式异常
		//System.out.println(i2);						//因为abc不是数字字符串,所以转换会报错
		
		Integer i3 = new Integer("100");
		System.out.println(i3);
	}

}

package com.heima.wrapclass;

public class Demo3_Integer {

	/**
	 * * A:int -- String
			* a:和""进行拼接
			* b:public static String valueOf(int i)
			* c:int -- Integer -- String(Integer类的toString方法())
			* d:public static String toString(int i)(Integer类的静态方法)
		* B:String -- int
			* a:String -- Integer -- int
				* public static int parseInt(String s)
		基本数据类型包装类有八种,其中七种都有parseXxx的方法,可以将这七种的字符串表现形式转换成基本数据类型
	 */
	public static void main(String[] args) {
		
		//demo1();
		String s1 = "true";
		boolean b = Boolean.parseBoolean(s1);
		System.out.println(b);
		
		//String s2 = "abc";
		//char c = Character.p		//char的包装类Character中没有pareseXxx的方法
									//字符串到字符的转换通过toCharArray()就可以把字符串转换为字符数组
	}

	private static void demo1() {
		//int ----> String int转换成String
		int i = 100;
		String s1 = i + "";						//推荐用
		String s2 = String.valueOf(i);			//推荐用
		
		Integer i2 = new Integer(i);
		String s3 = i2.toString();
		
		String s4 = Integer.toString(i);
		System.out.println(s1);
		
		//String----> int String 转换int
		String s = "200";
		Integer i3 = new Integer(s);
		int i4 = i3.intValue();					//将Integer转换成了int数
		
		int i5 = Integer.parseInt(s);			//将String转换为int,推荐用这种
	}

}

package com.heima.wrapclass;

public class Demo4_JDK5 {

	/**
	 * * A:JDK5的新特性
			* 自动装箱：把基本类型转换为包装类类型
			* 自动拆箱：把包装类类型转换为基本类型
		* B:案例演示
			* JDK5的新特性自动装箱和拆箱
			
			* Integer ii = 100;
			* ii += 200;
		* C:注意事项
			* 在使用时，Integer  x = null;代码就会出现NullPointerException。
			* 建议先判断是否为null，然后再使用。
	 */
	public static void main(String[] args) {
//		int x = 100;
//		Integer i1 = new Integer(x);			//将基本数据类型包装成对象,装箱
//		
//		int y = i1.intValue();					//将对象转换为基本数据类型,拆箱
		
		Integer i2 = 100;						//自动装箱,把基本数据类型转换成对象
		int z = i2 + 200;						//自动拆箱,把对象转换为基本数据类型
		System.out.println(z);
		
		Integer i3 = null;
		int a = i3 + 100;						//底层用i3调用intValue,但是i3是null,null调用方法就会出现
		System.out.println(a);					//空指针异常java.lang.NullPointerException
	}

}

package com.heima.wrapclass;


public class Demo5_Integer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer i1 = new Integer(97);
		Integer i2 = new Integer(97);
		System.out.println(i1 == i2);				//false
		System.out.println(i1.equals(i2));			//true
		System.out.println("-----------");
	
		Integer i3 = new Integer(197);
		Integer i4 = new Integer(197);
		System.out.println(i3 == i4);				//false
		System.out.println(i3.equals(i4));			//true
		System.out.println("-----------");
	
		Integer i5 = 127;
		Integer i6 = 127;
		System.out.println(i5 == i6);				//true
		System.out.println(i5.equals(i6));			//true
		System.out.println("-----------");
	
		Integer i7 = 128;
		Integer i8 = 128;
		System.out.println(i7 == i8);
		System.out.println(i7.equals(i8));			//true
		
		/*
		 * -128到127是byte的取值范围,如果在这个取值范围内,自动装箱就不会新创建对象,而是从常量池中获取
		 * 如果超过了byte取值范围就会再新创建对象
		 * 
		 * public static Integer valueOf(int i) {
		        assert IntegerCache.high >= 127;
		        if (i >= IntegerCache.low && i <= IntegerCache.high)			//i>= -128 && i <= 127
		            return IntegerCache.cache[i + (-IntegerCache.low)];
		        return new Integer(i);
		    }
		 */
	}

}

//day14
	//otherclass
package com.heima.otherclass;

public class Demo1_Math {

	/**
	 * @param args
	 * * A:Math类概述
		* Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。 
	* B:成员方法
		* public static int abs(int a)
		* public static double ceil(double a)
		* public static double floor(double a)
		* public static int max(int a,int b) min自学
		* public static double pow(double a,double b)
		* public static double random()
		* public static int round(float a) 参数为double的自学
		* public static double sqrt(double a)
	 */
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.abs(-10));  			//取绝对值
		
		//ceil天花板
		/*
		 * 13.0
		 * 12.3
		 * 12.0
		 */
		System.out.println(Math.ceil(12.3));			//向上取整,但是结果是一个double
		System.out.println(Math.ceil(12.99));
		
		System.out.println("-----------");
		//floor地板
		/*
		 * 13.0
		 * 12.3
		 * 12.0
		 */
		System.out.println(Math.floor(12.3));			//向下取整,但是结果是一个double
		System.out.println(Math.floor(12.99));
		
		//获取两个值中的最大值
		System.out.println(Math.max(20, 30));
		
		//前面的数是底数,后面的数是指数
		System.out.println(Math.pow(2, 3));				//2.0 ^ 3.0
		
		//生成0.0到1.0之间的所以小数,包括0.0,不包括1.0
		System.out.println(Math.random());
		
		//四舍五入
		System.out.println(Math.round(12.3f));
		System.out.println(Math.round(12.9f));
		
		//开平方
		System.out.println(Math.sqrt(4));
		System.out.println(Math.sqrt(2));
		System.out.println(Math.sqrt(3));
	}
}

package com.heima.otherclass;

import java.util.Random;

public class Demo2_Random {

	/**
	 * * A:Random类的概述
			* 此类用于产生随机数如果用相同的种子创建两个 Random 实例，
			* 则对每个实例进行相同的方法调用序列，它们将生成并返回相同的数字序列。
		* B:构造方法
			* public Random()
			* public Random(long seed)
		* C:成员方法
			* public int nextInt()
			* public int nextInt(int n)(重点掌握)
	 */
	public static void main(String[] args) {
		Random r = new Random();
		/*int x = r.nextInt();
		
		System.out.println(x);*/
		
		for(int i = 0; i < 10; i++) {
			//System.out.println(r.nextInt());
			System.out.println(r.nextInt(100));			//要求掌握,生成在0到n范围内的随机数,包含0不包含n
		}
		
		/*
		 * -1244746321
			1060493871
			
			-1244746321
			1060493871

		 */
		/*Random r2 = new Random(1001);
		
		int a = r2.nextInt();
		int b = r2.nextInt();
		
		System.out.println(a);
		System.out.println(b);*/
	}
}

package com.heima.otherclass;

public class Demo3_System {

	/**
	 * * A:System类的概述
			* System 类包含一些有用的类字段和方法。它不能被实例化。 
		* B:成员方法
			* public static void gc()
			* public static void exit(int status)
			* public static long currentTimeMillis()
			* pubiic static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
		* C:案例演示
			* System类的成员方法使用
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		
		int[] src = {11,22,33,44,55};
		int[] dest = new int[8];
		for (int i = 0; i < dest.length; i++) {
			System.out.println(dest[i]);
		}
		
		System.out.println("--------------------------");
		System.arraycopy(src, 0, dest, 0, src.length);		//将数组内容拷贝
		
		for (int i = 0; i < dest.length; i++) {
			System.out.println(dest[i]);
		}
	}

	public static void demo3() {
		long start = System.currentTimeMillis();		//1秒等于1000毫秒
		for(int i = 0; i < 1000; i++) {
			System.out.println("*");
		}
		long end = System.currentTimeMillis();			//获取当前时间的毫秒值
		
		System.out.println(end - start);
	}

	public static void demo2() {
		System.exit(1);							//非0状态是异常终止,退出jvm
		System.out.println("11111111111");
	}

	public static void demo1() {
		for(int i = 0; i < 100; i++) {
			new Demo();
			System.gc();						//运行垃圾回收器,相当于呼喊保洁阿姨
		}
	}

}

class Demo {									//在一个源文件中不允许定义两个用public修饰的类

	@Override
	public void finalize() {
		System.out.println("垃圾被清扫了");
	}							
	
}

package com.heima.otherclass;

import java.math.BigInteger;

public class Demo4_BigInteger {

	/**
	 ** A:BigInteger的概述
			* 可以让超过Integer范围内的数据进行运算
		* B:构造方法
			* public BigInteger(String val)
		* C:成员方法
			* public BigInteger add(BigInteger val)
			* public BigInteger subtract(BigInteger val)
			* public BigInteger multiply(BigInteger val)
			* public BigInteger divide(BigInteger val)
			* public BigInteger[] divideAndRemainder(BigInteger val)
	 */
	public static void main(String[] args) {
		//long num = 123456789098765432123L;
		//String s = "123456789098765432123";
		
		BigInteger bi1 = new BigInteger("100");
		BigInteger bi2 = new BigInteger("2");
		
		System.out.println(bi1.add(bi2)); 				//+
		System.out.println(bi1.subtract(bi2));			//-
		System.out.println(bi1.multiply(bi2)); 			//*
		System.out.println(bi1.divide(bi2));    		///(除)
		
		BigInteger[] arr = bi1.divideAndRemainder(bi2);	//取除数和余数
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}

package com.heima.otherclass;

import java.math.BigDecimal;

public class Demo5_BigDecimal {

	/**
	 * * A:BigDecimal的概述
			* 由于在运算的时候，float类型和double很容易丢失精度，演示案例。
			* 所以，为了能精确的表示、计算浮点数，Java提供了BigDecimal
		
			* 不可变的、任意精度的有符号十进制数。
		* B:构造方法
			* public BigDecimal(String val)
		* C:成员方法
			* public BigDecimal add(BigDecimal augend)
			* public BigDecimal subtract(BigDecimal subtrahend)
			* public BigDecimal multiply(BigDecimal multiplicand)
			* public BigDecimal divide(BigDecimal divisor)
		* D:案例演示
			* BigDecimal类的构造方法和成员方法使用
		十进制表示1/3
		0.3333333333333333333333333333333333333333 
			 */
	public static void main(String[] args) {
		//System.out.println(2.0 - 1.1);
		/*BigDecimal bd1 = new BigDecimal(2.0);		//这种方式在开发中不推荐,因为不够精确
		BigDecimal bd2 = new BigDecimal(1.1);
		
		System.out.println(bd1.subtract(bd2));*/
		
		/*BigDecimal bd1 = new BigDecimal("2.0");		//通过构造中传入字符串的方式,开发时推荐
		BigDecimal bd2 = new BigDecimal("1.1");
		
		System.out.println(bd1.subtract(bd2));*/
		
		BigDecimal bd1 = BigDecimal.valueOf(2.0);	//这种方式在开发中也是推荐的
		BigDecimal bd2 = BigDecimal.valueOf(1.1);
		
		System.out.println(bd1.subtract(bd2));
	}

}

package com.heima.otherclass;

import java.util.Date;

public class Demo6_Date {

	/**
	 * * A:Date类的概述是util包下的,不能导入sql包的
			* 类 Date 表示特定的瞬间，精确到毫秒。 
		* B:构造方法
			* public Date()
			* public Date(long date)
		* C:成员方法
			* public long getTime()
			* public void setTime(long time)
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		Date d1 = new Date();	
		d1.setTime(1000);								//设置毫秒值,改变时间对象
		System.out.println(d1);
	}

	public static void demo2() {
		Date d1 = new Date();	
		System.out.println(d1.getTime());				//通过时间对象获取毫秒值
		System.out.println(System.currentTimeMillis());	//通过系统类的方法获取当前时间毫秒值
	}

	public static void demo1() {
		Date d1 = new Date();					//如果没有传参数代表的是当前时间
		System.out.println(d1);
		
		Date d2 = new Date(0);					//如果构造方法中参数传为0代表的是1970年1月1日
		System.out.println(d2);					//通过毫秒值创建时间对象
	}

}

package com.heima.otherclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo7_SimpleDateFormat {

	/**
	 * * A:DateFormat类的概述
			* DateFormat 是日期/时间格式化子类的抽象类，它以与语言无关的方式格式化并解析日期或时间。是抽象类，所以使用其子类SimpleDateFormat
		* B:SimpleDateFormat构造方法
			* public SimpleDateFormat()
			* public SimpleDateFormat(String pattern)
		* C:成员方法
			* public final String format(Date date)
			* public Date parse(String source)
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		//demo1();
		//demo2();
		//demo3();
		
		//将时间字符串转换成日期对象
		String str = "2000年08月08日 08:08:08";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		Date d = sdf.parse(str);						//将时间字符串转换成日期对象
		System.out.println(d);
	}

	public static void demo3() {
		Date d = new Date();							//获取当前时间对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//创建日期格式化类对象
		System.out.println(sdf.format(d));				//将日期对象转换为字符串
	}

	public static void demo2() {
		Date d = new Date();							//获取当前时间对象
		SimpleDateFormat sdf = new SimpleDateFormat();	//创建日期格式化类对象
		System.out.println(sdf.format(d));	 			//88-6-6 下午9:31
	}

	public static void demo1() {
		//DateFormat df = new DateFormat();				//DateFormat是抽象类,不允许实例化
		//DateFormat df1 = new SimpleDateFormat();
		DateFormat df1 = DateFormat.getDateInstance();	//相当于父类引用指向子类对象,右边的方法返回一个子类对象
	}

}

package com.heima.otherclass;

import java.util.Calendar;

public class Demo8_Calendar {

	/**
	 * * A:Calendar类的概述
			* Calendar 类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法。
		* B:成员方法
			* public static Calendar getInstance()
			* public int get(int field)
	 */
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();		//父类引用指向子类对象
		//System.out.println(c);					//证明重写了toString方法打印了对象中所有的属性
		System.out.println(c.get(Calendar.YEAR));  	//通过字段获取对应的值
		System.out.println(c.get(Calendar.MONTH));
	}

}

package com.heima.otherclass;

import java.util.Calendar;

public class Demo9_Calendar {

	/**
	 * * A:Calendar类的概述
			* Calendar 类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法。
		* B:成员方法
			* public static Calendar getInstance()
			* public int get(int field)
		* C:成员方法
			* public void add(int field,int amount)
			* public final void set(int year,int month,int date)
		* D:案例演示
			* Calendar类的成员方法使用
	 */
	public static void main(String[] args) {
		//demo1();
		Calendar c = Calendar.getInstance();			//父类引用指向子类对象
		//c.add(Calendar.MONTH, -1);					//对指定的字段进行向前减或向后加
		//c.set(Calendar.YEAR, 2000);					//修改指定字段
		c.set(2000, 7, 8);
		
		System.out.println(c.get(Calendar.YEAR) + "年" + getNum((c.get(Calendar.MONTH)+1)) 
				+ "月" + getNum(c.get(Calendar.DAY_OF_MONTH)) + "日" + getWeek(c.get(Calendar.DAY_OF_WEEK)));
	}

	public static void demo1() {
		Calendar c = Calendar.getInstance();			//父类引用指向子类对象
		//System.out.println(c);
		System.out.println(c.get(Calendar.YEAR));		//通过字段获取年
		System.out.println(c.get(Calendar.MONTH));		//通过字段后期月,但是月是从0开始编号的
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//月中的第几天
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//周日是第一天,周六是最后一天
		
		System.out.println(c.get(Calendar.YEAR) + "年" + getNum((c.get(Calendar.MONTH)+1)) 
				+ "月" + getNum(c.get(Calendar.DAY_OF_MONTH)) + "日" + getWeek(c.get(Calendar.DAY_OF_WEEK)));
	}
	
	/*
	 * 将星期存储表中进行查表
	 * 1,返回值类型String
	 * 2,参数列表int week
	 */
	
	public static String getWeek(int week) {
		String[] arr = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		
		return arr[week];
	}
	
	/*
	 * 如果是个数数字前面补0
	 * 1,返回值类型String类型
	 * 2,参数列表,int num
	 */
	public static String getNum(int num) {
		/*if(num > 9) {
			return "" + num;
		}else {
			return "0" + num;
		}*/
		return num > 9 ? "" + num : "0" + num;
	}
}


	//regex
package com.heima.regex;

public class Demo1_Regex {

	/**
	 * * A:正则表达式
			* 是指一个用来描述或者匹配一系列符合某个语法规则的字符串的单个字符串。其实就是一种规则。有自己特殊的应用。
			* 作用:比如注册邮箱,邮箱有用户名和密码,一般会对其限制长度,这个限制长度的事情就是正则表达式做的
		* B:案例演示
			* 需求：校验qq号码.
				* 1:要求必须是5-15位数字
				* 2:0不能开头
				* 3:必须都是数字
				
			* a:非正则表达式实现
			* b:正则表达式实现
	 */
	public static void main(String[] args) {
		System.out.println(checkQQ("012345"));
		System.out.println(checkQQ("a1b345"));
		System.out.println(checkQQ("123456"));
		System.out.println(checkQQ("1234567890987654321"));
		
		String regex = "[1-9]\\d{4,14}";
		System.out.println("2553868".matches(regex));
		System.out.println("012345".matches(regex));
		System.out.println("2553868abc".matches(regex));
	}
	
	/*
	 * 需求：校验qq号码.
	 * 1:要求必须是5-15位数字
	 * 2:0不能开头
	 * 3:必须都是数字
	 * 校验qq
	 * 1,明确返回值类型boolean
	 * 2,明确参数列表String qq
	 */
	public static boolean checkQQ(String qq) {
		boolean flag = true;					//如果校验qq不符合要求就把flag置为false,如果符合要求直接返回
		
		if(qq.length() >= 5 && qq.length() <= 15) {
			if(!qq.startsWith("0")) {
				char[] arr = qq.toCharArray();	//将字符串转换成字符数组
				for (int i = 0; i < arr.length; i++) {
					char ch = arr[i];			//记录每一个字符
					if(!(ch >= '0' && ch <= '9')) {
						flag = false;			//不是数字
						break;
					}
				}
			}else {
				flag = false;					//以0开头,不符合qq标准
			}
		}else {
			flag = false;						//长度不符合
		}
		return flag;
	}
}

package com.heima.regex;

public class Demo2_Regex {

	/**
	 * [abc] a、b 或 c（简单类） 
		[^abc] 任何字符，除了 a、b 或 c（否定） 
		[a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围） 
		[a-d[m-p]] a 到 d 或 m 到 p：[a-dm-p]（并集） 
		[a-z&&[def]] d、e 或 f（交集） 
		[a-z&&[^bc]] a 到 z，除了 b 和 c：[ad-z]（减去） 
		[a-z&&[^m-p]] a 到 z，而非 m 到 p：[a-lq-z]（减去） 

	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();
		//demo6();
		String regex = "[a-z&&[^m-p]]";
		System.out.println("m".matches(regex));
		System.out.println("a".matches(regex));
		System.out.println("z".matches(regex));
		System.out.println("n".matches(regex));
	}

	private static void demo6() {
		String regex = "[a-z&&[^bc]]";
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("1".matches(regex));
	}

	private static void demo5() {
		String regex = "[a-z&&[def]]";						//取交集
		System.out.println("a".matches(regex));
		System.out.println("d".matches(regex));
	}

	private static void demo4() {
		String regex = "[a-d[m-p]]";
		System.out.println("a".matches(regex));
		System.out.println("m".matches(regex));
		System.out.println("n".matches(regex));
	}

	private static void demo3() {
		String regex = "[a-zA-Z]";
		System.out.println("a".matches(regex));
		System.out.println("A".matches(regex));
		System.out.println("z".matches(regex));
		System.out.println("Z".matches(regex));
		System.out.println("1".matches(regex));
		System.out.println("%".matches(regex));
	}

	private static void demo2() {
		String regex = "[^abc]";
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("d".matches(regex));
		System.out.println("1".matches(regex));
		System.out.println("%".matches(regex));
		System.out.println("10".matches(regex));		//10代表1字符和0字符,不是单个字符
	}

	private static void demo1() {
		String regex = "[abc]";					//[]代表单个字符
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("d".matches(regex));
		System.out.println("1".matches(regex));
		System.out.println("%".matches(regex));
	}

}

package com.heima.regex;

public class Demo3_Regex {

	/**
	 * 	. 任何字符
		\d 数字：[0-9] 
		\D 非数字： [^0-9] 
		\s 空白字符：[ \t\n\x0B\f\r] 
		\S 非空白字符：[^\s] 
		\w 单词字符：[a-zA-Z_0-9] 
		\W 非单词字符：[^\w] 

	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();
		//demo6();
		String regex = "\\W";
		System.out.println("a".matches(regex));
		System.out.println("z".matches(regex));
		System.out.println("_".matches(regex));
		System.out.println("%".matches(regex));
	}

	private static void demo6() {
		String regex = "\\w";
		System.out.println("a".matches(regex));
		System.out.println("z".matches(regex));
		System.out.println("_".matches(regex));
		System.out.println("%".matches(regex));
	}

	private static void demo5() {
		String regex = "\\S";
		System.out.println(" ".matches(regex));
		System.out.println("	".matches(regex));
		System.out.println("a".matches(regex));
	}

	private static void demo4() {
		String regex = "\\s";
		System.out.println(" ".matches(regex));
		System.out.println("	".matches(regex)); 				//一个tab键
		System.out.println("    ".matches(regex)); 				//四个空格
	}

	private static void demo3() {
		String regex = "\\D";
		System.out.println("0".matches(regex));
		System.out.println("9".matches(regex));
		System.out.println("a".matches(regex));
	}

	private static void demo2() {
		String regex = "\\d";					//\代表转义字符,如果想表示\d的话,需要\\d
		System.out.println("0".matches(regex));
		System.out.println("a".matches(regex));
		System.out.println("9".matches(regex));
	}

	private static void demo1() {
		String regex = "..";
		System.out.println("a".matches(regex));
		System.out.println("ab".matches(regex));
	}

}

package com.heima.regex;

public class Demo4_Regex {

	/**
	 * Greedy 数量词 
		X? X，一次或一次也没有 
		X* X，零次或多次 
		X+ X，一次或多次 
		X{n} X，恰好 n 次 
		X{n,} X，至少 n 次 
		X{n,m} X，至少 n 次，但是不超过 m 次 
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();
		String regex = "[abc]{5,15}";
		System.out.println("abcba".matches(regex));
		System.out.println("abcbaabcabbabab".matches(regex));
		System.out.println("abcb".matches(regex));
		System.out.println("abcbaabaabcbaaba".matches(regex));
	}

	public static void demo5() {
		String regex = "[abc]{5,}";
		System.out.println("abcba".matches(regex));
		System.out.println("abcbaabcabbabab".matches(regex));
		System.out.println("abcb".matches(regex));
		System.out.println("abcbaaba".matches(regex));
	}

	public static void demo4() {
		String regex = "[abc]{5}";
		System.out.println("abcba".matches(regex));
		System.out.println("abcbaabcabbabab".matches(regex));
		System.out.println("abcb".matches(regex));
		System.out.println("abcbaaba".matches(regex));
	}

	public static void demo3() {
		String regex = "[abc]+";
		System.out.println("".matches(regex));
		System.out.println("a".matches(regex));
		System.out.println("aaaaabbbbccccc".matches(regex));
	}

	public static void demo2() {
		String regex = "[abc]*";
		System.out.println("".matches(regex));
		System.out.println("abc".matches(regex));
		System.out.println("a".matches(regex));
	}

	public static void demo1() {
		String regex = "[abc]?";
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("d".matches(regex));
		System.out.println("".matches(regex));
	}

}

package com.heima.regex;

public class Demo5_Split {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "金三胖.郭美美.李dayone";
		String[] arr = s.split("\\.");				//通过正则表达式切割字符串
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("11111111111111111");
	}

}

package com.heima.regex;

public class Demo6_ReplaceAll {

	/**
	 * * A:正则表达式的替换功能
	 * String类的功能：public String replaceAll(String regex,String replacement)
	 */
	public static void main(String[] args) {
		String s = "wo111ai222heima";
		String regex = "\\d";			//\\d代表的是任意数字
		
		String s2 = s.replaceAll(regex, "");
		System.out.println(s2);
	}

}

package com.heima.regex;

public class Demo7_Regex {

	/**
	 * * A:正则表达式的分组功能
			* 捕获组可以通过从左到右计算其开括号来编号。例如，在表达式 ((A)(B(C))) 中，存在四个这样的组： 
		* 
				1     ((A)(B(C))) 
				2     (A 
				3     (B(C)) 
				4     (C) 
			
				组零始终代表整个表达式。
		B:案例演示
			a:切割
				需求：请按照叠词切割： "sdqqfgkkkhjppppkl";
			b:替换
				需求：我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程
				将字符串还原成:“我要学编程”。
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		
		/*
		 * 需求：我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程
				将字符串还原成:“我要学编程”。
		 */
		String s = "我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程";
		String s2 = s.replaceAll("\\.+", "");
		String s3 = s2.replaceAll("(.)\\1+", "$1");	//$1代表第一组中的内容
		System.out.println(s3);
	}

	public static void demo2() {
		//需求：请按照叠词切割： "sdqqfgkkkhjppppkl";
		String s = "sdqqfgkkkhjppppkl";
		String regex = "(.)\\1+";					//+代表第一组出现一次到多次
		String[] arr = s.split(regex);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void demo1() {
		//叠词 快快乐乐,高高兴兴
		/*String regex = "(.)\\1(.)\\2";					//\\1代表第一组又出现一次	\\2代表第二组又出现一次
		System.out.println("快快乐乐".matches(regex));
		System.out.println("快乐乐乐".matches(regex));
		System.out.println("高高兴兴".matches(regex));
		System.out.println("死啦死啦".matches(regex));*/
		
		//叠词 死啦死啦,高兴高兴
		String regex2 = "(..)\\1";
		System.out.println("死啦死啦".matches(regex2));
		System.out.println("高兴高兴".matches(regex2));
		System.out.println("快快乐乐".matches(regex2));
	}

}

package com.heima.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo8_Pattern {

	/**
	 * Pattern p = Pattern.compile("a*b");
		 Matcher m = p.matcher("aaaaab");
		 boolean b = m.matches();
		 
		* A:正则表达式的获取功能
			* Pattern和Matcher的结合使用
		* B:案例演示
			* 需求：把一个字符串中的手机号码获取出来
	 */
	public static void main(String[] args) {
		//demo1();
		String s = "我的手机是18511866260,我曾用过18987654321,还用过18812345678";
		String regex = "1[3578]\\d{9}";
		
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		
		/*boolean b1 = m.find();
		System.out.println(b1);
		System.out.println(m.group());
		
		boolean b2 = m.find();
		System.out.println(b2);
		System.out.println(m.group());*/
		
		while(m.find())
			System.out.println(m.group());
	}

	public static void demo1() {
		Pattern p = Pattern.compile("a*b");					//获取到正则表达式
		Matcher m = p.matcher("aaaaab");					//获取匹配器
		boolean b = m.matches();							//看是否能匹配,匹配就返回true
		
		System.out.println(b);
		
		System.out.println("aaaaab".matches("a*b"));  		//与上面的结果一样
	}

}

	//test
package com.heima.test;

import java.util.Arrays;

public class Test1 {

	/**
	 * @param args
	 * * A:案例演示
	 * 需求：我有如下一个字符串:”91 27 46 38 50”，请写代码实现最终输出结果是：”27 38 46 50 91”
	 * 100
	 * 80
	 * 分析:
	 * 1,将字符串切割成字符串数组
	 * 2,将字符串转换成数字并将其存储在一个等长度的int数组中
	 * 3,排序
	 * 4,将排序后的结果遍历并拼接成一个字符串
	 */
	public static void main(String[] args) {
		String s = "91 27 46 38 50";
		//1,将字符串切割成字符串数组
		String[] sArr = s.split(" ");
		//2,将字符串转换成数字并将其存储在一个等长度的int数组中
		int[] arr = new int[sArr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(sArr[i]); 	//将数字字符串转换成数字
		}
		
		//3,排序
		Arrays.sort(arr);
		
		//4,将排序后的结果遍历并拼接成一个字符串27 38 46 50 91
		/*String str = "";
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				str = str + arr[i];				//27 38 46 50 91
			}else {
				str = str + arr[i] + " ";		//27 38 46 50 
			}
		}
		
		System.out.println(str);*/
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				sb.append(arr[i]);
			}else {
				sb.append(arr[i] + " ");
			}
		}
		
		System.out.println(sb);
	}

}

package com.heima.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {

	/**
	 * * A:案例演示
	 * 需求：算一下你来到这个世界多少天?
	 * 分析:
	 * 1,将生日字符串和今天字符串存在String类型的变量中
	 * 2,定义日期格式化对象
	 * 3,将日期字符串转换成日期对象
	 * 4,通过日期对象后期时间毫秒值
	 * 5,将两个时间毫秒值相减除以1000,再除以60,再除以60,再除以24得到天
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		//1,将生日字符串和今天字符串存在String类型的变量中
		String birthday = "1983年07月08日";
		String today = "2088年6月6日";
		//2,定义日期格式化对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		//3,将日期字符串转换成日期对象
		Date d1 = sdf.parse(birthday);
		Date d2 = sdf.parse(today);
		//4,通过日期对象后期时间毫秒值
		long time = d2.getTime() - d1.getTime();
		//5,将两个时间毫秒值相减除以1000,再除以60,再除以60,再除以24得到天
		System.out.println(time / 1000 / 60 / 60 / 24 );
	}

}

package com.heima.test;

import java.util.Calendar;
import java.util.Scanner;

public class Test3 {

	/**
	 * * A:案例演示
	 * 需求：键盘录入任意一个年份，判断该年是闰年还是平年
	 * Calendar c = Calendar.getInstance();
	 * 
	 * 分析:
	 * 1,键盘录入年Scanner
	 * 2,创建Calendar c = Calendar.getInstance();
	 * 3,通过set方法设置为那一年的3月1日
	 * 4,将日向前减去1
	 * 5,判断日是多少天,如果是29天返回true否则返回false
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份,判断该年份是闰年还是平年:");
		//int year = sc.nextInt();
		
		String line = sc.nextLine();				//录入数字字符串
		int year = Integer.parseInt(line);			//将数字字符串转换成数字
		boolean b = getYear(year);
		System.out.println(b);
	}

	private static boolean getYear(int year) {
		//2,创建Calendar c = Calendar.getInstance();
		Calendar c = Calendar.getInstance();
		//设置为那一年的3月1日
		c.set(year, 2, 1);
		//将日向前减去1
		c.add(Calendar.DAY_OF_MONTH, -1);
		//判断是否是29天
		return c.get(Calendar.DAY_OF_MONTH) == 29;
	}

}


//day15
	//bean
package com.heima.bean;

public class Student {
	private String name;
	private int age;
	public Student() {
		super();
		
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}

	//collection
package com.heima.collection;

import com.heima.bean.Student;

public class Demo1_Array {

	/**
	 * * A:案例演示
			* 需求：我有5个学生，请把这个5个学生的信息存储到数组中，并遍历数组，获取得到每一个学生信息。
		* 
				Student[] arr = new Student[5];					//存储学生对象
				arr[0] = new Student("张三", 23);
				arr[1] = new Student("李四", 24);
				arr[2] = new Student("王五", 25);
				arr[3] = new Student("赵六", 26);
				arr[4] = new Student("马哥", 20);
				
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
				
		* B:画图演示
			* 把学生数组的案例画图讲解
			* 数组和集合存储引用数据类型,存的都是地址值
	 */
	public static void main(String[] args) {
		//int[] arr = new int[5];					//创建基本数据类型数组
		Student[] arr = new Student[5];				//创建引用数据类型数组
		arr[0] = new Student("张三", 23);				//创建一个学生对象,存储在数组的第一个位置
		arr[1] = new Student("李四", 24);				//创建一个学生对象,存储在数组的第二个位置
		arr[2] = new Student("王五", 25);				//创建一个学生对象,存储在数组的第三个位置
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}

package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.heima.bean.Student;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo2_Collection {

	/**
	 * * A:案例演示	
		* 
				基本功能演示
				
				boolean add(E e)
				boolean remove(Object o)
				void clear()
				boolean contains(Object o)
				boolean isEmpty()
				int size()
		
		* B:注意:
		* 
				collectionXxx.java使用了未经检查或不安全的操作.
				注意:要了解详细信息,请使用 -Xlint:unchecked重新编译.
				java编译器认为该程序存在安全隐患
				温馨提示:这不是编译失败,所以先不用理会,等学了泛型你就知道了
		add方法如果是List集合一直都返回true,因为List集合中是可以存储重复元素的
		如果是Set集合当存储重复元素的时候,就会返回false
		
		ArrayList的父类的父类重写toString方法,所以在打印对象的引用的时候,输出的结果不是Object类中toString的结果
	 */
	public static void main(String[] args) {
		//demo1();
		Collection c = new ArrayList();		
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		//c.remove("b");										//删除指定元素
		//c.clear();											//清空集合
		//System.out.println(c.contains("b"));					//判断是否包含
		//System.out.println(c.isEmpty());
		System.out.println(c.size()); 							//获取元素的个数
		System.out.println(c);
	}

	public static void demo1() {
		Collection c = new ArrayList();						//父类引用指向子类对象
		boolean b1 = c.add("abc");
		boolean b2 = c.add(true);							//自动装箱new Boolean(true);
		boolean b3 = c.add(100);
		boolean b4 = c.add(new Student("张三",23));			
		boolean b5 = c.add("abc");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		
		System.out.println(c.toString());
	}

}

package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.heima.bean.Student;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo3_Collection {

	/**
	 * * A:集合的遍历
			* 其实就是依次获取集合中的每一个元素。
		* B:案例演示
			* 把集合转成数组，可以实现集合的遍历
			* toArray()
	 */
	public static void main(String[] args) {
		//demo1();
		Collection c = new ArrayList();
		c.add(new Student("张三", 23));				//Object obj = new Student("张三",23);
		c.add(new Student("李四", 24));
		c.add(new Student("王五", 25));
		c.add(new Student("赵六", 26));
		
		Object[] arr = c.toArray();					//将集合转换成数组
		for (int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]);
			Student s = (Student)arr[i];			//向下转型
			System.out.println(s.getName() + "..." + s.getAge());
		}
	}

	public static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		Object[] arr = c.toArray();						//将集合转换成数组
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}

package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo4_CollectionAll {

	/**
	 * * A:案例演示
		* 
				带All的功能演示
				boolean addAll(Collection c)
				boolean removeAll(Collection c)
				boolean containsAll(Collection c)
				boolean retainAll(Collection c)
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		c2.add("e");
		c2.add("f");
		
		//取交集,如果调用的集合改变就返回true,如果调用的集合不变就返回false
		boolean b = c1.retainAll(c2);					//取交集
		System.out.println(b);
		System.out.println(c1);
	}

	public static void demo3() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("z");
		
		boolean b = c1.containsAll(c2);				//判断调用的集合是否包含传入的集合
		System.out.println(b);
	}

	public static void demo2() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("z");
		
		boolean b = c1.removeAll(c2);					//删除的是交集
		System.out.println(b);
		System.out.println(c1);
	}

	public static void demo1() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();			//alt + shift + r改名
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		
		//c1.addAll(c2);							//将c2中的每一个元素添加到c1中
		c1.add(c2);									//将c2看成一个对象添加到c1中
		System.out.println(c1);
	}

}

package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.heima.bean.Student;

public class Demo5_Iterator {

	/**
	 * 迭代
	 * * A:迭代器概述
	 * 集合是用来存储元素,存储的元素需要查看,那么就需要迭代(遍历) 
	 */
	public static void main(String[] args) {
		//demo1();
		Collection c = new ArrayList();
		c.add(new Student("张三", 23));				//Object obj = new Student("张三",23);
		c.add(new Student("李四", 24));
		c.add(new Student("王五", 25));
		c.add(new Student("赵六", 26));
		
		//获取迭代器
		Iterator it = c.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());
			Student s = (Student)it.next();			//向下转型
			System.out.println(s.getName() + "..." + s.getAge());
		}
	
	}

	public static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		//对集合中的元素迭代(遍历)
		Iterator it = c.iterator();					//获取迭代器
		/*boolean b1 = it.hasNext();					//判断集合中是否有元素,有就返回true
		Object obj1 = it.next();
		System.out.println(b1);
		System.out.println(obj1);
		
		boolean b2 = it.hasNext();					//判断集合中是否有元素,有就返回true
		Object obj2 = it.next();
		System.out.println(b2);
		System.out.println(obj2);*/
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

	//list
package com.heima.list;

import java.util.ArrayList;
import java.util.List;

public class Demo1_List {

	/**
	 * 	* void add(int index,E element)
		* E remove(int index)
		* E get(int index)
		* E set(int index,E element)
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		list.set(1, "z");						//将指定位置的元素修改
		System.out.println(list);
	}

	public static void demo4() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		//Object obj1 = list.get(2);
		//System.out.println(obj1);
		//通过索引遍历List集合
		for(int i = 0;i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void demo3() {
		List list = new ArrayList();
		list.add(111);
		list.add(222);
		list.add(333);
		
		list.remove(111);							//删除的时候不会自动装箱,把111当作索引
		System.out.println(list);
	}

	public static void demo2() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Object obj = list.remove(1);				//通过索引删除元素,将被删除的元素返回
		System.out.println(obj);
		System.out.println(list);
	}

	public static void demo1() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(4, "f");						//index<=size并且index>=0都不会报异常
		//list.add(1,"e");
		//list.add(10, "z");					//java.lang.IndexOutOfBoundsException,当存储时使用不存在的索引时
		System.out.println(list);
	}

}

package com.heima.list;

import java.util.ArrayList;
import java.util.List;

import com.heima.bean.Student;

public class Demo2_List {

	/**
	 * * A:案例演示
	 * 向List集合中存储学生对象
	 * 通过size()和get()方法结合使用遍历。
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Student("张三", 23));					//Object obj = new Student("张三",23);
		list.add(new Student("李四", 24));
		list.add(new Student("王五", 25));
		list.add(new Student("赵六", 26));
		
		for(int i = 0; i < list.size(); i++) {
			//System.out.println(list.get(i));	 			//通过索引获取每一个元素
			Student s = (Student)list.get(i);
			System.out.println(s.getName() + "..." + s.getAge());
		}
	}

}

package com.heima.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo3_List {

	/**
	 ** A:案例演示
	 * 需求：我有一个集合，请问，我想判断里面有没有"world"这个元素，如果有，我就添加一个"javaee"元素，请写代码实现。
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");									//Object obj = new String();
		list.add("b");
		list.add("world");
		list.add("c");
		list.add("d");
		list.add("e");
		
		/*Iterator it = list.iterator();					//获取迭代器
		while(it.hasNext()) {							//判断集合中是否有元素
			String str = (String)it.next();				//向下转型
			if("world".equals(str)) {
				list.add("javaee");						//遍历的同时在增加元素,并发修改ConcurrentModificationException
			}
		}*/
		
		ListIterator lit = list.listIterator();			//获取迭代器(List集合特有的)
		while(lit.hasNext()) {
			String str = (String)lit.next();			//向下转型
			if("world".equals(str)) {
				//list.add("javaee");						//遍历的同时在增加元素,并发修改ConcurrentModificationException
				lit.add("javaee");
			}
		}
		
		System.out.println(list);
	}

}

package com.heima.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo4_ListIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");									//Object obj = new String();
		list.add("b");
		list.add("world");
		list.add("c");
		list.add("d");
		list.add("e");
		
		ListIterator lit = list.listIterator();			//获取迭代器
		while(lit.hasNext()) {
			System.out.println(lit.next()); 			//获取元素并将指针向后移动
		}
		
		System.out.println("-----------------");
		
		while(lit.hasPrevious()) {
			System.out.println(lit.previous()); 		//获取元素并将指针向前移动
		}
	}

}

package com.heima.list;

import java.util.Enumeration;
import java.util.Vector;

public class Demo5_Vector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("a");
		v.addElement("b");
		v.addElement("c");
		v.addElement("d");
		
		Enumeration en = v.elements();					//获取枚举
		while(en.hasMoreElements()) {					//判断集合中是否有元素
			System.out.println(en.nextElement());		//获取集合中的元素
		}
	}

}


//day16
	//bean
package com.heima.bean;

public class Person {
	private String name;
	private int age;
	public Person() {
		super();
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	/*@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		return this.name.equals(p.name) && this.age == p.age;
	}*/
	
}

package com.heima.bean;

public class Student extends Person {

	public Student() {
	}

	public Student(String name, int age) {
		super(name, age);

	}

}

package com.heima.bean;

public class Tool<Q> {
	private Q q;

	public Q getObj() {
		return q;
	}

	public void setObj(Q q) {
		this.q = q;
	}
	
	public<T> void show(T t) {				//方法泛型最好与类的泛型一致
		System.out.println(t);				//如果不一致,需要在方法上声明该泛型
	}
	
	public static<W> void print(W w) {		//静态方法必须声明自己的泛型
		System.out.println(w);
	}
	
}

package com.heima.bean;

public class Worker extends Person {

	public Worker() {
	}

	public Worker(String name, int age) {
		super(name, age);

	}

}


	//generic
package com.heima.generic;

import java.util.ArrayList;
import java.util.Iterator;

import com.heima.bean.Person;

public class Demo1_Generic {

	/**
	 	* A:泛型概述
		* B:泛型好处
			* 提高安全性(将运行期的错误转换到编译期) 
			* 省去强转的麻烦
		* C:泛型基本使用
			* <>中放的必须是引用数据类型 
		* D:泛型使用注意事项
			* 前后的泛型必须一致,或者后面的泛型可以省略不写(1.7的新特性菱形泛型)  

	 */
	public static void main(String[] args) {
		//demo1();
		//int[] arr = new byte[5];							//数组要保证前后的数据类型一致
		//ArrayList<Object> list = new ArrayList<Person>();	//集合的泛型要保证前后的数据类型一致
		//ArrayList<Object> list = new ArrayList<>();		//1.7版本的新特性,菱形泛型
		ArrayList<Object> list = new ArrayList<>();			//泛型最好不要定义成Object,没有意义
		list.add("aaa");
		list.add(true);
	}

	public static void demo1() {
		ArrayList<Person> list = new ArrayList<Person>();
	//	list.add(110);
	//	list.add(true);
		list.add(new Person("张三", 23));
		list.add(new Person("李四", 24));
		
		Iterator<Person> it = list.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());
			
			//System.out.println(it.next().getName() + "..." + it.next().getAge());//next方法只能调用一次,如果调用多次会将指针向后移动多次
			Person p = it.next();			
			System.out.println(p.getName() + "..." + p.getAge());
		}
	}

}

package com.heima.generic;

import java.util.ArrayList;
import java.util.Iterator;

import com.heima.bean.Person;

public class Demo2_Generic {

	/**
	 * * A:案例演示
	 * ArrayList存储字符串并遍历泛型版
	 */
	public static void main(String[] args) {
		//demo1();
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("张三", 23));
		list.add(new Person("李四", 24));
		list.add(new Person("王五", 25));
		list.add(new Person("赵六", 26));
		
		Iterator<Person> it = list.iterator();
		while(it.hasNext()) {
			Person p = it.next();							//将集合中的每一个元素用Person记录
			System.out.println(p.getName() + "..." + p.getAge());
		}
	}

	public static void demo1() {
		ArrayList<String> list = new ArrayList<>();			//创建集合对象
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

package com.heima.generic;

import com.heima.bean.Student;
import com.heima.bean.Tool;
import com.heima.bean.Worker;

public class Demo3_Generic {

	/**
	 * A:案例演示
	 * 泛型的由来:通过Object转型问题引入
	 * 早期的Object类型可以接收任意的对象类型，但是在实际的使用中，会有类型转换的问题。也就存在这隐患，所以Java提供了泛型来解决这个安全问题。
	 */
	public static void main(String[] args) {
		//demo1();
		Tool<String> t = new Tool<>();
		//t.show("abc");
		t.show(true);
	}

	public static void demo1() {
		Tool<Student> t = new Tool<>();					//创建工具类对象
		t.setObj(new Student("张三",23));
		
		//Worker w = (Worker) t.getObj();			//向下转型
		//System.out.println(w);
	}

}

package com.heima.generic;

public class Demo4_Generic {

	/**
	 * * A:泛型接口概述
			* 把泛型定义在接口上
		* B:定义格式	
			* public interface 接口名<泛型类型>
		* C:案例演示
			* 泛型接口的使用
	 */
	public static void main(String[] args) {

	}
}

interface Inter<T> {
	public void show(T t);
}

/*class Demo implements Inter<String> {		//推荐用这种

	@Override
	public void show(String t) {
		System.out.println(t);
	}
	
}*/

class Demo<T> implements Inter<T> {			//没有必要在实现接口的时候给自己类加泛型

	@Override
	public void show(T t) {
		System.out.println(t);
	}
	
}

package com.heima.generic;

import java.util.ArrayList;
import java.util.List;

import com.heima.bean.Person;
import com.heima.bean.Student;

public class Demo5_Generic {

	/**
	 * * A:泛型通配符<?>
			* 任意类型，如果没有明确，那么就是Object以及任意的Java类了
		* B:? extends E
			* 向下限定，E及其子类
		* C:? super E
			* 向上限定，E及其父类
	 */
	public static void main(String[] args) {
		//List<?> list = new ArrayList<Integer>();			//当右边的泛型是不确定时,左边可以指定为?
		ArrayList<Person> list1 = new ArrayList<>();
		list1.add(new Person("张三", 23));
		list1.add(new Person("李四", 24));
		list1.add(new Person("王五", 25));
		
		ArrayList<Student> list2 = new ArrayList<>();
		list2.add(new Student("赵六", 26));
		list2.add(new Student("周七", 27));
		
		list1.addAll(list2);
		System.out.println(list1);
		
	}

}

	
	//jdk5
package com.heima.jdk5;

import java.util.ArrayList;
import java.util.Iterator;

import com.heima.bean.Person;

public class Demo1_Foreach {

	/**
	 * * A:增强for概述
			* 简化数组和Collection集合的遍历
		* B:格式：
		* 
				for(元素数据类型 变量 : 数组或者Collection集合) {
					使用变量即可，该变量就是元素
				}
		* C:案例演示
			* 数组，集合存储元素用增强for遍历
		* D:好处
			* 简化遍历
		增强for循环底层依赖的是迭代器(Iterator)
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		
		//1,普通for循环删除,索引要--
		/*for(int i = 0; i < list.size(); i++) {
			if("b".equals(list.get(i))) {
				list.remove(i--);							//通过索引删除元素
			}
		}*/
		
		//2,迭代器删除
		/*Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			if("b".equals(it.next())) {
				//list.remove("b");							//不能用集合的删除方法,因为迭代过程中如果集合修改会出现并发修改异常
				it.remove();
			}
		}*/
		
		/*for(Iterator<String> it2 = list.iterator(); it2.hasNext();) {
			if("b".equals(it2.next())) {
				//list.remove("b");							//不能用集合的删除方法,因为迭代过程中如果集合修改会出现并发修改异常
				it2.remove();
			}
		}*/
		//3,增强for循环,增强for循环不能删除,只能遍历
		for (String string : list) {
			if("b".equals(string)) {
				list.remove("b");
			}
		}
		System.out.println(list);
	}

	public static void demo2() {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("张三", 23));
		list.add(new Person("李四", 24));
		list.add(new Person("王五", 25));
		list.add(new Person("赵六", 26));
		
		for (Person person : list) {
			System.out.println(person);
		}
	}

	public static void demo1() {
		int[] arr = {11,22,33,44,55};
		for (int i : arr) {
			System.out.println(i);
		}
		
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		for (String string : list) {
			System.out.println(string);
		}
	}

}

package com.heima.jdk5;

import static java.util.Arrays.sort;			//静态导入
import static java.util.Arrays.toString;			//静态导入

public class Demo2_StaticImport {

	/**
	 * 	* A:静态导入概述
	 * 		静态导入是导入类中静态方法
		* B:格式：
			* import static 包名….类名.方法名;
			* 可以直接导入到方法的级别
		* C:注意事项
			* 方法必须是静态的,如果有多个同名的静态方法，容易不知道使用谁?这个时候要使用，必须加前缀。由此可见，意义不大，所以一般不用，但是要能看懂。
	 	静态导入开发不用,但是需要能看懂
	 */
	public static void main(String[] args) {
		int[] arr = {55,22,33,44,11};
		sort(arr);							//排序
		//System.out.println(toString(arr));
	}
	
	

}

package com.heima.jdk5;

public class Demo3_ChangeableArgs {

	/**
	 * * A:可变参数概述
			* 定义方法的时候不知道该定义多少个参数
		* B:格式
			* 修饰符 返回值类型 方法名(数据类型…  变量名){}
		* C:注意事项：
			* 这里的变量其实是一个数组
			* 如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个
	 */
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};
		//print(arr);
		print(11,22,33,44,55);
		System.out.println("---------------");
		//print();
	}
	
	/*public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}*/
	
	
	public static void print(int ... arr) {			//可变参数其实是一个数组
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

package com.heima.jdk5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo4_AsList {

	/**
	 * 数组转换成集合
	 * 数组转换成集合虽然不能增加或减少元素,但是可以用集合的思想操作数组,也就是说可以使用其他集合中的方法
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//集合转数组,加泛型的
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		String[] arr = list.toArray(new String[10]);		//当集合转换数组时,数组长度如果是小于等于集合的size时,转换后的数组长度等于集合的size
															//如果数组的长度大于了size,分配的数组长度就和你指定的长度一样
		for (String string : arr) {
			System.out.println(string);
		}
	}

	public static void demo2() {
		//int[] arr = {11,22,33,44,55};			
		//List<int[]> list = Arrays.asList(arr);			基本数据类型的数组转换成集合,会将整个数组当作一个对象转换
		//System.out.println(list);
		Integer[] arr = {11,22,33,44,55};					//将数组转换成集合,数组必须是引用数据类型
		List<Integer> list = Arrays.asList(arr);
		System.out.println(list);
	}

	public static void demo1() {
		String[] arr = {"a","b","c"};
		List<String> list = Arrays.asList(arr);				//将数组转换成集合
		//list.add("d");									//不能添加
		System.out.println(list);
	}

}


	//list
package com.heima.list;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo1_ArrayList {

	/**
	 * * A:案例演示
		* 需求：ArrayList去除集合中字符串的重复值(字符串的内容相同)
		* 思路：创建新集合方式
	 */
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("c");
		
		ArrayList newList = getSingle(list);
		System.out.println(newList);
	}

	/*
	 * 创建新集合将重复元素去掉
	 * 1,明确返回值类型,返回ArrayList
	 * 2,明确参数列表ArrayList
	 * 
	 * 分析:
	 * 1,创建新集合
	 * 2,根据传入的集合(老集合)获取迭代器
	 * 3,遍历老集合
	 * 4,通过新集合判断是否包含老集合中的元素,如果包含就不添加,如果不包含就添加
	 */
	public static ArrayList getSingle(ArrayList list) {
		ArrayList newList = new ArrayList<>();					//1,创建新集合
		Iterator it = list.iterator();							//2,根据传入的集合(老集合)获取迭代器
		
		while(it.hasNext()) {									//3,遍历老集合
			Object obj = it.next();								//记录住每一个元素
			if(!newList.contains(obj)) {						//如果新集合中不包含老集合中的元素
				newList.add(obj);								//将该元素添加
			}
		}
		
		return newList;
	}
}

package com.heima.list;

import java.util.ArrayList;
import java.util.Iterator;

import com.heima.bean.Person;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo2_ArrayList {

	/**
	 * * A:案例演示
			* 需求：ArrayList去除集合中自定义对象元素的重复值(对象的成员变量值相同)
		* B:注意事项
			* 重写equals()方法的
		contains方法判断是否包含,底层依赖的是equals方法
		remove方法判断是否删除,底层依赖的是equals方法
	 */
	public static void main(String[] args) {
		ArrayList list = new ArrayList();				//创建集合对象
		list.add(new Person("张三", 23));
		list.add(new Person("张三", 23));
		list.add(new Person("李四", 24));
		list.add(new Person("李四", 24));
		list.add(new Person("李四", 24));
		list.add(new Person("李四", 24));
		
		//ArrayList newList = getSingle(list);			//调用方法去除重复
		//System.out.println(newList);
		list.remove(new Person("张三", 23));
		System.out.println(list);
	}

	/*
	 * 创建新集合将重复元素去掉
	 * 1,明确返回值类型,返回ArrayList
	 * 2,明确参数列表ArrayList
	 * 
	 * 分析:
	 * 1,创建新集合
	 * 2,根据传入的集合(老集合)获取迭代器
	 * 3,遍历老集合
	 * 4,通过新集合判断是否包含老集合中的元素,如果包含就不添加,如果不包含就添加
	 */
	public static ArrayList getSingle(ArrayList list) {
		ArrayList newList = new ArrayList<>();					//1,创建新集合
		Iterator it = list.iterator();							//2,根据传入的集合(老集合)获取迭代器
		
		while(it.hasNext()) {									//3,遍历老集合
			Object obj = it.next();								//记录住每一个元素
			if(!newList.contains(obj)) {						//如果新集合中不包含老集合中的元素
				newList.add(obj);								//将该元素添加
			}
		}
		
		return newList;
	}
}

package com.heima.list;

import java.util.LinkedList;

public class Demo3_LinkedList {

	/**
	 * 	 public void addFirst(E e)及addLast(E e)
		* public E getFirst()及getLast()
		* public E removeFirst()及public E removeLast()
		* public E get(int index);
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst("a");
		list.addFirst("b");
		list.addFirst("c");
		list.addFirst("d");
		list.addLast("e");
		
		//System.out.println(list.getFirst());
		//System.out.println(list.getLast());
		//System.out.println(list.removeFirst());
		//System.out.println(list.removeLast());
		
		System.out.println(list.get(1));
		System.out.println(list);
	}
/*dcbae*/
}

package com.heima.list;

import java.util.LinkedList;

public class Demo4_LinkedList {

	/**
	 * 用LinkedList模拟栈结构
	 */
	public static void main(String[] args) {
		//demo1();
		Stack s = new Stack();
		s.in("a");								//进栈
		s.in("b");
		s.in("c");
		s.in("d");
		
		while(!s.isEmpty()) {					//判断栈结构是否为空
			System.out.println(s.out());		//弹栈
		}
	}

	public static void demo1() {
		LinkedList list = new LinkedList();					//创建集合对象
		list.addLast("a");
		list.addLast("b");
		list.addLast("c");
		list.addLast("d");
		
		/*System.out.println(list.removeLast());
		System.out.println(list.removeLast());
		System.out.println(list.removeLast());
		System.out.println(list.removeLast());*/
		
		while(!list.isEmpty()) {
			System.out.println(list.removeLast());
		}
	}

}

package com.heima.list;

import java.util.ArrayList;

import com.heima.bean.Person;

public class Demo5_ArrayListArrayList {

	/**
	 * * A:案例演示
	 * 集合嵌套之ArrayList嵌套ArrayList
	 * 案例:
	 * 我们学科,学科又分为若个班级
	 * 整个学科一个大集合
	 * 若干个班级分为每一个小集合
	 */
	public static void main(String[] args) {
		ArrayList<ArrayList<Person>> list = new ArrayList<>();
		
		ArrayList<Person> first = new ArrayList<>();				//创建第一个班级
		first.add(new Person("杨幂", 30));
		first.add(new Person("李冰冰", 33));
		first.add(new Person("范冰冰", 20));
		
		ArrayList<Person> second = new ArrayList<>();
		second.add(new Person("黄晓明", 31));
		second.add(new Person("赵薇", 33));
		second.add(new Person("陈坤", 32));
		
		//将班级添加到学科集合中
		list.add(first);
		list.add(second);
		
		//遍历学科集合
		for(ArrayList<Person> a : list) {
			for(Person p : a) {
				System.out.println(p);
			}
		}
	}

}

package com.heima.list;

import java.util.LinkedList;

public class Stack {
	private LinkedList list = new LinkedList();
	
	/*
	 * 模拟进栈方法
	 */
	public void in(Object obj) {
		list.addLast(obj);
	}
	
	/*
	 * 模拟出栈
	 */
	public Object out() {
		return list.removeLast();
	}
	
	/*
	 * 模拟栈结构是否为空
	 */
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
}


//day17
	//bean
package com.heiam.bean;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	public Person() {
		super();
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	/*@Override
	public boolean equals(Object obj) {
		System.out.println("执行了吗");
		Person p = (Person)obj;
		return this.name.equals(p.name) && this.age == p.age;
	}
	@Override
	public int hashCode() {
		final int NUM = 38;
		return name.hashCode() * NUM + age;
	}*/
	
	/*
	 * 为什么是31?
	 * 1,31是一个质数,质数是能被1和自己本身整除的数
	 * 2,31这个数既不大也不小
	 * 3,31这个数好算,2的五次方-1,2向左移动5位
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)						//调用的对象和传入的对象是同一个对象
			return true;						//直接返回true
		if (obj == null)						//传入的对象为null
			return false;						//返回false
		if (getClass() != obj.getClass())		//判断两个对象对应的字节码文件是否是同一个字节码
			return false;						//如果不是直接返回false
		Person other = (Person) obj;			//向下转型
		if (age != other.age)					//调用对象的年龄不等于传入对象的年龄
			return false;						//返回false
		if (name == null) {						//调用对象的姓名为null
			if (other.name != null)				//传入对象的姓名不为null
				return false;					//返回false
		} else if (!name.equals(other.name))	//调用对象的姓名不等于传入对象的姓名
			return false;						//返回false
		return true;							//返回true
	}
	/*@Override
	//按照年龄排序
	public int compareTo(Person o) {
		int num = this.age - o.age;				//年龄是比较的主要条件
		return num == 0 ? this.name.compareTo(o.name) : num;//姓名是比较的次要条件
	}*/
	/*@Override
	//按照姓名排序
	public int compareTo(Person o) {
		int num = this.name.compareTo(o.name);		//姓名是主要条件
		return num == 0 ? this.age - o.age : num;	//年龄是次要条件
	}*/
	/*
	 * aaa
	 * bbb
	 */
	public int compareTo(Person o) {
		int length = this.name.length() - o.name.length();				//比较长度为主要条件
		int num = length == 0 ? this.name.compareTo(o.name) : length;	//比较内容为次要条件
		return num == 0 ? this.age - o.age : num;						//比较年龄为次要条件
	}
	
}

package com.heiam.bean;

public class Student {
	private String name;
	private int chinese;
	private int math;
	private int english;
	private int sum;
	
	public Student() {
		super();
		
	}
	public Student(String name, int chinese, int math, int english) {
		super();
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
		this.sum = this.chinese + this.math + this.english;
	}
	public int getSum() {
		return sum;
	}
	
	public String toString() {
		return name + "," + chinese + "," + math + "," + english + "," + sum;
	}
	
}

	//set
package com.heima.set;

import java.util.HashSet;

import com.heiam.bean.Person;

public class Demo1_HashSet {

	/**
	 * @param args
	 * Set集合,无索引,不可以重复,无序(存取不一致)
	 */
	public static void main(String[] args) {
		//demo1();
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("张三", 23));
		hs.add(new Person("张三", 23));
		hs.add(new Person("李四", 24));
		hs.add(new Person("李四", 24));
		hs.add(new Person("李四", 24));
		hs.add(new Person("李四", 24));
		
		//System.out.println(hs.size());
		System.out.println(hs);
	}

	public static void demo1() {
		HashSet<String> hs = new HashSet<>();					//创建HashSet对象
		boolean b1 = hs.add("a");
		boolean b2 = hs.add("a");								//当向set集合中存储重复元素的时候返回为false
		hs.add("b");
		hs.add("c");
		hs.add("d");
		System.out.println(hs);									//HashSet的继承体系中有重写toString方法
		System.out.println(b1);
		System.out.println(b2);
		
		for (String string : hs) {								//只要能用迭代器迭代的,就可以使用增强for循环遍历
			System.out.println(string);
		}
	}

}

package com.heima.set;

import java.util.LinkedHashSet;

public class Demo2_LinkedHashSet {

	/**
	 * @param args
	 * LinkedHashSet
	 * 底层是链表实现的,是set集合中唯一一个能保证怎么存就怎么取的集合对象
	 * 因为是HashSet的子类,所以也是保证元素唯一的,与HashSet的原理一样
	 */
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add("a");
		lhs.add("a");
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");
		lhs.add("d");
		
		System.out.println(lhs);
	}

}

package com.heima.set;

import java.util.Comparator;
import java.util.TreeSet;

import com.heiam.bean.Person;

public class Demo3_TreeSet {

	/**
	 * @param args
	 * TreeSet集合是用来对象元素进行排序的,同样他也可以保证元素的唯一
	 * 当compareTo方法返回0的时候集合中只有一个元素
	 * 当compareTo方法返回正数的时候集合会怎么存就怎么取
	 * 当compareTo方法返回负数的时候集合会倒序存储
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//需求:将字符串按照长度排序
		TreeSet<String> ts = new TreeSet<>(new CompareByLen());		//Comparator c = new CompareByLen();
		ts.add("aaaaaaaa");
		ts.add("z");
		ts.add("wc");
		ts.add("nba");
		ts.add("cba");
		
		System.out.println(ts);
	}

	public static void demo4() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("zhangsan", 23));
		ts.add(new Person("lisi", 13));
		ts.add(new Person("wangwu", 33));
		ts.add(new Person("zhaoliu", 43));
		ts.add(new Person("aaaa", 53));
		
		System.out.println(ts);
	}

	public static void demo3() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("李四", 13));
		ts.add(new Person("张三", 23));
		ts.add(new Person("王五", 43));
		ts.add(new Person("赵六", 33));
		
		System.out.println('张' + 0);
		System.out.println('李' + 0);
		System.out.println('王' + 0);
		System.out.println('赵' + 0);
		
		System.out.println(ts);
	}

	public static void demo2() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("张三", 23));
		ts.add(new Person("李四", 13));
		ts.add(new Person("周七", 13));
		ts.add(new Person("王五", 43));
		ts.add(new Person("赵六", 33));
		
		System.out.println(ts);
	}

	public static void demo1() {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(3);
		ts.add(1);
		ts.add(1);
		ts.add(2);
		ts.add(2);
		ts.add(3);
		ts.add(3);
		
		System.out.println(ts);
	}

}


class CompareByLen /*extends Object*/ implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {		//按照字符串的长度比较
		int num = s1.length() - s2.length();		//长度为主要条件
		return num == 0 ? s1.compareTo(s2) : num;	//内容为次要条件
	}
	
}
	//test
package com.heima.test;

import java.util.HashSet;
import java.util.Random;

public class Test1 {

	/**
	 * * A:案例演示
	 * 需求：编写一个程序，获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数输出到控制台。
	 * 
	 * 分析:
	 * 1,有Random类创建随机数对象
	 * 2,需要存储10个随机数,而且不能重复,所以我们用HashSet集合
	 * 3,如果HashSet的size是小于10就可以不断的存储,如果大于等于10就停止存储
	 * 4,通过Random类中的nextInt(n)方法获取1到20之间的随机数,并将这些随机数存储在HashSet集合中
	 * 5,遍历HashSet
	 */
	public static void main(String[] args) {
		//1,有Random类创建随机数对象
		Random r = new Random();
		//2,需要存储10个随机数,而且不能重复,所以我们用HashSet集合
		HashSet<Integer> hs = new HashSet<>();
		//3,如果HashSet的size是小于10就可以不断的存储,如果大于等于10就停止存储
		while(hs.size() < 10) {
			//4,通过Random类中的nextInt(n)方法获取1到20之间的随机数,并将这些随机数存储在HashSet集合中
			hs.add(r.nextInt(20) + 1);
		}
		// 5,遍历HashSet
		for (Integer integer : hs) {
			System.out.println(integer);
		}
		
	}

}

package com.heima.test;

import java.util.HashSet;
import java.util.Scanner;

public class Test2 {

	/**
	 * * 使用Scanner从键盘读取一行输入,去掉其中重复字符, 打印出不同的那些字符
	 * aaaabbbcccddd
	 * 
	 * 分析:
	 * 1,创建Scanner对象
	 * 2,创建HashSet对象,将字符存储,去掉重复
	 * 3,将字符串转换为字符数组,获取每一个字符存储在HashSet集合中,自动去除重复
	 * 4,遍历HashSet,打印每一个字符
	 */
	public static void main(String[] args) {
		//1,创建Scanner对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一行字符串:");
		//2,创建HashSet对象,将字符存储,去掉重复
		HashSet<Character> hs = new HashSet<>();
		//3,将字符串转换为字符数组,获取每一个字符存储在HashSet集合中,自动去除重复
		String line = sc.nextLine();
		char[] arr = line.toCharArray();
		
		for (char c : arr) {							//遍历字符数组
			hs.add(c);
		}
		
		//4,遍历HashSet,打印每一个字符
		
		for(Character ch : hs) {
			System.out.print(ch);
		}
	}

}

package com.heima.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Test3 {

	/**
	 *  需求:将集合中的重复元素去掉
	 *  
	 *  分析:
	 *  1,创建List集合存储若干个重复元素
	 *  2,单独定义方法去除重复
	 *  3,打印一下List集合
	 */
	public static void main(String[] args) {
		//1,创建List集合存储若干个重复元素
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("c");
		
		//2,单独定义方法去除重复
		getSingle(list);
		
		//3,打印一下List集合
		System.out.println(list);
	}
	/*
	 * 分析
	 * 去除List集合中的重复元素
	 * 1,创建一个LinkedHashSet集合
	 * 2,将List集合中所有的元素添加到LinkedHashSet集合
	 * 3,将list集合中的元素清除
	 * 4,将LinkedHashSet集合中的元素添加回List集合中
	 */
	public static void getSingle(List<String> list) {
		//1,创建一个LinkedHashSet集合
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		//2,将List集合中所有的元素添加到LinkedHashSet集合
		lhs.addAll(list);
		//3,将list集合中的元素清除
		list.clear();
		//4,将LinkedHashSet集合中的元素添加回List集合中
		list.addAll(lhs);
	}

}

package com.heima.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Test4 {

	/**
	 * 在一个集合中存储了无序并且重复的字符串,定义一个方法,让其有序(字典顺序),而且还不能去除重复
	 * 
	 * 分析:
	 * 1,定义一个List集合,并存储重复的无序的字符串
	 * 2,定义方法对其排序保留重复
	 * 3,打印List集合
	 */
	public static void main(String[] args) {
		//1,定义一个List集合,并存储重复的无序的字符串
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("aaa");
		list.add("ccc");
		list.add("ddd");
		list.add("fffffffffff");
		list.add("heima");
		list.add("itcast");
		list.add("bbbb");
		list.add("aaa");
		list.add("aaa");
		
		//2,定义方法对其排序保留重复
		sort(list);
		
		//3,打印list
		System.out.println(list);
	}
	
	/*
	 * 定义方法,排序并保留重复
	 * 分析:
	 * 1,创建TreeSet集合对象,因为String本身就具备比较功能,但是重复不会保留,所以我们用比较器
	 * 2,将list集合中所有的元素添加到TrreSet集合中,对其排序,保留重复
	 * 3,清空list集合
	 * 4,将TreeSet集合中排好序的元素添加到list中
	 */
	public static void sort(List<String> list) {
		//1,创建TreeSet集合对象,因为String本身就具备比较功能,但是重复不会保留,所以我们用比较器
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				int num = s1.compareTo(s2);					//比较内容为主要条件
				return num == 0 ? 1 : num;					//保留重复
			}
		});
		//2,将list集合中所有的元素添加到TrreSet集合中,对其排序,保留重复
		ts.addAll(list);
		//3,清空list集合
		list.clear();
		//4,将TreeSet集合中排好序的元素添加到list中
		list.addAll(ts);
	}

}

package com.heima.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test5 {

	/**
	 * 从键盘接收一个字符串, 程序对其中所有字符进行排序,例如键盘输入: helloitcast程序打印:acehillostt
	 * 分析:
	 * 1,键盘录入字符串,Scanner
	 * 2,将字符串转换为字符数组
	 * 3,定义TreeSet集合,传入比较器对字符排序并保留重复
	 * 4,遍历字符数组,将每一个字符存储在TreeSet集合中
	 * 5,遍历TreeSet集合,打印每一个字符
	 */
	public static void main(String[] args) {
		//1,键盘录入字符串,Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String line = sc.nextLine();
		//2,将字符串转换为字符数组
		char[] arr = line.toCharArray();
		//3,定义TreeSet集合,传入比较器对字符排序并保留重复
		TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {

			@Override
			public int compare(Character c1, Character c2) {
				//int num = c1 - c2;				//自动拆箱
				int num = c1.compareTo(c2);
				return num == 0 ? 1 : num;
			}
		});
		
		//4,遍历字符数组,将每一个字符存储在TreeSet集合中
		for(char c : arr) {
			ts.add(c);							//自动装箱
		}
		
		//5,遍历TreeSet集合,打印每一个字符
		for(Character c : ts) {
			System.out.print(c);
		}
	}

}

package com.heima.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test6 {

	/**
	 * 程序启动后, 可以从键盘输入接收多个整数, 直到输入quit时结束输入. 把所有输入的整数倒序排列打印.
	 * 
	 * 1,创建Scanner对象,键盘录入
	 * 2,创建TreeSet集合对象,TreeSet集合中传入比较器
	 * 3,无限循环不断接收整数,遇到quit退出,因为退出是quit,所以键盘录入的时候应该都以字符串的形式录入
	 * 4,判断是quit就退出,不是将其转换为Integer,并添加到集合中
	 * 5,遍历TreeSet集合并打印每一个元素
	 */
	public static void main(String[] args) {
		//1,创建Scanner对象,键盘录入
		Scanner sc = new Scanner(System.in);
		//2,创建TreeSet集合对象,TreeSet集合中传入比较器
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				//int num = i2 - i1;					//自动拆箱
				int num = i2.compareTo(i1);
				return num == 0 ? 1 : num;
			}
		});
		//3,无限循环不断接收整数,遇到quit退出,因为退出是quit,所以键盘录入的时候应该都以字符串的形式录入
		while(true) {
			String line = sc.nextLine();				//将键盘录入的字符串存储在line中
			if("quit".equals(line)) {
				break;
			}
			//4,判断是quit就退出,不是将其转换为Integer,并添加到集合中
			Integer i = Integer.parseInt(line);
			ts.add(i);
		}
		
		// 5,遍历TreeSet集合并打印每一个元素
		for (Integer integer : ts) {
			System.out.println(integer);
		}
	}

}

package com.heima.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import com.heiam.bean.Student;

public class Test7 {

	/**
	 * * A:案例演示
	 * 需求：键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台。
	 * 
	 * 分析:
	 * 1,定义一个学生类
	 * 		成员变量:姓名,语文成绩,数学成绩,英语成绩,总成绩
	 * 		成员方法:空参,有参构造,有参构造的参数分别是姓名,语文成绩,数学成绩,英语成绩
	 * 			  toString方法,在遍历集合中的Student对象打印对象引用的时候会显示属性值
	 * 2,键盘录入需要Scanner,创建键盘录入对象
	 * 3,创建TreeSet集合对象,在TreeSet的构造函数中传入比较器,按照总分比较
	 * 4,录入五个学生,所以以集合中的学生个数为判断条件,如果size是小于5就进行存储
	 * 5,将录入的字符串切割,用逗号切割,会返回一个字符串数组,将字符串数组中从二个元素转换成int数,
	 * 6,将转换后的结果封装成Student对象,将Student添加到TreeSet集合中
	 * 7,遍历TreeSet集合打印每一个Student对象
	 */
	public static void main(String[] args) {
		//2,键盘录入需要Scanner,创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生成绩格式是:姓名,语文成绩,数学成绩,英语成绩");
		//3,创建TreeSet集合对象,在TreeSet的构造函数中传入比较器,按照总分比较
		TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int num = s2.getSum() - s1.getSum();
				return num == 0 ? 1 : num;
			}
		});
		//4,录入五个学生,所以以集合中的学生个数为判断条件,如果size是小于5就进行存储
		while(ts.size() < 5) {
			//5,将录入的字符串切割,用逗号切割,会返回一个字符串数组,将字符串数组中从二个元素转换成int数,
			String line = sc.nextLine();
			String[] arr = line.split(",");
			int chinese = Integer.parseInt(arr[1]);
			int math = Integer.parseInt(arr[2]);
			int english = Integer.parseInt(arr[3]);
			//6,将转换后的结果封装成Student对象,将Student添加到TreeSet集合中
			ts.add(new Student(arr[0], chinese, math, english));
		}
		
		//7,遍历TreeSet集合打印每一个Student对象
		System.out.println("排序后的学生信息:");
		for (Student s : ts) {
			System.out.println(s);
		}
	}

}


//day18
	//bean
package com.heima.bean;

public class Student implements Comparable<Student> {
	private String name;
	private int age;
	public Student() {
		super();
		
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Student o) {
		int num = this.age - o.age;					//以年龄为主要条件
		return num == 0 ? this.name.compareTo(o.name) : num;
	}
}

package com.heima.bean;

public class BaseStudent extends Student {

	public BaseStudent() {
	}

	public BaseStudent(String name, int age) {
		super(name, age);

	}

}

	//collections
class Animal {
	public static void main(String[] args) {
		Cat c = new Cat("加菲",8);
		c.eat();
		c.sleep();

		JumpCat jc = new JumpCat("猫跳高",3);
		jc.eat();
		jc.sleep();
		jc.jump();
	}
}
abstract class Animal_1{
	private String name ;
	private int age ;

	public Animal_1(){}

	public Animal_1(String name, int age){
		this.name = name ;
		this.age = age;
	}
	public String setName(String name){
	    this.name = name;
	}
	public String getName(){
	    return name;
	} 
	public int setAge(int age){
		this.age = age;
	}
    public int getAge(){
	     return age;
	}
	public abstract void eat();

	public abstract void sleep();
  }
}
interface Jumping{
	public void jump();
}
class Cat extends Animal_1{

	public	Cat(){}

	public Cat (String name , int age){
		super (name, age ); 
	}
	public void eat (){
		System.out.println("猫吃鱼");
	}
	public void sleep(){
		System.out.println("侧着睡");
	}
}
class JumpCat extends Cat implements Jumping{
	public JumpCat(){}

	public JumpCat (String name , int age){
			super (name, age);
	}
	public void jump(){
		System.out.println("猫跳高");
	}
}

package com.heima.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1_Collecitons {

	/**
	 * 	Collecitons中的常见方法
	 * 	public static <T> void sort(List<T> list)
		public static <T> int binarySearch(List<?> list,T key)
		public static <T> T max(Collection<?> coll)
		public static void reverse(List<?> list)
		public static void shuffle(List<?> list)
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("c");
		list.add("d");
		list.add("g");
		list.add("f");
		//System.out.println(Collections.max(list)); 			//根据默认排序结果获取集合中的最大值
		//Collections.reverse(list);							//反转集合
		Collections.shuffle(list);								//随机置换,可以用来洗牌
		System.out.println(list);
	}

	public static void demo2() {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("c");
		list.add("d");
		list.add("f");
		list.add("g");
		
		System.out.println(Collections.binarySearch(list, "c"));
		System.out.println(Collections.binarySearch(list, "b"));
	}

	public static void demo1() {
		ArrayList<String> list = new ArrayList<>();
		list.add("c");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("d");
		
		System.out.println(list);
		Collections.sort(list);						//将集合排序
		System.out.println(list);
	}

}

package com.heima.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

import com.heima.bean.BaseStudent;
import com.heima.bean.Student;

public class Demo2_Genric {

	/**
	 * 泛型固定下边界
	 * ? super E  
	 * 
	 * 泛型固定上边界
	 * ? extends E
	 */
	public static void main(String[] args) {
		//demo1();
		TreeSet<Student> ts1 = new TreeSet<>(new CompareByAge());
		ts1.add(new Student("张三", 33));
		ts1.add(new Student("李四", 13));
		ts1.add(new Student("王五", 23));
		ts1.add(new Student("赵六", 43));
		
		TreeSet<BaseStudent> ts2 = new TreeSet<>(new CompareByAge());
		ts2.add(new BaseStudent("张三", 33));
		ts2.add(new BaseStudent("李四", 13));
		ts2.add(new BaseStudent("王五", 23));
		ts2.add(new BaseStudent("赵六", 43));
		
		System.out.println(ts2);
	}

	public static void demo1() {
		ArrayList<Student> list1 = new ArrayList<>();
		list1.add(new Student("张三", 23));
		list1.add(new Student("李四", 24));
		
		ArrayList<BaseStudent> list2 = new ArrayList<>();
		list2.add(new BaseStudent("王五", 25));
		list2.add(new BaseStudent("赵六", 26));
		
		list1.addAll(list2);
	}

}

class CompareByAge implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		int num = s1.getAge() - s2.getAge();
		return num == 0 ? s1.getName().compareTo(s2.getName()) :  num;
	}
	
}

package com.heima.collections;

public class Demo3_Collection {

	/**
	 * Collection
	 * 		List(存取有序,有索引,可以重复)
	 * 			ArrayList
	 * 				底层是数组实现的,线程不安全,查找和修改快,增和删比较慢
	 * 			LinkedList
	 * 				底层是链表实现的,线程不安全,增和删比较快,查找和修改比较慢
	 * 			Vector
	 * 				底层是数组实现的,线程安全的,无论增删改查都慢
	 * 			如果查找和修改多,用ArrayList
	 * 			如果增和删多,用LinkedList
	 * 			如果都多,用ArrayList
	 * 		Set(存取无序,无索引,不可以重复)
	 * 			HashSet
	 * 				底层是哈希算法实现
	 * 				LinkedHashSet
	 * 					底层是链表实现,但是也是可以保证元素唯一,和HashSet原理一样
	 * 			TreeSet
	 * 				底层是二叉树算法实现
	 * 			一般在开发的时候不需要对存储的元素排序,所以在开发的时候大多用HashSet,HashSet的效率比较高
	 * 			TreeSet在面试的时候比较多,问你有几种排序方式,和几种排序方式的区别
	 * Map
	 * 		HashMap
	 * 			底层是哈希算法,针对键
	 * 			LinkedHashMap
	 * 				底层是链表,针对键
	 * 		TreeMap
	 * 			底层是二叉树算法,针对键
	 * 		开发中用HashMap比较多
	 */
	public static void main(String[] args) {

	}

}

	//map
package com.heima.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Demo1_Map {

	/**
	 * * A:Map集合的功能概述
		* a:添加功能
			* V put(K key,V value):添加元素。
				* 如果键是第一次存储，就直接存储元素，返回null
				* 如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
		* b:删除功能
			* void clear():移除所有的键值对元素
			* V remove(Object key)：根据键删除键值对元素，并把值返回
		* c:判断功能
			* boolean containsKey(Object key)：判断集合是否包含指定的键
			* boolean containsValue(Object value):判断集合是否包含指定的值
			* boolean isEmpty()：判断集合是否为空
		* d:获取功能
			* Set<Map.Entry<K,V>> entrySet():
			* V get(Object key):根据键获取值
			* Set<K> keySet():获取集合中所有键的集合
			* Collection<V> values():获取集合中所有值的集合
		* e:长度功能
			* int size()：返回集合中的键值对的个数
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		Map<String, Integer> map = new HashMap<>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五", 25);
		map.put("赵六", 26);
		
		Collection<Integer> c = map.values();
		System.out.println(c);
		System.out.println(map.size());
	}

	public static void demo2() {
		Map<String, Integer> map = new HashMap<>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五", 25);
		map.put("赵六", 26);
		
		//Integer value = map.remove("张三");				//根据键删除元素,返回键对应的值
		//System.out.println(value);
		System.out.println(map.containsKey("张三"));		//判断是否包含传入的键
		System.out.println(map.containsValue(100));		//判断是否包含传入的值
		System.out.println(map);
	}

	public static void demo1() {
		Map<String, Integer> map = new HashMap<>();
		Integer i1 = map.put("张三", 23);
		Integer i2= map.put("李四", 24);
		Integer i3 = map.put("王五", 25);
		Integer i4 = map.put("赵六", 26);
		Integer i5 = map.put("张三", 26);					//相同的键不存储,值覆盖,把被覆盖的值返回
		
		System.out.println(map);
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
	}

}

package com.heima.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo2_Iterator {

	/**
	 * 通过查看Map集合的api发现没有iterator方法,那么双列集合如何迭代呢?
	 * 根据键获取值
	 */
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五", 25);
		map.put("赵六", 26);
		
//		Integer i = map.get("张三");					//根据键获取值
//		System.out.println(i);
		
		//获取所有的键
		/*Set<String> keySet = map.keySet();			//获取所有键的集合
		Iterator<String> it = keySet.iterator();	//获取迭代器
		while(it.hasNext()) {						//判断集合中是否有元素
			String key = it.next();					//获取每一个键
			Integer value = map.get(key);			//根据键获取值
			System.out.println(key + "=" + value);
		}*/
		
		//使用增强for循环遍历
		for(String key : map.keySet()) {			//map.keySet()是所有键的集合
			System.out.println(key + "=" + map.get(key));
		}
	}

}

package com.heima.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Demo3_Iterator {

	/**
	 * Map集合的第二种迭代,根据键值对对象,获取键和值
	 *  A:键值对对象找键和值思路：
		* 获取所有键值对对象的集合
		* 遍历键值对对象的集合，获取到每一个键值对对象
		* 根据键值对对象找键和值
	 */
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五", 25);
		map.put("赵六", 26);
		
		//Map.Entry说明Entry是Map的内部接口,将键和值封装成了Entry对象,并存储在Set集合中
		/*Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		//获取每一个对象
		Iterator<Map.Entry<String, Integer>> it = entrySet.iterator();
		while(it.hasNext()) {
			//获取每一个Entry对象
			Map.Entry<String, Integer> en = it.next();	//父类引用指向子类对象
			//Entry<String, Integer> en = it.next();	//直接获取的是子类对象
			String key = en.getKey();					//根据键值对对象获取键
			Integer value = en.getValue();				//根据键值对对象获取值
			System.out.println(key + "=" + value);
		}*/
		
		for(Entry<String, Integer> en : map.entrySet()) {
			System.out.println(en.getKey() + "=" + en.getValue());
		}
	}

}

package com.heima.map;

public class Demo4_MapEntry {

	/**
	 * @param args
	 * 解释一个Map.Entry
	 */
	public static void main(String[] args) {

	}

}

interface Inter {
	interface Inter2 {
		public void show();
	}
}

class Demo implements Inter.Inter2 {

	@Override
	public void show() {
	}
	
}

package com.heima.map;

import java.util.HashMap;

import com.heima.bean.Student;

public class Demo5_HashMap {
	/*
	 * * A:案例演示
	 * HashMap集合键是Student值是String的案例
	 * 键是学生对象,代表每一个学生
	 * 值是字符串对象,代表学生归属地
	 */
	public static void main(String[] args) {
		HashMap<Student, String> hm = new HashMap<>();
		hm.put(new Student("张三", 23), "北京");
		hm.put(new Student("张三", 23), "上海");
		hm.put(new Student("李四", 24), "广州");
		hm.put(new Student("王五", 25), "深圳");
		
		System.out.println(hm);
	}
}

package com.heima.map;

import java.util.LinkedHashMap;

public class Demo6_LinkedHashMap {

	/**
	 * @param args
	 * LinkedHashMap可以保证怎么存就怎么取
	 */
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		lhm.put("张三", 23);
		lhm.put("李四", 24);
		lhm.put("赵六", 26);
		lhm.put("王五", 25);
		
		System.out.println(lhm);
	}

}

package com.heima.map;

import java.util.Comparator;
import java.util.TreeMap;

import com.heima.bean.Student;

public class Demo7_TreeMap {

	/**
	 * * A:案例演示
	 * TreeMap集合键是Student值是String的案例
	 */
	public static void main(String[] args) {
		//demo1();
		TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int num = s1.getName().compareTo(s2.getName());		//按照姓名比较
				return num == 0 ? s1.getAge() - s2.getAge() : num;
			}
		});
		tm.put(new Student("张三", 23), "北京");
		tm.put(new Student("李四", 13), "上海");
		tm.put(new Student("赵六", 43), "深圳");
		tm.put(new Student("王五", 33), "广州");
		
		System.out.println(tm);
	}

	public static void demo1() {
		TreeMap<Student, String> tm = new TreeMap<>();
		tm.put(new Student("张三", 23), "北京");
		tm.put(new Student("李四", 13), "上海");
		tm.put(new Student("王五", 33), "广州");
		tm.put(new Student("赵六", 43), "深圳");
		
		System.out.println(tm);
	}

}

package com.heima.map;

import java.util.HashMap;

import com.heima.bean.Student;

public class Demo8_HashMapHashMap {

	/**
	 * * A:案例演示
	 * 集合嵌套之HashMap嵌套HashMap
	 * 
	 * 需求:
	 * 双元课堂有很多基础班
	 * 第88期基础班定义成一个双列集合,键是学生对象,值是学生的归属地
	 * 第99期基础班定义成一个双列集合,键是学生对象,值是学生的归属地
	 * 
	 * 无论88期还是99期都是班级对象,所以为了便于统一管理,把这些班级对象添加到双元课堂集合中
	 */
	public static void main(String[] args) {
		//定义88期基础班
		HashMap<Student, String> hm88 = new HashMap<>();
		hm88.put(new Student("张三", 23), "北京");
		hm88.put(new Student("李四", 24), "北京");
		hm88.put(new Student("王五", 25), "上海");
		hm88.put(new Student("赵六", 26), "广州");
		
		//定义99期基础班
		HashMap<Student, String> hm99 = new HashMap<>();
		hm99.put(new Student("唐僧", 1023), "北京");
		hm99.put(new Student("孙悟空",1024), "北京");
		hm99.put(new Student("猪八戒",1025), "上海");
		hm99.put(new Student("沙和尚",1026), "广州");
		
		//定义双元课堂
		HashMap<HashMap<Student, String>, String> hm = new HashMap<>();
		hm.put(hm88, "第88期基础班");
		hm.put(hm99, "第99期基础班");
		
		//遍历双列集合
		for(HashMap<Student, String> h : hm.keySet()) {		//hm.keySet()代表的是双列集合中键的集合
			String value = hm.get(h);						//get(h)根据键对象获取值对象
			//遍历键的双列集合对象
			for(Student key : h.keySet()) {					//h.keySet()获取集合总所有的学生键对象
				String value2 = h.get(key);
				
				System.out.println(key + "=" + value2 + "=" + value);
			}
		}
		
	}

}

package com.heima.map;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo9_Hashtable {

	/**
	 * @param args
	 * 面试题
	 * HashMap和Hashtable的区别
	 * 共同点:
	 * 底层都是哈希算法,都是双列集合
	 * 区别:
	 * 1,HashMap是线程不安全的,效率高,JDK1.2版本
	 *   Hashtable是线程安全的,效率低,JDK1.0版本的
	 * 2,HashMap可以存储null键和null值
	 *   Hashtable不可以存储null键和null值
	 */
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put(null, 23);
		hm.put("李四", null);
		System.out.println(hm);
		
		/*Hashtable<String, Integer> ht = new Hashtable<>();
		//ht.put(null, 23);
		ht.put("张三", null);
		System.out.println(ht);*/
		
		
		System.out.println("1111111111111");
	}

}

	//test
package com.heima.test;

import java.util.HashMap;

public class Test1 {

	/**
	 * * A:案例演示
	 * 需求：统计字符串中每个字符出现的次数
	 * 
	 * 分析:
	 * 1,定义一个需要被统计字符的字符串
	 * 2,将字符串转换为字符数组
	 * 3,定义双列集合,存储字符串中字符以及字符出现的次数
	 * 4,遍历字符数组获取每一个字符,并将字符存储在双列集合中
	 * 5,存储过程中要做判断,如果集合中不包含这个键,就将该字符当作键,值为1存储,如果集合中包含这个键,就将值加1存储
	 * 6,打印双列集合获取字符出现的次数
	 */
	public static void main(String[] args) {
		//1,定义一个需要被统计字符的字符串
		String s = "aaaabbbbbccccccccccccc";
		//2,将字符串转换为字符数组
		char[] arr = s.toCharArray();
		//3,定义双列集合,存储字符串中字符以及字符出现的次数
		HashMap<Character, Integer> hm = new HashMap<>();
		//4,遍历字符数组获取每一个字符,并将字符存储在双列集合中
		for(char c: arr) {
			//5,存储过程中要做判断,如果集合中不包含这个键,就将该字符当作键,值为1存储,如果集合中包含这个键,就将值加1存储
			/*if(!hm.containsKey(c)) {			//如果不包含这个键
				hm.put(c, 1);
			}else {
				hm.put(c, hm.get(c) + 1);
			}*/
			hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c) + 1);
		}
		//6,打印双列集合获取字符出现的次数
		
		for (Character key : hm.keySet()) {				//hm.keySet()代表所有键的集合
			System.out.println(key + "=" + hm.get(key));//hm.get(key)根据键获取值
		}
	}

}

package com.heima.test;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {

	/**
	 * * A:案例演示
	 * 模拟斗地主洗牌和发牌，牌没有排序
	 * 
	 * 分析:
	 * 1,买一副扑克,其实就是自己创建一个集合对象,将扑克牌存储进去
	 * 2,洗牌
	 * 3,发牌
	 * 4,看牌
	 */
	public static void main(String[] args) {
		//1,买一副扑克,其实就是自己创建一个集合对象,将扑克牌存储进去
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] color = {"红桃","黑桃","方片","梅花"};
		ArrayList<String> poker = new ArrayList<>();
		
		//拼接花色和数字
		for(String s1 : color) {
			for(String s2 : num) {
				poker.add(s1.concat(s2)); 			//concat连接两个字符串
			}
		}
		poker.add("小王");
		poker.add("大王");
		//2,洗牌
		Collections.shuffle(poker);
		//3,发牌
		ArrayList<String> gaojin = new ArrayList<>();
		ArrayList<String> longwu = new ArrayList<>();
		ArrayList<String> me = new ArrayList<>();
		ArrayList<String> dipai = new ArrayList<>();
		
		for(int i = 0; i < poker.size(); i++) {
			if(i >= poker.size() - 3) {
				dipai.add(poker.get(i));					//将三张底牌存储在底牌集合中
			} else if(i % 3 == 0) {
				gaojin.add(poker.get(i));
			} else if(i % 3 == 1) {
				longwu.add(poker.get(i));
			} else {
				me.add(poker.get(i));
			}
		}
		
		//4,看牌
		System.out.println(gaojin);
		System.out.println(longwu);
		System.out.println(me);
		System.out.println(dipai);
	}

}

package com.heima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Test3 {

	/**
	 * * A:案例演示
	 * 模拟斗地主洗牌和发牌并对牌进行排序的代码实现
	 * 
	 *  分析:
	 * 1,买一副扑克,其实就是自己创建一个集合对象,将扑克牌存储进去
	 * 2,洗牌
	 * 3,发牌
	 * 4,看牌
	 */
	public static void main(String[] args) {
		//1,买一副扑克,其实就是自己创建一个集合对象,将扑克牌存储进去
		String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String[] color = {"红桃","黑桃","方片","梅花"};
		HashMap<Integer, String> hm = new HashMap<>();					//存储索引和扑克牌
		ArrayList<Integer> list = new ArrayList<>();					//存储索引
		int index = 0;
		
		//拼接扑克牌并索引和扑克牌存储在hm中
		for(String s1 : num) {											//获取数字
			for(String s2 : color) {									//获取颜色
				hm.put(index, s2.concat(s1));
				list.add(index);										//将索引0到51添加到list集合中
				index++;
			}
		}
		//将小王添加到双列集合中
		hm.put(index, "小王");
		list.add(index);												//将52索引添加到集合中
		index++;
		hm.put(index, "大王");
		list.add(index);												//将52索引添加到集合中
		
		//2,洗牌
		Collections.shuffle(list);
		//3,发牌
		TreeSet<Integer> gaojin = new TreeSet<>();
		TreeSet<Integer> longwu = new TreeSet<>();
		TreeSet<Integer> me = new TreeSet<>();
		TreeSet<Integer> dipai = new TreeSet<>();
		
		for(int i = 0; i < list.size(); i++) {
			if(i >= list.size() - 3) {
				dipai.add(list.get(i));							//将三张底牌存储在底牌集合中
			}else if(i % 3 == 0) {
				gaojin.add(list.get(i));
			}else if(i % 3 == 1) {
				longwu.add(list.get(i));
			}else {
				me.add(list.get(i));
			}
		}
		
		//看牌
		lookPoker(hm, gaojin, "高进");
		lookPoker(hm, longwu, "龙五");
		lookPoker(hm, me, "冯佳");
		lookPoker(hm, dipai, "底牌");
	}
	/*
	 * 看牌
	 * 1,返回值类型void
	 * 2,参数列表HashMap,TreeSet,String name
	 */
	public static void lookPoker(HashMap<Integer, String> hm,TreeSet<Integer> ts ,String name) {
		System.out.print(name + "的牌是:");
		for(Integer i : ts) {						//i代表双列集合中的每一个键
			System.out.print(hm.get(i) + " ");
		}
		System.out.println();
	}
}


//day19
	//exception
package com.heima.exception;

public class Demo1_Exception {

	/**
	 * * A:JVM默认是如何处理异常的
		* main函数收到这个问题时,有两种处理方式:
		* a:自己将该问题处理,然后继续运行
		* b:自己没有针对的处理方式,只有交给调用main的jvm来处理
		* jvm有一个默认的异常处理机制,就将该异常进行处理.
		* 并将该异常的名称,异常的信息.异常出现的位置打印在了控制台上,同时将程序停止运行
	* B:案例演示
		* JVM默认如何处理异常
	 */
	public static void main(String[] args) {
		//demo1();
		Demo d = new Demo();
		int x = d.div(10, 0);
		System.out.println(x);
	}

	public static void demo1() {
		int[] arr = {11,22,33,44,55};
		//arr = null;					//NullPointerException				空指针异常
		System.out.println(arr[10]);	//ArrayIndexOutOfBoundsException	数组索引越界异常
	}

}

class Demo {
	/*
	 * 除法运算
	 */
	public int div(int a,int b) {		//a = 10,b = 0
		return a / b;					// 10 / 0  被除数是10,除数是0当除数是0的时候违背了算数运算法则,抛出异常
										//new ArithmeticException("/ by zero");
	}
} 

package com.heima.exception;

public class Demo2_Exception {

	/**
	 * * A:异常处理的两种方式
			* a:try…catch…finally
				* try catch
				* try catch finally
				* try finally 
			* b:throws
		* B:try...catch处理异常的基本格式
			* try…catch…finally
		* C:案例演示
			* try...catch的方式处理1个异常
		
		try:用来检测异常的
		catch:用来捕获异常的
		finally:释放资源
		
		世界上最真情的相依就是你在try我在catch,无论你发神马脾气,我都静静接受,默默处理
		当通过trycatch将问题处理了,程序会继续执行
	 */
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		try{
			int x = d.div(10, 0);
			System.out.println(x);
		}catch(ArithmeticException a) {		//ArithmeticException a = new ArithmeticException();
			System.out.println("出错了,除数为零了");
		}
		
		System.out.println("1111111111111111");
	}

}

class Demo2 {
	/*
	 * 除法运算
	 */
	public int div(int a,int b) {		//a = 10,b = 0
		return a / b;					// 10 / 0  被除数是10,除数是0当除数是0的时候违背了算数运算法则,抛出异常
										//new ArithmeticException("/ by zero");
	}
} 

package com.heima.exception;

public class Demo3_Exception {

	/**
	 * * A:案例演示
	 * try...catch的方式处理多个异常
	 * JDK7以后处理多个异常的方式及注意事项
	 * 
	 * 安卓,客户端开发,如何处理异常?try{}catch(Exception e){}
	 * ee,服务端开发,一般都是底层开发,从底层向上抛
	 * 
	 * try后面如果跟多个catch,那么小的异常放前面,大的异常放后面,根据多态的原理,如果大的放前面,就会将所有的子类对象接收
	 * 后面的catch就没有意义了
	 */
	public static void main(String[] args) {
		//demo1();
		int a = 10;
		int b = 0;
		int[] arr = {11,22,33,44,55};
		
		//JDK7如何处理多个异常
		try {
			System.out.println(a / b);
			System.out.println(arr[10]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("出错了");
		} 
	}

	public static void demo1() {
		int a = 10;
		int b = 0;
		int[] arr = {11,22,33,44,55};
		
		try {
			System.out.println(a / b);
			System.out.println(arr[10]);
			arr = null;
			System.out.println(arr[0]);
		} catch (ArithmeticException e) {
			System.out.println("除数不能为零");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("索引越界了");
		} catch (Exception e) {				//Exception e = new NullPointerException();
			System.out.println("出错了");
		}
		
		System.out.println("over");
	}

}

package com.heima.exception;

import java.io.FileInputStream;

public class Demo4_Exception {

	/**
	 * * A:编译期异常和运行期异常的区别
		* Java中的异常被分为两大类：编译时异常和运行时异常。
		* 所有的RuntimeException类及其子类的实例被称为运行时异常，其他的异常就是编译时异常
		
		* 编译时异常
			* Java程序必须显示处理，否则程序就会发生错误，无法通过编译
		* 运行时异常
			* 无需显示处理，也可以和编译时异常一样处理
	* B:案例演示
		* 编译期异常和运行期异常的区别
	编译时异常也叫做未雨绸缪异常(老师自己定义的)
		未雨绸缪:在做某些事情的时候要做某些准备
		编译时异常:在编译某个程序的时候,有可能会有这样那样的事情发生,比如文件找不到,这样的异常就必须在编译的时候处理
		如果不处理编译通不过
		
		运行时异常:就是程序员所犯得错误,需要回来修改代码
	 */
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("xxx.txt");
		} catch(Exception e) {
			
		}
	}

}

package com.heima.exception;

public class Demo5_Throwable {

	/**
	 * * A:Throwable的几个常见方法
			* a:getMessage()
				* 获取异常信息，返回字符串。
			* b:toString()
				* 获取异常类名和异常信息，返回字符串。
			* c:printStackTrace()
				* 获取异常类名和异常信息，以及异常出现在程序中的位置。返回值void。
		* B:案例演示
			* Throwable的几个常见方法的基本使用
	 */
	public static void main(String[] args) {
		try {
			System.out.println(1/0);
		} catch (Exception e) {			//Exception e = new ArithmeticException("/ by zero");
			//System.out.println(e.getMessage());		//获取异常信息
			//System.out.println(e); 		//调用toString方法,打印异常类名和异常信息
			e.printStackTrace();		//jvm默认就用这种方式处理异常
		}
	}

}

package com.heima.exception;

public class Demo6_Exception {

	/**
	 * * A:throws的方式处理异常
			* 定义功能方法时，需要把出现的问题暴露出来让调用者去处理。
			* 那么就通过throws在方法上标识。
		* B:案例演示
			* 举例分别演示编译时异常和运行时异常的抛出
			* 编译时异常的抛出必须对其进行处理
			* 运行时异常的抛出可以处理也可以不处理
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Person p = new Person();
		p.setAge(-17);
		System.out.println(p.getAge());
	}

}

class Person {
	private String name;
	private int age;
	public Person() {
		super();
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws AgeOutOfBoundsException {
		if(age >0 && age <= 150) {
			this.age = age;
		}else {
			//Exception e = new Exception("年龄非法");
			//throw e;
			throw new AgeOutOfBoundsException("年龄非法");
		}
	}
	
	
}

package com.heima.exception;

public class Demo7_Finally {

	/**
	 * * A:finally的特点
			* 被finally控制的语句体一定会执行
			* 特殊情况：在执行到finally之前jvm退出了(比如System.exit(0))
		* B:finally的作用
			* 用于释放资源，在IO流操作和数据库操作中会见到
		* C:案例演示
			* finally关键字的特点及作用
		*return语句相当于是方法的最后一口气,那么在他将死之前会看一看有没有finally帮其完成遗愿,如果有就将finally执行
		*后在彻底返回
	 */
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("除数为零了");
			System.exit(0);								//退出jvm虚拟机
			return;
		} finally {
			System.out.println("看看我执行了吗");
		}
	}

}

package com.heima.exception;

public class Demo8_Exception {

	/**
	 * * A:为什么需要自定义异常
	 		* 通过名字区分到底是神马异常,有针对的解决办法 
			* 举例：人的年龄
		* B:自定义异常概述
			* 继承自Exception
			* 继承自RuntimeException
		* C:案例演示
			* 自定义异常的基本使用
	 */
	public static void main(String[] args) {

	}

}

class AgeOutOfBoundsException extends Exception {

	public AgeOutOfBoundsException() {
		super();
		
	}

	public AgeOutOfBoundsException(String message) {
		super(message);
		
	}
	
}

	//file
package com.heima.file;

import java.io.File;


public class Demo1_File {

	/**
	 * File(String pathname)：根据一个路径得到File对象
	 * File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
	 * File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		File parent = new File("F:\\双元课堂\\day19\\video");
		String child = "001_今日内容.avi";
		File file = new File(parent, child);
		System.out.println(file.exists());
		System.out.println(parent.exists());
	}

	public static void demo2() {
		String parent = "F:\\双元课堂\\day19\\video";
		String child = "001_今日内容.avi";
		File file = new File(parent,child);
		System.out.println(file.exists());
	}

	public static void demo1() {
		File file = new File("F:\\双元课堂\\day19\\video\\001_今日内容.avi");
		System.out.println(file.exists());
		
		File file2 = new File("xxx.txt");
		System.out.println(file2.exists());
		
		File file3 = new File("yyy.txt");
		System.out.println(file3.exists());
	}

}

package com.heima.file;

import java.io.File;
import java.io.IOException;

public class Demo2_FileMethod {

	/**
	 * * A:创建功能
			* public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
			* public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
			* public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
		* B:案例演示
			* File类的创建功能
		
			* 注意事项：
				* 如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下。
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		File dir1 = new File("aaa");
		System.out.println(dir1.mkdir());
		
		File dir2 = new File("bbb.txt");				//这样写是可以的,文件夹也是可以有后缀的
		System.out.println(dir2.mkdir());
		
		File dir3 = new File("ccc\\ddd");
		System.out.println(dir3.mkdirs()); 				//创建多级目录
	}

	public static void demo1() throws IOException {
		File file = new File("yyy.txt");
		System.out.println(file.createNewFile());			//如果没有就创建,返回true
		
		File file2 = new File("zzz");
		System.out.println(file2.createNewFile());
	}

}

package com.heima.file;

import java.io.File;

public class Demo3_FileMethod {

	/**
	 * * A:重命名和删除功能
			* public boolean renameTo(File dest):把文件重命名为指定的文件路径
			* public boolean delete():删除文件或者文件夹
		* B:重命名注意事项
			* 如果路径名相同，就是改名。
			* 如果路径名不同，就是改名并剪切。
		* C:删除注意事项：
			* Java中的删除不走回收站。
			* 要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹
	 */
	public static void main(String[] args) {
		//demo1();
		File file1 = new File("yyy.txt");
		System.out.println(file1.delete());
		
		File file2 = new File("aaa");
		System.out.println(file2.delete());
		
		File file3 = new File("ccc");					//如果删除一个文件夹,那么文件夹必须是空的
		System.out.println(file3.delete());
	}

	public static void demo1() {
		File file1 = new File("ooo.txt");
		File file2 = new File("D:\\xxx.txt");
		System.out.println(file1.renameTo(file2));
	}

}

package com.heima.file;

import java.io.File;

public class Demo4_FileMethod {

	/**
	 * * A:判断功能
		* public boolean isDirectory():判断是否是目录
		* public boolean isFile():判断是否是文件
		* public boolean exists():判断是否存在
		* public boolean canRead():判断是否可读
		* public boolean canWrite():判断是否可写
		* public boolean isHidden():判断是否隐藏
	* B:案例演示
		* File类的判断功能
	 */
	public static void main(String[] args) {
		//demo1();
		File file = new File("zzz");
		file.setReadable(false);
		System.out.println(file.canRead()); 			//windows系统认为所有的文件都是可读的
		file.setWritable(true);
		System.out.println(file.canWrite()); 			//windows系统可以设置为不可写
		
		File file2 = new File("aaa.txt");
		System.out.println(file2.isHidden());			//判断是否是隐藏文件
		System.out.println(file.isHidden());
	}

	public static void demo1() {
		File dir1 = new File("ccc");
		System.out.println(dir1.isDirectory());			//判断是否是文件夹
		
		File dir2 = new File("zzz");
		System.out.println(dir2.isDirectory());
		
		System.out.println(dir1.isFile());				//判断是否是文件
		System.out.println(dir2.isFile());
	}

}

package com.heima.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo5_FileMethod {

	/**
	 * * A:获取功能
		* public String getAbsolutePath()：获取绝对路径
		* public String getPath():获取路径
		* public String getName():获取名称
		* public long length():获取长度。字节数
		* public long lastModified():获取最后一次的修改时间，毫秒值
		* public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
		* public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组 
	 */
	public static void main(String[] args) {
		//demo1();
		File dir = new File("F:/双元课堂/day19/video");
		String[] arr = dir.list();						//仅为了获取文件名
		
		for (String string : arr) {
			System.out.println(string);
		}
		
		File[] subFiles = dir.listFiles();
		
		for (File file : subFiles) {					//获取文件对象
			System.out.println(file);
		}
 	}

	public static void demo1() {
		File file1 = new File("ccc.txt");
		File file2 = new File("D:\\双元课堂\\day19\\ccc.txt");
		//System.out.println(file1.getAbsolutePath());			//获取绝对路径
		//System.out.println(file2.getAbsolutePath());
		
		//System.out.println(file1.getPath());					//获取构造方法中传入路径
		//System.out.println(file2.getPath());
		
//		System.out.println(file1.getName());					//获取文件或者文件的名字
//		System.out.println(file2.getName());
//		
//		System.out.println(file1.length());
		
		Date d = new Date(file1.lastModified());				//文件的最后修改时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println(sdf.format(d));
	}

}

	//test
package com.heima.test;

public class Test1 {

	/**
	 * * A:面试题1
			* final,finally和finalize的区别
			* final可以修饰类,不能被继承
			* 修饰方法,不能被重写
			* 修饰变量,只能赋值一次
			* 
			* finally是try语句中的一个语句体,不能单独使用,用来释放资源
			* 
			* finalize是一个方法,当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法。
		* B:面试题2
			* 如果catch里面有return语句，请问finally的代码还会执行吗?如果会，请问是在return前还是return后。
	 */
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.method());
	}

}

class Demo {
	public int method() {
		int x = 10;
		try {
			x = 20;
			System.out.println(1/0);
			return x;
		} catch (Exception e) {
			x = 30;
			return x;
		} finally {
			x = 40;
			//return x;					千万不要在finally里面写返回语句,因为finally的作用是为了释放资源,是肯定会执行的
										//如果在这里面写返回语句,那么try和catch的结果都会被改变,所以这么写就是犯罪
		}
	}
}

package com.heima.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Test2 {

	/**
	 * 键盘录入一个int类型的整数,对其求二进制表现形式
	 * 如果录入的整数过大,给予提示,录入的整数过大请重新录入一个整数BigInteger
	 * 如果录入的是小数,给予提示,录入的是小数,请重新录入一个整数
	 * 如果录入的是其他字符,给予提示,录入的是非法字符,请重新录入一个整数
	 * 
	 * 分析:
	 * 1,创建键盘录入对象
	 * 2,将键盘录入的结果存储在String类型的字符串中,存储int类型中如果有不符合条件的直接报错,无法进行后续判断
	 * 3,键盘录入的结果转换成int类型的数据,是正确的还是错误的
	 * 4,正确的直接转换
	 * 5,错误的要进行对应判断
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		
		
		while(true) {
			String line = sc.nextLine();					//将键盘录入的结果存储在line中
			try {
				int num = Integer.parseInt(line);				//将字符串转换为整数
				System.out.println(Integer.toBinaryString(num));//将整数转换为二进制
				break;											//跳出循环
			}catch(Exception e) {
				try {
					new BigInteger(line);
					System.out.println("录入错误,您录入的是一个过大整数,请重新输入一个整数:");
				}catch (Exception e2) {							//alt + shif + z (try catch快捷键)
					try {
						new BigDecimal(line);
						System.out.println("录入错误,您录入的是一个小数,请重新输入一个整数:");
					} catch (Exception e1) {
						System.out.println("录入错误,您录入的是非法字符,请重新输入一个整数:");
					}
				}
				
			}
		}
		
		
	}

}

package com.heima.test;

import java.io.File;
import java.io.FilenameFilter;

public class Test3 {

	/**
	 * @param args
	 * * A:案例演示
	 * 需求：判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
	 */
	public static void main(String[] args) {
		File dir = new File("E:\\");
		
//		String[] arr = dir.list();					//获取e盘下所有的文件或文件夹
//		for (String string : arr) {
//			if(string.endsWith(".jpg")) {
//				System.out.println(string);
//			}
//		}
		
		/*File[] subFiles = dir.listFiles();			//获取e盘下所有的文件或文件夹对象
		
		for (File subFile : subFiles) {
			if(subFile.isFile() && subFile.getName().endsWith(".jpg")) {
				System.out.println(subFile);
			}
		}*/
		
		String[] arr = dir.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				//System.out.println(dir);
				//System.out.println(name);
				File file = new File(dir, name);
				return file.isFile() && file.getName().endsWith(".jpg");
			}
		});
		
		for (String string : arr) {
			System.out.println(string);
		}
	}

}


//day20
	//stream
package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1_FileInputStream {

	/**
	 * @param args
	 * @throws IOException  
	 * read()方法读取的是一个字节,为什么返回是int,而不是byte
	 * 
	 * 00010100 00100100 01000001 11111111 0000000
	 * 
	 * 10000001    byte类型-1的原码
	 * 11111110	   -1的反码
	 * 11111111    -1的补码
	 * 
	 * 00000000 00000000 00000000 11111111
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileInputStream fis = new FileInputStream("xxx.txt");	//创建流对象
		int b;
		while((b = fis.read()) != -1) {
			System.out.println(b);
		}
		
		fis.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");	//创建流对象
		int x = fis.read();										//从硬盘上读取一个字节
		System.out.println(x);
		int y = fis.read();
		System.out.println(y);
		int z = fis.read();
		System.out.println(z);
		int a = fis.read();
		System.out.println(a);
		int b = fis.read();
		System.out.println(b);
		fis.close();											//关流释放资源
	}

}
 
package com.heima.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2_FileOutputStream {

	/**
	 * @param args
	 * @throws IOException 
	 * FileOutputStream在创建对象的时候是如果没有这个文件会帮我创建出来
	 * 如果有这个文件就会先将文件清空
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileOutputStream fos = new FileOutputStream("yyy.txt",true);	//如果想续写就在第二个参数传true
		fos.write(97);
		fos.write(98);
		
		fos.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("yyy.txt");		//创建字节输出流对象,如果没有就自动创建一个
		//fos.write(97);				//虽然写出的是一个int数,但是到文件上的是一个字节,会自动去除前三个8位
		//fos.write(98);
		//fos.write(99);
		fos.write(100);
		fos.close();
	}

}

package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_Copy {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		//demo3();
	}

	public static void demo3() throws FileNotFoundException, IOException {
		//第二种拷贝,不推荐使用,因为有可能会导致内存溢出
		FileInputStream fis = new FileInputStream("致青春.mp3");		//创建输入流对象,关联致青春.mp3
		FileOutputStream fos = new FileOutputStream("copy.mp3");	//创建输出流对象,关联copy.mp3
		//int len = fis.available();
		//System.out.println(len);
		
		byte[] arr = new byte[fis.available()];						//创建与文件一样大小的字节数组
		fis.read(arr);												//将文件上的字节读取到内存中
		fos.write(arr);												//将字节数组中的字节数据写到文件上
		
		fis.close();
		fos.close();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("致青春.mp3");		//创建输入流对象,关联致青春.mp3
		FileOutputStream fos = new FileOutputStream("copy.mp3");	//创建输出流对象,关联copy.mp3
		
		int b;
		while((b = fis.read()) != -1) {								//在不断的读取每一个字节
			fos.write(b);											//将每一个字节写出
		}
		
		fis.close();												//关流释放资源
		fos.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("双元.jpg");		//创建输入流对象,关联双元.jpg
		FileOutputStream fos = new FileOutputStream("copy.jpg");	//创建输出流对象,关联copy.jpg
		
		int b;
		while((b = fis.read()) != -1) {								//在不断的读取每一个字节
			fos.write(b);											//将每一个字节写出
		}
		
		fis.close();												//关流释放资源
		fos.close();
	}

}

package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4_ArrayCopy {

	/**
	 * @param args
	 * 第三种拷贝
	 * 定义小数组
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		FileInputStream fis = new FileInputStream("致青春.mp3");
		FileOutputStream fos = new FileOutputStream("copy.mp3");
		
		byte[] arr = new byte[1024 * 8];
		int len;
		while((len = fis.read(arr)) != -1) {				//如果忘记加arr,返回的就不是读取的字节个数,而是字节的码表值
			fos.write(arr,0,len);
		}
		
		fis.close();
		fos.close();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		FileOutputStream fos = new FileOutputStream("yyy.txt");
		
		byte[] arr = new byte[2];
		int len;
		while((len = fis.read(arr)) != -1) {
			fos.write(arr,0,len);
		}
		
		fis.close();
		fos.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		byte[] arr = new byte[2];
		int a = fis.read(arr);						//将文件上的字节读取到字节数组中
		
		System.out.println(a);						//读到的有效字节个数
		for (byte b : arr) {						//第一次获取到文件上的a和b
			System.out.println(b);
		}
		System.out.println("-----------------------");
		int c = fis.read(arr);
		System.out.println(c);
		for (byte b : arr) {
			System.out.println(b);
		}
		fis.close();
	}

}

package com.heima.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5_BufferCopy {

	/**
	 * @param args
	 * @throws IOException 
	 * close方法
	 * 具备刷新的功能,在关闭流之前,就会先刷新一次缓冲区,将缓冲区的字节全都刷新到文件上,再关闭,close方法刷完之后就能写了
	 * flush方法?
	 * 具备刷新的功能,刷完之后还可以继续写
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		//flush和close方法的区别
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("致青春.mp3"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.mp3"));
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("致青春.mp3");				//创建输入流对象,关联致青春.mp3
		FileOutputStream fos = new FileOutputStream("copy.mp3");			//创建输出流对象,关联copy.mp3
		BufferedInputStream bis = new BufferedInputStream(fis);				//创建缓冲区对象,对输入流进行包装让其变得更加强大
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		
		bis.close();
		bos.close();
	}

}

package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo6_Chinese {

	/**
	 * @param args
	 * * 字节流读取中文的问题
			* 字节流在读中文的时候有可能会读到半个中文,造成乱码 
		* 字节流写出中文的问题
			* 字节流直接操作的字节,所以写出中文必须将字符串转换成字节数组 
			* 写出回车换行 write("\r\n".getBytes());
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileOutputStream fos = new FileOutputStream("zzz.txt");
		fos.write("我读书少,你不要骗我".getBytes());
		fos.write("\r\n".getBytes());
		fos.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("yyy.txt");
		byte[] arr = new byte[4];
		int len;
		while((len = fis.read(arr)) != -1) {
			System.out.println(new String(arr,0,len));
		}
		
		fis.close();
	}

}

package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo7_TryFinally {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		try(
			FileInputStream fis = new FileInputStream("xxx.txt");
			FileOutputStream fos = new FileOutputStream("yyy.txt");
			MyClose mc = new MyClose();
		){
			int b;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
		}
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("xxx.txt");
			fos = new FileOutputStream("yyy.txt");
			
			int b;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
		}finally {
			try{
				if(fis != null)
					fis.close();
			}finally {							//try fianlly的嵌套目的是能关一个尽量关一个
				if(fos != null)
					fos.close();
			}
		}
	}

}

class MyClose implements AutoCloseable {
	public void close() {
		System.out.println("我关了");
	}
}

	//test
package com.heima.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

	/**
	 * @param args
	 * @throws IOException 
	 * 将写出的字节异或上一个数,这个数就是密钥,解密的时候再次异或就可以了
	 */
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("copy.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy2.jpg"));
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b ^ 123);
		}
		
		bis.close();
		bos.close();
	}

}

package com.heima.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	/**
	 * 在控制台录入文件的路径,将文件拷贝到当前项目下
	 * 
	 * 分析:
	 * 
	 * 1,定义方法对键盘录入的路径进行判断,如果是文件就返回
	 * 2,在主方法中接收该文件
	 * 3,读和写该文件
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File file = getFile();					//获取文件
		BufferedInputStream  bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		
		bis.close();
		bos.close();
	}

	/*
	 * 定义一个方法获取键盘录入的文件路径,并封装成File对象返回
	 * 1,返回值类型File
	 * 2,参数列表无
	 */
	public static File getFile() {
		Scanner sc = new Scanner(System.in);				//创建键盘录入对象
		System.out.println("请输入一个文件的路径:");
		while(true) {
			String line = sc.nextLine();					//接收键盘录入的路径
			File file = new File(line);						//封装成File对象,并对其进行判断
			if(!file.exists()) {
				System.out.println("您录入的文件路径不存在,请重新录入:");
			}else if(file.isDirectory()) {
				System.out.println("您录入的是文件夹路径,请重新录入:");
			}else {
				return file;
			}
		}
	}
}

package com.heima.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test3 {

	/**
	 * 将键盘录入的数据拷贝到当前项目下的text.txt文件中,键盘录入数据当遇到quit时就退出
	 * 
	 * 分析:
	 * 1,创建键盘录入对象
	 * 2,创建输出流对象,关联text.txt文件
	 * 3,定义无限循环
	 * 4,遇到quit退出循环
	 * 5,如果不quit,就将内容写出
	 * 6,关闭流
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//1,创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		//2,创建输出流对象,关联text.txt文件
		FileOutputStream fos = new FileOutputStream("text.txt");
		System.out.println("请输入数据:");
		//3,定义无限循环
		while(true) {
			String line = sc.nextLine();					//将键盘录入的数据存储在line中
			//4,遇到quit退出循环
			if("quit".equals(line)) {
				break;
			}
			//5,如果不quit,就将内容写出
			fos.write(line.getBytes());						//字符串写出必须转换成字节数组
			fos.write("\r\n".getBytes());
		}
		//6,关闭流
		fos.close();
	}

}


//day21
	//chario
package com.heima.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo1_FileReader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileReader fr = new FileReader("xxx.txt");
		int c;
		
		while((c = fr.read()) != -1) {					//通过项目默认的码表一次读取一个字符
			System.out.print((char)c);
		}
		
		fr.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("xxx.txt");
		int x = fr.read();
		System.out.println(x);
		char c = (char)x;
		System.out.println(c);
		fr.close();
	}

}

package com.heima.chario;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2_FileWriter {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("yyy.txt");
		fw.write("大家好,基础班快接近尾声了,大家要努力,要坚持!!!");
		fw.write(97);
		fw.close();
	}

}

package com.heima.chario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3_Copy {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();	
		//demo3();
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("yyy.txt"));
		
		int c;
		while((c = br.read()) != -1) {
			bw.write(c);
		}
		
		br.close();
		bw.close();
	}

	public static void demo3() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("xxx.txt");
		FileWriter fw = new FileWriter("yyy.txt");
		
		char[] arr = new char[1024];
		int len;
		while((len = fr.read(arr)) != -1) {			//将文件上的数据读取到字符数组中
			fw.write(arr,0,len);					//将字符数组中的数据写到文件上
		}
		
		fr.close();
		fw.close();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		//字符流不能拷贝纯文本的文件
		FileReader fr = new FileReader("双元.jpg");
		FileWriter fw = new FileWriter("copy.jpg");
		
		int c;
		while((c = fr.read()) != -1) {
			fw.write(c);
		}
		
		fr.close();
		fw.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("xxx.txt");
		FileWriter fw = new FileWriter("zzz.txt");
		
		int c;
		while((c = fr.read()) != -1) {
			fw.write(c);
		}
		
		fr.close();
		fw.close();				//Writer类中有一个2k的小缓冲区,如果不关流,就会将内容写到缓冲区里,关流会将缓冲区内容刷新,再关闭
	}

}

package com.heima.chario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4_Buffered {

	/**
	 * @param args
	 * 带缓冲区的流中的特殊方法
	 * readLine()
	 * newLine();
	 * 
	 * newLine()与\r\n的区别
	 * newLine()是跨平台的方法
	 * \r\n只支持的是windows系统
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("aaa.txt"));
		
		String line;
		while((line = br.readLine()) != null) {
			bw.write(line);
			//bw.newLine();							//写出回车换行符
			//bw.write("\r\n");
		}
		
		br.close();
		bw.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		String line;
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();
	}

}

package com.heima.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Demo5_LineNumberReader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("zzz.txt"));
		
		String line;
		lnr.setLineNumber(100);
		while((line = lnr.readLine()) != null) {
			System.out.println(lnr.getLineNumber() + ":" + line);
		}
		
		lnr.close();
	}

}

package com.heima.chario;

public class Demo6_Wrap {

	/**
	 * @param args
	 * 装饰设计模式的好处是:
	 * 耦合性不强,被装饰的类的变化与装饰类的变化无关
	 */
	public static void main(String[] args) {
		HeiMaStudent hms = new HeiMaStudent(new Student());
		hms.code();
	}

}

interface Coder {
	public void code();
}

class Student implements Coder {

	@Override
	public void code() {
		System.out.println("javase");
		System.out.println("javaweb");
	}
	
}

class HeiMaStudent implements Coder {
	//1,获取被装饰类的引用
	private Student s;						//获取学生引用
	
	//2,在构造方法中传入被装饰类的对象
	public HeiMaStudent(Student s) {
		this.s = s;
	}

	//3,对原有的功能进行升级
	@Override
	public void code() {
		s.code();
		System.out.println("ssh");
		System.out.println("数据库");
		System.out.println("大数据");
		System.out.println("...");
	}
}

package com.heima.chario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Demo7_TransIO {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		BufferedReader br = 								//更高效的读
				new BufferedReader(new InputStreamReader(new FileInputStream("utf-8.txt"), "utf-8"));
		BufferedWriter bw = 								//更高效的写
				new BufferedWriter(new OutputStreamWriter(new FileOutputStream("gbk.txt"), "gbk"));
		int c;
		while((c = br.read()) != -1) {
			bw.write(c);
		}
		
		br.close();
		bw.close();
	}

	public static void demo2() throws UnsupportedEncodingException,
			FileNotFoundException, IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("utf-8.txt"), "uTf-8");	//指定码表读字符
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"), "gbk");	//指定码表写字符
		
		int c;
		while((c = isr.read()) != -1) {
			osw.write(c);
		}
		
		isr.close();
		osw.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		//用默认编码表读写,出现乱码
		FileReader fr = new FileReader("utf-8.txt");				
		FileWriter fw = new FileWriter("gbk.txt");
		
		int c;
		while((c = fr.read()) != -1) {
			fw.write(c);
		}
		
		fr.close();
		fw.close();
	}

}

package com.heima.chario;

public class Demo8_Digui {

	/**
	 * @param args
	 * 递归:方法自己调用自己
	 * 5!
	 * 5 * 4 * 3 * 2 * 1
	 * 
	 * 5 * fun(4)(代表4!)
	 * 		4 * fun(3)(代表3!)
	 * 				3 * fun(2)(代表2!) 
	 * 						2 * fun(1)(代表1!)
	 * 递归的弊端:不能调用次数过多,容易导致栈内存溢出
	 * 递归的好处:不用知道循环次数
	 * 
	 * 构造方法是否可以递归调用?
	 * 构造方法不能使用递归调用
	 * 
	 * 递归调用是否必须有返回值?
	 * 不一定(可以有,也可以没有)
	 */
	public static void main(String[] args) {
		/*int result = 1;
		
		for(int i = 1; i <= 5; i++) {
			result = result * i;
		}
		
		System.out.println(result);*/
		System.out.println(fun(6000));
	}
	
	public static int fun(int num) {
		if(num == 1) {
			return 1;
		}else {
			return num * fun(num - 1);
		}
	}
}

	//test
package com.heima.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test1 {

	/**
	 * @param args
	 * 将一个文本文档上的文本反转,第一行和倒数第一行交换,第二行和倒数第二行交换
	 * 
	 * 分析:
	 * 1,创建输入输出流对象
	 * 2,创建集合对象
	 * 3,将读到的数据存储在集合中
	 * 4,倒着遍历集合将数据写到文件上
	 * 5,关流
	 * @throws IOException 
	 * 
	 * 注意事项:
	 * 流对象尽量晚开早关
	 */
	public static void main(String[] args) throws IOException {
		//改写后是尽量晚开早关
		// 1,创建输入输出流对象
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		
		//2,创建集合对象
		ArrayList<String> list = new ArrayList<>();
		//3,将读到的数据存储在集合中
		String line;
		while((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close();											//关流
		
		//4,倒着遍历集合将数据写到文件上
		BufferedWriter bw = new BufferedWriter(new FileWriter("revzzz.txt"));
		for(int i = list.size() - 1; i >= 0; i--) {
			bw.write(list.get(i));
			bw.newLine();
		}
		//5,关流
		
		bw.close();
	}

}

package com.heima.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Test2 {

	/**
	 * @param args
	 * 获取一个文本上每个字符出现的次数,将结果写在times.txt上
	 * 
	 * 1,创建带缓冲区的输入流对象
	 * 2,创建双列集合对象,目的是把字符当作键,把字符出现的次数当作值
	 * 3,通过读取不断向集合中存储,存储的时候要判断,如果不包含这个键就将键和值为1存储,如果包含就将键和值加1存储
	 * 4,关闭输入流
	 * 5,创建输出流对象
	 * 6,将结果写出
	 * 7,关闭输出流
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//1,创建带缓冲区的输入流对象
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		//2,创建双列集合对象,目的是把字符当作键,把字符出现的次数当作值
		HashMap<Character, Integer> hm = new HashMap<>();
		//3,通过读取不断向集合中存储,存储的时候要判断,如果不包含这个键就将键和值为1存储,如果包含就将键和值加1存储
		int c;
		while((c = br.read()) != -1) {
			char ch = (char)c;
			/*if(!hm.containsKey(ch)) {
				hm.put(ch, 1);
			}else {
				hm.put(ch, hm.get(ch) +  1);
			}*/
			
			hm.put(ch, !hm.containsKey(ch)? 1 : hm.get(ch) + 1);
		}
		//4,关闭输入流
		br.close();
		//5,创建输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("times.txt"));
		//6,将结果写出
		
		for (Character key : hm.keySet()) {
			bw.write(key + "=" + hm.get(key));
		}
		
		bw.close();
	}

}

package com.heima.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class Test3 {

	/**
	 * 获取一个文本上每个字符出现的次数,将结果写在times.txt上
	 * 
	 * 分析:
	 * 1,创建带缓冲的输入流对象
	 * 2,创建双列集合对象TreeMap
	 * 3,将读到的字符存储在双列集合中,存储的时候要做判断,如果不包含这个键,就将键和1存储,如果包含这个键,就将该键和值加1存储
	 * 4,关闭输入流
	 * 5,创建输出流对象
	 * 6,遍历集合将集合中的内容写到times.txt中
	 * 7,关闭输出流
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//1,创建带缓冲的输入流对象
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		//2,创建双列集合对象TreeMap
		TreeMap<Character, Integer> tm = new TreeMap<>();
		//3,将读到的字符存储在双列集合中,存储的时候要做判断,如果不包含这个键,就将键和1存储,如果包含这个键,就将该键和值加1存储
		int ch;
		while((ch = br.read()) != -1) {
			char c = (char)ch;					//强制类型转换
			/*if(!tm.containsKey(c)) {
				tm.put(c, 1);
			}else {
				tm.put(c, tm.get(c) + 1);
			}*/
			tm.put(c, !tm.containsKey(c) ? 1 : tm.get(c) + 1);
		}
		//4,关闭输入流
		br.close();
		//5,创建输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("times.txt"));
		//6,遍历集合将集合中的内容写到times.txt中
		for(Character key : tm.keySet()) {
			switch (key) {
			case '\t':
				bw.write("\\t" + "=" + tm.get(key)); 	
				break;
			case '\n':
				bw.write("\\n" + "=" + tm.get(key)); 
				break;
			case '\r':
				bw.write("\\r" + "=" + tm.get(key)); 
				break;
			default:
				bw.write(key + "=" + tm.get(key)); 			//写出键和值
				break;
			}
			bw.newLine();
		}
		//7,关闭输出流
		bw.close();
	}

}

package com.heima.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test4 {

	/**
	 *  当我们下载一个试用版软件,没有购买正版的时候,每执行一次就会提醒我们还有多少次使用机会用学过的IO流知识,模拟试用版软件,
	 *  试用10次机会,执行一次就提示一次您还有几次机会,如果次数到了提示请购买正版
	 * @throws IOException 
	 * 分析:
	 * 1,创建带缓冲的输入流对象,因为要使用readLine方法,可以保证数据的原样性
	 * 2,将读到的字符串转换为int数
	 * 3,对int数进行判断,如果大于0,就将其--写回去,如果不大于0,就提示请购买正版
	 * 4,在if判断中要将--的结果打印,并将结果通过输出流写到文件上
	 */
	public static void main(String[] args) throws IOException {
		//1,创建带缓冲的输入流对象,因为要使用readLine方法,可以保证数据的原样性
		BufferedReader br = new BufferedReader(new FileReader("config.txt"));
		//2,将读到的字符串转换为int数
		String line = br.readLine();
		int times = Integer.parseInt(line);					//将数字字符串转换为数字
		//3,对int数进行判断,如果大于0,就将其--写回去,如果不大于0,就提示请购买正版
		if(times > 0) {
			//4,在if判断中要将--的结果打印,并将结果通过输出流写到文件上
			System.out.println("您还有" + times-- + "次机会");
			FileWriter fw = new FileWriter("config.txt");
			fw.write(times + "");
			fw.close();
		}else {
			System.out.println("您的试用次数已到,请购买正版");
		}
		//关闭流
		br.close();
	}

}

package com.heima.test;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Test5 {

	/**
	 * 需求:从键盘输入接收一个文件夹路径,打印出该文件夹下所有的.java文件名
	 * 
	 * 分析:
	 * 从键盘接收一个文件夹路径
	 * 1,如果录入的是不存在,给与提示
	 * 2,如果录入的是文件路径,给与提示
	 * 3,如果是文件夹路径,直接返回
	 * 
	 * 打印出该文件夹下所有的.java文件名
	 * 1,获取到该文件夹路径下的所有的文件和文件夹,存储在File数组中
	 * 2,遍历数组,对每一个文件或文件夹做判断
	 * 3,如果是文件,并且后缀是.java的,就打印
	 * 4,如果是文件夹,就递归调用
	 */
	public static void main(String[] args) {
		File dir = getDir();
		printJavaFile(dir);
	}

	/*
	 * 获取键盘录入的文件夹路径
	 * 1,返回值类型File
	 * 2,不需要有参数
	 */
	public static File getDir() {
		Scanner sc = new Scanner(System.in);				//创建键盘录入对象
		System.out.println("请输入一个文件夹路径");
		while(true) {
			String line = sc.nextLine();					//将键盘录入的文件夹路径存储
			File dir = new File(line);						//封装成File对象
			if(!dir.exists()) {
				System.out.println("您录入的文件夹路径不存在,请重新录入");
			}else if(dir.isFile()) {
				System.out.println("您录入的是文件路径,请重新录入文件夹路径");
			}else {
				return dir;
			}
		}
	}
	/*
	 * 获取文件夹路径下的所.java文件
	 * 1,返回值类型 void
	 * 2,参数列表File dir
	 */
	public static void printJavaFile(File dir) {
		//1,获取到该文件夹路径下的所有的文件和文件夹,存储在File数组中
		File[] subFiles = dir.listFiles();
		//2,遍历数组,对每一个文件或文件夹做判断
		for (File subFile : subFiles) {
			//3,如果是文件,并且后缀是.java的,就打印
			if(subFile.isFile() && subFile.getName().endsWith(".java")) {
				System.out.println(subFile);
			//4,如果是文件夹,就递归调用
			}else if (subFile.isDirectory()){
				printJavaFile(subFile);
			}
		}
	}
}


//day22
	//bean
package com.heima.bean;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private String name;
	private int age;
	
	public Person() {
		super();
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}		
}

	//otherio
package com.heima.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Demo01_SequenceInputStream {

	/**
	 * @param args
	 * 整合两个输入流
	 * SequenceInputStream(InputStream s1, InputStream s2)
	 * 整合多个输入流
	 * SequenceInputStream(Enumeration<? extends InputStream> e)
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		FileInputStream fis3 = new FileInputStream("c.txt");
		
		Vector<FileInputStream> v = new Vector<>();					//创建集合对象
		v.add(fis1);												//将流对象存储进来
		v.add(fis2);
		v.add(fis3);
		
		Enumeration<FileInputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);		//将枚举中的输入流整合成一个
		FileOutputStream fos = new FileOutputStream("d.txt");
		
		int b;
		while((b = sis.read()) != -1) {
			fos.write(b);
		}
		
		sis.close();
		fos.close();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		FileOutputStream fos = new FileOutputStream("c.txt");
		
		int b;
		while((b = sis.read()) != -1) {
			fos.write(b);
		}
		
		sis.close();					//sis在关闭的时候,会将构造方法中传入的流对象也都关闭
		fos.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis1 = new FileInputStream("a.txt");		//创建字节输入流关联a.txt
		FileOutputStream fos = new FileOutputStream("c.txt");		//创建字节输出流关联c.txt
		
		int b1;
		while((b1 = fis1.read()) != -1) {							//不断的在a.txt上读取字节
			fos.write(b1);											//将读到的字节写到c.txt上
		}
		fis1.close();												//关闭字节输入流
		
		FileInputStream fis2 = new FileInputStream("b.txt");
		int b2;
		while((b2 = fis2.read()) != -1) {
			fos.write(b2);
		}
		
		fis2.close();
		fos.close();
	}

}

package com.heima.otherio;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo02_ByteArrayOutputStream {

	/**
	 * @param args
	 * ByteArrayOutputStream
	 * 内存输出流
	 * 
	 * FileInputStream读取中文的时候出现了乱码
	 * 
	 * 解决方案
	 * 1,字符流读取
	 * 2,ByteArrayOutputStream
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileInputStream fis = new FileInputStream("e.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();			//在内存中创建了可以增长的内存数组
		
		int b;
		while((b = fis.read()) != -1) {
			baos.write(b);													//将读取到的数据逐个写到内存中
		}
		
		//byte[] arr = baos.toByteArray();									//将缓冲区的数据全部获取出来,并赋值给arr数组
		//System.out.println(new String(arr));
		
		System.out.println(baos.toString());								//将缓冲区的内容转换为了字符串,在输出语句中可以省略调用toString方法
		fis.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("e.txt");
		byte[] arr = new byte[3];
		int len;
		while((len = fis.read(arr)) != -1) {
			System.out.println(new String(arr,0,len));
		}
		
		fis.close();
	}

}

package com.heima.otherio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.heima.bean.Person;

public class Demo03_ObjectOutputStream {

	/**
	 * @param args
	 * 序列化:将对象写到文件上
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		Person p1 = new Person("张三", 23);
		Person p2 = new Person("李四", 24);
		Person p3 = new Person("王五", 25);
		Person p4 = new Person("赵六", 26);
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e.txt"));
		oos.writeObject(list);								//把整个集合对象一次写出
		oos.close();
	}

	public static void demo1() throws IOException, FileNotFoundException {
		Person p1 = new Person("张三", 23);
		Person p2 = new Person("李四", 24);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e.txt"));
		oos.writeObject(p1);
		oos.writeObject(p2);
		
		oos.close();
	}

}

package com.heima.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.heima.bean.Person;

public class Demo04_ObjectInputStream {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 * ObjectInputStream
	 * 对象输入流,反序列化
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//demo1();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e.txt"));
		ArrayList<Person> list = (ArrayList<Person>) ois.readObject();		//将集合对象一次读取
		
		for (Person person : list) {
			System.out.println(person);
		}
		
		ois.close();
	}

	public static void demo1() throws IOException, FileNotFoundException,
			ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e.txt"));
		
		Person p1 = (Person) ois.readObject();
		Person p2 = (Person) ois.readObject();
		//Person p3 = (Person) ois.readObject();			//当文件读取到了末尾时出现EOFException
		
		System.out.println(p1);
		System.out.println(p2);
		
		ois.close();
	}

}

package com.heima.otherio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import com.heima.bean.Person;

public class Demo05_PrintStream {

	/**
	 * @param args
	 * @throws IOException 
	 * PrintStream和PrintWriter分别是打印的字节流和字符流
	 * 只操作数据目的的
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		PrintWriter pw = new PrintWriter(new FileOutputStream("f.txt"),true);
		//pw.println(97);							//自动刷出功能只针对的是println方法
		//pw.write(97);
		pw.print(97);
		pw.println(97);
		pw.close();
	}

	public static void demo1() {
		System.out.println("aaa");
		PrintStream ps = System.out;			//获取标注输出流
		ps.println(97);							//底层通过Integer.toString()将97转换成字符串并打印
		ps.write(97);							//查找码表,找到对应的a并打印
		
		Person p1 = new Person("张三", 23);
		ps.println(p1);							//默认调用p1的toString方法
		
		Person p2 = null;						//打印引用数据类型,如果是null,就打印null,如果不是null就打印对象的toString方法
		ps.println(p2);
		ps.close();
	}

}

package com.heima.otherio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Demo06_SystemInOut {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		System.setIn(new FileInputStream("a.txt"));			//改变标准输入流
		System.setOut(new PrintStream("b.txt"));			//改变标注输出流
		
		InputStream is = System.in;							//获取标准的键盘输入流,默认指向键盘,改变后指向文件
		PrintStream ps = System.out;						//获取标准输出流,默认指向的是控制台,改变后就指向文件
		
		int b;
		while((b = is.read()) != -1) {
			ps.write(b);
		}
		//System.out.println();								//也是一个输出流,不用关,因为没有和硬盘上的文件产生关联的管道
		is.close();
		ps.close();
		
	}

	public static void demo1() throws IOException {
		InputStream is = System.in;
		int x = is.read();
		System.out.println(x);
		
		is.close();
		
		InputStream is2 = System.in;
		int y = is2.read();
		System.out.println(y);
	}

}

package com.heima.otherio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo07_SystemIn {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		//InputStreamReader转换流
		String line = br.readLine();
		System.out.println(line);
		br.close();*/
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		System.out.println(line);
		sc.close();
	}

}

package com.heima.otherio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo08_RandomAccessFile {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("g.txt", "rw");
		//raf.write(97);
		//int x = raf.read();
		//System.out.println(x);
		raf.seek(0);					//在指定位置设置指针
		raf.write(98);
		raf.close();
	}

}

package com.heima.otherio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo09_Data {

	/**
	 * @param args
	 * @throws IOException 
	 * 00000000 00000000 00000011 11100101	int类型997
	 * 11100101
	 * 00000000 00000000 00000000 11100101
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		//demo3();
		DataInputStream dis = new DataInputStream(new FileInputStream("h.txt"));
		int x = dis.readInt();
		int y = dis.readInt();
		int z = dis.readInt();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		dis.close();
	}

	public static void demo3() throws FileNotFoundException, IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("h.txt"));
		dos.writeInt(997);
		dos.writeInt(998);
		dos.writeInt(999);
		dos.close();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("h.txt");
		int x = fis.read();
		int y = fis.read();
		int z = fis.read();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		fis.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("h.txt");
		fos.write(997);
		fos.write(998);
		fos.write(999);
		
		fos.close();
	}

}

package com.heima.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Demo10_Properties {

	/**
	 * @param args
	 * Properties是Hashtable的子类
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//demo1();
		//demo2();
		Properties prop = new Properties();
		prop.load(new FileInputStream("config.properties"));		//将文件上的键值对读取到集合中
		prop.setProperty("tel", "18912345678");
		prop.store(new FileOutputStream("config.properties"), null);//第二个参数是对列表参数的描述,可以给值,也可以给null
		System.out.println(prop);
	}

	public static void demo2() {
		Properties prop = new Properties();
		prop.setProperty("name", "张三");
		prop.setProperty("tel", "18912345678");
		
		//System.out.println(prop);
		Enumeration<String> en = (Enumeration<String>) prop.propertyNames();
		while(en.hasMoreElements()) {
			String key = en.nextElement();				//获取Properties中的每一个键
			String value = prop.getProperty(key);		//根据键获取值
			System.out.println(key + "="+ value);
		}
	}

	public static void demo1() {
		Properties prop = new Properties();
		prop.put("abc", 123);
		System.out.println(prop);
	}

}

	//test
package com.heima.test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1 {

	/**
	 * @param args
	 * 定义一个文件输入流,调用read(byte[] b)方法,将a.txt文件中的内容打印出来(byte数组大小限制为5)
	 * 
	 * 分析:
	 * 1,reda(byte[] b)是字节输入流的方法,创建FileInputStream,关联a.txt
	 * 2,创建内存输出流,将读到的数据写到内存输出流中
	 * 3,创建字节数组,长度为5
	 * 4,将内存输出流的数据全部转换为字符串打印
	 * 5,关闭输入流
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//1,reda(byte[] b)是字节输入流的方法,创建FileInputStream,关联a.txt
		FileInputStream fis = new FileInputStream("a.txt");
		//2,创建内存输出流,将读到的数据写到内存输出流中
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		//3,创建字节数组,长度为5
		byte[] arr = new byte[5];
		int len;
		
		while((len = fis.read(arr)) != -1) {
			baos.write(arr, 0, len);
			//System.out.println(new String(arr,0,len));
		}
		//4,将内存输出流的数据全部转换为字符串打印
		System.out.println(baos); 					//即使没有调用,底层也会默认帮我们调用toString()方法
		//5,关闭输入流
		fis.close();
	}
}

package com.heima.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Test2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("双元.jpg"));			//改变标准输入流
		System.setOut(new PrintStream("copy.jpg")); 			//改变标准输出流
		
		InputStream is = System.in;
		PrintStream ps = System.out;
		
		byte[] arr = new byte[1024];
		int len;
		
		while((len = is.read(arr)) != -1) {
			ps.write(arr, 0, len);
		}
		
		is.close();
		ps.close();
	}

}


//day23
	//test
package com.heima.test;

import java.io.File;
import java.util.Scanner;

public class Test1 {

	/**
	 * @param args
	 * 需求:1,从键盘接收一个文件夹路径,统计该文件夹大小
	 * 
	 * 从键盘接收一个文件夹路径
	 * 1,创建键盘录入对象
	 * 2,定义一个无限循环
	 * 3,将键盘录入的结果存储并封装成File对象
	 * 4,对File对象判断
	 * 5,将文件夹路径对象返回
	 * 
	 * 统计该文件夹大小 
	 * 1,定义一个求和变量
	 * 2,获取该文件夹下所有的文件和文件夹listFiles();
	 * 3,遍历数组
	 * 4,判断是文件就计算大小并累加
	 * 5,判断是文件夹,递归调用
	 */
	public static void main(String[] args) {
		//File dir = new File("F:\\day06");
		//System.out.println(dir.length());				//直接获取文件夹的结果是0
		File dir = getDir();
		System.out.println(getFileLength(dir));
		
	}
	
	/*
	 * 从键盘接收一个文件夹路径
	 * 1,返回值类型File
	 * 2,参数列表无
	 */
	public static File getDir() {
		//1,创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个文件夹路径:");
		//2,定义一个无限循环
		while(true) {
			//3,将键盘录入的结果存储并封装成File对象
			String line = sc.nextLine();
			File dir = new File(line);
			//4,对File对象判断
			if(!dir.exists()) {
				System.out.println("您录入的文件夹路径不存在,请输入一个文件夹路径:");
			}else if(dir.isFile()) {
				System.out.println("您录入的是文件路径,请输入一个文件夹路径:");
			}else {
				//5,将文件夹路径对象返回
				return dir;
			}
		}
		
	}
	
	/*
	 * 统计该文件夹大小 
	 * 1,返回值类型long
	 * 2,参数列表File dir
	 */
	public static long getFileLength(File dir) {	//dir = F:\day06\day07
		//1,定义一个求和变量
		long len = 0;
		//2,获取该文件夹下所有的文件和文件夹listFiles();
		File[] subFiles = dir.listFiles();			//day07 Demo1_Student.class Demo1_Student.java
		//3,遍历数组
		for (File subFile : subFiles) {
			//4,判断是文件就计算大小并累加
			if(subFile.isFile()) {
				len = len + subFile.length();
			//5,判断是文件夹,递归调用
			}else {
				len = len + getFileLength(subFile);
			}
		}
		return len;
	}
}

package com.heima.test;

import java.io.File;

public class Test2 {

	/**
	 * 需求:2,从键盘接收一个文件夹路径,删除该文件夹
	 * 
	 * 删除该文件夹
	 * 分析:
	 * 1,获取该文件夹下的所有的文件和文件夹
	 * 2,遍历数组
	 * 3,判断是文件直接删除
	 * 4,如果是文件夹,递归调用
	 * 5,循环结束后,把空文件夹删掉
	 */
	public static void main(String[] args) {
		File dir = Test1.getDir();					//获取文件夹路径
		deleteFile(dir);
	}

	/*
	 * 删除该文件夹
	 * 1,返回值类型 void
	 * 2,参数列表File dir
	 */
	public static void deleteFile(File dir) {	
		//1,获取该文件夹下的所有的文件和文件夹
		File[] subFiles = dir.listFiles();		
		//2,遍历数组
		for (File subFile : subFiles) {
			//3,判断是文件直接删除
			if(subFile.isFile()) {
				subFile.delete();
			//4,如果是文件夹,递归调用
			}else {
				deleteFile(subFile);			
			}
		}
		//5,循环结束后,把空文件夹删掉
		dir.delete();
	}
}

package com.heima.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {

	/**
	 * 需求:3,从键盘接收两个文件夹路径,把其中一个文件夹中(包含内容)拷贝到另一个文件夹中
	 * 
	 * 把其中一个文件夹中(包含内容)拷贝到另一个文件夹中
	 * 分析:
	 * 1,在目标文件夹中创建原文件夹
	 * 2,获取原文件夹中所有的文件和文件夹,存储在File数组中
	 * 3,遍历数组
	 * 4,如果是文件就用io流读写
	 * 5,如果是文件夹就递归调用
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File src = Test1.getDir();
		File dest = Test1.getDir();
		if(src.equals(dest)) {
			System.out.println("目标文件夹是源文件夹的子文件夹");
		}else {
			copy(src,dest);
		}
	}
	/*
	 * 把其中一个文件夹中(包含内容)拷贝到另一个文件夹中
	 * 1,返回值类型void
	 * 2,参数列表File src,File dest
	 */
	public static void copy(File src, File dest) throws IOException {
		//1,在目标文件夹中创建原文件夹
		File newDir = new File(dest, src.getName());
		newDir.mkdir();
		//2,获取原文件夹中所有的文件和文件夹,存储在File数组中
		File[] subFiles = src.listFiles();
		//3,遍历数组
		for (File subFile : subFiles) {
			//4,如果是文件就用io流读写
			if(subFile.isFile()) {
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(subFile));
				BufferedOutputStream bos = 
						new BufferedOutputStream(new FileOutputStream(new File(newDir,subFile.getName())));
				
				int b;
				while((b = bis.read()) != -1) {
					bos.write(b);
				}
				
				bis.close();
				bos.close();
			//5,如果是文件夹就递归调用
			}else {
				copy(subFile,newDir);
			}
		}
	}
}

package com.heima.test;

import java.io.File;

public class Test4 {

	/**
	 * 需求:4,从键盘接收一个文件夹路径,把文件夹中的所有文件以及文件夹的名字按层级打印, 例如:
	 * 把文件夹中的所有文件以及文件夹的名字按层级打印
	 * 分析:
	 * 1,获取所有文件和文件夹,返回的File数组
	 * 2,遍历数组
	 * 3,无论是文件还是文件夹,都需要直接打印
	 * 4,如果是文件夹,递归调用
	 * 	day07
	 * 		day08
	 * 			xxx.jpg
	 * 			yyy.txt
	 * 		Demo1_Consturctor.class
	 * 		Demo1_Consturctor.java
	 * 	Demo1_Student.class
	 * 	Demo1_Student.java
	 */
	public static void main(String[] args) {
		File dir = Test1.getDir();				//获取文件夹路径
		printLev(dir,0);
	}

	public static void printLev(File dir,int lev) {
		//1,把文件夹中的所有文件以及文件夹的名字按层级打印
		File[] subFiles = dir.listFiles();
		//2,遍历数组
		for (File subFile : subFiles) {
			for(int i = 0; i <= lev; i++) {
				System.out.print("\t");
			}
			//3,无论是文件还是文件夹,都需要直接打印
			System.out.println(subFile);
			//4,如果是文件夹,递归调用
			if(subFile.isDirectory()) {
				//printLev(subFile,lev + 1);
				printLev(subFile,++lev);
			}
		}
	}

}

package com.heima.test;

public class Test5 {

	/**
	 * * 不死神兔
	* 故事得从西元1202年说起，话说有一位意大利青年，名叫斐波那契。
	* 在他的一部著作中提出了一个有趣的问题：假设一对刚出生的小兔一个月后就能长成大兔，再过一个月就能生下一对小兔，并且此后每个月都生一对小兔，一年内没有发生死亡，
	* 问：一对刚出生的兔子，一年内繁殖成多少对兔子?
	* 1 1 2 3 5 8 13 21
	* 1 = fun(1)
	* 1 = fun(2)
	* 2 = fun(1) + fun(2)
	* 3 = fun(2) + fun(3)
	 */
	public static void main(String[] args) {
		//demo1();
		System.out.println(fun(8));
	}

	public static void demo1() {
		//用数组做不死神兔
		int[] arr = new int[8];
		//数组中第一个元素和第二个元素都为1
		arr[0] = 1;
		arr[1] = 1;
		//遍历数组对其他元素赋值
		for(int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}
		//如何获取最后一个数
		System.out.println(arr[arr.length - 1]);
	}

	/*
	 * 用递归求斐波那契数列
	 */
	public static int fun(int num) {
		if(num == 1 || num == 2) {
			return 1;
		}else {
			return fun(num - 2) + fun(num - 1);
		}
	}
}

package com.heima.test;

import java.math.BigInteger;

public class Test6 {

	/**
	 * @param args
	 *  需求:求出1000的阶乘所有零和尾部零的个数,不用递归做
	 */
	public static void main(String[] args) {
		/*int result = 1;
		for(int i = 1; i <= 1000; i++) {
			result = result * i;
		}
		
		System.out.println(result);		//因为1000的阶乘远远超出了int的取值范围
		*/
		//demo1();
		demo2();
	}

	public static void demo2() {		//获取1000的阶乘尾部有多少个零
		BigInteger bi1 = new BigInteger("1");
		for(int i = 1; i <= 1000; i++) {
			BigInteger bi2 = new BigInteger(i+"");
			bi1 = bi1.multiply(bi2);	//将bi1与bi2相乘的结果赋值给bi1
		}
		String str = bi1.toString();	//获取字符串表现形式
		StringBuilder sb = new StringBuilder(str);
		str = sb.reverse().toString();	//链式编程
		
		int count = 0;					//定义计数器
		for(int i = 0; i < str.length(); i++) {
			if('0' != str.charAt(i)) {
				break;
			}else {
				count++;
			}
		}
		
		System.out.println(count);
	}

	public static void demo1() {		//求1000的阶乘中所有的零
		BigInteger bi1 = new BigInteger("1");
		for(int i = 1; i <= 1000; i++) {
			BigInteger bi2 = new BigInteger(i+"");
			bi1 = bi1.multiply(bi2);	//将bi1与bi2相乘的结果赋值给bi1
		}
		String str = bi1.toString();	//获取字符串表现形式
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if('0' == str.charAt(i)) {	//如果字符串中出现了0字符
				count++;				//计数器加1
			}
		}
		System.out.println(count);
	}

}

package com.heima.test;

public class Test7 {

	/**
	 * @param args
	 * 需求:求出1000的阶乘尾部零的个数,用递归做
	 * 5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100...1000  1000 / 5 = 200
	 * 5 * 5	5 * 5 * 2 	5 * 5 * 3	5 * 5 * 4	5 * 5 * 5	5 * 5 * 6	200 / 5 = 40
	 * 5 * 5 * 5 * 1	5 * 5 * 5 * 2	5 * 5 * 5 * 3	5 * 5 *  5 * 4	5 * 5 *  5 * 5	5 * 5 *  5 * 6	5 * 5 *  5 * 7	5 * 5 *  5 * 8
																			40 / 5 = 8
		5 * 5 * 5 * 5														8 / 5 = 1
	 */
	public static void main(String[] args) {
		System.out.println(fun(1000));
	}

	public static int fun(int num) {
		if(num > 0 && num < 5) {
			return 0;
		}else {
			return num / 5 + fun(num / 5);
		}
	}
}

package com.heima.test;

import java.util.ArrayList;

public class Test8 {

	/**
	 * @param args
	 * 约瑟夫环
	 * * 幸运数字
	 */
	public static void main(String[] args) {
		System.out.println(getLucklyNum(8));
	}

	/*
	 * 获取幸运数字
	 * 1,返回值类型int
	 * 2,参数列表int num
	 */
	public static int getLucklyNum(int num) {
		ArrayList<Integer> list = new ArrayList<>();		//创建集合存储1到num的对象
		for(int i = 1; i <= num; i++) {
			list.add(i);									//将1到num存储在集合中
		}
		
		int count = 1;										//用来数数的,只要是3的倍数就杀人
		for(int i = 0; list.size() != 1; i++) {				//只要集合中人数超过1,就要不断的杀
			if(i == list.size()) {							//如果i增长到集合最大的索引+1时
				i = 0;										//重新归零
			}
			
			if(count % 3 == 0) {							//如果是3的倍数
				list.remove(i--);								//就杀人
			}
			count++;
		}
		
		return list.get(0);
	}
}



//day24
	//syn
package com.heima.syn;

public class Demo1_Synchronized {

	/**
	 * @param args
	 * 同步代码块
	 */
	public static void main(String[] args) {
		final Printer p = new Printer();
		
		new Thread() {
			public void run() {
				while(true) {
					p.print1();
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					p.print2();
				}
			}
		}.start();
	}

}

class Printer {
	Demo d = new Demo();
	public void print1() {
		//synchronized(new Demo()) {							//同步代码块,锁机制,锁对象可以是任意的
		synchronized(d) {
			System.out.print("黑");
			System.out.print("马");
			System.out.print("程");
			System.out.print("序");
			System.out.print("员");
			System.out.print("\r\n");
		}
	}
	
	public void print2() {
		//synchronized(new Demo()) {							//锁对象不能用匿名对象,因为匿名对象不是同一个对象
		synchronized(d) {		
			System.out.print("传");
			System.out.print("智");
			System.out.print("播");
			System.out.print("客");
			System.out.print("\r\n");
		}
	}
}

class Demo{}

package com.heima.syn;

public class Demo2_Synchronized {

	/**
	 * @param args
	 * 同步代码块
	 */
	public static void main(String[] args) {
		final Printer2 p = new Printer2();
		
		new Thread() {
			public void run() {
				while(true) {
					p.print1();
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					p.print2();
				}
			}
		}.start();
	}

}

class Printer2 {
	Demo d = new Demo();
	//非静态的同步方法的锁对象是神马?
	//答:非静态的同步方法的锁对象是this
	//静态的同步方法的锁对象是什么?
	//是该类的字节码对象
	public static synchronized void print1() {							//同步方法只需要在方法上加synchronized关键字即可
		System.out.print("黑");
		System.out.print("马");
		System.out.print("程");
		System.out.print("序");
		System.out.print("员");
		System.out.print("\r\n");
	}
	
	public static void print2() {
		//synchronized(new Demo()) {							//锁对象不能用匿名对象,因为匿名对象不是同一个对象
		synchronized(Printer2.class) {		
			System.out.print("传");
			System.out.print("智");
			System.out.print("播");
			System.out.print("客");
			System.out.print("\r\n");
		}
	}
}

package com.heima.syn;

public class Demo3_Ticket {

	/**
	 * 需求:铁路售票,一共100张,通过四个窗口卖完.
	 */
	public static void main(String[] args) {
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
	}

}

class Ticket extends Thread {
	private static int ticket = 100;
	//private static Object obj = new Object();		//如果用引用数据类型成员变量当作锁对象,必须是静态的
	public void run() {
		while(true) {
			synchronized(Ticket.class) {
				if(ticket <= 0) {
					break;
				}
				try {
					Thread.sleep(10);				//线程1睡,线程2睡,线程3睡,线程4睡
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println(getName() + "...这是第" + ticket-- + "号票");
			}
		}
	}
}

package com.heima.syn;

public class Demo4_Ticket {

	/**
	 * @param args
	 * 火车站卖票的例子用实现Runnable接口
	 */
	public static void main(String[] args) {
		MyTicket mt = new MyTicket();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
		
		/*Thread t1 = new Thread(mt);				//多次启动一个线程是非法的
		t1.start();
		t1.start();
		t1.start();
		t1.start();*/
	}

}

class MyTicket implements Runnable {
	private int tickets = 100;
	@Override
	public void run() {
		while(true) {
			synchronized(this) {
				if(tickets <= 0) {
					break;
				}
				try {
					Thread.sleep(10);				//线程1睡,线程2睡,线程3睡,线程4睡
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "...这是第" + tickets-- + "号票");
			}
		}
	}
}

package com.heima.syn;

public class Demo5_DeadLock {

	/**
	 * @param args
	 */
	private static String s1 = "筷子左";
	private static String s2 = "筷子右";

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				while(true) {
					synchronized(s1) {
						System.out.println(getName() + "...获取" + s1 + "等待" + s2);
						synchronized(s2) {
							System.out.println(getName() + "...拿到" + s2 + "开吃");
						}
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					synchronized(s2) {
						System.out.println(getName() + "...获取" + s2 + "等待" + s1);
						synchronized(s1) {
							System.out.println(getName() + "...拿到" + s1 + "开吃");
						}
					}
				}
			}
		}.start();
	}
}

	//thread
package com.heima.thread;

public class Demo1_Thread {

	/**
	 * @param args
	 * 证明jvm是多线程的
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 100000; i++) {
			new Demo();
		}
		
		for(int i = 0; i < 10000; i++) {
			System.out.println("我是主线程的执行代码");
		}
	}

}

class Demo {

	@Override
	public void finalize() {
		System.out.println("垃圾被清扫了");
	}
	
}

package com.heima.thread;

public class Demo2_Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread mt = new MyThread();		//4,创建Thread类的子类对象
		mt.start();							//5,开启线程
		
		for(int i = 0; i < 1000; i++) {
			System.out.println("bb");
		}
	}

}

class MyThread extends Thread {				//1,继承Thread
	public void run() {						//2,重写run方法
		for(int i = 0; i < 1000; i++) {		//3,将要执行的代码写在run方法中
			System.out.println("aaaaaaaaaaaa");
		}
	}
}

package com.heima.thread;

public class Demo3_Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();	//4,创建Runnable的子类对象
		//Runnable target = mr;	mr = 0x0011
		Thread t = new Thread(mr);			//5,将其当作参数传递给Thread的构造函数
		t.start();							//6,开启线程
		
		for(int i = 0; i < 1000; i++) {
			System.out.println("bb");
		}
	}

}

class MyRunnable implements Runnable {		//1,定义一个类实现Runnable

	@Override
	public void run() {						//2,重写run方法
		for(int i = 0; i < 1000; i++) {		//3,将要执行的代码写在run方法中
			System.out.println("aaaaaaaaaaaa");
		}
	}
	
}

package com.heima.thread;

public class Demo4_Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread() {										//1,继承Thread类
			public void run() {								//2,重写run方法
				for(int i = 0; i < 1000; i++) {				//3,将要执行的代码写在run方法中
					System.out.println("aaaaaaaaaaaaaa");
				}
			}
		}.start();											//4,开启线程
		
		new Thread(new Runnable() {							//1,将Runnable的子类对象传递给Thread的构造方法
			public void run() {								//2,重写run方法
				for(int i = 0; i < 1000; i++) {				//3,将要执行的代码写在run方法中
					System.out.println("bb");
				}
			}
		}).start();											//4,开启线程
	}

}

	//threadmethod
package com.heima.threadmethod;

public class Demo1_Name {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//demo1();
		Thread t1 = new Thread() {
			public void run() {
				//this.setName("张三");
				System.out.println(this.getName() + "....aaaaaaaaaaaaa");
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				//this.setName("李四");
				System.out.println(this.getName() + "....bb");
			}
		};
		
		t1.setName("张三");
		t2.setName("李四");
		t1.start();
		t2.start();
	}

	public static void demo1() {
		new Thread("芙蓉姐姐") {							//通过构造方法给name赋值
			public void run() {
				System.out.println(this.getName() + "....aaaaaaaaa");
			}
		}.start();
		
		new Thread("凤姐") {
			public void run() {
				System.out.println(this.getName() + "....bb");
			}
		}.start();
	}

}

package com.heima.threadmethod;

public class Demo2_CurrentThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				System.out.println(getName() + "....aaaaaa");
			}
		}.start();
		
		
		new Thread(new Runnable() {
			public void run() {
				//Thread.currentThread()获取当前正在执行的线程
				System.out.println(Thread.currentThread().getName() + "...bb");
			}
		}).start();
		
		Thread.currentThread().setName("我是主线程");
		System.out.println(Thread.currentThread().getName());
	}

}

package com.heima.threadmethod;

public class Demo3_Sleep {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		//demo1();
		new Thread() {
			public void run() {
				for(int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println(getName() + "...aaaaaaaaaa");
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				for(int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println(getName() + "...bb");
				}
			}
		}.start();
	}

	public static void demo1() throws InterruptedException {
		for(int i = 20; i >= 0; i--) {
			Thread.sleep(1000);
			System.out.println("倒计时第" +i + "秒");
		}
	}

}

package com.heima.threadmethod;

public class Demo4_Daemon {

	/**
	 * @param args
	 * 守护线程
	 */
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 2; i++) {
					System.out.println(getName() + "...aaaaaaaaaaaaaaaaaaaa");
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 50; i++) {
					System.out.println(getName() + "...bb");
				}
			}
		};
		
		t2.setDaemon(true);							//设置为守护线程
		
		t1.start();
		t2.start();
	}

}

package com.heima.threadmethod;

public class Demo5_Join {

	/**
	 * @param args
	 * join(), 当前线程暂停, 等待指定的线程执行结束后, 当前线程再继续
	 */
	public static void main(String[] args) {
		final Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println(getName() + "...aaaaaaaaaaaaa");
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 10; i++) {
					if(i == 2) {
						try {
							//t1.join();
							t1.join(1);					//插队指定的时间,过了指定时间后,两条线程交替执行
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
					}
					System.out.println(getName() + "...bb");
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}

package com.heima.threadmethod;

public class Demo6_Yield {

	/**
	 * yield让出cpu礼让线程
	 */
	public static void main(String[] args) {
		new MyThread().start();
		new MyThread().start();
	}

}

class MyThread extends Thread {
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			if(i % 10 == 0) {
				Thread.yield();						//让出CPU
			}
			System.out.println(getName() + "..." + i);
		}
	}
}

package com.heima.threadmethod;

public class Demo7_Priority {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run() {
				for(int i = 0; i < 100; i++) {
					System.out.println(getName() + "...aaaaaaaaa" );
				}
			}
		};
		
		Thread t2 = new Thread(){
			public void run() {
				for(int i = 0; i < 100; i++) {
					System.out.println(getName() + "...bb" );
				}
			}
		};
		
		//t1.setPriority(10);					设置最大优先级
		//t2.setPriority(1);
		
		t1.setPriority(Thread.MIN_PRIORITY);		//设置最小的线程优先级
		t2.setPriority(Thread.MAX_PRIORITY);		//设置最大的线程优先级
		
		t1.start();
		t2.start();
	}

}



//day25
	//gui
package com.heima.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Demo1_Frame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Frame f = new Frame("我的第一个窗口");
		f.setSize(400, 600);							//设置窗体大小
		f.setLocation(500, 50);							//设置窗体位置
		f.setIconImage(Toolkit.getDefaultToolkit().createImage("qq.png"));
		Button b1 = new Button("按钮一");
		Button b2 = new Button("按钮二");
		f.add(b1);
		f.add(b2);
		f.setLayout(new FlowLayout());					//设置布局管理器
		//f.addWindowListener(new MyWindowAdapter());
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		b1.addMouseListener(new MouseAdapter() {
			/*@Override
			public void mouseClicked(MouseEvent e) {	//单击
				System.exit(0);
			}*/
			@Override
			public void mouseReleased(MouseEvent e) {	//释放
				System.exit(0);
			}
		});
		
		b1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				//System.exit(0);
				//System.out.println(e.getKeyCode());
				//if(e.getKeyCode() == 32) {
				if(e.getKeyCode() == KeyEvent.VK_SPACE){
					System.exit(0);
				}
			}
		});
		
		b2.addActionListener(new ActionListener() {		//添加动作监听,应用场景就是暂停视频和播放视频
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);								//设置窗体可见
	}

}

/*class MyWindowListener implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("Closed");
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}
	
}
*/

/*class MyWindowAdapter extends WindowAdapter {
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}*/


	//thread
package com.heima.thread;

public class Demo1_Singleton {

	/**
	 * @param args
	 * * 单例设计模式：保证类在内存中只有一个对象。
	 */
	public static void main(String[] args) {
		//Singleton s1 = new Singleton();
		
		Singleton s1 = Singleton.s;				//成员变量被私有,不能通过类名.调用
		//Singleton.s = null;
		Singleton s2 = Singleton.s;
		
		System.out.println(s1 == s2);
		
	/*	Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1 == s2);*/
	}

}

/*
 * 饿汉式
 
class Singleton {
	//1,私有构造方法,其他类不能访问该构造方法了
	private Singleton(){}
	//2,创建本类对象
	private static Singleton s = new Singleton();
	//3,对外提供公共的访问方法
	public static Singleton getInstance() {				//获取实例
		return s;
	}
}*/
/*
 * 懒汉式,单例的延迟加载模式
 */
/*class Singleton {
	//1,私有构造方法,其他类不能访问该构造方法了
	private Singleton(){}
	//2,声明一个引用
	private static Singleton s ;
	//3,对外提供公共的访问方法
	public static Singleton getInstance() {				//获取实例
		if(s == null) {
			//线程1等待,线程2等待
			s = new Singleton();
		}
		
		return s;
	}
}*/
/*
 * 饿汉式和懒汉式的区别
 * 1,饿汉式是空间换时间,懒汉式是时间换空间
 * 2,在多线程访问时,饿汉式不会创建多个对象,而懒汉式有可能会创建多个对象
 */

class Singleton {
	//1,私有构造方法,其他类不能访问该构造方法了
	private Singleton(){}
	//2,声明一个引用
	public static final Singleton s = new Singleton();
	
}

package com.heima.thread;

import java.io.IOException;

public class Demo2_Runtime {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();			//获取运行时对象
		//r.exec("shutdown -s -t 300");
		r.exec("shutdown -a");
	}

}

package com.heima.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo3_Timer {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Timer t = new Timer();
		//在指定时间安排指定任务
		//第一个参数,是安排的任务,第二个参数是执行的时间,第三个参数是过多长时间再重复执行
		t.schedule(new MyTimerTask(), new Date(188, 6, 1, 14, 22, 50),3000);	
		
		while(true) {
			Thread.sleep(1000);
			System.out.println(new Date());
		}
	}

}

class MyTimerTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("起床背英语单词");
	}
}

	//thread2
package com.heima.thread2;

public class Demo1_Notify {
	/**
	 * @param args
	 * 等待唤醒机制
	 */
	public static void main(String[] args) {
		final Printer p = new Printer();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print1();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print2();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		}.start();
	}

}

//等待唤醒机制
class Printer {
	private int flag = 1;
	public void print1() throws InterruptedException {							
		synchronized(this) {
			if(flag != 1) {
				this.wait();					//当前线程等待
			}
			System.out.print("黑");
			System.out.print("马");
			System.out.print("程");
			System.out.print("序");
			System.out.print("员");
			System.out.print("\r\n");
			flag = 2;
			this.notify();						//随机唤醒单个等待的线程
		}
	}
	
	public void print2() throws InterruptedException {
		synchronized(this) {
			if(flag != 2) {
				this.wait();
			}
			System.out.print("传");
			System.out.print("智");
			System.out.print("播");
			System.out.print("客");
			System.out.print("\r\n");
			flag = 1;
			this.notify();
		}
	}
}

package com.heima.thread2;

public class Demo2_NotifyAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Printer2 p = new Printer2();
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print1();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print2();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print3();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		}.start();
	}

}
/*1,在同步代码块中,用哪个对象锁,就用哪个对象调用wait方法
 * 2,为什么wait方法和notify方法定义在Object这类中?
 * 	因为锁对象可以是任意对象,Object是所有的类的基类,所以wait方法和notify方法需要定义在Object这个类中
 * 3,sleep方法和wait方法的区别?
 * a,sleep方法必须传入参数,参数就是时间,时间到了自动醒来
 *   wait方法可以传入参数也可以不传入参数,传入参数就是在参数的时间结束后等待,不传入参数就是直接等待
 * b,sleep方法在同步函数或同步代码块中,不释放锁,睡着了也抱着锁睡
 * 	wait方法在同步函数或者同步代码块中,释放锁
 */ 
class Printer2 {
	private int flag = 1;
	public void print1() throws InterruptedException {							
		synchronized(this) {
			while(flag != 1) {
				this.wait();					//当前线程等待
			}
			System.out.print("黑");
			System.out.print("马");
			System.out.print("程");
			System.out.print("序");
			System.out.print("员");
			System.out.print("\r\n");
			flag = 2;
			//this.notify();						//随机唤醒单个等待的线程
			this.notifyAll();
		}
	}
	
	public void print2() throws InterruptedException {
		synchronized(this) {
			while(flag != 2) {
				this.wait();					//线程2在此等待
			}
			System.out.print("传");
			System.out.print("智");
			System.out.print("播");
			System.out.print("客");
			System.out.print("\r\n");
			flag = 3;
			//this.notify();
			this.notifyAll();
		}
	}
	
	public void print3() throws InterruptedException {
		synchronized(this) {
			while(flag != 3) {
				this.wait();						//线程3在此等待,if语句是在哪里等待,就在哪里起来
													//while循环是循环判断,每次都会判断标记
			}
			System.out.print("i");
			System.out.print("t");
			System.out.print("h");
			System.out.print("e");
			System.out.print("i");
			System.out.print("m");
			System.out.print("a");
			System.out.print("\r\n");
			flag = 1;
			//this.notify();
			this.notifyAll();
		}
	}
}

package com.heima.thread2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Demo3_ReentrantLock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Printer3 p = new Printer3();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print1();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print2();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print3();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		}.start();
	}

}

class Printer3 {
	private ReentrantLock r = new ReentrantLock();
	private Condition c1 = r.newCondition();
	private Condition c2 = r.newCondition();
	private Condition c3 = r.newCondition();
	
	private int flag = 1;
	public void print1() throws InterruptedException {							
		r.lock();								//获取锁
			if(flag != 1) {
				c1.await();
			}
			System.out.print("黑");
			System.out.print("马");
			System.out.print("程");
			System.out.print("序");
			System.out.print("员");
			System.out.print("\r\n");
			flag = 2;
			//this.notify();						//随机唤醒单个等待的线程
			c2.signal();
		r.unlock();								//释放锁
	}
	
	public void print2() throws InterruptedException {
		r.lock();
			if(flag != 2) {
				c2.await();
			}
			System.out.print("传");
			System.out.print("智");
			System.out.print("播");
			System.out.print("客");
			System.out.print("\r\n");
			flag = 3;
			//this.notify();
			c3.signal();
		r.unlock();
	}
	
	public void print3() throws InterruptedException {
		r.lock();
			if(flag != 3) {
				c3.await();
			}
			System.out.print("i");
			System.out.print("t");
			System.out.print("h");
			System.out.print("e");
			System.out.print("i");
			System.out.print("m");
			System.out.print("a");
			System.out.print("\r\n");
			flag = 1;
			c1.signal();
		r.unlock();
	}
}

package com.heima.thread2;

public class Demo4_ThreadGroup {

	/**
	 * @param args
	 * ThreadGroup
	 */
	public static void main(String[] args) {
		//demo1();
		ThreadGroup tg = new ThreadGroup("我是一个新的线程组");		//创建新的线程组
		MyRunnable mr = new MyRunnable();						//创建Runnable的子类对象
		
		Thread t1 = new Thread(tg, mr, "张三");					//将线程t1放在组中
		Thread t2 = new Thread(tg, mr, "李四");					//将线程t2放在组中
		
		System.out.println(t1.getThreadGroup().getName());		//获取组名
		System.out.println(t2.getThreadGroup().getName());
		
		tg.setDaemon(true);
	}

	public static void demo1() {
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr, "张三");
		Thread t2 = new Thread(mr, "李四");
		
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		
		System.out.println(tg1.getName());				//默认的是主线程
		System.out.println(tg2.getName());
	}

}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName() + "...." + i);
		}
	}
	
}

package com.heima.thread2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo5_Executors {

	/**
	 * public static ExecutorService newFixedThreadPool(int nThreads)
	 * public static ExecutorService newSingleThreadExecutor()
	 */
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(2);//创建线程池
		pool.submit(new MyRunnable());				//将线程放进池子里并执行
		pool.submit(new MyRunnable());
		
		pool.shutdown();							//关闭线程池
	}

}

package com.heima.thread2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo6_Callable {

	/**
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService pool = Executors.newFixedThreadPool(2);//创建线程池
		Future<Integer> f1 = pool.submit(new MyCallable(100));				//将线程放进池子里并执行
		Future<Integer> f2 = pool.submit(new MyCallable(50));
		
		System.out.println(f1.get());
		System.out.println(f2.get());
		
		pool.shutdown();							//关闭线程池
	}

}

class MyCallable implements Callable<Integer> {
	private int num;
	public MyCallable(int num) {
		this.num = num;
	}
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		
		return sum;
	}
	
}

	//工厂方法
package com.heima.工厂方法;

public abstract class Animal {
	public abstract void eat();
}

package com.heima.工厂方法;

public class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}

}

package com.heima.工厂方法;

public class CatFactory implements Factory {

	@Override
	public Animal createAnimal() {

		return new Cat();
	}

}

package com.heima.工厂方法;

public class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("狗吃肉");
	}

}

package com.heima.工厂方法;

public class DogFactory implements Factory {

	@Override
	public Animal createAnimal() {

		return new Dog();
	}

}

package com.heima.工厂方法;

public interface Factory {
	public Animal createAnimal();
}

package com.heima.工厂方法;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DogFactory df = new DogFactory();
		Dog d = (Dog) df.createAnimal();
		d.eat();
	}

}

	//简单工厂
package com.heima.简单工厂;

public abstract class Animal {
	public abstract void eat();
}

package com.heima.简单工厂;

public class AnimalFactory {
	/*public static Dog createDog() {
		return new Dog();
	}
	
	public static Cat createCat() {
		return new Cat();
	}*/
	
	//发现方法会定义很多,复用性太差
	//改进
	public static Animal createAnimal(String name) {
		if("dog".equals(name)) {
			return new Dog();
		}else if("cat".equals(name)) {
			return new Cat();
		}else {
			return null;
		}
	}
}

package com.heima.简单工厂;

public class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}

}

package com.heima.简单工厂;

public class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("狗吃肉");
	}

}

package com.heima.简单工厂;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Dog d = AnimalFactory.createDog();
		
		Dog d = (Dog) AnimalFactory.createAnimal("dog");
		d.eat();
		
		Cat c = (Cat) AnimalFactory.createAnimal("cat");
		c.eat();
	}

}

	//适配器
package com.heima.适配器;

public class Demo1_Adapter {

	/**
	 * @param args
	 * 适配器设计模式
	 * 鲁智深
	 */
	public static void main(String[] args) {
		
	}

}

interface 和尚 {
	public void 打坐();
	public void 念经();
	public void 撞钟();
	public void 习武();
}

abstract class 天罡星 implements 和尚 {		//声明成抽象的原因是,不想让其他类创建本类对象,因为创建也没有意义,方法都是空的

	@Override
	public void 打坐() {
	}

	@Override
	public void 念经() {
	}

	@Override
	public void 撞钟() {
	}

	@Override
	public void 习武() {
	}
	
}

class 鲁智深 extends 天罡星 {
	public void 习武() {
		System.out.println("倒拔垂杨柳");
		System.out.println("拳打镇关西");
		System.out.println("大闹野猪林");
		System.out.println("......");
	}
}
	
	
//day26
	//socket
package com.heima.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Demo1_Receive {

	/**
	 ** 2.接收Receive
	 * 创建DatagramSocket, 指定端口号
	 * 创建DatagramPacket, 指定数组, 长度
	 * 使用DatagramSocket接收DatagramPacket
	 * 关闭DatagramSocket
	 * 从DatagramPacket中获取数据
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(6666);		//创建Socket相当于创建码头
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);//创建Packet相当于创建集装箱
		socket.receive(packet);									//接货,接收数据
		
		byte[] arr = packet.getData();							//获取数据
		int len = packet.getLength();							//获取有效的字节个数
		System.out.println(new String(arr,0,len));
		socket.close();
	}

}

package com.heima.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Demo2_Receive {

	/**
	 ** 2.接收Receive
	 * 创建DatagramSocket, 指定端口号
	 * 创建DatagramPacket, 指定数组, 长度
	 * 使用DatagramSocket接收DatagramPacket
	 * 关闭DatagramSocket
	 * 从DatagramPacket中获取数据
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(6666);		//创建Socket相当于创建码头
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);//创建Packet相当于创建集装箱
		
		while(true) {
			socket.receive(packet);									//接货,接收数据
			
			byte[] arr = packet.getData();							//获取数据
			int len = packet.getLength();							//获取有效的字节个数
			String ip = packet.getAddress().getHostAddress();		//获取ip地址
			int port = packet.getPort();							//获取端口号
			System.out.println(ip + ":" + port + ":" + new String(arr,0,len));
		}
	}

}

package com.heima.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Demo1_Send {

	/**
	 * * 1.发送Send
	 * 创建DatagramSocket, 随机端口号
	 * 创建DatagramPacket, 指定数据, 长度, 地址, 端口
	 * 使用DatagramSocket发送DatagramPacket
	 * 关闭DatagramSocket
	 * @throws SocketException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws Exception {
		String str = "what are you 弄啥呢?";
		DatagramSocket socket = new DatagramSocket();				//创建Socket相当于创建码头
		DatagramPacket packet = 									//创建Packet相当于集装箱
				new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);
		socket.send(packet);										//发货,将数据发出去
		socket.close();												//关闭码头
	}

}

package com.heima.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Demo2_Send {

	/**
	 * * 1.发送Send
	 * 创建DatagramSocket, 随机端口号
	 * 创建DatagramPacket, 指定数据, 长度, 地址, 端口
	 * 使用DatagramSocket发送DatagramPacket
	 * 关闭DatagramSocket
	 * @throws SocketException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);						//创建键盘录入对象
		DatagramSocket socket = new DatagramSocket();				//创建Socket相当于创建码头
		
		while(true) {
			String line = sc.nextLine();							//获取键盘录入的字符串
			if("quit".equals(line)) {
				break;
			}
			DatagramPacket packet = 								//创建Packet相当于集装箱
					new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);
			socket.send(packet);									//发货,将数据发出去
		}
		socket.close();												//关闭码头
	}

}

package com.heima.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Demo3_MoreThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Receive().start();
		
		new Send().start();
	}

}

class Receive extends Thread {
	public void run() {
		try {
			DatagramSocket socket = new DatagramSocket(6666);		//创建Socket相当于创建码头
			DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);//创建Packet相当于创建集装箱
			
			while(true) {
				socket.receive(packet);									//接货,接收数据
				
				byte[] arr = packet.getData();							//获取数据
				int len = packet.getLength();							//获取有效的字节个数
				String ip = packet.getAddress().getHostAddress();		//获取ip地址
				int port = packet.getPort();							//获取端口号
				System.out.println(ip + ":" + port + ":" + new String(arr,0,len));
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}

class Send extends Thread {
	public void run() {
		try {
			Scanner sc = new Scanner(System.in);						//创建键盘录入对象
			DatagramSocket socket = new DatagramSocket();				//创建Socket相当于创建码头
			
			while(true) {
				String line = sc.nextLine();							//获取键盘录入的字符串
				if("quit".equals(line)) {
					break;
				}
				DatagramPacket packet = 								//创建Packet相当于集装箱
						new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);
				socket.send(packet);									//发货,将数据发出去
			}
			socket.close();
		}  catch (IOException e) {
			
			e.printStackTrace();
		}		
	}
}

package com.heima.socket;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo4_GUIChat extends Frame {

	private TextField tf;
	private Button send;
	private Button log;
	private Button clear;
	private Button shake;
	private TextArea viewText;
	private TextArea sendText;
	private DatagramSocket socket;
	private BufferedWriter bw;
	/**
	 * @param args
	 * GUI聊天
	 */
	public Demo4_GUIChat() {
		init();
		southPanel();
		centerPanel();
		event();
	}

	public void event() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				try {
					socket.close();
					bw.close();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				System.exit(0);
			}
		});
		
		send.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					send();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}

		});
		
		log.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					logFile();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}

		});
		
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				viewText.setText("");
			}
		});
		
		shake.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					send(new byte[]{-1},tf.getText());
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}

		});
		
		sendText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				//if(e.getKeyCode() == KeyEvent.VK_ENTER && e.isControlDown()) {	//isControlDown ctrl是否被按下
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					try {
						send();
					} catch (IOException e1) {
						
						e1.printStackTrace();
					}
				}
			}
		});
	}
	

	private void shake() {
		int x = this.getLocation().x;							//获取横坐标位置
		int y = this.getLocation().y;							//获取纵坐标位置
		
		for(int i = 0; i < 20; i++) {
			try {
				this.setLocation(x + 20, y + 20);
				Thread.sleep(20);
				this.setLocation(x + 20, y - 20);
				Thread.sleep(20);
				this.setLocation(x - 20, y + 20);
				Thread.sleep(20);
				this.setLocation(x - 20, y - 20);
				Thread.sleep(20);
				this.setLocation(x, y);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	private void logFile() throws IOException {
		bw.flush();									//刷新缓冲区
		FileInputStream fis = new FileInputStream("config.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();	//在内存中创建缓冲区
		
		int len;
		byte[] arr = new byte[8192];
		while((len = fis.read(arr)) != -1) {
			baos.write(arr, 0, len);
		}
		
		String str = baos.toString();				//将内存中的内容转换成了字符串
		viewText.setText(str);
		
		fis.close();
	}
	
	private void send(byte[] arr, String ip) throws IOException {
		DatagramPacket packet = 
				new DatagramPacket(arr, arr.length, InetAddress.getByName(ip), 9999);
		socket.send(packet);						//发送数据
	}
	
	private void send() throws IOException {
		String message = sendText.getText();		//获取发送区域的内容
		String ip = tf.getText();					//获取ip地址;
		ip = ip.trim().length() == 0 ? "255.255.255.255" : ip;
		
		send(message.getBytes(),ip);
		
		String time = getCurrentTime();				//获取当前时间
		String str = time + " 我对:" + (ip.equals("255.255.255.255") ? "所有人" : ip) + "说\r\n" + message + "\r\n\r\n";	//alt + shift + l 抽取局部变量
		viewText.append(str);						//将信息添加到显示区域中
		bw.write(str);								//将信息写到数据库中
		sendText.setText("");
		
		
	}
	
	private String getCurrentTime() {
		Date d = new Date();						//创建当前日期对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		return sdf.format(d);						//将时间格式化
	}

	public void centerPanel() {
		Panel center = new Panel();					//创建中间的Panel
		viewText = new TextArea();
		sendText = new TextArea(5,1);
		center.setLayout(new BorderLayout());		//设置为边界布局管理器
		center.add(sendText,BorderLayout.SOUTH);	//发送的文本区域放在南边
		center.add(viewText,BorderLayout.CENTER);	//显示区域放在中间
		viewText.setEditable(false);				//设置不可以编辑
		viewText.setBackground(Color.WHITE);		//设置背景颜色
		sendText.setFont(new Font("xxx", Font.PLAIN, 15));
		viewText.setFont(new Font("xxx", Font.PLAIN, 15));
		this.add(center,BorderLayout.CENTER);
	}

	public void southPanel() {
		Panel south = new Panel();					//创建南边的Panel
		tf = new TextField(15);
		tf.setText("127.0.0.1");
		send = new Button("发 送");
		log = new Button("记 录");
		clear = new Button("清 屏");
		shake = new Button("震 动");
		south.add(tf);
		south.add(send);
		south.add(log);
		south.add(clear);
		south.add(shake);
		this.add(south,BorderLayout.SOUTH);			//将Panel放在Frame的南边
	}

	public void init() {
		this.setLocation(500, 50);
		this.setSize(400, 600);
		new Receive().start();
		try {
			socket = new DatagramSocket();
			bw = new BufferedWriter(new FileWriter("config.txt",true));	//需要在尾部追加
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		this.setVisible(true);
	}
	private class Receive extends Thread {			//接收和发送需要同时执行,所以定义成多线程的
		public void run() {
			try {
				DatagramSocket socket = new DatagramSocket(9999);
				DatagramPacket packet = new DatagramPacket(new byte[8192], 8192);
				
				while(true) {
					socket.receive(packet);				//接收信息
					byte[] arr = packet.getData();		//获取字节数据
					int len = packet.getLength();		//获取有效的字节数据
					if(arr[0] == -1 && len == 1) {		//如果发过来的数组第一个存储的值是-1,并且数组长度是1
						shake();						//调用震动方法
						continue;						//终止本次循环,继续下次循环,因为震动后不需要执行下面的代码
					}
					String message = new String(arr,0,len);	//转换成字符串
					
					String time = getCurrentTime();		//获取当前时间
					String ip = packet.getAddress().getHostAddress();	//获取ip地址
					String str = time + " " + ip + " 对我说:\r\n" + message + "\r\n\r\n";
					viewText.append(str);
					bw.write(str);
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new Demo4_GUIChat();
	}

}


	//tcp
package com.heima.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo1_Server {

	/**
	 * * 2.服务端
	* 创建ServerSocket(需要指定端口号)
	* 调用ServerSocket的accept()方法接收一个客户端请求，得到一个Socket
	* 调用Socket的getInputStream()和getOutputStream()方法获取和客户端相连的IO流
	* 输入流可以读取客户端输出流写出的数据
	* 输出流可以写出数据到客户端的输入流
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(12345);
		
		Socket socket = server.accept();						//接受客户端的请求
		InputStream is = socket.getInputStream();			//获取客户端输入流
		OutputStream os = socket.getOutputStream();			//获取客户端的输出流
		
		os.write("百度一下你就知道".getBytes());					//服务器向客户端写出数据
		
		byte[] arr = new byte[1024];
		int len = is.read(arr);								//读取客户端发过来的数据
		System.out.println(new String(arr,0,len));       	//将数据转换成字符串并打印
		
		socket.close();
	}

}

package com.heima.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo2_Server {

	/**
	 * * 2.服务端
	* 创建ServerSocket(需要指定端口号)
	* 调用ServerSocket的accept()方法接收一个客户端请求，得到一个Socket
	* 调用Socket的getInputStream()和getOutputStream()方法获取和客户端相连的IO流
	* 输入流可以读取客户端输出流写出的数据
	* 输出流可以写出数据到客户端的输入流
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		ServerSocket server = new ServerSocket(12345);
		
		while(true) {
			final Socket socket = server.accept();						//接受客户端的请求
			new Thread() {
				public void run() {
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));		//将字节流包装成了字符流
						PrintStream ps = new PrintStream(socket.getOutputStream());					//PrintStream中有写出换行的方法
						
						ps.println("欢迎咨询黑马程序员");
						System.out.println(br.readLine());
						ps.println("不好意思,爆满了");
						System.out.println(br.readLine());
						socket.close();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				}
			}.start();
		}
	}

	public static void demo1() throws IOException {
		ServerSocket server = new ServerSocket(12345);
		
		Socket socket = server.accept();						//接受客户端的请求
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));		//将字节流包装成了字符流
		PrintStream ps = new PrintStream(socket.getOutputStream());					//PrintStream中有写出换行的方法
		
		ps.println("欢迎咨询黑马程序员");
		System.out.println(br.readLine());
		ps.println("不好意思,爆满了");
		System.out.println(br.readLine());
		socket.close();
	}

}

package com.heima.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo1_Client {

	/**
	 * * 1.客户端
		* 创建Socket连接服务端(指定ip地址,端口号)通过ip地址找对应的服务器
		* 调用Socket的getInputStream()和getOutputStream()方法获取和服务端相连的IO流
		* 输入流可以读取服务端输出流写出的数据
		* 输出流可以写出数据到服务端的输入流
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 12345);
		
		InputStream is = socket.getInputStream();			//获取客户端输入流
		OutputStream os = socket.getOutputStream();			//获取客户端的输出流
		
		byte[] arr = new byte[1024];
		int len = is.read(arr);								//读取服务器发过来的数据
		System.out.println(new String(arr,0,len));       	//将数据转换成字符串并打印
		
		os.write("学习挖掘机哪家强?".getBytes());					//客户端向服务器写数据
		
		socket.close();
	}

}

package com.heima.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo2_Client {

	/**
	 * * 1.客户端
		* 创建Socket连接服务端(指定ip地址,端口号)通过ip地址找对应的服务器
		* 调用Socket的getInputStream()和getOutputStream()方法获取和服务端相连的IO流
		* 输入流可以读取服务端输出流写出的数据
		* 输出流可以写出数据到服务端的输入流
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 12345);
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));		//将字节流包装成了字符流
		PrintStream ps = new PrintStream(socket.getOutputStream());					//PrintStream中有写出换行的方法
		
		System.out.println(br.readLine());
		ps.println("我想报名黑马程序员");
		System.out.println(br.readLine());
		ps.println("大哭!!!能不能给次机会");
		
		socket.close();
	}

}

	//test
package com.heima.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test1_Server {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(54321);
		System.out.println("服务器启动,绑定54321端口");
		
		while(true) {
			final Socket socket = server.accept();					//接受客户端的请求
			
			new Thread() {											//开启一条线程
				public void run() {
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));	//获取输入流
						PrintStream ps = new PrintStream(socket.getOutputStream());//获取输出流
						
						String line = br.readLine();				//将客户端写过来的数据读取出来
						line = new StringBuilder(line).reverse().toString();	//链式编程
						ps.println(line);							//反转后写回去
						
						socket.close();
					} catch (IOException e) {						
						
						e.printStackTrace();
					}
				}
			}.start();
		}
	}

}

package com.heima.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Test1_Client {

	/**
	 * 客户端向服务器写字符串(键盘录入),服务器(多线程)将字符串反转后写回,客户端再次读取到是反转后的字符串
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner sc = new Scanner(System.in);				//创建键盘录入对象
		Socket socket = new Socket("127.0.0.1", 54321);		//创建客户端,指定ip地址和端口号
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));	//获取输入流
		PrintStream ps = new PrintStream(socket.getOutputStream());//获取输出流
		
		ps.println(sc.nextLine());							//将字符串写到服务器去
		System.out.println(br.readLine()); 					//将反转后的结果读出来
		
		socket.close();
	}

}

package com.heima.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test2_UpdateServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//3,建立多线程的服务器
		ServerSocket server = new ServerSocket(12345);
		System.out.println("服务器启动,绑定12345端口号");
		
		//4.读取文件名
		while(true) {
			final Socket socket = server.accept();					//接受请求
			new Thread() {
				public void run() {
					try {
						InputStream is = socket.getInputStream();
						BufferedReader br = new BufferedReader(new InputStreamReader(is));
						PrintStream ps = new PrintStream(socket.getOutputStream());
						String fileName = br.readLine();
						
						//5.判断文件是否存在, 将结果发回客户端
						File dir = new File("update");
						dir.mkdir();								//创建文件夹
						File file = new File(dir,fileName);			//封装成File对象
						
						if(file.exists()) {							//如果服务器已经存在这个文件
							ps.println("存在");						//将存在写给客户端
							socket.close();							//关闭socket
							return;
						}else {
							ps.println("不存在");
						}
						
						//8.定义FileOutputStream, 从网络读取数据, 存储到本地
						FileOutputStream fos = new FileOutputStream(file);
						byte[] arr = new byte[8192];
						int len;
						
						while((len = is.read(arr)) != -1) {
							fos.write(arr, 0, len);
						}
						
						fos.close();
						socket.close();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				}
			}.start();
		}
		
		
		
	}
}

package com.heima.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Test2_UpdateClient {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// 1.提示输入要上传的文件路径, 验证路径是否存在以及是否是文件夹
		File file = getFile();
		// 2.发送文件名到服务端
		Socket socket = new Socket("127.0.0.1", 12345);
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		ps.println(file.getName());
		// 6.接收结果, 如果存在给予提示, 程序直接退出
		String result = br.readLine();						//读取存在后不存在的结果
		if("存在".equals(result)) {
			System.out.println("您上传的文件已经存在,请不要重复上传");
			socket.close();
			return;
		}
		// 7.如果不存在, 定义FileInputStream读取文件, 写出到网络
		FileInputStream fis = new FileInputStream(file);
		byte[] arr = new byte[8192];
		int len;
		
		while((len = fis.read(arr)) != -1) {
			ps.write(arr, 0, len);
		}
		
		fis.close();
		socket.close();
	}

	private static File getFile() {
		Scanner sc = new Scanner(System.in);				//创建键盘录入对象
		System.out.println("请输入一个文件路径:");
		
		while(true) {
			String line = sc.nextLine();
			File file = new File(line);
			
			if(!file.exists()) {
				System.out.println("您录入的文件路径不存在,请重新录入:");
			}else if(file.isDirectory()) {
				System.out.println("您录入的是文件夹路径,请输入一个文件路径:");
			}else {
				return file;
			}
		}
	}
}


	//

//day27
	//bean
package com.heima.bean;

public class Person {
	private String name;
	private int age;
	public Person() {
		super();
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())		//判断调用对象和传入对象的字节码文件是否是同一个字节码文件
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public void eat() {
		System.out.println("今天吃了一顿金钱豹");
	}
	
	public void eat(int num) {
		System.out.println("今天吃了" + num + "顿金钱豹");
	}
}

	//jdk7
package com.heima.jdk7;

public class Demo1_JDK7 {

	/**
	 	* A:二进制字面量
		* B:数字字面量可以出现下划线
		* C:switch 语句可以用字符串
		* D:泛型简化,菱形泛型
		* E:异常的多个catch合并,每个异常用或|
		* F:try-with-resources 语句,1.7版标准的异常处理代码
		* 
		* 100_000
	 */
	public static void main(String[] args) {
		System.out.println(0b110);
		System.out.println(100_000);
	}

}

	//reflect
package com.heima.reflect;

import com.heima.bean.Person;

public class Demo1_Reflect {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz1 = Class.forName("com.heima.bean.Person");
		Class clazz2 = Person.class;
		
		Person p = new Person();
		Class clazz3 = p.getClass();
		
		System.out.println(clazz1 == clazz2);
		System.out.println(clazz2 == clazz3);
	}

}

package com.heima.reflect;

import java.io.BufferedReader;
import java.io.FileReader;

public class Demo2_Reflect {

	/**
	 * * 榨汁机(Juicer)榨汁的案例
	 * 分别有水果(Fruit)苹果(Apple)香蕉(Banana)桔子(Orange)榨汁(squeeze)
	 * @throws IOException 
	 */
	public static void main(String[] args) throws Exception {
		Juicer j = new Juicer();									//创建榨汁机
		//j.run(new Apple());
		//j.run(new Orange());
		BufferedReader br = new BufferedReader(new FileReader("config.properties"));
		Class clazz = Class.forName(br.readLine());					//获取该类的字节码文件
		Fruit f = (Fruit) clazz.newInstance();						//创建实例对象
		j.run(f);
		
	}
}
interface Fruit {
	public void squeeze();
}
class Apple implements Fruit {
	public void squeeze() {
		System.out.println("榨出一杯苹果汁儿");
	}
}

class Orange implements Fruit {
	public void squeeze() {
		System.out.println("榨出一杯橘子汁儿");
	}
}

class Juicer {
	/*public void run(Apple a) {
		a.squeeze();
	}
	
	public void run(Orange o) {
		o.squeeze();
	}*/
	
	public void run(Fruit f) {
		f.squeeze();
	}
}

package com.heima.reflect;

import java.lang.reflect.Constructor;

import com.heima.bean.Person;

public class Demo3_Constructor {

	/**
	 * Class类的newInstance()方法是使用该类无参的构造函数创建对象, 如果一个类没有无参的构造函数,
	 * 就不能这样创建了,可以调用Class类的getConstructor
	 * (String.class,int.class)方法获取一个指定的构造函数然后再调用Constructor类的newInstance
	 * ("张三",20)方法创建对象
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.heima.bean.Person");
		//Person p = (Person) clazz.newInstance();				通过无餐构造创建对象
		//System.out.println(p);
		Constructor c = clazz.getConstructor(String.class,int.class);	//获取有参构造
		Person p = (Person) c.newInstance("张三",23);						//通过有参构造创建对象
		System.out.println(p);
	}

}

package com.heima.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.heima.bean.Person;

public class Demo4_Field {

	/**
	 * Class.getField(String)方法可以获取类中的指定字段(可见的),
	 * 如果是私有的可以用getDeclaedField("name")方法获取,通过set(obj, "李四")方法可以设置指定对象上该字段的值,
	 * 如果是私有的需要先调用setAccessible(true)设置访问权限,用获取的指定的字段调用get(obj)可以获取指定对象中该字段的值
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.heima.bean.Person");
		Constructor c = clazz.getConstructor(String.class,int.class);	//获取有参构造
		Person p = (Person) c.newInstance("张三",23);						//通过有参构造创建对象
		
		//Field f = clazz.getField("name");								//获取姓名字段
		//f.set(p, "李四");												//修改姓名的值
		Field f = clazz.getDeclaredField("name");						//暴力反射获取字段
		f.setAccessible(true);											//去除私有权限
		f.set(p, "李四");	
		
		System.out.println(p);
	}

}

package com.heima.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.heima.bean.Person;

public class Demo5_Method {

	/**
	 * Class.getMethod(String, Class...) 和 Class.getDeclaredMethod(String,
	 * Class...)方法可以获取类中的指定方法,调用invoke(Object,
	 * Object...)可以调用该方法,Class.getMethod("eat") invoke(obj)
	 * Class.getMethod("eat",int.class) invoke(obj,10)
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.heima.bean.Person");
		Constructor c = clazz.getConstructor(String.class,int.class);	//获取有参构造
		Person p = (Person) c.newInstance("张三",23);						//通过有参构造创建对象
		
		Method m = clazz.getMethod("eat");								//获取eat方法
		m.invoke(p);
		
		Method m2 = clazz.getMethod("eat", int.class);					//获取有参的eat方法
		m2.invoke(p, 10);
	}

}

	//test
package com.heima.test;

public class DemoClass {
	public void run() {
		System.out.println("welcome to heima!");
	}
}

package com.heima.test;

import java.lang.reflect.Field;

public class Tool {
	//此方法可将obj对象中名为propertyName的属性的值设置为value。
	public void setProperty(Object obj, String propertyName, Object value) throws Exception {
		Class clazz = obj.getClass();					//获取字节码对象
		Field f = clazz.getDeclaredField(propertyName);	//暴力反射获取字段
		f.setAccessible(true);							//去除权限
		f.set(obj, value);
	}
}

package com.heima.test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test1 {

	/**
	 * @param args
	 * ArrayList<Integer>的一个对象，在这个集合中添加一个字符串数据，如何实现呢？
	 * 泛型只在编译期有效,在运行期会被擦除掉
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(111);
		list.add(222);
		
		Class clazz = Class.forName("java.util.ArrayList");				//获取字节码对象
		Method m = clazz.getMethod("add", Object.class);				//获取add方法
		m.invoke(list, "abc");
		
		System.out.println(list);
		
	}

}

package com.heima.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test2 {

	/**
	 * * 已知一个类，定义如下： 
	 * package cn.itcast.heima;
	 * 		public class DemoClass {
				public void run() {
					System.out.println("welcome to heima!");
				}
			}
	 * (1) 写一个Properties格式的配置文件，配置类的完整名称。 
	 * (2) 写一个程序，读取这个Properties配置文件，获得类的完整名称并加载这个类，用反射的方式运行run方法。
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("xxx.properties"));	//创建输入流关联xxx.properties
		Class clazz = Class.forName(br.readLine());									//读取配置文件中类名,获取字节码对象
		
		DemoClass dc = (DemoClass) clazz.newInstance();								//通过字节码对象创建对象
		dc.run();
	}

}

package com.heima.test;

public class Test3 {

	/**
	 * * A:案例演示
	* public void setProperty(Object obj, String propertyName, Object value){}，
	* 此方法可将obj对象中名为propertyName的属性的值设置为value。
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Student s = new Student("张三", 23);
		System.out.println(s);
		
		Tool t = new Tool();
		t.setProperty(s, "name", "李四");
		System.out.println(s);
	}

}

class Student {
	private String name;
	private int age;
	public Student() {
		super();
		
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}
	//动态代理
package com.heima.动态代理;

public interface User {
	public void add();
	
	public void delete();
}

package com.heima.动态代理;

public class UserImp implements User {

	@Override
	public void add() {
		//System.out.println("权限校验");
		System.out.println("添加功能");
		//System.out.println("日志记录");
	}

	@Override
	public void delete() {
		//System.out.println("权限校验");
		System.out.println("删除功能");
		//System.out.println("日志记录");
	}

}

package com.heima.动态代理;

public interface Student {
	public void login();
	
	public void submit();
}

package com.heima.动态代理;

public class StudentImp implements Student {

	@Override
	public void login() {
		System.out.println("登录");
	}

	@Override
	public void submit() {
		System.out.println("提交");
	}

}

package com.heima.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	private Object target;
	
	public MyInvocationHandler(Object target) {
		this.target = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("权限校验");
		method.invoke(target, args);					//执行被代理target对象的方法
		System.out.println("日志记录");
		return null;
	}

}

package com.heima.动态代理;

import java.lang.reflect.Proxy;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*UserImp ui = new UserImp();
		ui.add();
		ui.delete();
		
		System.out.println("-------------------------------");*/
		/*
		 * public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,
		 * InvocationHandler h)
		 */
		/*MyInvocationHandler m = new MyInvocationHandler(ui);
		User u = (User)Proxy.newProxyInstance(ui.getClass().getClassLoader(), ui.getClass().getInterfaces(), m);
		u.add();
		u.delete();*/
		
		StudentImp si = new StudentImp();
		si.login();
		si.submit();
		
		System.out.println("-------------------------------");
		MyInvocationHandler m = new MyInvocationHandler(si);
		Student s = (Student)Proxy.newProxyInstance(si.getClass().getClassLoader(), si.getClass().getInterfaces(), m);
		
		s.login();
		s.submit();
	}

}

	//枚举
package com.heima.枚举;

public class Week {
	
	public static final Week MON = new Week();
	public static final Week TUE = new Week();
	public static final Week WED = new Week();
	
	private Week(){}						//私有构造,不让其他类创建本类对象
}

package com.heima.枚举;

public class Week2 {
	
	public static final Week2 MON = new Week2("星期一");
	public static final Week2 TUE = new Week2("星期二");
	public static final Week2 WED = new Week2("星期三");
	
	private String name;
	private Week2(String name){
		this.name = name;
	}						//私有构造,不让其他类创建本类对象
	public String getName() {
		return name;
	}
	
	
}

package com.heima.枚举;

public abstract class Week3 {
	
	public static final Week3 MON = new Week3("星期一") {
		public void show() {
			System.out.println("星期一");
		}
	};
	public static final Week3 TUE = new Week3("星期二"){
		public void show() {
			System.out.println("星期二");
		}
	};
	public static final Week3 WED = new Week3("星期三"){
		public void show() {
			System.out.println("星期三");
		}
	};
	
	private String name;
	private Week3(String name){
		this.name = name;
	}						//私有构造,不让其他类创建本类对象
	public String getName() {
		return name;
	}
	
	public abstract void show();
}

package com.heima.枚举;

public class Demo1_Enum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		Week3 mon = Week3.MON;
		mon.show();
	}

	public static void demo2() {
		Week2 mon = Week2.MON;
		System.out.println(mon.getName());
	}

	public static void demo1() {
		Week mon = Week.MON;
		Week tue = Week.TUE;
		Week wed = Week.WED;
		
		System.out.println(mon);
	}
}

	//枚举2
package com.heima.枚举2;

public enum Week {
	MON,TUE,WED;
}

package com.heima.枚举2;

public enum Week2 {
	MON("星期一"),TUE("星期二"),WED("星期三");
	
	private String name;
	private Week2(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name;
	}
}

package com.heima.枚举2;

public enum Week3 {
	MON("星期一"){
		public void show() {
			System.out.println("星期一");
		}
	},TUE("星期二"){
		public void show() {
			System.out.println("星期二");
		}
	},WED("星期三"){
		public void show() {
			System.out.println("星期三");
		}
	};
	
	private String name;
	private Week3(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public abstract void show();
	
}

package com.heima.枚举2;

public class Demo1_Enum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		Week3 mon = Week3.TUE;
		switch (mon) {
		case MON:
			System.out.println("星期一");
			break;
		case TUE:
			System.out.println("星期二");
			break;
		}
	}

	public static void demo3() {
		Week3 mon = Week3.MON;
		mon.show();
	}

	public static void demo2() {
		Week2 mon = Week2.MON;
		System.out.println(mon.getName());
	}

	public static void demo1() {
		Week mon = Week.MON;
		System.out.println(mon);
	}

}

package com.heima.枚举2;

public class Demo2_Enum {

	/**
	 * int ordinal()
	* int compareTo(E o)
	* String name()
	* String toString()
	* <T> T valueOf(Class<T> type,String name)
	* values() 
	* 此方法虽然在JDK文档中查找不到，但每个枚举类都具有该方法，它遍历枚举类的所有枚举值非常方便
	 */
	public static void main(String[] args) {
		//demo1();
//		Week2 mon = Week2.valueOf(Week2.class, "MON");		//通过字节码对象获取枚举项
//		System.out.println(mon);
		
		Week2[] arr = Week2.values();
		for (Week2 week2 : arr) {
			System.out.println(week2);
		}
	}

	public static void demo1() {
		Week2 mon = Week2.MON;
		Week2 tue = Week2.TUE;
		Week2 wed = Week2.WED;
		
		/*System.out.println(mon.ordinal());				//枚举项都是有编号的
		System.out.println(tue.ordinal());
		System.out.println(wed.ordinal());
		
		System.out.println(mon.compareTo(tue));			//比较的是编号
		System.out.println(mon.compareTo(wed));*/
		
		System.out.println(mon.name()); 				//获取实例名称
		System.out.println(mon.toString()); 			//调用重写之后的toString方法
	}

}

	//模版方法设计模式
package com.heima.模版方法设计模式;

public class Demo1_Template {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*long start = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++) {
			System.out.println("x");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);*/
		Demo d = new Demo();
		System.out.println(d.getTime());
	}

}

abstract class GetTime {
	public final long getTime() {
		long start = System.currentTimeMillis();
		code();
		long end = System.currentTimeMillis();
		return end - start;
	}

	public abstract void code();
}

class Demo extends GetTime {

	@Override
	public void code() {
		int i = 0;
		while(i < 100000) {
			System.out.println("x");
			i++;
		}
	}
}

