package hello;

		class Person2 {

		private String name;

		private String sex;

		private int age;

		private String add;

		public Person2(String name,String sex,int age,String add) {

		this.name=name;

		this.sex=sex;

		this.age=age;

		this.add=add;

		}

		void eating(String food) {

		System.out.println(name + "吃" + food);

		}



		void shopping(String goods) {

		System.out.println(name + "买" + goods);


		}



		void sleeping(int time) {

		System.out.println(name + "睡" + time + "小时");

		}



		void setName(String aName) {

		name = aName;

		}



		void setAge(int aAge) {

		age = aAge;

		}



		void printPerson() {

		System.out.println("姓名："+name+"，性别："+sex+"，年龄："+age+"，地址："+add);

		}



		}


		public class hello {

			public static void main(String[] args) {


		Person2 a=new Person2("Jane","女",18,"张家界");

		a.shopping("哇哈哈");

		a.sleeping(9);

		a.printPerson();

		}



		}