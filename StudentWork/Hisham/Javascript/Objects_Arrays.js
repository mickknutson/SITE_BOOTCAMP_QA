//Dates
let date = new Date();
console.log(`Year ${date.getFullYear()} , month ${date.getMonth()} , day ${date.getDay()}`);

//Objects

//literal
const employees = [
	{
		id: 102,
		name: 'Ahmed',
		salary: 40000
	},
	{
		id: 103,
		name: 'Yousef',
		salary: 40000
	},
	{
		id: 104,
		name: 'Khalid',
		salary: 40000
	}
];

for (const emp of employees) {
	console.log(`this is literal method - id is : ${emp.id} , name is : ${emp.name} , salary is ${emp.salary}`);
}
console.log('=====================================================================');

// an instance
const employees2 = new Object();
employees2[0] = {
	id: 102,
	name: 'Ahmed2',
	salary: 40000
};
employees2[1] = {
	id: 103,
	name: 'Yousef2',
	salary: 40000
};
employees2[2] = {
	id: 104,
	name: 'Khalid2',
	salary: 40000
};

for (const emp of employees) {
	console.log(
		`this is the instance method - id is : ${emp['id']} , name is : ${emp['name']} , salary is ${emp['salary']}`
	);
}
console.log('=====================================================================');

//constructor

function Employee(id, name, salary) {
	this.id = id;
	this.name = name;
	this.salary = salary;
}

const emp1 = new Employee(103, 'Foo', 34000);
console.log(emp1);
console.log('=====================================================================');

// classes

class Person {
	fname;
	lname;
	age;
	job;
	constructor(fname, lname, age, job) {
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.job = job;
	}

	set setFname(name) {
		this.fname = name;
	}

	get getFullName() {
		return this.fname + ' ' + this.lname;
	}
}

let p = new Person('hisham', 'BinSeddeq', 29, 'SQAE');
console.log(p);
console.log(p.getFullName);
p.setFname = 'koko';
console.log(p);
console.log(p.getFullName);
