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

		System.out.println(name + "��" + food);

		}



		void shopping(String goods) {

		System.out.println(name + "��" + goods);


		}



		void sleeping(int time) {

		System.out.println(name + "˯" + time + "Сʱ");

		}



		void setName(String aName) {

		name = aName;

		}



		void setAge(int aAge) {

		age = aAge;

		}



		void printPerson() {

		System.out.println("������"+name+"���Ա�"+sex+"�����䣺"+age+"����ַ��"+add);

		}



		}


		public class hello {

			public static void main(String[] args) {


		Person2 a=new Person2("Jane","Ů",18,"�żҽ�");

		a.shopping("�۹���");

		a.sleeping(9);

		a.printPerson();

		}



		}